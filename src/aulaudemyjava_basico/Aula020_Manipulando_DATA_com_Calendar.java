/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaudemyjava_basico;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author admlocal
 */
public class Aula020_Manipulando_DATA_com_Calendar {
 
   /** public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        
        System.out.println(sdf.format(d));
        
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        // adicionando hora 
        //c.add(Calendar.HOUR_OF_DAY, 4);
        
        // pegando DATA
        int minutos = c.get(Calendar.MINUTE);
        int mes = c.get(Calendar.MONTH);
        
        //d = c.getTime();
        
//        System.out.println(sdf.format(d));
        System.out.println("Minutos: " + minutos);
        System.out.println("Mês: " + mes);
        
    }
    
**/}
