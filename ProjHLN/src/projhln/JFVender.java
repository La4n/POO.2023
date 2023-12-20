package projhln;

import Dao.DAOFactory;
import Dao.ProdDAO;
import com.sun.glass.events.WindowEvent;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projhln.JFrameP;
import projhln.ClassProd;
import javax.swing.table.DefaultTableModel;

public class JFVender extends javax.swing.JFrame {

    Connection conexao = null;
    ProdDAO ProdutoDAO = DAOFactory.criarProdDAO();
    private final DefaultComboBoxModel modelo;
 
    public JFVender() {
        initComponents();
        modelo = (DefaultComboBoxModel) CBXVender.getModel();
    
        this.setLocationRelativeTo(null);
    }
    
    private void preencherCBX() {
        
        try {
            for (ClassProd Produto : ProdutoDAO.listar()) {
                CBXVender.addItem(Produto.getProduto());
            }
        } catch (Exception e) {
            throw e;
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CBXVender = new javax.swing.JComboBox<>();
        init = new javax.swing.JLabel();
        TXTPRECO = new javax.swing.JLabel();
        Qtd = new javax.swing.JLabel();
        TXTQTD = new javax.swing.JTextField();
        BTNVender = new javax.swing.JButton();
        BTNCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        CBXVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXVenderActionPerformed(evt);
            }
        });

        init.setText("Preço:");

        TXTPRECO.setText(" ");

        Qtd.setText("Quantidade:");

        BTNVender.setText("Vender");
        BTNVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVenderActionPerformed(evt);
            }
        });

        BTNCancelar.setText("Cancelar");
        BTNCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Produto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTNVender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(init)
                                .addGap(29, 29, 29)
                                .addComponent(TXTPRECO, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Qtd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBXVender, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CBXVender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(init)
                    .addComponent(TXTPRECO))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Qtd)
                    .addComponent(TXTQTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNVender)
                    .addComponent(BTNCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBXVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXVenderActionPerformed
       ClassProd Preco = new ClassProd();
        
      for (ClassProd Produto : ProdutoDAO.listar()) {
         if (Produto.getProduto().equals(CBXVender.getItemAt(CBXVender.getSelectedIndex()))) {
             Preco.setPrecoVenda(Produto.getPrecoVenda());
                    TXTPRECO.setText(String.valueOf(Preco.getPreco()));
         }
           }
    }//GEN-LAST:event_CBXVenderActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        preencherCBX();
        ClassProd Preco = new ClassProd();
          setBackground(Color.yellow);
      for (ClassProd Produto : ProdutoDAO.listar()) {
         if (Produto.getProduto().equals(CBXVender.getItemAt(CBXVender.getSelectedIndex()))) {
             Preco.setPrecoVenda(Produto.getPrecoVenda());
                    TXTPRECO.setText(String.valueOf(Preco.getPrecoVenda()));
         }
           }
      
    }//GEN-LAST:event_formWindowGainedFocus

    private void BTNVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVenderActionPerformed
      Object[] opcao = {"Não", "Sim"};
        int Verif;
        int opcaoSelecionada = JOptionPane.showOptionDialog(this, "Deseja realmente Vender?\n", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcao, opcao[0]);
        
        if (opcaoSelecionada == 1) {
            ClassProd PComprado = new ClassProd();

            for (ClassProd Produto : ProdutoDAO.listar()) {

                if (Produto.getProduto().equals(CBXVender.getItemAt(CBXVender.getSelectedIndex()))) {
                  
                    PComprado.setPosicao(Produto.getPosicao());
                    PComprado.setQuantidade(Integer.parseInt(TXTQTD.getText()));
                    PComprado.setProduto(Produto.getProduto());
                    PComprado.setPreco(Produto.getPreco());
                    PComprado.setPrecoVenda(Produto.getPrecoVenda());
                    
         
                    Verif = ProdutoDAO.VerificarEsq(Produto.getPosicao());
                    
                    if( Verif < PComprado.getQuantidade()){
                        JOptionPane.showMessageDialog(null, "A QUANTIDADE INSERIDA É MAIOR QUE A DO ESTOQUE!!\n("+Produto.getQuantidade()+")");
                    }else{
                    PComprado.setQuantidade(Produto.getQuantidade() - PComprado.getQuantidade());
                    
                    int linha = ProdutoDAO.Comprar(PComprado);
                    if (linha > 0) {
                       float t = PComprado.getPrecoVenda()* Integer.parseInt(TXTQTD.getText());
        JOptionPane.showMessageDialog(null,"Vendido Por "+t+" R$");
        
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao Vender Produto.");
                    }
                    new JFrameP().setVisible(true);
                    this.dispose();
                }
                    
            }
            }
        }
    }//GEN-LAST:event_BTNVenderActionPerformed

    private void BTNCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCancelarActionPerformed
         this.dispose();
       new JFrameP().setVisible(true);
    }//GEN-LAST:event_BTNCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCancelar;
    private javax.swing.JButton BTNVender;
    private javax.swing.JComboBox<String> CBXVender;
    private javax.swing.JLabel Qtd;
    private javax.swing.JLabel TXTPRECO;
    private javax.swing.JTextField TXTQTD;
    private javax.swing.JLabel init;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
