/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab2_jorgezuniga;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Cliente implements Serializable{
    private String nombre;
    private ArrayList orden;
    private int cont;
private static final long SerialVersionUID=777L;
    public Cliente() {
    }

    public Cliente(String nombre, ArrayList orden, int cont) {
        this.nombre = nombre;
        this.orden = orden;
        this.cont = cont;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getOrden() {
        return orden;
    }

    public void setOrden(ArrayList orden) {
        this.orden = orden;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Orden=" + orden + ", Numero de Orden=" + cont;
    }
    
}
