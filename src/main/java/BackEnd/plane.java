/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DELL ADMIN
 */
public class plane {
    public static String load(String select) throws FileNotFoundException{
           
        String ln = "";
        String name = "";
        String ex1 = "";
        String ex1rep = "";
        String ex2 = "";
        String ex2rep = "";
        String ex3 = "";
        String ex3rep = "";
        String ex4 = "";
        String ex4rep = "";
        String ex5 = "";
        String ex5rep = "";
         String out="";
        String nameselect=select;
        boolean matched=false;
        
        // TODO add your handling code here:
        File plan = new File("data//plans.txt");
        Scanner sc = new Scanner(plan);
        while (sc.hasNext()) {
            
            ln = sc.next();
            
            Scanner lnsc = new Scanner(ln).useDelimiter("#");
            
            while (lnsc.hasNext()) {
                
                name = lnsc.next();
                if (name.equals(nameselect) ) {
                    
                    if (matched == false) {
                        ex1 = lnsc.next();
                        ex1rep = lnsc.next();
                        ex2 = lnsc.next();
                        ex2rep = lnsc.next();
                        ex3 = lnsc.next();
                        ex3rep = lnsc.next();
                        ex4 = lnsc.next();
                        ex4rep = lnsc.next();
                        ex5 = lnsc.next();
                        ex5rep = lnsc.next();
                        
                        out=(ex1 + " " + ex1rep + " reps\n" + ex2 + " " + ex2rep + " reps\n"
                                + ex3 + " " + ex3rep + " reps\n" + ex4 + " " + ex4rep + " reps\n"
                                + ex5 + " " + ex5rep + " reps\n");
                        matched=true;
                    }

                    
                    
                } else {
                    ex1 = lnsc.next();
                    ex1rep = lnsc.next();
                    ex2 = lnsc.next();
                    ex2rep = lnsc.next();
                    ex3 = lnsc.next();
                    ex3rep = lnsc.next();
                    ex4 = lnsc.next();
                    ex4rep = lnsc.next();
                    ex5 = lnsc.next();
                    ex5rep = lnsc.next();
                }
                
            }
        }
        return out;
       }
    
}
