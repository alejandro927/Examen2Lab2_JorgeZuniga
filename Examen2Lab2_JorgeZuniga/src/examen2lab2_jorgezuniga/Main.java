/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab2_jorgezuniga;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ordenes = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NombreCliente = new javax.swing.JTextField();
        Pedir = new javax.swing.JButton();
        SpinnerPollo = new javax.swing.JSpinner();
        SpinnerBiscuit = new javax.swing.JSpinner();
        SpinnerPure = new javax.swing.JSpinner();
        SpinnerPapas = new javax.swing.JSpinner();
        SpinnerRefresco = new javax.swing.JSpinner();
        SpinnerPie = new javax.swing.JSpinner();
        PiezaPollo = new javax.swing.JCheckBox();
        Biscuit = new javax.swing.JCheckBox();
        Pure = new javax.swing.JCheckBox();
        papas = new javax.swing.JCheckBox();
        Refresco = new javax.swing.JCheckBox();
        Pies = new javax.swing.JCheckBox();
        ListarClientes = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        llenar = new javax.swing.JButton();
        Simulacion = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Barra1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Simular = new javax.swing.JButton();
        Combo1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Listar = new javax.swing.JButton();
        PedirComida = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Registrar pedido");

        jLabel3.setText("Nombre del Comprador");

        Pedir.setText("Pedir");
        Pedir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PedirMouseClicked(evt);
            }
        });

        SpinnerPollo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        SpinnerBiscuit.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        SpinnerPure.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        SpinnerPapas.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        SpinnerRefresco.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        SpinnerPie.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        PiezaPollo.setText("Piezas de pollo");

        Biscuit.setText("Biscuit");

        Pure.setText("Pure");

        papas.setText("Papas");

        Refresco.setText("Refresco");

        Pies.setText("Pie");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PiezaPollo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(SpinnerPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Biscuit)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pure)
                                    .addComponent(SpinnerPure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(papas)
                                    .addComponent(SpinnerPapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Refresco)
                                    .addComponent(SpinnerRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SpinnerBiscuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(286, 286, 286)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pies)
                            .addComponent(SpinnerPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(Pedir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresco)
                    .addComponent(Pure)
                    .addComponent(Biscuit)
                    .addComponent(PiezaPollo)
                    .addComponent(papas)
                    .addComponent(Pies))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerBiscuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerPure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerPapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(Pedir)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout OrdenesLayout = new javax.swing.GroupLayout(Ordenes.getContentPane());
        Ordenes.getContentPane().setLayout(OrdenesLayout);
        OrdenesLayout.setHorizontalGroup(
            OrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        OrdenesLayout.setVerticalGroup(
            OrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Orden", "Nombre", "Elementos"
            }
        ));
        jScrollPane1.setViewportView(tabla2);

        jLabel4.setText("Clientes");

        llenar.setText("Llenar");
        llenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(llenar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(llenar)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout ListarClientesLayout = new javax.swing.GroupLayout(ListarClientes.getContentPane());
        ListarClientes.getContentPane().setLayout(ListarClientesLayout);
        ListarClientesLayout.setHorizontalGroup(
            ListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ListarClientesLayout.setVerticalGroup(
            ListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Orden", "Elemento", "Tiempo"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jLabel5.setText("Preparando");

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Simular.setText("Simular");
        Simular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Simular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(Barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(216, 216, 216))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Simular)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout SimulacionLayout = new javax.swing.GroupLayout(Simulacion.getContentPane());
        Simulacion.getContentPane().setLayout(SimulacionLayout);
        SimulacionLayout.setHorizontalGroup(
            SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SimulacionLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SimulacionLayout.setVerticalGroup(
            SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SimulacionLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("POPEYES");

        Listar.setText("Listas Pedidos");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });

        PedirComida.setText("Ordenar comida");
        PedirComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PedirComidaMouseClicked(evt);
            }
        });

        jButton2.setText("Simular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PedirComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jButton2)))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(PedirComida)
                .addGap(51, 51, 51)
                .addComponent(jButton2)
                .addGap(49, 49, 49)
                .addComponent(Listar)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PedirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedirMouseClicked
        // TODO add your handling code here:
        AdministrarOrdenes p = new AdministrarOrdenes("./Ordenez.jz");
        p.cargarArchivo();
        if (p.getListaOrdenes().size() == 0) {
            contador = 0;
        } else {
            contador = p.getListaOrdenes().get(p.getListaOrdenes().size()).getNumeroOrden() + 1;
        }
        String nombre = "";
        int cant1 = 0, cant2 = 0, cant3 = 0, cant4 = 0, cant5 = 0, cant6 = 0;
        String h1 = "", h2 = "", h3 = "", h4 = "", h5 = "", h6 = "";
        ArrayList orden = new ArrayList();
        nombre = NombreCliente.getText();

        if (PiezaPollo.isSelected()) {
            h1 = "Pollo";
            cant1 = (int) SpinnerPollo.getValue();
            if (cant1 >= 1) {
                for (int i = 0; i < cant1; i++) {
                    orden.add(h1);
                }
            }
        }
        if (Biscuit.isSelected()) {
            h2 = "Biscuit";
            cant2 = (int) SpinnerBiscuit.getValue();
            if (cant2 >= 1) {
                for (int i = 0; i < cant2; i++) {
                    orden.add(h2);
                }
            }
        }
        if (Pure.isSelected()) {
            h3 = "Pure";
            cant3 = (int) SpinnerPure.getValue();
            if (cant3 >= 1) {
                for (int i = 0; i < cant3; i++) {
                    orden.add(h3);
                }
            }
        }
        if (papas.isSelected()) {
            h4 = "Papas";
            cant4 = (int) SpinnerPapas.getValue();
            if (cant4 >= 1) {
                for (int i = 0; i < cant4; i++) {
                    orden.add(h4);
                }
            }
        }
        if (Refresco.isSelected()) {
            h5 = "Refresco";
            cant5 = (int) SpinnerRefresco.getValue();
            if (cant5 >= 1) {
                for (int i = 0; i < cant5; i++) {
                    orden.add(h5);
                }
            }
        }
        if (Pies.isSelected()) {
            h6 = "Pie";
            cant6 = (int) SpinnerPie.getValue();
            for (int i = 0; i < cant6; i++) {
                orden.add(h6);
            }
        }
        Cliente client = new Cliente(nombre, orden, contador);
        Ordenes ordenes = new Ordenes(orden, contador);

        AdministrarOrdenes oo = new AdministrarOrdenes("./Odenes.jz");
        oo.cargarArchivo();
        oo.setOrdenes(ordenes);
        oo.escribirArchivo();

        AdministrarClientes cc = new AdministrarClientes("./Clientes.jz");
        cc.cargarArchivo();
        cc.setPelicula(client);
        cc.escribirArchivo();

        AdministrarClientes pp = new AdministrarClientes("./Clientes.jz");
        pp.cargarArchivo();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < pp.getListaClientes().size(); i++) {
            modelo.addElement(pp.getListaClientes().get(i));
        }
        Combo1.setModel(modelo);

        Simulacion.pack();
        Simulacion.setLocationRelativeTo(this);
        Simulacion.setVisible(true);
        Ordenes.setVisible(false);

    }//GEN-LAST:event_PedirMouseClicked

    private void llenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarActionPerformed
        // TODO add your handling code here:

        tabla.setModel(new javax.swing.table.DefaultTableModel(new Object[][][][]{}, new String[]{"Numero", "Nombre", "Elementos"}
        ) {
            Class[] types = new Class[]{java.lang.String.class, java.lang.String.class, java.lang.String.class};

            boolean[] canEdit = new boolean[]{
                false, false, false};

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });


    }//GEN-LAST:event_llenarActionPerformed

    private void PedirComidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedirComidaMouseClicked
        // TODO add your handling code here:
        Ordenes.setLocationRelativeTo(this);
        Ordenes.pack();
        Ordenes.setVisible(true);
    }//GEN-LAST:event_PedirComidaMouseClicked

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
        // TODO add your handling code here:
        ListarClientes.setLocationRelativeTo(this);
        ListarClientes.pack();
        ListarClientes.setVisible(true);
    }//GEN-LAST:event_ListarActionPerformed

    private void SimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimularActionPerformed
        // TODO add your handling code here:
        try {

            AdministrarOrdenes o = new AdministrarOrdenes("./Ordenes.jz");
            o.cargarArchivo();

        } catch (Exception e) {
        }


    }//GEN-LAST:event_SimularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Simulacion.setLocationRelativeTo(this);
        Simulacion.pack();
        Simulacion.setVisible(true);
        Ordenes.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Simulacion.setLocationRelativeTo(this);
        Simulacion.pack();
        Simulacion.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra1;
    private javax.swing.JCheckBox Biscuit;
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JButton Listar;
    private javax.swing.JDialog ListarClientes;
    private javax.swing.JTextField NombreCliente;
    private javax.swing.JDialog Ordenes;
    private javax.swing.JButton Pedir;
    private javax.swing.JButton PedirComida;
    private javax.swing.JCheckBox Pies;
    private javax.swing.JCheckBox PiezaPollo;
    private javax.swing.JCheckBox Pure;
    private javax.swing.JCheckBox Refresco;
    private javax.swing.JDialog Simulacion;
    private javax.swing.JButton Simular;
    private javax.swing.JSpinner SpinnerBiscuit;
    private javax.swing.JSpinner SpinnerPapas;
    private javax.swing.JSpinner SpinnerPie;
    private javax.swing.JSpinner SpinnerPollo;
    private javax.swing.JSpinner SpinnerPure;
    private javax.swing.JSpinner SpinnerRefresco;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton llenar;
    private javax.swing.JCheckBox papas;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
    private int contador;

}