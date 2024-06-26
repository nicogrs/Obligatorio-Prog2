package interfaz; // Nicolas Rodriguez y Manuel Ackerman
import dominio.Mayorista;
import dominio.Sistema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.ImageIcon;

public class VentanaConsultaMayorista extends javax.swing.JFrame implements PropertyChangeListener{

    public VentanaConsultaMayorista(Sistema modelo) {
        this.modelo = modelo;
        this.modelo.addPropertyChangeListener(this);
        initComponents();
        ImageIcon icon = new ImageIcon("icono.png");
        this.setIconImage(icon.getImage());
        setLocationRelativeTo(null); //Centra ventana
        cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConsultaMayoristas = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMayoristas = new javax.swing.JList();
        lblProdVendidos = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstProductosVendidos = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta mayorista - Mercado");
        setResizable(false);

        jPanelConsultaMayoristas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Consulta mayoristas");

        listaMayoristas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaMayoristasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaMayoristas);

        lblProdVendidos.setText("Productos vendidos por el mayorista seleccionado:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lstProductosVendidos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstProductosVendidos);

        javax.swing.GroupLayout jPanelConsultaMayoristasLayout = new javax.swing.GroupLayout(jPanelConsultaMayoristas);
        jPanelConsultaMayoristas.setLayout(jPanelConsultaMayoristasLayout);
        jPanelConsultaMayoristasLayout.setHorizontalGroup(
            jPanelConsultaMayoristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaMayoristasLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanelConsultaMayoristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProdVendidos))
                .addGap(0, 86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaMayoristasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(56, 56, 56))
            .addGroup(jPanelConsultaMayoristasLayout.createSequentialGroup()
                .addGroup(jPanelConsultaMayoristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaMayoristasLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lblTitulo))
                    .addGroup(jPanelConsultaMayoristasLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelConsultaMayoristasLayout.setVerticalGroup(
            jPanelConsultaMayoristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaMayoristasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProdVendidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelConsultaMayoristas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelConsultaMayoristas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 588, 479);
    }// </editor-fold>//GEN-END:initComponents

    private void listaMayoristasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaMayoristasValueChanged
        if (listaMayoristas.getSelectedValue() != null){
        Mayorista may = (Mayorista) listaMayoristas.getSelectedValue();
        may.getListaProductos().sort(null);
        lstProductosVendidos.setListData(may.getListaProductos().toArray());
        }
    }//GEN-LAST:event_listaMayoristasValueChanged

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public void cargar() {
        listaMayoristas.setListData(modelo.getListaMayoristas().toArray());
    }
    
            @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargar();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanelConsultaMayoristas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblProdVendidos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList listaMayoristas;
    private javax.swing.JList lstProductosVendidos;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
} // Nicolas Rodriguez y Manuel Ackerman
