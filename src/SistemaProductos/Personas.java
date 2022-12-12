/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaProductos;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crisk18
 */
public class Personas extends javax.swing.JInternalFrame {
    public static ArrayList<Persona> list = new ArrayList();
    private DefaultTableModel modelo;
    /**
     * Creates new form Registro_Clientes
     */
    public Personas() {
        initComponents();
        modelo = new DefaultTableModel() {
            public boolean celdastabla(int fila, int columna) { //crear estructura de columna
                return columna == 6;

            }
        };
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Edad");//columnas
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.setRowCount(0);//borrar modelo
        for (int i = 0; i < list.size(); i++) {

            Object[] fila = new Object[7]; //filas
            fila[0] = list.get(i).getNombre();
            fila[1] = list.get(i).getApellido();
            fila[2] = list.get(i).getEdad();
            fila[3] = list.get(i).getCedula();
            fila[4] = list.get(i).getTelefono();
            fila[5] = list.get(i).getDireccion();
            modelo.addRow(fila);
        }

        tablapersonas.setModel(modelo);
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapersonas = new javax.swing.JTable();
        btnagregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("INGRESAR DATOS");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 21, -1, -1));

        jLabel3.setText("NOMBRE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel4.setText("APELLIDO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel5.setText("EDAD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 145, -1, -1));

        jLabel6.setText("CEDULA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 189, -1, -1));

        jLabel7.setText("TÉLEFONO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 10));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 59, 180, -1));

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 96, 180, -1));

        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });
        jPanel1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, -1));

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 170, -1));

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 180, -1));

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, 50));

        jLabel8.setText("DIRECCION:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 180, -1));

        tablapersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablapersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablapersonasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablapersonas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 420, 190));

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, 50));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, 50));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 100, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void actualizar() {
        modelo.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {

            Object[] fila = new Object[7]; //filas
            fila[0] = list.get(i).getCedula();
            fila[1] = list.get(i).getNombre();
            fila[2] = list.get(i).getApellido();
            fila[3] = list.get(i).getEdad();
            fila[4] = list.get(i).getTelefono();
            fila[5] = list.get(i).getDireccion();
            modelo.addRow(fila);
            
        }
    }
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        
        int variable = JOptionPane.showConfirmDialog(null, "Desea guardar los datos?");
        if (variable == 0) {
            if ((!txtnombre.getText().isEmpty()) && (!txtapellido.getText().isEmpty()) && (!txtedad.getText().isEmpty()) && (!txtcedula.getText().isEmpty()) && (!txttelefono.getText().isEmpty()) && (!txtdireccion.getText().isEmpty())) {
                Persona persona = new Persona(txtcedula.getText(), txtnombre.getText(), txtapellido.getText(), Integer.parseInt(txtedad.getText()), txttelefono.getText(), txtdireccion.getText());
                list.add(persona);
                limpiar();
                actualizar();
             
            } else {
                JOptionPane.showMessageDialog(null, "no dejar campos vacios");
            }
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int select=tablapersonas.getSelectedRow();
         list.get(select).setNombre(txtnombre.getText());
         list.get(select).setApellido(txtapellido.getText());
         list.get(select).setEdad(Integer.parseInt(txtedad.getText()));
         list.get(select).setCedula(txtcedula.getText());
         list.get(select).setDireccion(txtdireccion.getText());
         list.get(select).setTelefono(txttelefono.getText());
         limpiar();
         actualizar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tablapersonasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapersonasMousePressed
        // TODO add your handling code here:
        //Evento de la tabla para actualizar,lleno mis campos seleccionada
        int select=tablapersonas.getSelectedRow();
        txtnombre.setText(list.get(select).getNombre()+"");
        txtapellido.setText(list.get(select).getApellido());
        txtedad.setText(list.get(select).getEdad()+"");
        txtcedula.setText(list.get(select).getCedula());
        txtdireccion.setText(list.get(select).getDireccion());
        txttelefono.setText(list.get(select).getTelefono());
    }//GEN-LAST:event_tablapersonasMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int variable = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar los datos?");
        if (variable == 0) {
            if ((!txtnombre.getText().isEmpty()) && (!txtapellido.getText().isEmpty()) && (!txtedad.getText().isEmpty()) && (!txtcedula.getText().isEmpty()) && (!txtdireccion.getText().isEmpty())  && (!txttelefono.getText().isEmpty())) {

                int select = tablapersonas.getSelectedRow();
                list.remove(select);
                limpiar();
                actualizar();

            } else {
                JOptionPane.showMessageDialog(null, "no existe registro seleccionado");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
        Character c= evt.getKeyChar();
        if(!Character.isLetter(c)&& c!=KeyEvent.VK_SPACE){
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        // TODO add your handling code here:
        Character c= evt.getKeyChar();
        if(!Character.isLetter(c)&& c!=KeyEvent.VK_SPACE){
            evt.consume();
        }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
Character c= evt.getKeyChar();
        if(!Character.isLetter(c)&& c!=KeyEvent.VK_SPACE){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        Character c= evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtedadKeyTyped

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        Character c= evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        Character c= evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txttelefonoKeyTyped
    private void limpiar(){
        txtnombre.setText(null);
        txtapellido.setText(null);
        txtedad.setText(null);
        txtcedula.setText(null);
        txtdireccion.setText(null);
        txttelefono.setText(null);
        
        
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personas().setVisible(true);
              
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_salir1;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablapersonas;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
