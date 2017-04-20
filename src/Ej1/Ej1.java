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
    public static void main(String[] args) {
        Scanner t = new Scanner(new File("hamlet.txt"));
        File f = new File("b.txt");
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                System.out.println("No es posible acceder al archivo");
            }
        }
        System.out.println(f.exists());
    }
    
}
