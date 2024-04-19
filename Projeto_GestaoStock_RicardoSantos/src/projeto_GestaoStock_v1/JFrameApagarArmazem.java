/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_GestaoStock_v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardo
 */
public class JFrameApagarArmazem extends javax.swing.JFrame {

    /**
     * Creates new form JFrameApagarArmazem
     */
    public JFrameApagarArmazem() {
        initComponents();
        setResizable(false);
        try {
            UltimoID();
        } 
        catch (Exception e){
            System.out.println("Erro ao obter o último ID: " + e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jTextFieldNomeAmz = new javax.swing.JTextField();
        jTextFieldDescricaoAmz = new javax.swing.JTextField();
        jButtonApagar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jSpinnerIDAmz = new javax.swing.JSpinner();
        jButtonProcurar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Apagar Armazem ");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonProcurar.setText("Procurar");
        jButtonProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID_Material :");

        jLabel2.setText("Nome:");

        jLabel3.setText("Descrição:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinnerIDAmz, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonProcurar))
                            .addComponent(jTextFieldNomeAmz, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDescricaoAmz, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerIDAmz, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProcurar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeAmz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricaoAmz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void UltimoID() throws Exception{
        try {
            /* Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection SQlCnn = DriverManager.getConnection("jdbc:sqlserver://localhost\\EXEMPLO2:64201;databaseName=Fornecedores; user=lixo; password=1");*/
            Connection SQlCnn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/?user=root");  
            System.out.print("Ligação com sucesso");
            Statement stat1 = SQlCnn.createStatement();
            ResultSet resultadoQuery = stat1.executeQuery("Select Max(id_armazem) as max_id From BDGestaoStock.Armazens");

            int novoID =0;
            if( resultadoQuery.next()) {
                int maxID= resultadoQuery.getInt("max_id");
                novoID = maxID;
            }

            //texto=texto.replaceAll("null","  ");
            jSpinnerIDAmz.setValue(novoID);
            resultadoQuery.close();
            stat1.close();
            SQlCnn.close();
            }
        catch (Exception CnnErr)
            {
                System.out.print("Mariadb Server - problema:"+CnnErr);
            }

    }
    
    private void LimparCampos()
    {
        jSpinnerIDAmz.setEnabled(true);
        jTextFieldNomeAmz.setText("");
        jTextFieldDescricaoAmz.setText("");
        try 
        {
            UltimoID();
        } 
        catch (Exception e) 
        {
            System.out.println("Erro ao obter o último ID: " + e.getMessage());
        }
        
    }
    
    
    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        try {
            Connection SQlCnn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/?user=root");
            System.out.print("Ligação com sucesso");

            int idSelecionado = (int) jSpinnerIDAmz.getValue();

            // Exibe uma caixa de diálogo de confirmação
            int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir"
                    + " este Armazem ?", "Apagar Armazem", JOptionPane.YES_NO_OPTION);

            // Se o usuário confirmar
            if (resposta == JOptionPane.YES_OPTION) {
                String query = "Delete From BDGestaoStock.Armazens Where id_armazem = " + idSelecionado;

                // Cria um Statement para executar a consulta
                Statement statement = SQlCnn.createStatement();
                int linhasAfetadas = statement.executeUpdate(query);

                // Verifica se a exclusão foi bem-sucedida
                if (linhasAfetadas > 0) {
                    System.out.println("Armazem Apagado com sucesso.");
                    JOptionPane.showMessageDialog(this,"Armazem Apagado com Sucesso");
                    LimparCampos();
                }
                else {
                    System.out.println("Falha a Apagar o Armazem. O ID especificado pode não existir.");
                    JOptionPane.showMessageDialog(this,"!!!Falha a Apagar Armazem!!!");
                    LimparCampos();
                }
                    statement.close();
                }
                SQlCnn.close();
            } 
        catch (Exception e) {
            // Lida com exceções
            System.out.println("Erro: " + e);
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        LimparCampos();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarActionPerformed
        try {
            // Estabelece conexão com o base de dados
            Connection SQlCnn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/?user=root");
            System.out.print("Ligação com sucesso");

            // Obtém o ID selecionado no JSpinner
            int idSelecionado = (int) jSpinnerIDAmz.getValue();

            // Cria uma consulta SQL para recuperar os dados do material com o ID selecionado
            String query = "Select * From BDGestaoStock.Armazens where id_armazem = " + idSelecionado;

            Statement stat1 = SQlCnn.createStatement();
            ResultSet resultadoQuery = stat1.executeQuery(query);

            // Se houver resultados
            if (resultadoQuery.next()) {
                // Preenche os campos de texto com os valores do resultado
                jTextFieldNomeAmz.setText(resultadoQuery.getString("nome_amz"));
                jTextFieldDescricaoAmz.setText(resultadoQuery.getString("localizacao_amz"));

            } else {
                // Limpa os campos de texto se não houver resultados
                jTextFieldNomeAmz.setText("");
                jTextFieldDescricaoAmz.setText("");

            }
            // Fecha os recursos
            resultadoQuery.close();
            stat1.close();
            SQlCnn.close();
        }
        catch (Exception CnnErr) {
            // Lida com exceções
            System.out.print("Mariadb Server - problema:" + CnnErr);
        }
        jSpinnerIDAmz.setEnabled(false);
    }//GEN-LAST:event_jButtonProcurarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameApagarArmazem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameApagarArmazem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameApagarArmazem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameApagarArmazem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameApagarArmazem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonProcurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerIDAmz;
    private javax.swing.JTextField jTextFieldDescricaoAmz;
    private javax.swing.JTextField jTextFieldNomeAmz;
    // End of variables declaration//GEN-END:variables
}
