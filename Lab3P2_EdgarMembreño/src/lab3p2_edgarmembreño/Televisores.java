/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_edgarmembreño;

/**
 *
 * @author edgarmembreno
 */
public class Televisores extends Articulos {

    private int Tama_Pantalla;
    private boolean smart;
    private String marca;
    private int conexiones;
    private int grosor;

    public Televisores() {
        super();
    }

    public Televisores(int Tama_Pantalla, boolean smart, String marca, int conexiones, int grosor, int NumSerie, int Precio, String color, String InfoGara) {
        super(NumSerie, Precio, color, InfoGara);
        this.Tama_Pantalla = Tama_Pantalla;
        this.smart = smart;
        this.marca = marca;
        this.conexiones = conexiones;
        this.grosor = grosor;
    }

   

    public int getTama_Pantalla() {
        return Tama_Pantalla;
    }

    public void setTama_Pantalla(int Tama_Pantalla) {
        this.Tama_Pantalla = Tama_Pantalla;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getConexiones() {
        return conexiones;
    }

    public void setConexiones(int conexiones) {
        this.conexiones = conexiones;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Televisores{" + "Tama_Pantalla=" + Tama_Pantalla +"Pul" +", smart=" + smart + ", marca=" + marca + ", conexiones=" + conexiones + ", grosor=" + grosor + '}';
    }

}
