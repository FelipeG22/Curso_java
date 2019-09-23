/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaudemyjava_basico;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities_enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author admlocal
 */
public class Aula022_Composicao {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do Departamento: ");
        String departamento = sc.nextLine();

        System.out.println("Entre com os dados do trabalhador: ");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Nível: ");
        String workerLevel = sc.nextLine();
        System.out.print("Salário: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamento));

        System.out.print("Quantos contratos este trabalhador obteve?: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do #" + i + ":");
            System.out.println("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duração (Horas): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        
        System.out.println();
        System.out.print("Entre com o mês e ano para calcular o ganho (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Ganho por : " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        
        sc.close();
    }

}
