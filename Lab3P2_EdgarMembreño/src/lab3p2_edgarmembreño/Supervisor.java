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
public class Supervisor extends empleados {

    public ArrayList cajeros;
    public int salarioPro;
    public int metaProme;

    public Supervisor() {
        super();
    }

    public Supervisor(ArrayList cajeros, int salarioPro, int metaProme, String user, String contra, String nombre, String apellido, String nacionalidad, int Salario) {
        super(user, contra, nombre, apellido, nacionalidad, Salario);
        this.cajeros = cajeros;
        this.salarioPro = salarioPro;
        this.metaProme = metaProme;
    }

    public ArrayList getCajeros() {
        return cajeros;
    }

    public void setCajeros(ArrayList cajeros) {
        this.cajeros = cajeros;
    }

    public int getSalarioPro() {
        return salarioPro;
    }

    public void setSalarioPro(int salarioPro) {
        this.salarioPro = salarioPro;
    }

    public int getMetaProme() {
        return metaProme;
    }

    public void setMetaProme(int metaProme) {
        this.metaProme = metaProme;
    }

    @Override
    public String toString() {
        return "Supervisor{" + "cajeros=" + cajeros + ", salarioPro=" + salarioPro + ", metaProme=" + metaProme + '}';
    }

}
