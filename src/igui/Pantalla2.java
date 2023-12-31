/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igui;

import java.net.URL;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author andre_hk4s7fk
 */
public class Pantalla2 extends javax.swing.JFrame {
    private static Pantalla2 instance;
    /**
     * Creates new form Conversor
     */
    public Pantalla2() {
        initComponents();
        
        setLocationRelativeTo(null);
    }
    
    public static Pantalla2 getIntance(){
        if(instance == null){
            instance=new Pantalla2();
            
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtvalue = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        moneda = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtvalue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalueActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor Moneda");

        jLabel3.setText("Conversor de moneda");

        jLabel2.setText("Moneda");

        moneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos" }));
        moneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtvalue))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String EliminarNotaciónCientífica(double número) {
           String d = "####################################";
           return new DecimalFormat("#." + d + d + d).format(número);
       }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String valor=txtvalue.getText();
        int op=moneda.getSelectedIndex();
        String numeroFormateado = formatearNumero(Double.parseDouble(valor));
        System.out.println(op);
        switch(op){
            
            case 0 -> {
                System.out.println(numeroFormateado);
                 double conv=Double.parseDouble(numeroFormateado)/4042;
                JOptionPane.showMessageDialog(null, conv+" pesos colombianos");
            }
            case 1 -> {
                double conv=Double.parseDouble(valor)/4.423;
                JOptionPane.showMessageDialog(null, conv+" pesos colombianos");
            }
            case 2 -> {
                double conv=Double.parseDouble(valor)/5.140;
                JOptionPane.showMessageDialog(null, conv+" pesos colombianos");
            }
            case 3 -> {
                double conv=Double.parseDouble(valor)/28.22;
                JOptionPane.showMessageDialog(null, conv+" pesos colombianos");
            }
            case 4 -> {
               
                double conv=Double.parseDouble(valor)/3.12;
                JOptionPane.showMessageDialog(null, conv+" pesos colombianos");
            }
            case 5 -> {
                double conv=4.042*Double.parseDouble(numeroFormateado);
                JOptionPane.showMessageDialog(null, conv+" dolar(s)");
            }
            case 6 -> {
                double conv=4.422*Double.parseDouble(numeroFormateado);
                JOptionPane.showMessageDialog(null, conv+" euro(s)");
            }
            case 7 -> {
                double conv=5.138*Double.parseDouble(numeroFormateado);
                JOptionPane.showMessageDialog(null, conv+" Libra(s)");
            }
            case 8 -> {
               double conv=28.20*Double.parseDouble(numeroFormateado);
                String s= EliminarNotaciónCientífica(conv);
                System.out.println(s);
                JOptionPane.showMessageDialog(null, conv+" Yen(es)");
            }
            case 9 -> {
                double conv=3.11*Double.parseDouble(numeroFormateado);
                JOptionPane.showMessageDialog(null, conv+" Won(es) coreanos");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    public static String formatearNumero(double numero) {
           // Crear un objeto DecimalFormat con el patrón "###,###.##" para separador de miles con punto decimal
           DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
           return decimalFormat.format(numero);
       }
    private void txtvalueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalueActionPerformed

    private void monedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monedaActionPerformed

   
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> moneda;
    private javax.swing.JTextField txtvalue;
    // End of variables declaration//GEN-END:variables
}
