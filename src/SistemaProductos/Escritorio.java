/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaProductos;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Panel;
import javax.swing.Icon;
import javax.swing.ImageIcon;



/**
 *
 * @author wills
 */
public class Escritorio extends javax.swing.JFrame {

    /**
     * Creates new form Escritorio
     */
    public Escritorio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);

        ImageIcon imagen = new ImageIcon("src/SistemaProductos/IMAGENES/fondomenu.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblTotal.getWidth(), lblTotal.getHeight(), Image.SCALE_DEFAULT));
        lblTotal.setIcon(icono);
        this.repaint();
        ImageIcon imagen1 = new ImageIcon("src/SistemaProductos/IMAGENES/logo2.jpg");
        Icon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(lbTtotal2.getWidth(), lbTtotal2.getHeight(), Image.SCALE_DEFAULT));
        lbTtotal2.setIcon(icono1);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JDesktopPane();
        lbTtotal2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMenu.add(lbTtotal2);
        lbTtotal2.setBounds(1100, 550, 250, 120);
        panelMenu.add(lblTotal);
        lblTotal.setBounds(0, 0, 1472, 796);

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu1.setText("USUARIOS");
        jMenu1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaProductos/IMAGENES/USUARIO.png"))); // NOI18N
        jMenuItem1.setText("NUEVO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaProductos/IMAGENES/LISTA.png"))); // NOI18N
        jMenuItem2.setText("LISTA");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu2.setText("PERSONAS");
        jMenu2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaProductos/IMAGENES/USUARIO.png"))); // NOI18N
        jMenuItem3.setText("NUEVO");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaProductos/IMAGENES/LISTA.png"))); // NOI18N
        jMenuItem4.setText("LISTA");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu3.setText("PRODUCTOS");
        jMenu3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaProductos/IMAGENES/USUARIO.png"))); // NOI18N
        jMenuItem5.setText("NUEVO");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaProductos/IMAGENES/LISTA.png"))); // NOI18N
        jMenuItem6.setText("LISTA");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu4.setText("VENTAS");
        jMenu4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaProductos/IMAGENES/USUARIO.png"))); // NOI18N
        jMenuItem7.setText("NUEVO");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaProductos/IMAGENES/LISTA.png"))); // NOI18N
        jMenuItem8.setText("LISTA");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu5.setForeground(new java.awt.Color(255, 0, 0));
        jMenu5.setText("SALIR");
        jMenu5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaProductos/IMAGENES/EXIT.png"))); // NOI18N
        jMenuItem9.setText("SALIR");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       lista_usuario usuario = new lista_usuario();
        panelMenu.add(usuario);
        Dimension destopSize = panelMenu.getSize();
        Dimension FrameSize = usuario.getSize();
        usuario.setLocation(
                (destopSize.width - FrameSize.width) / 2,
                (destopSize.height - FrameSize.height) / 2);
        usuario.show();
        usuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Personas personas = new Personas();
        panelMenu.add(personas);
        Dimension destopSize = panelMenu.getSize();
        Dimension FrameSize = personas.getSize();
        personas.setLocation(
                (destopSize.width - FrameSize.width) / 2,
                (destopSize.height - FrameSize.height) / 2);
        personas.show();
        personas.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        Productos productos = new Productos();
        panelMenu.add(productos);
        Dimension destopSize = panelMenu.getSize();
        Dimension FrameSize = productos.getSize();
        productos.setLocation(
                (destopSize.width - FrameSize.width) / 2,
                (destopSize.height - FrameSize.height) / 2);
        productos.show();
        productos.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    usuarios usuario = new usuarios();
        panelMenu.add(usuario);
        Dimension destopSize = panelMenu.getSize();
        Dimension FrameSize = usuario.getSize();
        usuario.setLocation(
                (destopSize.width - FrameSize.width) / 2,
                (destopSize.height - FrameSize.height) / 2);
        usuario.show();
        usuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       Login rojo = new Login();
      rojo.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
Ventas usuario = new Ventas();
        panelMenu.add(usuario);
        Dimension destopSize = panelMenu.getSize();
        Dimension FrameSize = usuario.getSize();
        usuario.setLocation(
                (destopSize.width - FrameSize.width) / 2,
                (destopSize.height - FrameSize.height) / 2);
        usuario.show();
        usuario.setVisible(true);      
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
     
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
Lista_productos productos = new Lista_productos();
        panelMenu.add(productos);
        Dimension destopSize = panelMenu.getSize();
        Dimension FrameSize = productos.getSize();
        productos.setLocation(
                (destopSize.width - FrameSize.width) / 2,
                (destopSize.height - FrameSize.height) / 2);
        productos.show();
        productos.setVisible(true);         
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lbTtotal2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JDesktopPane panelMenu;
    // End of variables declaration//GEN-END:variables
}
