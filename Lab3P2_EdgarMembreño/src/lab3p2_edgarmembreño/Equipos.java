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
public class Equipos extends Articulos{
    public int CantAltavo;
    public int PotencMax;
    public int CantAux;
    public int CantDisc;
    public int CantUsb;

    public Equipos() {
        super();
    }
    

    public Equipos(int CantAltavo, int PotencMax, int CantAux, int CantDisc, int CantUsb, int NumSerie, int Precio, String color, String InfoGara) {
        super(NumSerie, Precio, color, InfoGara);
        this.CantAltavo = CantAltavo;
        this.PotencMax = PotencMax;
        this.CantAux = CantAux;
        this.CantDisc = CantDisc;
        this.CantUsb = CantUsb;
    }

    public int getCantAltavo() {
        return CantAltavo;
    }

    public void setCantAltavo(int CantAltavo) {
        this.CantAltavo = CantAltavo;
    }

    public int getPotencMax() {
        return PotencMax;
    }

    public void setPotencMax(int PotencMax) {
        this.PotencMax = PotencMax;
    }

    public int getCantAux() {
        return CantAux;
    }

    public void setCantAux(int CantAux) {
        this.CantAux = CantAux;
    }

    public int getCantDisc() {
        return CantDisc;
    }

    public void setCantDisc(int CantDisc) {
        this.CantDisc = CantDisc;
    }

    public int getCantUsb() {
        return CantUsb;
    }

    public void setCantUsb(int CantUsb) {
        this.CantUsb = CantUsb;
    }

    @Override
    public String toString() {
        return "Equipos{" + "CantAltavo=" + CantAltavo + ", PotencMax=" + PotencMax + ", CantAux=" + CantAux + ", CantDisc=" + CantDisc + ", CantUsb=" + CantUsb + '}';
    }
    
    
}
