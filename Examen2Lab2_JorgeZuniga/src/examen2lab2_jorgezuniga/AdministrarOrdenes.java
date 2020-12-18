/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab2_jorgezuniga;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class AdministrarOrdenes {
    private ArrayList<Ordenes> ListaOrdenes = new ArrayList();
    private File archivo = null;
    
    public AdministrarOrdenes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Ordenes> getListaOrdenes() {
        return ListaOrdenes;
    }

    public void setListaOrdenes(ArrayList<Ordenes> Ordenes) {
        this.ListaOrdenes = ListaOrdenes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setOrdenes(Ordenes a){
        ListaOrdenes.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            ListaOrdenes = new ArrayList();
            Ordenes temp;
            if (archivo.exists()) {
                FileInputStream entrada= new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Ordenes) objeto.readObject()) != null) {
                        ListaOrdenes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Ordenes t : ListaOrdenes) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
