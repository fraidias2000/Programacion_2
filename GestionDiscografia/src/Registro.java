
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aculplay
 */
public class Registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
        Discografia miDiscografica = new Discografia("Alvaro",5);
        int opcion;
        
       do{
        System.out.println("************* MENU PRINCIPAL ************** ");
        System.out.println("1. Mostrar artistas en la discografica ");
        System.out.println("2. Obtener informacion sobre un artista ");
        System.out.println("3. Dar de alta a un artista ");
        System.out.println("4. Asociar un disco a un artista ");
        System.out.println("5. Obtener el precio final del disco de un artista ");
        System.out.println("6. Salir ");
        System.out.println("*******************************************");
      
        opcion = teclado.nextInt();
        teclado.nextLine();
        
            switch(opcion){
                case 1:
               miDiscografica.listarArtistas();
               
               break;
                   
                case 2:
                    System.out.println("Dime el identificador del artista que quieres obtener informacion");
                    
                    int identificadorArtista = teclado.nextInt();
                    teclado.nextLine();
                    miDiscografica.obtenerInformacionArtista(identificadorArtista);
                    break;
                case 3:
                    System.out.println("Dime el nombre del artista");
                    String nuevoNombreArtista = teclado.nextLine();
                    
                    System.out.println("Dime el identificador");
                    int nuevoIdentificador = teclado.nextInt();
                     teclado.nextLine();
                    
                    System.out.println("Dime el genero");
                    String nuevoGenero = teclado.nextLine();
                    
                    Artista nuevoArtista2 = new Artista(nuevoNombreArtista, nuevoIdentificador, nuevoGenero);
                    miDiscografica.anyadirArtista(nuevoArtista2);
                    System.out.println(miDiscografica.getArtistas()[0].toString());
                    break;
                    
                case 4:
                    Artista artista4;
                    System.out.println("Dime el nombre del artista");
                    int ident = teclado.nextInt();
                    
                    System.out.println("Dime el disco");
                    String nombreDisco = teclado.nextLine();
                    
                    System.out.println("Dime el anyo de publicacion");
                    int anyoDisco = teclado.nextInt();
                    
                    Disco nuevoDisco = new Disco(nombreDisco, anyoDisco);
                    
                    
                    artista4 = miDiscografica.obtenerArtista(ident);
                    artista4.setDisco(nuevoDisco);
                    break;
                case 5:
                    System.out.println("Dime el identificador del artista");
                    nuevoIdentificador = teclado.nextInt();
                    teclado.nextLine();
                    Artista nuevoArtista3 ;
            
                   nuevoArtista3 = miDiscografica.obtenerArtista(nuevoIdentificador);
                   nuevoArtista3.getDisco().calcularPrecioFinal();
                    break;
                case 6:
                    break;
            }
        }while(opcion!= 6);
    }
}


