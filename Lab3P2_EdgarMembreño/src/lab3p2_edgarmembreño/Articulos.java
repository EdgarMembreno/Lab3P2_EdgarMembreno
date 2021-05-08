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
public class Articulos {
    public int NumSerie;
    public int Precio;
    public String color;
    public String InfoGara;

    public Articulos() {
    }

    public Articulos(int NumSerie, int Precio, String color, String InfoGara) {
        this.NumSerie = NumSerie;
        this.Precio = Precio;
        this.color = color;
        this.InfoGara = InfoGara;
    }

    public int getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(int NumSerie) {
        this.NumSerie = NumSerie;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInfoGara() {
        return InfoGara;
    }

    public void setInfoGara(String InfoGara) {
        this.InfoGara = InfoGara;
    }

    @Override
    public String toString() {
        return "Articulos{" + "NumSerie=" + NumSerie + ", Precio=" + Precio + ", color=" + color + ", InfoGara=" + InfoGara + '}';
    }
    
    
}
