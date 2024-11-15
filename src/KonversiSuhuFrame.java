
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rahmat
 */
public class KonversiSuhuFrame extends javax.swing.JFrame {

    /**
     * Creates new form KonversiSuhuFrame
     */
    public KonversiSuhuFrame() {
        initComponents();
        setTitle("Aplikasi Konversi Suhu");
        
        // Membatasi input hanya angka
        textFieldInput.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume();
                }
            }
        });
        
       // Menambahkan DocumentListener untuk mendeteksi perubahan input
    textFieldInput.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateConversion();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateConversion();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateConversion();
        }
    });
                
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conversionGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelInput = new javax.swing.JLabel();
        textFieldInput = new javax.swing.JTextField();
        labelOutput = new javax.swing.JLabel();
        comboBoxConversion = new javax.swing.JComboBox<>();
        labelResult = new javax.swing.JLabel();
        buttonConvert = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        radioCelsiusToAll = new javax.swing.JRadioButton();
        radioFahrenheitToAll = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelInput.setText("Input Suhu");

        textFieldInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldInputActionPerformed(evt);
            }
        });

        labelOutput.setText("Pilih Suhu");

        comboBoxConversion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius ke Fahrenheit", "Celsius ke Reamur", "Celsius ke Kelvin" }));
        comboBoxConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxConversionActionPerformed(evt);
            }
        });

        labelResult.setText("Hasil Konversi");

        buttonConvert.setText("Konversi");
        buttonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConvertActionPerformed(evt);
            }
        });

        conversionGroup.add(radioCelsiusToAll);
        radioCelsiusToAll.setText("Celcius");

        conversionGroup.add(radioFahrenheitToAll);
        radioFahrenheitToAll.setText("Fahrenheit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioCelsiusToAll, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radioFahrenheitToAll, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(radioCelsiusToAll)
                .addComponent(radioFahrenheitToAll))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Aplikasi Konversi Suhu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboBoxConversion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldInput, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonConvert))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelInput)
                            .addComponent(textFieldInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelOutput)
                            .addComponent(comboBoxConversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttonConvert)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(labelResult)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldInputActionPerformed

    private void buttonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConvertActionPerformed
     updateConversion();
    }//GEN-LAST:event_buttonConvertActionPerformed

    private void comboBoxConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxConversionActionPerformed

    }//GEN-LAST:event_comboBoxConversionActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConvert;
    private javax.swing.JComboBox<String> comboBoxConversion;
    private javax.swing.ButtonGroup conversionGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelInput;
    private javax.swing.JLabel labelOutput;
    private javax.swing.JLabel labelResult;
    private javax.swing.JRadioButton radioCelsiusToAll;
    private javax.swing.JRadioButton radioFahrenheitToAll;
    private javax.swing.JTextField textFieldInput;
    // End of variables declaration//GEN-END:variables

    private void updateConversion() {
        try {
        // Mendapatkan nilai suhu input dari text field
        String inputText = textFieldInput.getText();
        if (inputText.isEmpty()) {
            labelResult.setText("Hasil Konversi: Masukkan nilai suhu.");
            return;
        }
        
        double inputTemp = Double.parseDouble(inputText);
        StringBuilder resultText = new StringBuilder();

        // Mendapatkan pilihan dari comboBoxConversion
        String conversionType = (String) comboBoxConversion.getSelectedItem();
        
        // Debug: Tampilkan pilihan yang dipilih di comboBoxConversion
        System.out.println("Pilihan konversi: " + conversionType);
        
        // Jika RadioButton Celsius ke Semua dipilih
        if (radioCelsiusToAll.isSelected()) {
            double toFahrenheit = inputTemp * 9 / 5 + 32;
            double toReamur = inputTemp * 4 / 5;
            double toKelvin = inputTemp + 273.15;
            
            resultText.append("Celsius ke Fahrenheit: ").append(toFahrenheit).append(" °F<br>");
            resultText.append("Celsius ke Reamur: ").append(toReamur).append(" °R<br>");
            resultText.append("Celsius ke Kelvin: ").append(toKelvin).append(" K");
        
        // Jika RadioButton Fahrenheit ke Semua dipilih
        } else if (radioFahrenheitToAll.isSelected()) {
            double toCelsius = (inputTemp - 32) * 5 / 9;
            double toReamur = (inputTemp - 32) * 4 / 9;
            double toKelvin = (inputTemp - 32) * 5 / 9 + 273.15;

            resultText.append("Fahrenheit ke Celsius: ").append(toCelsius).append(" °C<br>");
            resultText.append("Fahrenheit ke Reamur: ").append(toReamur).append(" °R<br>");
            resultText.append("Fahrenheit ke Kelvin: ").append(toKelvin).append(" K");
        
        // Jika tidak ada RadioButton dipilih, gunakan ComboBox untuk konversi spesifik
        } else {
            double resultTemp = 0;
            String resultScale = "";

            // Logika konversi spesifik sesuai pilihan comboBox
            if ("Celsius ke Fahrenheit".equals(conversionType)) {
                resultTemp = inputTemp * 9 / 5 + 32;
                resultScale = "Fahrenheit";
            } else if ("Celsius ke Reamur".equals(conversionType)) {
                resultTemp = inputTemp * 4 / 5;
                resultScale = "Reamur";
            } else if ("Celsius ke Kelvin".equals(conversionType)) {
                resultTemp = inputTemp + 273.15;
                resultScale = "Kelvin";
            } else {
                labelResult.setText("Pilih konversi yang valid.");
                return;
            }
            resultText.append("Hasil Konversi: ").append(resultTemp).append(" ").append(resultScale);
        }

        // Menampilkan hasil konversi di label
        labelResult.setText("<html>" + resultText.toString() + "</html>");
    } catch (NumberFormatException ex) {
        labelResult.setText("Hasil Konversi: Masukkan nilai suhu yang valid.");
    }
    }

   

    
}
