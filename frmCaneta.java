
package caneta1;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmCaneta extends javax.swing.JFrame {

    caneta1 caneta = new caneta1();

    ArrayList<caneta1> canetas = new ArrayList();
    DefaultTableModel  modelo;
    
    public frmCaneta() {
        initComponents();
    }



@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cor = new javax.swing.ButtonGroup();
        Ponta = new javax.swing.ButtonGroup();
        Estado = new javax.swing.ButtonGroup();
        TxtModelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rbbAzul = new javax.swing.JRadioButton();
        rbbPreta = new javax.swing.JRadioButton();
        rbbVermelha = new javax.swing.JRadioButton();
        rbbVerde = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbb07 = new javax.swing.JRadioButton();
        rbb10 = new javax.swing.JRadioButton();
        rbb14 = new javax.swing.JRadioButton();
        rbb16 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jSliCarga = new javax.swing.JSlider();
        jlbCarga = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jrbTampada = new javax.swing.JRadioButton();
        jrbDestampada = new javax.swing.JRadioButton();
        jbtnExibi = new javax.swing.JButton();
        jbtnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCaneta = new javax.swing.JTable();
        jbtnDelet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtModeloActionPerformed(evt);
            }
        });

        jLabel1.setText("Cor:");

        Cor.add(rbbAzul);
        rbbAzul.setText("Azul");

        Cor.add(rbbPreta);
        rbbPreta.setText("Preta");

        Cor.add(rbbVermelha);
        rbbVermelha.setText("Vermelho");

        Cor.add(rbbVerde);
        rbbVerde.setText("Verde");

        jLabel6.setText("Modelo:");

        jLabel7.setText("Ponta:");

        Ponta.add(rbb07);
        rbb07.setText("0.7");

        Ponta.add(rbb10);
        rbb10.setText("1.0");

        Ponta.add(rbb14);
        rbb14.setText("1.4");

        Ponta.add(rbb16);
        rbb16.setText("1.6");

        jLabel8.setText("Carga:");

        jSliCarga.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliCargaStateChanged(evt);
            }
        });

        jlbCarga.setText("50");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel9.setText("Estado:");

        Estado.add(jrbTampada);
        jrbTampada.setText("Tampada");
        jrbTampada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTampadaActionPerformed(evt);
            }
        });

        Estado.add(jrbDestampada);
        jrbDestampada.setText("Destampada");
        jrbDestampada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDestampadaActionPerformed(evt);
            }
        });

        jbtnExibi.setText("Exibir");
        jbtnExibi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExibiActionPerformed(evt);
            }
        });

        jbtnSair.setText("Sair");
        jbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSairActionPerformed(evt);
            }
        });

        jtCaneta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Cor", "Ponta", "Carga", "Tampada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtCaneta);

        jbtnDelet.setText("Deletar");
        jbtnDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnExibi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnDelet))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbTampada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbDestampada))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtModelo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbbAzul)
                                        .addGap(2, 2, 2)
                                        .addComponent(rbbPreta)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbbVermelha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbbVerde)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSliCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbCarga))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbb07)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbb10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbb14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbb16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(TxtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbbAzul)
                                .addComponent(rbbPreta)
                                .addComponent(rbbVermelha)
                                .addComponent(rbbVerde)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rbb07)
                            .addComponent(rbb10)
                            .addComponent(rbb14)
                            .addComponent(rbb16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jlbCarga))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jrbTampada)
                                    .addComponent(jrbDestampada)))
                            .addComponent(jSliCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(jbtnExibi)
                    .addComponent(jbtnSair)
                    .addComponent(jbtnDelet))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
         caneta = new caneta1();
         
        caneta.modelo = TxtModelo.getText();

        if (rbbAzul.isSelected()) {
            caneta.cor = rbbAzul.getText();
        } else if (rbbVermelha.isSelected()) {
            caneta.cor = rbbVermelha.getText();
        } else if (rbbPreta.isSelected()) {
            caneta.cor = rbbPreta.getText();
        } else {
            caneta.cor = rbbVerde.getText();
        }
        if (rbb07.isSelected()) {
            caneta.ponta = Float.parseFloat(rbb07.getText());
        } else if (rbb10.isSelected()) {
            caneta.ponta = Float.parseFloat(rbb10.getText());
        } else if (rbb14.isSelected()) {
            caneta.ponta = Float.parseFloat(rbb14.getText());
        } else {
            caneta.ponta = Float.parseFloat(rbb16.getText());
        }
        caneta.carga = Integer.parseInt(jlbCarga.getText());
        
        if(jrbTampada.isSelected()){
            caneta.tamp = jrbTampada.getText();
        }else if(jrbDestampada.isSelected()){
            caneta.tamp = jrbDestampada.getText();
        }
        
        
         modelo = (DefaultTableModel) jtCaneta.getModel();
         
         modelo.addRow(new Object[]{caneta.modelo,caneta.cor,caneta.ponta,caneta.carga,caneta.tamp});
      
         
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jSliCargaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliCargaStateChanged
         jlbCarga.setText(String.valueOf(jSliCarga.getValue()));
    }//GEN-LAST:event_jSliCargaStateChanged

    private void jrbTampadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTampadaActionPerformed
       int erro = caneta.tampar();

        if (erro > 0) {
            JOptionPane.showMessageDialog(this, "A caneta JÁ esta TAMPADA!!");
        }
    }//GEN-LAST:event_jrbTampadaActionPerformed

    private void jrbDestampadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDestampadaActionPerformed
          int erro = caneta.destampar();
          
        if (erro > 0) {
            JOptionPane.showMessageDialog(this, "A caneta JÁ esta DESTAMPADA!!");
        }
    }//GEN-LAST:event_jrbDestampadaActionPerformed

    private void jbtnExibiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExibiActionPerformed
        JOptionPane.showMessageDialog(this, caneta);
    }//GEN-LAST:event_jbtnExibiActionPerformed

    private void jbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnSairActionPerformed

    private void TxtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtModeloActionPerformed

    private void jbtnDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletActionPerformed
        int selecinado;

        if(jtCaneta.getSelectedRow() != -1){
            modelo.removeRow(jtCaneta.getSelectedRow());
        }else{ 
        JOptionPane.showMessageDialog(this, "!!SELECIONE UMA LINHA!!");
        }
        
    }//GEN-LAST:event_jbtnDeletActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Cor;
    private javax.swing.ButtonGroup Estado;
    private javax.swing.ButtonGroup Ponta;
    private javax.swing.JTextField TxtModelo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliCarga;
    private javax.swing.JButton jbtnDelet;
    private javax.swing.JButton jbtnExibi;
    private javax.swing.JButton jbtnSair;
    private javax.swing.JLabel jlbCarga;
    private javax.swing.JRadioButton jrbDestampada;
    private javax.swing.JRadioButton jrbTampada;
    private javax.swing.JTable jtCaneta;
    private javax.swing.JRadioButton rbb07;
    private javax.swing.JRadioButton rbb10;
    private javax.swing.JRadioButton rbb14;
    private javax.swing.JRadioButton rbb16;
    private javax.swing.JRadioButton rbbAzul;
    private javax.swing.JRadioButton rbbPreta;
    private javax.swing.JRadioButton rbbVerde;
    private javax.swing.JRadioButton rbbVermelha;
    // End of variables declaration//GEN-END:variables

}