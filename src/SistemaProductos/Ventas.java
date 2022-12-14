package SistemaProductos;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ventas extends javax.swing.JInternalFrame {

    public static ArrayList<Clase_Ventas> listaVentas = new ArrayList();
    ArrayList<Productos_class> list = Productos.lista;
    private DefaultTableModel modelo = new DefaultTableModel();

    ;

    public Ventas() {
        initComponents();
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio total");
        modelo.setRowCount(0);
        //Añade los nombres de los productos al combo
        agregarProductos();
        //Lleno mi tabla con los objetos de venta
        actualizar();
        tblVentas.setModel(modelo);
    }

    public void actualizar() {
        modelo.setRowCount(0);
        for (int i = 0; i < listaVentas.size(); i++) {

            Object[] fila = new Object[4]; //filas
            fila[0] = listaVentas.get(i).getNombre();
            fila[1] = listaVentas.get(i).getPrecio();
            fila[2] = listaVentas.get(i).getCantidad();
            fila[3] = listaVentas.get(i).getPrecio_total();
            modelo.addRow(fila);

        }

    }

    public void agregarProductos() {

        for (int i = 0; i < list.size(); i++) {

            Object[] ventas = new Object[2];
            ventas[0] = list.get(i).getNombre();
            ventas[1] = list.get(i).getPrecio();

            Comproducto.addItem(list.get(i).getNombre());
        }
    }

    public void limpiar() {
        Comproducto.setSelectedItem(listaVentas.get(0).getNombre());
        lbprecio.setText(listaVentas.get(0).getPrecio() + "");
        spinnerCantidad.setValue(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnInsertar = new javax.swing.JButton();
        Comproducto = new javax.swing.JComboBox<>();
        spinnerCantidad = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbprecio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAct = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jScrollPane1.setViewportView(jEditorPane1);

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel5.setText("VENTAS");

        tblVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblVentas.setForeground(new java.awt.Color(0, 204, 204));
        tblVentas.setModel(modelo);
        tblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblVentasMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblVentas);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnInsertar.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        Comproducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComproductoItemStateChanged(evt);
            }
        });
        Comproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComproductoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del producto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cantidad");

        lbprecio.setText("valor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Precio");

        btnAct.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(222, 222, 222))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2)
                                .addComponent(jScrollPane2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(Comproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(lbprecio)))
                                    .addGap(58, 58, 58)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(45, 45, 45))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnInsertar)
                                    .addGap(33, 33, 33)
                                    .addComponent(btnAct)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEliminar)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Comproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbprecio)
                            .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnEliminar)
                    .addComponent(btnAct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentasMousePressed
        int select = tblVentas.getSelectedRow();
        Comproducto.setSelectedItem(listaVentas.get(select).getNombre());
        lbprecio.setText(listaVentas.get(select).getPrecio() + "");
        spinnerCantidad.setValue(listaVentas.get(select).getCantidad());
    }//GEN-LAST:event_tblVentasMousePressed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

        if (!(Comproducto.getSelectedItem() == null) && (!lbprecio.getText().isEmpty()) && !(spinnerCantidad.getValue().hashCode() <= 0)) {
            int variable = JOptionPane.showConfirmDialog(null, "Desea guardar los datos?");
            if (variable == 0) {
                //Lleno mi objeto ventas
                double precioTotal = spinnerCantidad.getValue().hashCode() * Double.parseDouble(lbprecio.getText());
                Clase_Ventas cv = new Clase_Ventas(Comproducto.getSelectedItem().toString(), spinnerCantidad.getValue().hashCode(), Double.parseDouble(lbprecio.getText()), precioTotal);
                listaVentas.add(cv);
                actualizar();
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No dejar campos vacios y la cantidad debe ser mayor que 0");
        }


    }//GEN-LAST:event_btnInsertarActionPerformed

    private void ComproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComproductoActionPerformed
        int select = (Integer) Comproducto.getSelectedIndex();
        Double precio = list.get(select).getPrecio();
        lbprecio.setText(precio + " ");
    }//GEN-LAST:event_ComproductoActionPerformed

    private void ComproductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComproductoItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_ComproductoItemStateChanged

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        // TODO add your handling code here:
        if (!(Comproducto.getSelectedItem() == null) && (!lbprecio.getText().isEmpty()) && !(spinnerCantidad.getValue().hashCode() <= 0)) {
            int variable = JOptionPane.showConfirmDialog(null, "Desea actualizar los datos?");
            if (variable == 0) {
                int select = tblVentas.getSelectedRow();
                listaVentas.get(select).setNombre(Comproducto.getSelectedItem().toString());
                listaVentas.get(select).setCantidad(spinnerCantidad.getValue().hashCode());
                listaVentas.get(select).setPrecio(Double.parseDouble(lbprecio.getText()));
                double precioTotal = spinnerCantidad.getValue().hashCode() * Double.parseDouble(lbprecio.getText());
                listaVentas.get(select).setPrecio_total(precioTotal);
                limpiar();
                actualizar();
            }

        } else {
            JOptionPane.showMessageDialog(null, "no dejar campos vacios");
        }

    }//GEN-LAST:event_btnActActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (!(Comproducto.getSelectedItem() == null) && (!lbprecio.getText().isEmpty()) && !(spinnerCantidad.getValue().hashCode() <= 0)) {
            int variable = JOptionPane.showConfirmDialog(null, "Desea eliminar los datos?");
            if (variable == 0) {
                int select = tblVentas.getSelectedRow();
                listaVentas.remove(select);
                limpiar();
                actualizar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe registro seleccionado");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Comproducto;
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbprecio;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JTable tblVentas;
    // End of variables declaration//GEN-END:variables
}
