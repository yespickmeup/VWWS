/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.cashiering;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.fields.Label;
import synsoftech.util.DateType;
import vwws.customers.Customers;
import vwws.occupancy_types.Occupancy_types;
import vwws.reading_payments.Reading_payments;
import vwws.readings.Readings;
import vwws.readings.Readings.to_readings;
import vwws.util.MyUser;

/**
 *
 * @author Guinness
 */
public class Dlg_cashiering extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_cashiering
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;

    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_cashiering(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_cashiering(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_cashiering() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_cashiering myRef;

    private void setThisRef(Dlg_cashiering myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_cashiering> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_cashiering create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_cashiering create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_cashiering dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashiering((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_cashiering dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashiering((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        return null;

    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Dlg_cashiering dialog = Dlg_cashiering.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().removeAll();
            initComponents();
            myInit();
            repaint();
        }

    }

    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }

    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_customers = new javax.swing.JTable();
        jTextField1 = new Field.Search();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_readings = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel45 = new Label.Separator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new Button.Primary();

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/wallet11.png"))); // NOI18N
        jMenuItem1.setText("Payment");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbl_customers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_customersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_customers);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/family24.png"))); // NOI18N
        jLabel2.setText("Customers");

        jLabel1.setText("No of Customers:");

        jLabel3.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbl_readings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_readings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_readingsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_readingsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_readingsMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_readings);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/bill.png"))); // NOI18N
        jLabel4.setText("Bills");

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Total Consumption:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("0.00");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Discount:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("0.00");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Amount:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("0.00");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Additional Charge:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("0.00");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("0.00");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Meter Monthly Amortization:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Maintenance Charge:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("0.00");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Amount Due:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("0.00");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/creditcard3.png"))); // NOI18N
        jButton1.setText("Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13))
                            .addGap(1, 1, 1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16))
                            .addGap(1, 1, 1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jLabel18))
                            .addGap(3, 3, 3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        data_cols();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tbl_customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customersMouseClicked
        data_readings();
    }//GEN-LAST:event_tbl_customersMouseClicked

    private void tbl_readingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_readingsMouseClicked
        select_reading();
    }//GEN-LAST:event_tbl_readingsMouseClicked

    private void tbl_readingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_readingsMousePressed
        show_popup(evt);
    }//GEN-LAST:event_tbl_readingsMousePressed

    private void tbl_readingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_readingsMouseReleased
        show_popup(evt);
    }//GEN-LAST:event_tbl_readingsMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        payment();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        payment();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbl_customers;
    private javax.swing.JTable tbl_readings;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_customers(tbl_customers);
        data_cols();
        init_tbl_readings(tbl_readings);
    }

    public void do_pass() {

    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                              KeyEvent.VK_ESCAPE, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                disposed();
            }
        });
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" customers "> 
    public static ArrayListModel tbl_customers_ALM;
    public static TblcustomersModel tbl_customers_M;

    public static void init_tbl_customers(JTable tbl_customers) {
        tbl_customers_ALM = new ArrayListModel();
        tbl_customers_M = new TblcustomersModel(tbl_customers_ALM);
        tbl_customers.setModel(tbl_customers_M);
        tbl_customers.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_customers.setRowHeight(25);
        int[] tbl_widths_customers = {80, 150, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_customers.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_customers, i, tbl_widths_customers[i]);
        }
        Dimension d = tbl_customers.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_customers.getTableHeader().setPreferredSize(d);
        tbl_customers.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_customers.setRowHeight(25);
        tbl_customers.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_customers(List<Customers.to_customers> acc) {
        tbl_customers_ALM.clear();
        tbl_customers_ALM.addAll(acc);
    }

    public static class TblcustomersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "ID #", "Name", "Barangay", "Purok", "lname", "bday", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "address", "balance", "tax_dec_no", "meter_is_paid", "date_added", "date_updated", "added_by_id", "update_by_id", "status"
        };

        public TblcustomersModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            Customers.to_customers tt = (Customers.to_customers) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.customer_no;
                case 1:
                    return " " + tt.lname + ", " + tt.fname + " " + tt.mi;
                case 2:
                    return " " + tt.barangay;
                case 3:
                    return " " + tt.purok;
                case 4:
                    return tt.purok;
                case 5:
                    return tt.bday;
                case 6:
                    return tt.city;
                case 7:
                    return tt.city_id;
                case 8:
                    return tt.barangay;
                case 9:
                    return tt.barangay_id;
                case 10:
                    return tt.purok;
                case 11:
                    return tt.purok_id;
                case 12:
                    return tt.address;
                case 13:
                    return tt.balance;
                case 14:
                    return tt.tax_dec_no;
                case 15:
                    return tt.meter_is_paid;
                case 16:
                    return tt.date_added;
                case 17:
                    return tt.date_updated;
                case 18:
                    return tt.added_by_id;
                case 19:
                    return tt.update_by_id;
                default:
                    return tt.status;
            }
        }
    }

    private void data_cols() {
        String where = " where concat(lname,space(1),fname,space(10),mi) like '%" + jTextField1.getText() + "%' "
                + " or concat(fname,space(1),lname) like '%" + jTextField1.getText() + "%' "
                + " or customer_no like '%" + jTextField1.getText() + "%' "
                + " order by lname asc";
        List<Customers.to_customers> datas = Customers.ret_data(where);
        loadData_customers(datas);
        jLabel3.setText("" + datas.size());
    }

//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" readings "> 
    public static ArrayListModel tbl_readings_ALM;
    public static TblreadingsModel tbl_readings_M;

    public static void init_tbl_readings(JTable tbl_readings) {
        tbl_readings_ALM = new ArrayListModel();
        tbl_readings_M = new TblreadingsModel(tbl_readings_ALM);
        tbl_readings.setModel(tbl_readings_M);
        tbl_readings.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_readings.setRowHeight(25);
        int[] tbl_widths_readings = {100, 100, 100, 60, 50, 50, 70, 100, 60, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_readings.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_readings, i, tbl_widths_readings[i]);
        }

        Dimension d = tbl_readings.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_readings.getTableHeader().setPreferredSize(d);
        tbl_readings.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_readings.setRowHeight(25);
        tbl_readings.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_readings, 4);
        TableWidthUtilities.setColumnRightRenderer(tbl_readings, 5);
        TableWidthUtilities.setColumnRightRenderer(tbl_readings, 6);
        TableWidthUtilities.setColumnRightRenderer(tbl_readings, 7);
    }

    public static void loadData_readings(List<to_readings> acc) {
        tbl_readings_ALM.clear();
        tbl_readings_ALM.addAll(acc);
    }

    public static class TblreadingsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Date", "Prev. Reading", "Curr. Reading", "Cubic", "MF", "MR", "Interest", "Amount", "Status", "", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "address", "date_added", "date_updated", "added_by_id", "update_by_id", "status"
        };

        public TblreadingsModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 9) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_readings tt = (to_readings) getRow(row);
            switch (col) {
                case 0:
                    return " " + DateType.convert_slash_datetime(tt.date_added);
                case 1:
                    return " " + FitIn.fmt_woc(tt.previous_reading);
                case 2:
                    return " " + FitIn.fmt_woc(tt.current_reading);
                case 3:
                    return " " + FitIn.fmt_woc(tt.current_reading - tt.previous_reading);
                case 4:
                    return FitIn.fmt_wc_0(tt.mf) + " ";
                case 5:
                    return FitIn.fmt_wc_0(tt.mr) + " ";
                case 6:
                    return FitIn.fmt_wc_0(tt.interest) + " ";
                case 7:
                    return FitIn.fmt_wc_0(tt.amount) + " ";
                case 8:
                    if (tt.status == 1) {
                        return " Paid";
                    } else {
                        return " Pending";
                    }
                case 9:
                    return tt.selected;
                case 10:
                    return tt.city;
                case 11:
                    return tt.city_id;
                case 12:
                    return tt.barangay;
                case 13:
                    return tt.barangay_id;
                case 14:
                    return tt.purok;
                case 15:
                    return tt.purok_id;
                case 16:
                    return tt.address;
                case 17:
                    return tt.date_added;
                case 18:
                    return tt.date_updated;
                case 19:
                    return tt.added_by_id;
                case 20:
                    return tt.update_by_id;
                default:
                    return tt.status;
            }
        }
    }

    private void data_readings() {
        int row = tbl_customers.getSelectedRow();
        if (row < 0) {
            return;
        }
        Customers.to_customers to = (Customers.to_customers) tbl_customers_ALM.get(row);
        String where2 = " where occupancy='" + to.occupancy + "' and occupancy_type_id='" + to.occupancy_type_id + "' ";
        List<Occupancy_types.to_occupancy_types> occupancy_types = Occupancy_types.ret_data(where2);

        String where = " where customer_id='" + to.id + "' and is_paid='" + "0" + "' ";
        List<to_readings> datas = Readings.ret_data(where);
        for (to_readings t : datas) {
            double cubic = t.current_reading - t.previous_reading;
            double amount = 0;
            for (Occupancy_types.to_occupancy_types tt : occupancy_types) {
                String[] cubics = tt.cubic.split(",");
                double low = FitIn.toDouble(cubics[0]);
                double high = FitIn.toDouble(cubics[1]);
                if (cubics[1].equalsIgnoreCase("above")) {
                    high = 100000;
                }
                double total_cubic = t.current_reading - t.previous_reading;

                if (total_cubic >= low && total_cubic <= high) {
                    double total_amount = total_cubic * tt.charge + (tt.mf + tt.mr);
                    t.setAmount(total_amount);
                    t.setMf(tt.mf);
                    t.setMr(tt.mr);
                    break;
                }
            }
        }
        loadData_readings(datas);
        compute();
    }
//</editor-fold> 

    private void compute() {
        List<to_readings> datas = tbl_readings_ALM;
        double consumption = 0;
        double discount = 0;
        double addtl_charge = 0;
        double amount = 0;
        double amortization = 0;
        double maintenace_charge = 0;
        double amount_due = 0;

        for (to_readings to : datas) {
            if (to.isSelected()) {
                consumption += to.current_reading - to.previous_reading;
                amount += to.amount;
                maintenace_charge += to.mf;
                amortization += to.mr;
            }
        }
        amount_due = (amount + addtl_charge) - discount;
        jLabel6.setText(FitIn.fmt_wc_0(consumption));
        jLabel8.setText(FitIn.fmt_wc_0(discount));
        jLabel12.setText(FitIn.fmt_wc_0(addtl_charge));
        jLabel10.setText(FitIn.fmt_wc_0(amount));

        jLabel13.setText(FitIn.fmt_wc_0(amortization));
        jLabel16.setText(FitIn.fmt_wc_0(maintenace_charge));
        jLabel18.setText(FitIn.fmt_wc_0(amount_due));
    }

    private void select_reading() {
        int row = tbl_readings.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_readings.getSelectedColumn();
        if (col == 9) {
            to_readings to = (to_readings) tbl_readings_ALM.get(row);
            if (to.selected == true) {
                to.setSelected(false);
            } else {
                to.setSelected(true);
            }
            tbl_readings_M.fireTableDataChanged();
        }
        compute();
    }

    private void show_popup(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(tbl_readings, evt.getX(), evt.getY());
        }
    }

    private void payment() {
        int row = tbl_customers.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Customers.to_customers customer = (Customers.to_customers) tbl_customers_ALM.get(row);
        List<to_readings> datas = tbl_readings_ALM;
        String reading_ids = "";
        int i = 0;
        double amount_due = 0;
        final double amount_due1 = 0;
        for (to_readings to : datas) {
            if (to.selected == true) {
                if (i == 0) {
                    reading_ids = "" + to.id;
                } else {
                    reading_ids = reading_ids + "," + to.id;
                }
                amount_due += to.amount + to.interest;
                i++;
            }
        }
        final String reading_ids1 = reading_ids;
        Window p = (Window) this;
        Dlg_cashiering_payment nd = Dlg_cashiering_payment.create(p, true);
        nd.setTitle("");
        nd.do_pass(amount_due);
        nd.setCallback(new Dlg_cashiering_payment.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_cashiering_payment.OutputData data) {
                closeDialog.ok();

                int id = 0;
                String or_no = Reading_payments.increment_id();
                String customer_id = "" + customer.id;
                String customer_name = customer.lname + ", " + customer.fname + " " + customer.mi;
                double amount_due = data.amount_due;
                double amount_paid = data.amount_paid;
                double cash_paid = data.cash_paid;
                double check_amount = data.check_amount;
                String check_bank = data.check_bank;
                String check_no = data.check_no;
                String check_holder = data.check_holder;
                String check_date = data.check_date;
                String discount_name = "";
                double discount_amount = 0;
                double discount_rate = 0;
                String discount_customer_name = "";
                String discount_customer_id = "";
                String city = "";
                String city_id = "";
                String barangay = "";
                String barangay_id = "";
                String purok = "";
                String purok_id = "";
                String address = "";
                String date_added = DateType.now();
                String date_updated = DateType.now();
                String added_by_id = MyUser.getUser_id();
                String update_by_id = MyUser.getUser_id();
                int status = 0;
                int is_counted = 1;
                Reading_payments.to_reading_payments rp = new Reading_payments.to_reading_payments(id, or_no, customer_id, customer_name, reading_ids1, amount_due, amount_paid, cash_paid, check_amount, check_bank, check_no, check_holder, check_date, discount_name, discount_amount, discount_rate, discount_customer_name, discount_customer_id, city, city_id, barangay, barangay_id, purok, purok_id, address, date_added, date_updated, added_by_id, update_by_id, status, is_counted);
                int add = 0;

                do {
                    add = Reading_payments.add_data(rp);
                    if (add == 1) {
                        System.out.println("Successfully Added!");
                        data_readings();
                    } else {
                        System.out.println("Failed!");
                    }
                } while (add == 0);

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

}
