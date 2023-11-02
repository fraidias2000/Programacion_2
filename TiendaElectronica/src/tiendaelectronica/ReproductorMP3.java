/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaelectronica;

/**
 *
 * @author aculplay
 */
public class ReproductorMP3 extends Dispositivos{
        //ATRIBUTOS
    public int almacenamiento;
    public boolean radio;
    
            //METODOS
    public ReproductorMP3(double p, double d , double pr,int almacenamiento, boolean radio ){
        super(p,d,pr);
        this.almacenamiento = almacenamiento;
        this.radio = radio;
    }
}