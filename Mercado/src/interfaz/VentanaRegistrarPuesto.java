package interfaz; // Nicolas Rodriguez y Manuel Ackerman

import dominio.Dueño;
import dominio.Sistema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import utilidades.Utilidades;

public class VentanaRegistrarPuesto extends javax.swing.JFrame implements PropertyChangeListener {

    private Utilidades util;

    public VentanaRegistrarPuesto(Sistema modelo) {
        this.modelo = modelo;
        this.modelo.addPropertyChangeListener(this);
        this.util = new Utilidades();
        initComponents();
        ImageIcon icon = new ImageIcon("icono.png");
        this.setIconImage(icon.getImage());
        setLocationRelativeTo(null); //Centra ventana
        cargar();
        lblReingresoIdentificación.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRegistrarPuesto = new javax.swing.JPanel();
        lblIdentificacion = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblEmpleados = new javax.swing.JLabel();
        btnCrearPuesto = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();
        fieldIdentificacion = new javax.swing.JTextField();
        spinnerEmpleados = new javax.swing.JSpinner();
        lblRegistrarDueño = new javax.swing.JLabel();
        fieldUbicacion = new javax.swing.JTextField();
        lblDueño = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDueño = new javax.swing.JList();
        lblReingresoIdentificación = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar puesto - Mercado");
        setResizable(false);

        lblIdentificacion.setText("Identificación:");

        lblUbicacion.setText("Ubicación:");

        lblEmpleados.setText("Empleados");

        btnCrearPuesto.setText("Crear puesto");
        btnCrearPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPuestoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        fieldIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIdentificacionActionPerformed(evt);
            }
        });

        spinnerEmpleados.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lblRegistrarDueño.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblRegistrarDueño.setText("Registrar puesto");

        fieldUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUbicacionActionPerformed(evt);
            }
        });

        lblDueño.setText("Dueño:");

        listaDueño.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaDueño);

        lblReingresoIdentificación.setForeground(new java.awt.Color(255, 0, 0));
        lblReingresoIdentificación.setText("* Reingrese la identificación");

        javax.swing.GroupLayout jPanelRegistrarPuestoLayout = new javax.swing.GroupLayout(jPanelRegistrarPuesto);
        jPanelRegistrarPuesto.setLayout(jPanelRegistrarPuestoLayout);
        jPanelRegistrarPuestoLayout.setHorizontalGroup(
            jPanelRegistrarPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarPuestoLayout.createSequentialGroup()
                .addGap(44, 121, Short.MAX_VALUE)
                .addGroup(jPanelRegistrarPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarPuestoLayout.createSequentialGroup()
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarPuestoLayout.createSequentialGroup()
                            .addGroup(jPanelRegistrarPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelRegistrarPuestoLayout.createSequentialGroup()
                                    .addComponent(lblUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelRegistrarPuestoLayout.createSequentialGroup()
                                    .addComponent(lblDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelRegistrarPuestoLayout.createSequentialGroup()
                                    .addComponent(lblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(spinnerEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelRegistrarPuestoLayout.createSequentialGroup()
                                    .addComponent(lblIdentificacion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanelRegistrarPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelRegistrarPuestoLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(lblReingresoIdentificación))
                                        .addComponent(fieldIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(135, 135, 135)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarPuestoLayout.createSequentialGroup()
                        .addComponent(lblRegistrarDueño)
                        .addGap(170, 170, 170))))
        );
        jPanelRegistrarPuestoLayout.setVerticalGroup(
            jPanelRegistrarPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarPuestoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblRegistrarDueño)
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdentificacion))
                .addGap(1, 1, 1)
                .addComponent(lblReingresoIdentificación)
                .addGap(1, 1, 1)
                .addGroup(jPanelRegistrarPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarPuestoLayout.createSequentialGroup()
                        .addComponent(lblDueño)
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUbicacion))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpleados))
                .addGap(25, 25, 25)
                .addGroup(jPanelRegistrarPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCrearPuesto))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRegistrarPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRegistrarPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 559, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPuestoActionPerformed
        fieldIdentificacion.setBorder(BorderFactory.createLineBorder(util.COLOR_NEGRO));
        lblReingresoIdentificación.setVisible(false);
        String identificacion = fieldIdentificacion.getText();
        Dueño dueño = (Dueño) listaDueño.getSelectedValue();
        String ubicacion = fieldUbicacion.getText();
        int empleados = (int) spinnerEmpleados.getValue();
        //Validaciones de Puesto
        if (util.validarTxt(identificacion)) {
            String mensaje = "";
            if (modelo.puestoUnico(identificacion)) { // Si puesto es único
                modelo.agregarPuesto(identificacion, dueño, ubicacion, empleados);
                mensaje = "Puesto '" + identificacion + "' creado correctamente.";
                this.recargar();
            } else { // Si identificacion de puesto ya existe
                mensaje = "Ya existe un puesto identificado como '" + identificacion + "'.\nLa identificación del puesto debe ser única.";
                fieldIdentificacion.setBorder(BorderFactory.createLineBorder(util.COLOR_ROJO));
                lblReingresoIdentificación.setVisible(true);
            }
            JOptionPane.showMessageDialog(this, mensaje, "Informacion del sistema.", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "La identificación del puesto no puede ser vacía. Ingreselo.",
                    "Informacion del sistema.", JOptionPane.ERROR_MESSAGE);
            fieldIdentificacion.setBorder(BorderFactory.createLineBorder(util.COLOR_ROJO));
            lblReingresoIdentificación.setVisible(true);
        }
        this.btnCrearPuesto.setSelected(false);
    }//GEN-LAST:event_btnCrearPuestoActionPerformed

    private void fieldIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIdentificacionActionPerformed

    private void fieldUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUbicacionActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void cargar() {
        if (modelo.getListaDueños().size() > 0) {
            modelo.getListaDueños().sort(null);
        }
        listaDueño.setListData(modelo.getListaDueños().toArray());
    }

    public void recargar() {
        fieldIdentificacion.setText("");
        fieldUbicacion.setText("");
        spinnerEmpleados.setValue(0);
        cargar();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnCrearPuesto;
    private javax.swing.JTextField fieldIdentificacion;
    private javax.swing.JTextField fieldUbicacion;
    private javax.swing.JPanel jPanelRegistrarPuesto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDueño;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblRegistrarDueño;
    private javax.swing.JLabel lblReingresoIdentificación;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JList listaDueño;
    private javax.swing.JSpinner spinnerEmpleados;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
} // Nicolas Rodriguez y Manuel Ackerman
