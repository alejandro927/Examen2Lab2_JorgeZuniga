package examen2lab2_jorgezuniga;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro
 */
public class HiloPiezaPollo extends Thread {

    private boolean vivo;
    private JTable tabla;
    private JProgressBar ProgressBar;
    private int Indice;
    private JComboBox combo;

    public HiloPiezaPollo(boolean vivo, JTable tabla, JProgressBar ProgressBar, int Indice, JComboBox combo) {
        this.vivo = vivo;
        this.tabla = tabla;
        this.ProgressBar = ProgressBar;
        this.Indice = Indice;
        this.combo = combo;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public JProgressBar getProgressBar() {
        return ProgressBar;
    }

    public void setProgressBar(JProgressBar ProgressBar) {
        this.ProgressBar = ProgressBar;
    }

    @Override
    public void run() {
        DefaultTableModel m = (DefaultTableModel) tabla.getModel();
        AdministrarClientes ap = new AdministrarClientes("./Clientes.jz");
        ap.cargarArchivo();
        Cliente c = (Cliente) combo.getSelectedItem();
        int orden = c.getCont();
        ArrayList<Object> comida = new ArrayList();

        for (int i = 0; i < c.getOrden().size(); i++) {
            comida.add(c.getOrden().get(i).toString());
        }

        String tiempo = "";

        while (ProgressBar.getValue() < ProgressBar.getMaximum()) {

            if (vivo) {

                if (comida.contains("Pollo")) {
                    ProgressBar.setMaximum(400);
                    ProgressBar.setValue(100);
                    
                    tiempo = "4 minutos";
                    Object row[] = {orden, "Pollo", tiempo};
                    m.addRow(row);
                    tabla.setModel(m);

                    for (int i = 0; i < ProgressBar.getMaximum(); i++) {
                        ProgressBar.setValue(i);
                        try {
                            HiloPiezaPollo.sleep(10);
                        } catch (Exception e) {
                        }
                    }
                    ProgressBar.setMaximum(0);
                }
                if (comida.contains("Biscuit")) {
                    ProgressBar.setMaximum(100);
                    tiempo = "1 minutos";
                    Object row[] = {orden, "Biscuit", tiempo};
                    m.addRow(row);
                    tabla.setModel(m);
                    for (int i = 0; i < ProgressBar.getMaximum(); i++) {
                        ProgressBar.setValue(i);
                        try {
                            HiloPiezaPollo.sleep(10);
                        } catch (Exception e) {
                        }
                    }
                    ProgressBar.setMaximum(0);
                }
                if (comida.contains("Pure")) {
                    ProgressBar.setMaximum(200);
                    tiempo = "2 minutos";
                    Object row[] = {orden, "Pure", tiempo};
                    m.addRow(row);
                    tabla.setModel(m);
                    for (int i = 0; i < ProgressBar.getMaximum(); i++) {
                        ProgressBar.setValue(i);
                        try {
                            HiloPiezaPollo.sleep(10);
                        } catch (Exception e) {
                        }
                    }
                    ProgressBar.setMaximum(0);
                }
                if (comida.contains("Papas")) {
                    ProgressBar.setMaximum(300);
                    tiempo = "3 minutos";
                    Object row[] = {orden, "Papas", tiempo};
                    m.addRow(row);
                    tabla.setModel(m);
                    for (int i = 0; i < ProgressBar.getMaximum(); i++) {
                        ProgressBar.setValue(i);
                        try {
                            HiloPiezaPollo.sleep(10);
                        } catch (Exception e) {
                        }
                    }
                    ProgressBar.setMaximum(0);
                }
                if (comida.contains("Refresco")) {
                    ProgressBar.setMaximum(100);
                    tiempo = "1 minutos";
                    Object row[] = {orden, "Refresco", tiempo};
                    m.addRow(row);
                    tabla.setModel(m);
                    for (int i = 0; i < ProgressBar.getMaximum(); i++) {
                        ProgressBar.setValue(i);
                        try {
                            HiloPiezaPollo.sleep(10);
                        } catch (Exception e) {
                        }
                    }
                    ProgressBar.setMaximum(0);
                }
                if (comida.contains("Pie")) {
                    ProgressBar.setMaximum(500);
                    tiempo = "5 minutos";
                    Object row[] = {orden, "Pie", tiempo};
                    m.addRow(row);
                    tabla.setModel(m);
                    for (int i = 0; i < ProgressBar.getMaximum(); i++) {
                        ProgressBar.setValue(i);
                        try {
                            HiloPiezaPollo.sleep(10);
                        } catch (Exception e) {
                        }
                    }
                    ProgressBar.setMaximum(0);
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPiezaPollo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
