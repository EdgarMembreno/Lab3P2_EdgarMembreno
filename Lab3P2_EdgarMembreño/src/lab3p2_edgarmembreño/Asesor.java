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
public class Asesor extends empleados  {
    public ArrayList Clientes;
    public int CantPro;
    public int Creditos;

    public Asesor() {
        super();
    }

    public Asesor(ArrayList Clientes, int CantPro, int Creditos, String user, String contra, String nombre, String apellido, String nacionalidad, int Salario) {
        super(user, contra, nombre, apellido, nacionalidad, Salario);
        this.Clientes = Clientes;
        this.CantPro = CantPro;
        this.Creditos = Creditos;
    }

    

    public ArrayList getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList Clientes) {
        this.Clientes = Clientes;
    }

    public int getCantPro() {
        return CantPro;
    }

    public void setCantPro(int CantPro) {
        this.CantPro = CantPro;
    }

    public int getCreditos() {
        return Creditos;
    }

    public void setCreditos(int Creditos) {
        this.Creditos = Creditos;
    }

    @Override
    public String toString() {
        return "Asesor{" + "Clientes=" + Clientes + ", CantPro=" + CantPro + ", Creditos=" + Creditos + '}';
    }
    
    
}
