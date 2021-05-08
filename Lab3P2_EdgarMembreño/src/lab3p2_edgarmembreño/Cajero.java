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
public class Cajero extends empleados{
    public int CantLab;
    public int HorTra;
    public int HorAlm;
    public double MetaVender;
    public int cantEmpleAten;

    public Cajero() {
        super();
        
    }

    public Cajero(int CantLab, int HorTra, int HorAlm, double MetaVender, int cantEmpleAten, String user, String contra, String nombre, String apellido, String nacionalidad, int Salario) {
        super(user, contra, nombre, apellido, nacionalidad, Salario);
        this.CantLab = CantLab;
        this.HorTra = HorTra;
        this.HorAlm = HorAlm;
        this.MetaVender = MetaVender;
        this.cantEmpleAten = cantEmpleAten;
    }
    

    public int getCantLab() {
        return CantLab;
    }

    public void setCantLab(int CantLab) {
        this.CantLab = CantLab;
    }

    public int getHorTra() {
        return HorTra;
    }

    public void setHorTra(int HorTra) {
        this.HorTra = HorTra;
    }

    public int getHorAlm() {
        return HorAlm;
    }

    public void setHorAlm(int HorAlm) {
        this.HorAlm = HorAlm;
    }

    public double getMetaVender() {
        return MetaVender;
    }

    public void setMetaVender(double MetaVender) {
        this.MetaVender = MetaVender;
    }

    public int getCantEmpleAten() {
        return cantEmpleAten;
    }

    public void setCantEmpleAten(int cantEmpleAten) {
        this.cantEmpleAten = cantEmpleAten;
    }

    @Override
    public String toString() {
        return "Cajero{" + "CantLab=" + CantLab + ", HorTra=" + HorTra + ", HorAlm=" + HorAlm + ", MetaVender=" + MetaVender + ", cantEmpleAten=" + cantEmpleAten + '}';
    }
    
    
    
    
}
