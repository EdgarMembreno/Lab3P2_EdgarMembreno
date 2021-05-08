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
public class Clientes {

    public String nombre;
    public String apellido;
    public int Salario;
    public String nacionalidad;
    public int cantCredito;
    public ArrayList ProCompra;
    public int cantCompra;
    public String direccion;
    public String usuario;
    public String contra;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, int Salario, String nacionalidad, int cantCredito, ArrayList ProCompra, int cantCompra, String direccion, String usuario, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Salario = Salario;
        this.nacionalidad = nacionalidad;
        this.cantCredito = cantCredito;
        this.ProCompra = ProCompra;
        this.cantCompra = cantCompra;
        this.direccion = direccion;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getCantCredito() {
        return cantCredito;
    }

    public void setCantCredito(int cantCredito) {
        this.cantCredito = cantCredito;
    }

    public ArrayList getProCompra() {
        return ProCompra;
    }

    public void setProCompra(ArrayList ProCompra) {
        this.ProCompra = ProCompra;
    }

    public int getCantCompra() {
        return cantCompra;
    }

    public void setCantCompra(int cantCompra) {
        this.cantCompra = cantCompra;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", Salario=" + Salario + ", nacionalidad=" + nacionalidad + ", cantCredito=" + cantCredito + ", ProCompra=" + ProCompra + ", cantCompra=" + cantCompra + ", direccion=" + direccion + ", usuario=" + usuario + ", contra=" + contra + '}';
    }
    
    

}
