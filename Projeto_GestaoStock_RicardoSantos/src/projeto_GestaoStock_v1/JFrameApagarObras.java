/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_GestaoStock_v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author ricardo
 */
public class JFrameApagarObras extends javax.swing.JFrame {

    /**
     * Creates new form JFrameApagarObras
     */
    
    MaskFormatter mfdata;
    MaskFormatter mfdata1;
    
    public JFrameApagarObras() {
       
         try {
            mfdata = new MaskFormatter("####-##-##");
        } catch (ParseException ex) {
            System.out.print("Erro na criação da máscara");   
        }
        
         try {
            mfdata1 = new MaskFormatter("####-##-##");
        } catch (ParseException ex) {
            System.out.print("Erro na criação da máscara");   
        }
        
        initComponents();
        
        setResizable(false);
        try{
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
        jFDataFim = new javax.swing.JFormattedTextField(mfdata);
        jLabel1 = new javax.swing.JLabel();
        jSpinnerIDObra = new javax.swing.JSpinner();
        jButtonProcurar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonApagar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jFDataInicio1 = new javax.swing.JFormattedTextField(mfdata1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Apagar Obra");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jFDataFim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFDataFimFocusLost(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID_Obra:");

        jButtonProcurar.setText("Procurar");
        jButtonProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Localização:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data-Inicio:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data-Conclusão:");

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

        jFDataInicio1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFDataInicio1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinnerIDObra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButtonProcurar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jFDataInicio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinnerIDObra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProcurar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jFDataInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            ResultSet resultadoQuery = stat1.executeQuery("Select Max(id_obra) as max_id From BDGestaoStock.Obras");

            int novoID =0; 
            if( resultadoQuery.next()) {
                int maxID= resultadoQuery.getInt("max_id");
                novoID = maxID;
            }

            //texto=texto.replaceAll("null","  ");
            jSpinnerIDObra.setValue(novoID);
            resultadoQuery.close();
            stat1.close();
            SQlCnn.close();
            }
        catch (Exception CnnErr)
            {
                System.out.print("Mariadb Server - problema:"+CnnErr);
            }

    }
    
     private void LimparCampos(){
        jSpinnerIDObra.setEnabled(true);
        jTextField2.setText("");
        jFDataInicio1.setText("");
        jFDataFim.setText("");
         try 
        {
            UltimoID();
        } 
        catch (Exception e) 
        {
            System.out.println("Erro ao obter o último ID: " + e.getMessage());
        }
    }
    
    private void jButtonProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarActionPerformed
        try {
            // Estabelece conexão com o base de dados
            Connection SQlCnn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/?user=root");
            System.out.print("Ligação com sucesso");

            // Obtém o ID selecionado no JSpinner
            int idSelecionado = (int) jSpinnerIDObra.getValue();

            // Cria uma consulta SQL para recuperar os dados do material com o ID selecionado
            String query = "Select * From BDGestaoStock.Obras where id_obra = " + idSelecionado;

            Statement stat1 = SQlCnn.createStatement();
            ResultSet resultadoQuery = stat1.executeQuery(query);

            // Se houver resultados
            if (resultadoQuery.next()) {
                // Preenche os campos de texto com os valores do resultado
                jTextField2.setText(resultadoQuery.getString("localizacao_obr"));
                jFDataInicio1.setText(resultadoQuery.getString("data_inicio"));
                jFDataFim.setText(resultadoQuery.getString("data_conclusao"));
            } else {
                // Limpa os campos de texto se não houver resultados
                jTextField2.setText("");
                jFDataInicio1.setText("");
                jFDataFim.setText("");
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
        jSpinnerIDObra.setEnabled(false);
        jTextField2.setEnabled(false);
        jFDataInicio1.setEnabled(false);
        jFDataFim.setEnabled(false);
    }//GEN-LAST:event_jButtonProcurarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        try {
            Connection SQlCnn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/?user=root");
            System.out.print("Ligação com sucesso");

            int idSelecionado = (int) jSpinnerIDObra.getValue();

            // Exibe uma caixa de diálogo de confirmação
            int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir"
                    + " esta Obra?", "Apagar Obra", JOptionPane.YES_NO_OPTION);

            // Se o usuário confirmar
            if (resposta == JOptionPane.YES_OPTION) {
                String query = "Delete From BDGestaoStock.Obras Where id_obra = " + idSelecionado;

                // Cria um Statement para executar a consulta
                Statement statement = SQlCnn.createStatement();
                int linhasAfetadas = statement.executeUpdate(query);

                // Verifica se a exclusão foi bem-sucedida
                if (linhasAfetadas > 0) {
                    System.out.println("Obra Apagada com sucesso.");
                    JOptionPane.showMessageDialog(this,"Obra Apagada com Sucesso");
                    LimparCampos();
                }
                else {
                    System.out.println("Falha a apagar a Obra. O ID especificado pode não existir.");
                    JOptionPane.showMessageDialog(this,"!!!Falha a apagar Obra!!!");
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

    private void jFDataInicio1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFDataInicio1FocusLost
        //        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
        //
        //        try {
            //            Date date = sdf1.parse(jFDataInicio1.getText());
            //            jFDataInicio1.setValue(sdf1.format(date));
            //
            //        } catch (ParseException e) {
            //            jFDataInicio1.setFocusLostBehavior(JFormattedTextField.PERSIST);
            //            jFDataInicio1.setText("");
            //            jFDataInicio1.setValue(null);
            //        }
    }//GEN-LAST:event_jFDataInicio1FocusLost

    private void jFDataFimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFDataFimFocusLost
        //        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        //
        //        try {
            //            Date date = sdf.parse(jFDataFim.getText());
            //            jFDataFim.setValue(sdf.format(date));
            //
            //        } catch (ParseException e) {
            //            jFDataFim.setFocusLostBehavior(JFormattedTextField.PERSIST);
            //            jFDataFim.setText("");
            //            jFDataFim.setValue(null);
            //        }
    }//GEN-LAST:event_jFDataFimFocusLost

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
            java.util.logging.Logger.getLogger(JFrameApagarObras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameApagarObras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameApagarObras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameApagarObras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameApagarObras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonProcurar;
    private javax.swing.JFormattedTextField jFDataFim;
    private javax.swing.JFormattedTextField jFDataInicio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerIDObra;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
