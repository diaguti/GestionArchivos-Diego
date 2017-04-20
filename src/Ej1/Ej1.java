/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {        
        File f = new File("b.txt");
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                System.out.println("No es posible acceder al archivo");
            }
        }
        PrintStream escritura = new PrintStream(f);
        escritura.print("Hola,Diego,Gutierrez");        
      
        try {
            Scanner lectura = new Scanner(f);
            lectura.useDelimiter(",");
            while (lectura.hasNext()) {                
                System.out.println(lectura.next());
            }
            lectura.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
    
}
