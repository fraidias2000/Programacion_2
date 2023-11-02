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
public class CamaraDigital extends Dispositivos{
        //ATRIBUTOS
    public double resolucionHorizontal;
    public double resolucionVertical;
    public boolean flash;
    public static double  descuento = 0.1;
    
            //METODOS
    public CamaraDigital(double p, double d , double pr,double resolucionHorizontal, double resolucionVertical, boolean flash ){
        super(p,d,pr);
        this.resolucionHorizontal = resolucionHorizontal;
        this.resolucionVertical = resolucionVertical;
        this.flash =flash;
    }
}
