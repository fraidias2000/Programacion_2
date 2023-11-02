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
public class Telefono extends Dispositivos{
        //ATRIBUTOS
    public String operadora;
    public boolean camara;
 
        //METODOS
    public Telefono(double p, double d , double pr,String operadora, boolean camara ){
        super(p,d,pr);
        this.operadora = operadora;
        this.camara = camara;
        
    }
}
