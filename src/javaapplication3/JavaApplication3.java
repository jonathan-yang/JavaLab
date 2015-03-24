/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sample-heinz
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File rFile=new File("C:\\Users\\sample-heinz\\Desktop\\javal1.txt");
        try (Scanner sc = new Scanner(rFile)){
            // TODO code application logic here
            
            
            System.out.println("It exists : "+rFile.exists());
            
                StringBuilder sb=new StringBuilder();
                while(sc.hasNextLine())
                {
                    sb.append(sc.nextLine());
                    sb.append("\n");
                    System.out.println(sb.toString());
                }
                sb.append("\n");
                sb.append("This line is added from the program");
                sb.append("\n");
                PrintWriter pw=new PrintWriter(rFile);
                
                pw.print(sb);
                
                pw.close();

        } catch (FileNotFoundException ex) {
            
            if(ex instanceof FileNotFoundException)
            {
            }
            Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
