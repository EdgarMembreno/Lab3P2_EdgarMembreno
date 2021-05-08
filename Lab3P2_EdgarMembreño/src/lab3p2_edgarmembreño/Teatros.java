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
public class Teatros extends Articulos{
    public int CantAlta;
    public int CantBluRay;
    public String InfoDisc;
    public String lectDisc;

    public Teatros() {
        super();
    }
    

    public Teatros(int CantAlta, int CantBluRay, String InfoDisc, String lectDisc, int NumSerie, int Precio, String color, String InfoGara) {
        super(NumSerie, Precio, color, InfoGara);
        this.CantAlta = CantAlta;
        this.CantBluRay = CantBluRay;
        this.InfoDisc = InfoDisc;
        this.lectDisc = lectDisc;
    }

    public int getCantAlta() {
        return CantAlta;
    }

    public void setCantAlta(int CantAlta) {
        this.CantAlta = CantAlta;
    }

    public int getCantBluRay() {
        return CantBluRay;
    }

    public void setCantBluRay(int CantBluRay) {
        this.CantBluRay = CantBluRay;
    }

    public String getInfoDisc() {
        return InfoDisc;
    }

    public void setInfoDisc(String InfoDisc) {
        this.InfoDisc = InfoDisc;
    }

    public String getLectDisc() {
        return lectDisc;
    }

    public void setLectDisc(String lectDisc) {
        this.lectDisc = lectDisc;
    }

    @Override
    public String toString() {
        return "Teatros{" + "CantAlta=" + CantAlta + ", CantBluRay=" + CantBluRay + ", InfoDisc=" + InfoDisc + ", lectDisc=" + lectDisc + '}';
    }
    
    
}
