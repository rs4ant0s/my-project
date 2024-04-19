/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_GestaoStock_v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ricardo
 */
public class JFrameListarMaterialObra extends javax.swing.JFrame {

    /**
     * Creates new form JFrameListarMaterialObra
     */
    public JFrameListarMaterialObra() {
        initComponents();
        setResizable(false);
        jComboBoxMatrialobr.enable(false);
        try {
            PopularComboBoxObra();
            
        } 
        catch (Exception e) {
            System.out.println("Erro ao Inicializar " + e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxMatrialobr = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabelQuantidade = new javax.swing.JLabel();
        jComboBoxIDObra = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonListar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Material em Obra");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jComboBoxMatrialobr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMatrialobrActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantidade:");

        jLabelQuantidade.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Obra:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Matreial em Armazem");

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxIDObra, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jComboBoxMatrialobr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxIDObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxMatrialobr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAtualizar))
                .addContainerGap(10, Short.MAX_VALUE))
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

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        try {
            Atualiza();
            PopularComboBoxMaterialobr();
            
        }
        catch (Exception e) {
            System.out.println("Erro ao Listar " + e.getMessage());
        }
        jComboBoxMatrialobr.enable(true);

    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jComboBoxMatrialobrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMatrialobrActionPerformed
        try {
            atualizarQuantidadeTotal();
        } catch (Exception e) {
            System.out.println("Erro ao calcular quantidade total: " + e.getMessage());
        }
    }//GEN-LAST:event_jComboBoxMatrialobrActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        PopularComboBoxObra();
        jComboBoxIDObra.revalidate(); // Revalida a combobox para refletir as mudanças
        jComboBoxIDObra.repaint(); // Força a repintura da combobox para atualização visual
        jTextArea1.setText("");
        jLabelQuantidade.setText("");
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

     private void PopularComboBoxObra() 
    {
        jComboBoxIDObra.removeAllItems(); // Limpa todos os itens do ComboBox
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/BDGestaoStock?user=root");
            Statement stat = conn.createStatement()) {

           ResultSet resultadoQuery = stat.executeQuery("select id_obra, localizacao_obr from Obras");

           while (resultadoQuery.next()) {
               String item = resultadoQuery.getString("id_obra") + "-" + resultadoQuery.getString("localizacao_obr");
               jComboBoxIDObra.addItem(item);
           }
        } 
        catch (Exception e) {
            System.out.println("Erro ao popular combo box de Obras 1: " + e.getMessage());
        }
    }
    
    private void Atualiza() throws Exception{
     
        try {
            
            String obraEscolhida = jComboBoxIDObra.getSelectedItem().toString().split("-")[0].trim();
            
            Connection SQlCnn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/?user=root");  
            System.out.print("Ligação com sucesso");
            Statement stat1 = SQlCnn.createStatement();
            ResultSet resultadoQuery = stat1.executeQuery("Select mo.id_material_obr, m.nome, mo.quantidade_utilizada From "
                + "BDGestaoStock.Material_Obra mo "
                + "Inner Join BDGestaoStock.Material m On mo.id_material_obr = m.id_material Where mo.id_obra_obr = '" + obraEscolhida + "'");

            String texto="";
              while( resultadoQuery.next()) 
                   texto= texto + resultadoQuery.getString("nome")
                           +"\t"+ resultadoQuery.getString("quantidade_utilizada")
                           +"\n";
        
              jTextArea1.setText(texto);
              resultadoQuery.close();
              stat1.close();
              SQlCnn.close();
        }
        catch (Exception CnnErr)
                     {
                     System.out.print("Mariadb Server - problema a autualizar lista de materiais na Obra:"+CnnErr);
        }    
        
    }
    
    private void PopularComboBoxMaterialobr() 
    {
        jComboBoxMatrialobr.removeAllItems(); // Limpa todos os itens do ComboBox 
        
        String obraEscolhida = jComboBoxIDObra.getSelectedItem().toString().split("-")[0].trim();
        
       
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/BDGestaoStock?user=root");
            Statement stat = conn.createStatement()) {

           ResultSet resultadoQuery = stat.executeQuery("Select mo.id_material_obr, m.nome, mo.quantidade_utilizada From "
                + "BDGestaoStock.Material_Obra mo "
                + "Inner Join BDGestaoStock.Material m On mo.id_material_obr = m.id_material Where mo.id_obra_obr = '" + obraEscolhida + "'");

           while (resultadoQuery.next()) {
               String item = resultadoQuery.getString("nome")+ "-" + resultadoQuery.getString("quantidade_utilizada");
               jComboBoxMatrialobr.addItem(item);
           }
        } 
        catch (Exception e) {
            System.out.println("Erro ao popular combo box Material em obra 2: " + e.getMessage());
        }
    }
    
    private void atualizarQuantidadeTotal() {
    if (jComboBoxMatrialobr.getSelectedItem() != null) {
        String selectedMaterial = jComboBoxMatrialobr.getSelectedItem().toString();
        String[] parts = selectedMaterial.split("-");
        String materialName = parts[0].trim(); // Nome do material

        int totalQuantity = 0;

        // Calcular a quantidade total do material selecionado
        String obraEscolhida = jComboBoxIDObra.getSelectedItem().toString().split("-")[0].trim();
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/BDGestaoStock?user=root");
             Statement stat = conn.createStatement()) {

            ResultSet resultadoQuery = stat.executeQuery("Select mo.quantidade_utilizada " +
                    "From Material_Obra mo " +
                    "Inner Join Material m On mo.id_material_obr = m.id_material " +
                    "Where mo.id_obra_obr = '" + obraEscolhida + "' And m.nome = '" + materialName + "'");

            while (resultadoQuery.next()) {
                totalQuantity += resultadoQuery.getInt("quantidade_utilizada");
            }

            jLabelQuantidade.setText(String.valueOf(totalQuantity));

        } catch (Exception e) {
            System.out.println("Erro ao calcular quantidade total: " + e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(JFrameListarMaterialObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameListarMaterialObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameListarMaterialObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameListarMaterialObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameListarMaterialObra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JComboBox<String> jComboBoxIDObra;
    private javax.swing.JComboBox<String> jComboBoxMatrialobr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
