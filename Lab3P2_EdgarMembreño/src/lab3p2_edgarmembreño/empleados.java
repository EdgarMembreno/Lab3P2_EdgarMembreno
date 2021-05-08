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
public class empleados {
    private String user;
    private String contra;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int Salario;

    public empleados() {
        super();
    }
    

    public empleados(String user, String contra, String nombre, String apellido, String nacionalidad, int Salario) {
        this.user = user;
        this.contra = contra;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.Salario = Salario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return "empleados{" + "user=" + user + ", contra=" + contra + ", nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", Salario=" + Salario + '}';
    }
    
    
           
    
}
