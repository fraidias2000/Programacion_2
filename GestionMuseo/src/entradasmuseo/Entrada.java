/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasmuseo;

/**
 *
 * @author aculplay
 */
public class Entrada {
    //Atributos de las variables instancia
    private String exposicion;
    private String museo;
    double precioFinal;
 
    //Variables de clase
    static double precioBase = 7.6;
    static int edadJubilados = 65;
    static String diaMuseo = "L";
    static double descuentoEdad = 0.3;
    static double incrementoFestivos = 0.1;
    static double descuentoAbonados = 0.2;
    static double descuentoLunes = 0.2;
    
    //Metodos
    public  Entrada(String exp, String museo) {
        exposicion = exp;
        this.museo = museo; //se pone el this cuando el nombre de la variables es igual a la clase.
    }
    
    @Override
    public String toString(){  //Crea una cadena
    
        String cadena = exposicion + "," + museo + ",\n" + "Precio base: " + precioBase + "\n" + "Precio final: " + precioFinal ;
        return cadena;
    }
    
    public boolean equals (Entrada entrada){
        boolean iguales = false;
        if(precioFinal == entrada.precioFinal){
            if(exposicion.equals(entrada.exposicion)){
                if(museo.equals(entrada.museo)){
                
                    iguales = true;
                }
            }
        }
        return false;
    }
    
    public void calcularPrecioFinal(int edad, boolean diaDelMuseo,
                                     boolean festivo, boolean abonado){
        
        if(edad > edadJubilados){
            precioFinal = precioBase - precioBase * descuentoEdad;    
            
        }else{
            if(diaDelMuseo == true){
            precioFinal = precioBase - precioBase * descuentoLunes; 
        
             }else{
                if(festivo == true){
                    precioFinal = precioBase + precioBase * incrementoFestivos; 
             
                }else{
                    if (abonado == true){
                         precioFinal = precioBase - precioBase * descuentoAbonados; 
                    }
                }
             }
        }    
    }

    public String getExposicion() {
        return exposicion;
    }

    public void setExposicion(String exposicion) {
        this.exposicion = exposicion;
    }

    public String getMuseo() {
        return museo;
    }

    public void setMuseo(String museo) {
        this.museo = museo;
    }
}
