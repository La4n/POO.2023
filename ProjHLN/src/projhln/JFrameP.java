package projhln;

import Conexao.ConexaoSql;
import Dao.DAOFactory;
import Dao.ProdDAO;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class JFrameP extends javax.swing.JFrame {

    Connection conexao = null;
    ProdDAO ProdutoDAO = DAOFactory.criarProdDAO();
    private final DefaultTableModel modelo;

    public JFrameP() {
        initComponents();
        modelo = (DefaultTableModel) ControleEstq.getModel();

        try {
            conexao = ConexaoSql.getConexao();
            

        } catch (Exception ex) {
       
            Logger.getLogger(JFrameP.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void preencherTabela() {
        modelo.getDataVector().clear();
        try {
            for (ClassProd Produto : ProdutoDAO.listar()) {
                modelo.addRow(new Object[]{Produto.getPosicao(), Produto.getProduto(), Produto.getQuantidade(), Produto.getPreco(),
                    Produto.getCodigo()}
                );
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ControleEstq = new javax.swing.JTable();
        BtnInserir = new javax.swing.JButton();
        BrnComprar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnApagar = new javax.swing.JToggleButton();
        BtnVender = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 250));
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        ControleEstq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posicao", "Produto", "Quantidade", "Preco", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ControleEstq);

        BtnInserir.setText("Inserir");
        BtnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInserirActionPerformed(evt);
            }
        });

        BrnComprar.setText("Comprar");
        BrnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrnComprarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        BtnVender.setText("Vender");
        BtnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVenderActionPerformed(evt);
            }
        });

        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(BrnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnVender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BrnComprar, BtnEditar, BtnInserir, BtnVender, btnApagar, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnInserir)
                    .addComponent(BrnComprar)
                    .addComponent(btnSair)
                    .addComponent(btnApagar)
                    .addComponent(BtnVender)
                    .addComponent(BtnEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BrnComprar, BtnInserir, btnSair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInserirActionPerformed

        JFInserir modelo = new JFInserir();
        modelo.setVisible(true);
        modelo.pack();
        modelo.setLocationRelativeTo(null);
        modelo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BtnInserirActionPerformed

    public static void AddRowToControleEstq(Object[] dataRow) {

        DefaultTableModel modelo = (DefaultTableModel) ControleEstq.getModel();
        modelo.addRow(dataRow);

    }

    public void apagar() {
        try {
            Integer i = (Integer) modelo.getValueAt(ControleEstq.getSelectedRow(), 0);

            int linha = ProdutoDAO.apagar(i);

            if (linha > 0) {
                modelo.removeRow(ControleEstq.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Item excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Por favor, selecionar uma linha da tabela");
        }
    }

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        preencherTabela();
    }//GEN-LAST:event_formWindowGainedFocus

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed

        if(ControleEstq.getSelectedRow() != -1){
            ClassProd produto = new ClassProd();
            produto.setCodigo((int) ControleEstq.getValueAt(ControleEstq.getSelectedRow(), 0));
            apagar();
        } else {
            JOptionPane.showMessageDialog(this, "Escolha uma linha");
        }
        
        
    }//GEN-LAST:event_btnApagarActionPerformed

    private void BrnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrnComprarActionPerformed
        new JFCompra().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BrnComprarActionPerformed

    private void BtnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVenderActionPerformed
     new JFVender().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_BtnVenderActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
     new JFEditar().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_BtnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrnComprar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnInserir;
    private javax.swing.JButton BtnVender;
    private static javax.swing.JTable ControleEstq;
    private javax.swing.JToggleButton btnApagar;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
