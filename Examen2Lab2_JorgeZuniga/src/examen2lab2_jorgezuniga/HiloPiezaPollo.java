package examen2lab2_jorgezuniga;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private String error;
    private JProgressBar ProgressBar;
    private String comida;
    private int Norden;
    private int tiempo;

    public HiloPiezaPollo(JProgressBar ProgressBar, boolean vivo, String comida, JTable tabla,int Norden,int tiempo) {
        this.ProgressBar = ProgressBar;
        this.vivo = vivo;
        this.tabla = tabla;
        this.comida = comida;
        this.tiempo = tiempo;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getNorden() {
        return Norden;
    }

    public void setNorden(int Norden) {
        this.Norden = Norden;
    }

    public JProgressBar getProgressBar() {
        return ProgressBar;
    }

    public void setProgressBar(JProgressBar ProgressBar) {
        this.ProgressBar = ProgressBar;
    }

    @Override
    public void run() {
        while (ProgressBar.getValue() < ProgressBar.getMaximum()) {
            if (vivo) {
                ProgressBar.setValue(ProgressBar.getValue() + 10);
            }
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPiezaPollo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Object row[] = {Norden,comida , tiempo};
        DefaultTableModel m = (DefaultTableModel) tabla.getModel();
        m.addRow(row);
        tabla.setModel(m);
        ProgressBar.setMaximum(0);

    }
}
