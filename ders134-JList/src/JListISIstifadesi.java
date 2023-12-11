
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class JListISIstifadesi extends javax.swing.JFrame {

    DefaultListModel model = new DefaultListModel();

    /**
     * Creates new form JListISIstifadesi
     */
    public JListISIstifadesi() {
        initComponents();
        IstifadeciList.setModel(model);//modele Cevirdik
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MesalLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        IstifadeciList = new javax.swing.JList<>();
        SilBtn = new javax.swing.JButton();
        ElaveEtBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Istifadeciler");

        MesalLabel.setForeground(new java.awt.Color(255, 51, 51));

        IstifadeciList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(IstifadeciList);

        SilBtn.setText("Istifadeci Sil");
        SilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilBtnActionPerformed(evt);
            }
        });

        ElaveEtBtn.setText("Istifadeci Elavve Et");
        ElaveEtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElaveEtBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ElaveEtBtn))
                            .addComponent(MesalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(SilBtn)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(MesalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ElaveEtBtn)
                    .addComponent(SilBtn))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ElaveEtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElaveEtBtnActionPerformed
        // TODO add your handling code here:
         MesalLabel.setText("");
        String cavab = JOptionPane.showInputDialog("İstifadəçi adı");
        if (cavab != null) {
            if (cavab.trim().equals("")) {
                MesalLabel.setText("Boş bir istifadəçi adı girdiniz");
            } else {
                model.addElement(cavab);
                MesalLabel.setText("İstifadəçi uğurla əlavə edildi");
            }
        } else {
            MesalLabel.setText("İşləm iptal edildi");
        }
    }//GEN-LAST:event_ElaveEtBtnActionPerformed

    private void SilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilBtnActionPerformed
        // TODO add your handling code here:
         MesalLabel.setText("");
        int selectedIndex = IstifadeciList.getSelectedIndex();
        if (selectedIndex == -1) {
            if (model.getSize() == 0) {
                MesalLabel.setText("Listiniz bombos");
            } else {
                MesalLabel.setText("Xahiş olunur silinəcək bir istifadəçi seçin...");
            }
        } else {
            Object silinecek = (Object) model.getElementAt(selectedIndex);
            model.removeElement(silinecek);
            MesalLabel.setText("Ad silindi");
        }
    }//GEN-LAST:event_SilBtnActionPerformed

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
            java.util.logging.Logger.getLogger(JListISIstifadesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JListISIstifadesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JListISIstifadesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JListISIstifadesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JListISIstifadesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ElaveEtBtn;
    private javax.swing.JList<String> IstifadeciList;
    private javax.swing.JLabel MesalLabel;
    private javax.swing.JButton SilBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
