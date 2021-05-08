/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_edgarmembreño;

import java.util.ArrayList;

/**
 *
 * @author edgarmembreno
 */
public class Tienda {

    private int identificador;
    private String ubicacion;
    private int cantempleados;
    private int cajaspago;
    private String proMasVendido;
    private int ArtiMax;
    private ArrayList<Articulos> art;
    private ArrayList<empleados> empl;
    private ArrayList<Clientes> clien;

    public Tienda() {
    }

    public Tienda(int identificador, String ubicacion, int cantempleados, int cajaspago, String proMasVendido, int ArtiMax) {
        this.identificador = identificador;
        this.ubicacion = ubicacion;
        this.cantempleados = cantempleados;
        this.cajaspago = cajaspago;
        this.proMasVendido = proMasVendido;
        this.ArtiMax = ArtiMax;
    }

    
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantempleados() {
        return cantempleados;
    }

    public void setCantempleados(int cantempleados) {
        this.cantempleados = cantempleados;
    }

    public int getCajaspago() {
        return cajaspago;
    }

    public void setCajaspago(int cajaspago) {
        this.cajaspago = cajaspago;
    }

    public String getProMasVendido() {
        return proMasVendido;
    }

    public void setProMasVendido(String proMasVendido) {
        this.proMasVendido = proMasVendido;
    }

    public int getArtiMax() {
        return ArtiMax;
    }

    public void setArtiMax(int ArtiMax) {

        this.ArtiMax = ArtiMax;
    }

    public ArrayList<Articulos> getArt() {
        return art;
    }

    public void setArt(ArrayList<Articulos> art) {
        if (art.size() < ArtiMax) {
            this.art = art;
        }

    }

    public ArrayList<empleados> getEmpl() {
        return empl;
    }

    public void setEmpl(ArrayList<empleados> empl) {
        if (empl.size() < cantempleados) {
            this.empl = empl;
        }
    }

    public ArrayList<Clientes> getClien() {
        return clien;
    }

    public void setClien(ArrayList<Clientes> clien) {
        this.clien = clien;
    }

    @Override
    public String toString() {
        return "Tienda{" + "identificador=" + identificador + ", ubicacion=" + ubicacion + ", cantempleados=" + cantempleados + ", cajaspago=" + cajaspago + ", proMasVendido=" + proMasVendido + ", ArtiMax=" + ArtiMax + ", art=" + art + ", empl=" + empl + ", clien=" + clien + '}';
    }

}
