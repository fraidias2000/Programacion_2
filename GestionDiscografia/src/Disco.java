/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aculplay
 */
public class Disco {
    
    public String nombre;
    public int copiasVendidas;
    public boolean premio;
    public int anyoPublicacion;
    
    public static double precioPremiado = 0.5;
    public static double muchasCopias = 0.2;
    public static double incrementoPrecio = 0.7;
    public static double descuento = 0.1;
    public static double precioBase =  15;
    public double precioFinal;
    
    public String premiado = "Si";
    public String noPremiado = "No";  
    public int fechaActual = 2019;
    
    //metodos
    public Disco(String nombre, int anyoPublicacion){
        this.nombre = nombre;
        this.anyoPublicacion = anyoPublicacion;
    }
    
    public int getCopiasVendidas(){
        return copiasVendidas;
    }
    
    public void setCopiasVendidas(int copiasVendidas){
        this.copiasVendidas = copiasVendidas;
     }
    
    public void setPremio(boolean premio){
    this.premio = premio;
    }
    
    public boolean getPremio(){
     return premio;
    }
    
    @Override
    public String toString(){
         String cadena;
         String cadenaPremio;
         if(premio==true){
            cadenaPremio = "Si";
         }else{
                cadenaPremio = "No";
         }
         
         cadena ="Nombre:" + nombre + "\n" + 
                 "Copias vendidas:"+ copiasVendidas + "\n" +
                 "Premio: " + cadenaPremio + "\n" +
                 "Anyo de publicacion:" + anyoPublicacion;
         return cadena;
   }
    
    public double calcularPrecioFinal(){
        int diferencia = fechaActual - anyoPublicacion;
        precioFinal = precioBase;
        
        //Mas de 20 años desde que se publicó
        if(diferencia > 20){
            precioFinal = precioBase - descuento * precioBase;
        
        }else{
            //Disco premiado y con mas de 10000 ventas
            if(premio == true && copiasVendidas > 10000 ){
                precioFinal = precioBase + precioBase * incrementoPrecio;
                
            }
            //Disco premiado
            if(premio == true ){
                precioFinal = precioBase + precioBase * precioPremiado;
           }
            //Mas de 10000 ventas
            if (copiasVendidas > 10000){
                precioFinal = precioBase + precioBase * muchasCopias;
            }
        }
        return precioFinal;
    }
    
   }
