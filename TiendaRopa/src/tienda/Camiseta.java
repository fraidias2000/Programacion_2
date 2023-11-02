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
public class Camiseta extends Ropa{
    private String mangas;
    private boolean dibujo;
    
    public Camiseta (String c, String f, float p, String t,String m, boolean d){
        super(c,f,p,t);
        mangas = m;
        dibujo = d;
    }
    
    @Override
   public void imprimir(){
       super.imprimir();
        System.out.println("Mangas: " + mangas);
        System.out.println("Dibujo: " + dibujo);
    }
}
