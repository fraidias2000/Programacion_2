/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aculplay
 */
public class Discografia {
    //ATRIBUTOS
    private String nombre;
    private  Artista[] artistas;
    int i = 0;
    
    
    public Artista[] getArtistas(){
        return artistas;
    }

    //METODOS
    public void setArtistas(Artista[] artistas) {
        this.artistas = artistas;
    }

    public Discografia(String nombre, int tamanyo) {
        this.nombre = nombre;
        artistas = new Artista[tamanyo];
    }
    
    public void listarArtistas(){
        for(i = 0; i < artistas.length &&artistas[i] !=null; i++){
            System.out.println( artistas[i].toString());
        }
    
    }
    
    public void obtenerInformacionArtista(int identificador){
        
        while(artistas[i] != null &&  artistas[i].identificador != identificador && i<artistas.length){
            i++;
        }
        if(artistas[i] != null && artistas[i].identificador == identificador){
              System.out.println(artistas[i].toString());
            
        }else{
            
       }
    }
    
    public Artista obtenerArtista(int identificador){
        
        while(artistas[i] != null && artistas[i].identificador != identificador && i<artistas.length){
            i++;
        }
        if(artistas[i] != null && artistas[i].identificador == identificador){
            return artistas[i];
        
        }else{
            System.out.println("Artista no encontrado");
             return null;
        }
    }
    
    
    void anyadirArtista(Artista a){
       while(artistas[i] !=null && i < artistas.length){
           i++;
       }
        artistas[i] = a;
              
        }
    void asociarDisco( String nombreArtista,Disco a){
        while( artistas[i].nombre != nombreArtista){
        artistas[i].setDisco(a);
        i++;
    }
}

}