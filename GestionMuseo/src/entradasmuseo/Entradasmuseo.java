/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasmuseo;

import java.util.Scanner;

/**
 *
 * @author aculplay
 */
public class Entradasmuseo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
      
      
      Scanner teclado= new Scanner(System.in);//sirve para leer lo que el usuario escribe
      System.out.println("Introduce nombre del museo");
      String museo = teclado.nextLine(); 
      System.out.println("Introduce nombre de la exposicion");
      String exposicion = teclado.nextLine();
      
      Entrada entradaMuseo = new Entrada(exposicion,museo);
      
      
      
    }
    
}
