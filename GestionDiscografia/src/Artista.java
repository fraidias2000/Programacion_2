/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aculplay
 */
public class Artista {
    
    //Atributos
    public String nombre;
    public int identificador;
    public String genero;
    public Disco disco;
   
    //metodos
    public  Artista(String nombre, int identificador, String genero){
        this.nombre = nombre;
        this.identificador = identificador;
        this.genero = genero;
    }
    
   public Disco getDisco(){
         return disco;
   
   }
    
    public void setDisco(Disco d){
        disco = d;
    }
    
    public int getIdentificador(){
        return identificador;
    }
    
    void setIdentificador(int i){
        identificador = i;
    }
    
    public void consultarDatosDisco(){
    if(disco==null){
        System.out.println("No existe un disco asociado al artista");
        }else{
                disco.toString();
             }
        
    }
    
    @Override
    public String toString(){
       String cadena2;
       if(disco != null){
            cadena2 = "Nombre: " + nombre + "\n"+
                      "Identificador: " + identificador + "\n"+
                      "Genero: " + genero + "\n" +
                      "Disco: " + disco + "\n" + 
                      disco.toString();
                      return cadena2; 
                     
       }else{
            cadena2 = "Nombre: " + nombre + "\n"+
                      "Identificador: " + identificador + "\n"+
                      "Genero: " + genero + "\n" +
                      "Disco: No tiene disco" + "\n" ; 
                      return cadena2; 
       }
    }
}
