/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.cashier_report;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Date;
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
import synsoftech.util.DateType;
import vwws.reading_payments.Reading_payments;
import vwws.reading_payments.Reading_payments.to_reading_payments;

/**
 *
 * @author Guinness
 */
public class Dlg_cashier_report extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_cashier_report
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
    private Dlg_cashier_report(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_cashier_report(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_cashier_report() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_cashier_report myRef;

    private void setThisRef(Dlg_cashier_report myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_cashier_report> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_cashier_report create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_cashier_report create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_cashier_report dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashier_report((java.awt.Frame) parent, false);
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
            Dlg_cashier_report dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashier_report((java.awt.Dialog) parent, false);
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

        Dlg_cashier_report dialog = Dlg_cashier_report.create(new javax.swing.JFrame(), true);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnl_holder = new javax.swing.JPanel();
        pnl_collection_summary = new javax.swing.JPanel();
        pnl_cash_count = new javax.swing.JPanel();
        pnl_transactions = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_reading_payments = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new Field.Input();
        jButton1 = new Button.Default();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jMenuItem1.setText("Void");
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/register.png"))); // NOI18N
        jLabel1.setToolTipText("Collection Summary");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/task.png"))); // NOI18N
        jLabel2.setToolTipText("Transactions");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/abacus7 (1).png"))); // NOI18N
        jLabel3.setToolTipText("Transactions");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_holder.setBackground(new java.awt.Color(255, 255, 255));
        pnl_holder.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout pnl_collection_summaryLayout = new javax.swing.GroupLayout(pnl_collection_summary);
        pnl_collection_summary.setLayout(pnl_collection_summaryLayout);
        pnl_collection_summaryLayout.setHorizontalGroup(
            pnl_collection_summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        pnl_collection_summaryLayout.setVerticalGroup(
            pnl_collection_summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        pnl_holder.add(pnl_collection_summary, "card2");

        javax.swing.GroupLayout pnl_cash_countLayout = new javax.swing.GroupLayout(pnl_cash_count);
        pnl_cash_count.setLayout(pnl_cash_countLayout);
        pnl_cash_countLayout.setHorizontalGroup(
            pnl_cash_countLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        pnl_cash_countLayout.setVerticalGroup(
            pnl_cash_countLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        pnl_holder.add(pnl_cash_count, "card3");

        pnl_transactions.setBackground(new java.awt.Color(255, 255, 255));

        tbl_reading_payments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_reading_payments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_reading_paymentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_reading_payments);

        jLabel4.setText("Total No of Transaction:");

        jLabel5.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Date From:");

        jDateChooser1.setDate(new Date());
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("To:");

        jDateChooser2.setDate(new Date());
        jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Customer Name:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("All");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/search19.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Total Amount:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("0.00");

        javax.swing.GroupLayout pnl_transactionsLayout = new javax.swing.GroupLayout(pnl_transactions);
        pnl_transactions.setLayout(pnl_transactionsLayout);
        pnl_transactionsLayout.setHorizontalGroup(
            pnl_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_transactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnl_transactionsLayout.createSequentialGroup()
                        .addGroup(pnl_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_transactionsLayout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 224, Short.MAX_VALUE))
                    .addGroup(pnl_transactionsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_transactionsLayout.setVerticalGroup(
            pnl_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_transactionsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnl_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_transactionsLayout.createSequentialGroup()
                        .addGroup(pnl_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(pnl_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnl_holder.add(pnl_transactions, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnl_holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        cardLayout.show(pnl_holder, "1");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        cardLayout.show(pnl_holder, "2");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        cardLayout.show(pnl_holder, "3");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        data_cols();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_reading_paymentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_reading_paymentsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_reading_paymentsMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnl_cash_count;
    private javax.swing.JPanel pnl_collection_summary;
    private javax.swing.JPanel pnl_holder;
    private javax.swing.JPanel pnl_transactions;
    private javax.swing.JTable tbl_reading_payments;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_panel_layout();
        init_tbl_reading_payments(tbl_reading_payments);
        data_cols();
    }

    CardLayout cardLayout = new CardLayout();

    private void init_panel_layout() {
        cardLayout = (CardLayout) pnl_holder.getLayout();
        cardLayout.addLayoutComponent("1", pnl_collection_summary);
        cardLayout.addLayoutComponent("2", pnl_cash_count);
        cardLayout.addLayoutComponent("3", pnl_transactions);
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

    //<editor-fold defaultstate="collapsed" desc=" reading_payments "> 
    public static ArrayListModel tbl_reading_payments_ALM;
    public static Tblreading_paymentsModel tbl_reading_payments_M;

    public static void init_tbl_reading_payments(JTable tbl_reading_payments) {
        tbl_reading_payments_ALM = new ArrayListModel();
        tbl_reading_payments_M = new Tblreading_paymentsModel(tbl_reading_payments_ALM);
        tbl_reading_payments.setModel(tbl_reading_payments_M);
        tbl_reading_payments.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_reading_payments.setRowHeight(25);
        int[] tbl_widths_reading_payments = {100, 100, 100, 100, 100, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_reading_payments.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_reading_payments, i, tbl_widths_reading_payments[i]);
        }
        Dimension d = tbl_reading_payments.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_reading_payments.getTableHeader().setPreferredSize(d);
        tbl_reading_payments.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_reading_payments.setRowHeight(25);
        tbl_reading_payments.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_reading_payments, 2);
        TableWidthUtilities.setColumnRightRenderer(tbl_reading_payments, 3);
        TableWidthUtilities.setColumnRightRenderer(tbl_reading_payments, 4);
    }

    public static void loadData_reading_payments(List<to_reading_payments> acc) {
        tbl_reading_payments_ALM.clear();
        tbl_reading_payments_ALM.addAll(acc);
    }

    public static class Tblreading_paymentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Date", "Customer Name", "Cash", "Cheque", "Amount Due", "Status", "check_amount", "check_bank", "check_no", "check_holder", "check_date", "discount_name", "discount_amount", "discount_rate", "discount_customer_name", "discount_customer_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "address", "date_added", "date_updated", "added_by_id", "update_by_id", "status"
        };

        public Tblreading_paymentsModel(ListModel listmodel) {
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
            to_reading_payments tt = (to_reading_payments) getRow(row);
            switch (col) {
                case 0:
                    return " " + DateType.convert_slash_datetime(tt.date_added);
                case 1:
                    return " " + tt.customer_name;
                case 2:
                    return FitIn.fmt_wc_0(tt.cash_paid) + " ";
                case 3:
                    return FitIn.fmt_wc_0(tt.check_amount) + " ";
                case 4:
                    return FitIn.fmt_wc_0(tt.amount_due) + " ";
                case 5:
                    if (tt.is_counted == 1) {
                        return " Counted";
                    } else {
                        return " Void";
                    }

                case 6:
                    return tt.check_amount;
                case 7:
                    return tt.check_bank;
                case 8:
                    return tt.check_no;
                case 9:
                    return tt.check_holder;
                case 10:
                    return tt.check_date;
                case 11:
                    return tt.discount_name;
                case 12:
                    return tt.discount_amount;
                case 13:
                    return tt.discount_rate;
                case 14:
                    return tt.discount_customer_name;
                case 15:
                    return tt.discount_customer_id;
                case 16:
                    return tt.city;
                case 17:
                    return tt.city_id;
                case 18:
                    return tt.barangay;
                case 19:
                    return tt.barangay_id;
                case 20:
                    return tt.purok;
                case 21:
                    return tt.purok_id;
                case 22:
                    return tt.address;
                case 23:
                    return tt.date_added;
                case 24:
                    return tt.date_updated;
                case 25:
                    return tt.added_by_id;
                case 26:
                    return tt.update_by_id;
                default:
                    return tt.status;
            }
        }
    }

    private void data_cols() {
        String search = jTextField1.getText();
        String date_from = DateType.sf.format(jDateChooser1.getDate());
        String date_to = DateType.sf.format(jDateChooser2.getDate());
        String where = " where customer_name like '%" + search + "%' ";

        if (!jCheckBox1.isSelected()) {
            where = where + " and Date(date_added) between  '" + date_from + "' and '" + date_to + "' ";
        }
        where = where + " order by id asc ";
        List<Reading_payments.to_reading_payments> datas = Reading_payments.ret_data(where);
        loadData_reading_payments(datas);
        double amount = 0;
        for (Reading_payments.to_reading_payments to : datas) {
            amount += to.amount_due;
        }
        jLabel10.setText(FitIn.fmt_wc_0(amount));
        jLabel5.setText("" + datas.size());
    }

//</editor-fold> 
    
    private void select_transaction(){
        int row=tbl_reading_payments.getSelectedRow();
        if(row<0){
            return;
        }
        to_reading_payments to=(to_reading_payments)tbl_reading_payments_ALM.get(row);
                       
    }
    
}
