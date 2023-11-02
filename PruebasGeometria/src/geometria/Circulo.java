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
public class Circulo {
    //ATRIBUTOS
    private double radio;
    static double pi = 3.1415;
    
    //MÉTODOS
    public void asignaRadio(double valor){
       radio = valor; 
    }
    
    public double daRadio(){
        return radio;
    }
    
    public double longitud (){
        double longitud = 2*pi*radio;
        return longitud;
    }
    public double area (){
        double area = pi*radio*radio;
        return area;
    }
    public boolean mayorQue (Circulo otroCirculo){
    
        if(radio > otroCirculo.radio){
            return true;
        }else{
            return false;
         }
    }
}
    