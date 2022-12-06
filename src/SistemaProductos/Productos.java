/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaProductos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP GAMER
 */
public class Productos extends javax.swing.JInternalFrame {
    public static ArrayList<Productos_class> lista = new ArrayList(); //para almacenar las columnas
    private DefaultTableModel modelo; //
    /**
     * Creates new form Productos
     */
    public Productos() {
        initComponents();
        id_codigo.setEditable(false);//evita editar el codigo
        id_codigo.setText(lista.size()+1+"");
        modelo = new DefaultTableModel(){
            public boolean celdastabla( int fila, int columna){
                return columna == 6;
                
            }
        };
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("TIPO");
        modelo.addColumn("PROVEEDOR");
        modelo.addColumn("CALIDAD");
        modelo.addColumn("PRECIO");
        
        modelo.setRowCount(0);
        for(int i=0; i< lista.size(); i++){
          Object[] fila = new Object[7];
          fila[0] = lista.get(i).getCodigo();
          fila[1] = lista.get(i).getNombre();
          fila[2] = lista.get(i).getTipo();
          fila[3] = lista.get(i).getProveedor();
          fila[7] =lista.get(i).getCalidad();
          fila[4] = lista.get(i).getPrecio();
          modelo.addRow(fila);
          
        }
        
        tabla.setModel(modelo);
    }
     public void actualizar(){
        modelo.setRowCount(0);
        for(int i=0; i< lista.size(); i++){
          Object[] fila = new Object[7];
          fila[0] = lista.get(i).getCodigo();
          fila[1] = lista.get(i).getNombre();
          fila[2] = lista.get(i).getTipo();
          fila[3] = lista.get(i).getProveedor();
          fila[4] =lista.get(i).getCalidad();
          fila[5] = lista.get(i).getPrecio();
          modelo.addRow(fila);
          
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productos = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        calidad = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        id_codigo = new javax.swing.JTextField();
        id_nombre = new javax.swing.JTextField();
        id_calidad = new javax.swing.JTextField();
        id_precio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_limpiar = new javax.swing.JButton();
        id_proveedor = new javax.swing.JTextField();
        proveedor = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        btn_salir = new javax.swing.JButton();

        productos.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        productos.setText("PRODUCTOS");

        codigo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        codigo.setText("CODIGO");

        nombre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nombre.setText("NOMBRE");

        tipo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tipo.setText("TIPO");

        calidad.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        calidad.setText("CALIDAD");

        precio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        precio.setText("PRECIO");

        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_editar.setText("EDITAR");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        id_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_codigoActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        proveedor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        proveedor.setText("PROVEEDOR");

        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipo)
                            .addComponent(codigo)
                            .addComponent(nombre)
                            .addComponent(calidad)
                            .addComponent(precio)
                            .addComponent(proveedor))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id_nombre)
                            .addComponent(id_codigo)
                            .addComponent(id_calidad)
                            .addComponent(id_precio)
                            .addComponent(id_proveedor)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(productos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btn_guardar)
                        .addGap(120, 120, 120)
                        .addComponent(btn_editar)
                        .addGap(112, 112, 112)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(btn_limpiar)))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(productos)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigo)
                            .addComponent(id_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre)
                            .addComponent(id_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipo)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calidad)
                            .addComponent(id_calidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precio)
                            .addComponent(id_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proveedor)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_guardar)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminar)
                            .addComponent(btn_editar)
                            .addComponent(btn_limpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir)
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_codigoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        modelo.setRowCount(0);
        int variable = JOptionPane.showConfirmDialog(null, "¿ESTÁS SEGURO DE GUARDAR?"); 
        if (!id_codigo.getText().isEmpty() && !id_nombre.getText().isEmpty() && !id_precio.getText().isEmpty() && !txt_tipo.getText().isEmpty() && !id_proveedor.getText().isEmpty()){ //aumentar el  && para completar los dem[as campos
           Productos_class producto= new Productos_class(Integer.parseInt(id_codigo.getText()), txt_tipo.getText(),id_nombre.getText(), id_proveedor.getText(), id_calidad.getText(), Double.valueOf(id_precio.getText()));
           lista.add(producto);
           limpiar();
           actualizar();
           
        }else {
            JOptionPane.showMessageDialog(null, "No dejar campos vacios");
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        int selec = tabla.getSelectedRow();
        id_codigo.setText(lista.get(selec).getCodigo()+"");
        id_nombre.setText(lista.get(selec).getNombre());
        txt_tipo.setText(lista.get(selec).getTipo());     
        id_proveedor.setText(lista.get(selec).getProveedor());
        id_calidad.setText(lista.get(selec).getCalidad());
        id_precio.setText(lista.get(selec).getPrecio()+"");
        
    }//GEN-LAST:event_tablaMousePressed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        modelo.setRowCount(0);
        int variable = JOptionPane.showConfirmDialog(null, "¿ESTÁS SEGURO DE MODIFICAR?"); 
        int selec = tabla.getSelectedRow();
        lista.get(selec).setNombre(id_nombre.getText());
        lista.get(selec).setTipo(txt_tipo.getText());
        lista.get(selec).setProveedor(id_proveedor.getText());
        lista.get(selec).setCalidad(id_calidad.getText());
        lista.get(selec).setPrecio(Double.valueOf(id_precio.getText()));
        limpiar();
        actualizar();
       
    }                                             
   public void limpiar(){
       for(int i=0;i<lista.size();i++){
           int a = lista.size()+1;
           if(lista.get(i).getCodigo()==a){
             id_codigo.setText(lista.size()+234+"");  
           }
       }
       id_codigo.setText(lista.size()+1+"");
       id_nombre.setText("");
       txt_tipo.setText("");
       id_proveedor.setText("");
       id_calidad.setText("");
       id_precio.setText("");
       
   
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        modelo.setRowCount(0);
        int variable = JOptionPane.showConfirmDialog(null, "¿ESTÁS SEGURO DE ELIMINAR?");
        if (variable==0){
        int selec = tabla.getSelectedRow();
        lista.remove(selec);
        limpiar();
        actualizar();
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel calidad;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField id_calidad;
    private javax.swing.JTextField id_codigo;
    private javax.swing.JTextField id_nombre;
    private javax.swing.JTextField id_precio;
    private javax.swing.JTextField id_proveedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel productos;
    private javax.swing.JLabel proveedor;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel tipo;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables
}
