/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author aculplay
 */
public class Ropa {
    //ATRIBUTOS
    private String color;
    private String fabricante;
    private float precio;
    private String tejido;
    protected static int identificador;
    
    //METODOS
    
    public Ropa(String c, String f, float p, String t){
        color =c;
        fabricante = f;
        precio = p;
        tejido =t;
        identificador++;
        
    }
    
    public void imprimir (){
        System.out.println("Color: " + color);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Precio: " + precio);
        System.out.println("Tejido: " + tejido);
        System.out.println("Identificador: " + identificador);
    }
}
