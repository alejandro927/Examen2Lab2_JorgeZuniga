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
public class Ordenes implements Serializable {

    private ArrayList Orden;
    private int NumeroOrden;
    private static final long SerialVersionUID = 888L;

    public Ordenes() {
    }

    public Ordenes(ArrayList Orden, int NumeroOrden) {
        this.Orden = Orden;
        this.NumeroOrden = NumeroOrden;
    }


    public ArrayList getOrden() {
        return Orden;
    }

    public void setOrden(ArrayList Orden) {
        this.Orden = Orden;
    }

    public int getNumeroOrden() {
        return NumeroOrden;
    }

    public void setNumeroOrden(int NumeroOrden) {
        this.NumeroOrden = NumeroOrden;
    }

    @Override
    public String toString() {
        return "Orden=" + Orden + ", NumeroOrden=" + NumeroOrden;
    }

}
