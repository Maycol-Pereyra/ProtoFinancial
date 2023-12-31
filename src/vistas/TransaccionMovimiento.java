/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;

import clases.CabeceraTransaccionContable;
import clases.TransaccionContable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicios.Archivos;
import servicios.Convertidor;

/**
 *
 * @author User
 */
public class TransaccionMovimiento extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    /** Creates new form TransaccionMovimiento */
    public TransaccionMovimiento() {
        initComponents();
        
        LocalDate fechaActual = LocalDate.now();
        
        String fechaFormateada = fechaActual.format(formatter);
        
        fecha.setText(fechaFormateada);  
        
        this.LimpiarTabla();
        this.PopularTipoDoc();
    }

    private void PopularTipoDoc(){
        
        tipoDoc.removeAllItems();
        
        Archivos manejador = new Archivos();
        Convertidor cvt = new Convertidor();
        
        String[] datos = cvt.Separador(manejador.ObtenerDatos(manejador.TipoDocumento));
        
        for(int i=0; i<datos.length; i++){
            String item = datos[i].split("#")[1];
            tipoDoc.addItem(item);
        }
        
        tipoDoc.setSelectedIndex(0);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cuenta = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        debito = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        credito = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        descripcionCuenta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comentario = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        tipoDoc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transaccion");

        jLabel2.setText("Numero*");

        numero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numeroFocusLost(evt);
            }
        });

        jLabel3.setText("Tipo Doc.*");

        jLabel4.setText("Descripcion*");

        jLabel5.setText("Monto transaccion");

        monto.setEditable(false);

        jLabel6.setText("Cuenta*");

        cuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cuentaFocusLost(evt);
            }
        });

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha");

        fecha.setEditable(false);

        jLabel9.setText("Debito");

        debito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                debitoFocusLost(evt);
            }
        });
        debito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitoActionPerformed(evt);
            }
        });

        jLabel10.setText("Credito");

        credito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                creditoFocusLost(evt);
            }
        });

        jLabel11.setText("Desc. Cta*");

        descripcionCuenta.setEditable(false);

        jLabel12.setText("Comentario");

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Secuencia", "Cuenta", "Desc. Cta", "Debito", "Credito", "Comentario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
        }

        tipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(descripcionCuenta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(debito, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(credito, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comentario)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(368, 368, 368)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(descripcionCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(debito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(credito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(comentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        LimpiarTabla();      
    }//GEN-LAST:event_limpiarActionPerformed

    private void LimpiarTabla(){
        modeloTabla = (DefaultTableModel) tabla.getModel();
        
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);
        }
        
        monto.setText("");
    }
    
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        
        if(ValidarAgregar()){
            
            modeloTabla = (DefaultTableModel) tabla.getModel();
            
            int cant = modeloTabla.getRowCount() + 1;
            String sec = "";
            
            if(cant < 10)
                sec = "00" + cant;
            
            else if(cant >= 10 && cant < 100)
                sec = "0" + cant;
            
            else if(cant >= 100)
                sec = "" + cant;
            
            String[] Lista = {sec,
                cuenta.getText(), 
                descripcionCuenta.getText(),
                debito.getText(), 
                credito.getText(), 
                comentario.getText()};

            modeloTabla.addRow(Lista);
            
            int credito = 0;
            int debito = 0;

            for(int i=0; i<modeloTabla.getRowCount(); i++){

                String creditoStr = String.valueOf(modeloTabla.getValueAt(i, 4));
                String debitoStr = String.valueOf(modeloTabla.getValueAt(i, 3));

                if(creditoStr.equals(""))
                    credito += 0;
                else
                    credito += Integer.parseInt(creditoStr);

                if(debitoStr.equals(""))
                    debito += 0;
                else
                    debito += Integer.parseInt(debitoStr);

            }
            monto.setText(String.valueOf(Integer.max(credito, debito)));
            LimpiarAgregar();
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos requeridos", "Informacion", JOptionPane.WARNING_MESSAGE);
       
        }
        
    }//GEN-LAST:event_agregarActionPerformed

    private void LimpiarAgregar(){
        
        cuenta.setText("");
        descripcionCuenta.setText("");
        debito.setText("");
        debito.setEditable(true);
        credito.setText("");
        credito.setEditable(true);
        comentario.setText("");
    }
    
    private boolean ValidarAgregar(){
        
        if(cuenta.getText().equals(""))
            return false;
        if(descripcionCuenta.getText().equals(""))
            return false;
        if(debito.getText().equals("") && credito.getText().equals("") )
            return false;

        return true;
    }
    
    private void creditoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditoFocusLost
        
        if(!credito.getText().equals(""))
            debito.setEditable(false);
        
        if(credito.getText().equals(""))
            debito.setEditable(true);
    }//GEN-LAST:event_creditoFocusLost

    private void debitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_debitoActionPerformed

    private void debitoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_debitoFocusLost
        
        if(!debito.getText().equals(""))
            credito.setEditable(false);
        
        
        if(debito.getText().equals(""))
            credito.setEditable(true);
        
    }//GEN-LAST:event_debitoFocusLost

    private void cuentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cuentaFocusLost
        
        Archivos manejador = new Archivos();
         
        if(manejador.ValidarCatalogoCuenta(cuenta.getText())){
            boolean respuesta = Boolean.parseBoolean(manejador.ObtenerDato(manejador.CatalogoCuenta, 
                    Integer.parseInt(cuenta.getText())).split("#")[2]);
            if(respuesta == true){
                JOptionPane.showMessageDialog(null, "La cuenta no es de tipo detalle", "Error", JOptionPane.WARNING_MESSAGE);
                cuenta.setText("");
                return;
            }
            
           descripcionCuenta.setText(manejador.ObtenerCCC(cuenta.getText()).split("#")[1]);
        }
        else{
            JOptionPane.showMessageDialog(null, "La cuenta no existe", "Error", JOptionPane.WARNING_MESSAGE);
            cuenta.setText("");
        }
    }//GEN-LAST:event_cuentaFocusLost

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
                
        if(!ValidarGuardar()){
           
            JOptionPane.showMessageDialog(null, "Debe llenar los campos obligatorios", "Informacion", JOptionPane.WARNING_MESSAGE);
            return;

        }
        
        modeloTabla = (DefaultTableModel) tabla.getModel();

        
        if(modeloTabla.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla", "Informacion", JOptionPane.WARNING_MESSAGE);
            return;

        }
        
        int credito = 0;
        int debito = 0;
        
        for(int i=0; i<modeloTabla.getRowCount(); i++){
            
            String creditoStr = String.valueOf(modeloTabla.getValueAt(i, 4));
            String debitoStr = String.valueOf(modeloTabla.getValueAt(i, 3));

            if(creditoStr.equals(""))
                credito += 0;
            else
                credito += Integer.parseInt(creditoStr);
            
            if(debitoStr.equals(""))
                debito += 0;
            else
                debito += Integer.parseInt(debitoStr);

        }

        if(debito != credito){
            JOptionPane.showMessageDialog(null, "La cantidad de credito y debito no es equivalente", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Archivos manejador = new Archivos();
        Convertidor cvt = new Convertidor();
        
        CabeceraTransaccionContable ctc = new CabeceraTransaccionContable();
        
            ctc.Numero = numero.getText();
            ctc.Fecha_documento = LocalDate.parse(fecha.getText(), formatter);
            ctc.Tipo_documento = tipoDoc.getSelectedItem().toString();
            ctc.Descripcion_documento = descripcion.getText();
            ctc.Hecho_por = "master";
            ctc.Monto_transaccion = Double.parseDouble(monto.getText());
            ctc.Fecha_actualizacion = LocalDate.parse(fecha.getText(), formatter);
            ctc.Status_actualizacion = false;
        
        if(!manejador.ValidarCabecera(numero.getText())){
            
            manejador.Insertar(manejador.CabeceraTrans, cvt.CabeceraLista(ctc));
        }
        
        else{
            
            String infos = manejador.ObtenerCTC(numero.getText());
            
            if(infos.split("#")[7].equals("true")){
                JOptionPane.showMessageDialog(null, "No se puede modificar una transaccion que haya sido actualizada", "informacion", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            manejador.Actualizar(manejador.CabeceraTrans, cvt.CabeceraLista(ctc));
        }
        
        for(int i=0; i<modeloTabla.getRowCount(); i++){
            
            String secuenciaV = String.valueOf(modeloTabla.getValueAt(i, 0));
            String cuentaV = String.valueOf(modeloTabla.getValueAt(i, 1));
            
            String debitoV;
            if(modeloTabla.getValueAt(i, 3).equals(""))
                debitoV = "0";
            else
                debitoV = String.valueOf(modeloTabla.getValueAt(i, 3));
            
            String creditoV;
            if(modeloTabla.getValueAt(i, 4).equals(""))
                creditoV = "0";
            else
                creditoV = String.valueOf(modeloTabla.getValueAt(i, 4));
            
            String comentarioV;
            if(modeloTabla.getValueAt(i, 5).equals(""))
                comentarioV = " "; 
            else
                comentarioV = String.valueOf(modeloTabla.getValueAt(i, 5));

            String[] lista = {numero.getText(), secuenciaV, cuentaV, debitoV, creditoV, comentarioV};
            manejador.Insertar(manejador.TransacContable, lista);
        
        }
        
        JOptionPane.showMessageDialog(null, "Transaccion registrada con exito", "informacion", JOptionPane.WARNING_MESSAGE);
        
        Limpiar();
    }//GEN-LAST:event_guardarActionPerformed

    private void Limpiar(){
     
        LimpiarAgregar();
        LimpiarTabla();
        
        numero.setText("");
        descripcion.setText("");
        tipoDoc.setSelectedIndex(0);
    }
    
    private void numeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroFocusLost
        
        Archivos manejador = new Archivos();
        
        if(manejador.ValidarCabecera(numero.getText())){
            
            Convertidor cvt = new Convertidor();
            CabeceraTransaccionContable ctc = cvt.StringCTC(manejador.ObtenerCTC(numero.getText()));
            
            if(ctc.Status_actualizacion){
                JOptionPane.showMessageDialog(null, "Transaccion a sido actualizada", "informacion", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            numero.setText(ctc.Numero);
            tipoDoc.setSelectedItem(ctc.Tipo_documento);
            descripcion.setText(ctc.Descripcion_documento);
            monto.setText(String.valueOf(ctc.Monto_transaccion));
            
            String[] datos = cvt.Separador(manejador.ObtenerDatos(manejador.TransacContable));
            
            for(int i=0; i<datos.length; i++){
                String[] data = datos[i].split("#");
                
                String descriCuenta = manejador.ObtenerDato(manejador.CatalogoCuenta,
                        Integer.parseInt(data[2])).split("#")[1];
                
                String[] lista = {data[1], data[2], descriCuenta, data[3], data[4], data[5]};
                
                modeloTabla.addRow(lista);
            }      
        }
    }//GEN-LAST:event_numeroFocusLost

    private boolean ValidarGuardar(){
        
        if(numero.getText().equals(""))
            return false;
        if(tipoDoc.getSelectedItem().toString().equals(""))
            return false;
        if(descripcion.getText().equals(""))
            return false;
        
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(TransaccionMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransaccionMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransaccionMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransaccionMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransaccionMovimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField comentario;
    private javax.swing.JTextField credito;
    private javax.swing.JTextField cuenta;
    private javax.swing.JTextField debito;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField descripcionCuenta;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField numero;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipoDoc;
    // End of variables declaration//GEN-END:variables

}
