/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaudemyjava_basico;

import entities.Comments;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author admlocal
 */
public class Aula023_StringBuilder {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comments c1 = new Comments("Have a nice trip!");
        Comments c2 = new Comments("Wow that's awesome!");
        
        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderfull country!",
                12);
        
        p1.addComments(c1);
        p1.addComments(c2);
        
        System.out.print(p1);
        
    }

}
