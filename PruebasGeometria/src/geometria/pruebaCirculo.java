/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author aculplay
 */
public class pruebaCirculo {
    
    public static void main (String[] args){
    
    Circulo c1 = new Circulo();
    c1.asignaRadio(5);
    
    Circulo c2 = new Circulo ();
    c2.asignaRadio(10);
    
    boolean c1mayor = c2.mayorQue(c1);
        System.out.println("¿C1 es mayor que C2?" + " " + c1mayor);
    
    
    
    }
    
}
