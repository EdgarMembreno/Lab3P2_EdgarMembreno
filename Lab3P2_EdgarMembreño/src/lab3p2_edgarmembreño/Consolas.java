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
public class Consolas extends Articulos{
    public String Marca;
    public int almacenamiento;
    public int CantContro;
    public int NumAcce;
    public String InfoTarje;

    public Consolas() {
        super();
    }
    

    public Consolas(String Marca, int almacenamiento, int CantContro, int NumAcce, String InfoTarje, int NumSerie, int Precio, String color, String InfoGara) {
        super(NumSerie, Precio, color, InfoGara);
        this.Marca = Marca;
        this.almacenamiento = almacenamiento;
        this.CantContro = CantContro;
        this.NumAcce = NumAcce;
        this.InfoTarje = InfoTarje;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCantContro() {
        return CantContro;
    }

    public void setCantContro(int CantContro) {
        this.CantContro = CantContro;
    }

    public int getNumAcce() {
        return NumAcce;
    }

    public void setNumAcce(int NumAcce) {
        this.NumAcce = NumAcce;
    }

    public String getInfoTarje() {
        return InfoTarje;
    }

    public void setInfoTarje(String InfoTarje) {
        this.InfoTarje = InfoTarje;
    }

    @Override
    public String toString() {
        return "Consolas{" + "Marca=" + Marca + ", almacenamiento=" + almacenamiento + "GB" +", CantContro=" + CantContro + ", NumAcce=" + NumAcce + ", InfoTarje=" + InfoTarje + '}';
    }
    
    
    
}
