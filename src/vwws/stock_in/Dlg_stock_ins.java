/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.stock_in;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
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
import vwws.inventory.Inventory;
import vwws.stock_in.Stock_in_items.to_stock_in_items;
import vwws.suppliers.Suppliers;
import vwws.util.Alert;
import vwws.util.MyUser;
import vwws.util.TableRenderer;

/**
 *
 * @author Guinness
 */
public class Dlg_stock_ins extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_stock_ins
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
    private Dlg_stock_ins(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_stock_ins(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_stock_ins() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_stock_ins myRef;

    private void setThisRef(Dlg_stock_ins myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_stock_ins> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_stock_ins create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_stock_ins create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_stock_ins dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_stock_ins((java.awt.Frame) parent, false);
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
            Dlg_stock_ins dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_stock_ins((java.awt.Dialog) parent, false);
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

        Dlg_stock_ins dialog = Dlg_stock_ins.create(new javax.swing.JFrame(), true);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new Button.Warning();
        jButton2 = new Button.Info();
        jButton3 = new Button.Success();
        jButton4 = new Button.Default();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new Field.Combo();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new Field.Input();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_stock_in_items = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new Field.Search();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Delete");

        jButton2.setText("Update");

        jButton3.setText("Post");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Supplier:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Date Delivered:");

        jDateChooser1.setDate(new Date());
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jDateChooser2.setDate(new Date());
        jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Date Received:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Reference No:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Remarks:");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField3)
                                .addGap(128, 128, 128)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbl_stock_in_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_stock_in_items);

        jLabel1.setText("Total no. of items:");

        jLabel2.setText("0");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Gross Amount:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("0.00");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("0.00");

        jLabel10.setText("Discount:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        init_occupancies2();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        init_suppliers();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        post();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tbl_stock_in_items;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_stock_in_items(tbl_stock_in_items);
        String search = "";

        suppliers = Suppliers.ret_data(search);
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

    //<editor-fold defaultstate="collapsed" desc=" stock_in_items "> 
    public static ArrayListModel tbl_stock_in_items_ALM;
    public static Tblstock_in_itemsModel tbl_stock_in_items_M;

    public static void init_tbl_stock_in_items(JTable tbl_stock_in_items) {
        tbl_stock_in_items_ALM = new ArrayListModel();
        tbl_stock_in_items_M = new Tblstock_in_itemsModel(tbl_stock_in_items_ALM);
        tbl_stock_in_items.setModel(tbl_stock_in_items_M);
        tbl_stock_in_items.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_stock_in_items.setRowHeight(25);
        int[] tbl_widths_stock_in_items = {60, 100, 100, 100, 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_stock_in_items.length; i < n; i++) {
            if (i == 3) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_stock_in_items, i, tbl_widths_stock_in_items[i]);
        }
        Dimension d = tbl_stock_in_items.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_stock_in_items.getTableHeader().setPreferredSize(d);
        tbl_stock_in_items.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_stock_in_items.setRowHeight(25);
        tbl_stock_in_items.setFont(new java.awt.Font("Arial", 0, 12));

        TableWidthUtilities.setColumnRightRenderer(tbl_stock_in_items, 4);
        TableWidthUtilities.setColumnRightRenderer(tbl_stock_in_items, 5);
    }

    public static void loadData_stock_in_items(List<to_stock_in_items> acc) {
        tbl_stock_in_items_ALM.clear();
        tbl_stock_in_items_ALM.addAll(acc);
    }

    public static class Tblstock_in_itemsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Qty", "Item Code", "Barcode", "Description", "Cost", "Amount", "remarks", "date_delivered", "date_received", "reference_no", "item_code", "barcode", "description", "category_id", "category", "classification_id", "sub_classification_id", "sub_classification", "brand_id", "brand", "model_id", "model", "product_qty", "unit", "conversion", "cost", "selling_price", "discount_amount", "item_type", "supplier_id", "supplier", "branch_id", "branch", "location_id", "location", "status"
        };

        public Tblstock_in_itemsModel(ListModel listmodel) {
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
            to_stock_in_items tt = (to_stock_in_items) getRow(row);
            switch (col) {
                case 0:
                    return " " + FitIn.fmt_woc(tt.product_qty);
                case 1:
                    return " " + tt.item_code;
                case 2:
                    return " " + tt.barcode;
                case 3:
                    return " " + tt.description;
                case 4:
                    return FitIn.fmt_wc_0(tt.cost) + " ";
                case 5:
                    return FitIn.fmt_wc_0(tt.product_qty * tt.cost) + " ";
                case 6:
                    return tt.remarks;
                case 7:
                    return tt.date_delivered;
                case 8:
                    return tt.date_received;
                case 9:
                    return tt.reference_no;
                case 10:
                    return tt.item_code;
                case 11:
                    return tt.barcode;
                case 12:
                    return tt.description;
                case 13:
                    return tt.category_id;
                case 14:
                    return tt.category;
                case 15:
                    return tt.classification_id;
                case 16:
                    return tt.sub_classification_id;
                case 17:
                    return tt.sub_classification;
                case 18:
                    return tt.brand_id;
                case 19:
                    return tt.brand;
                case 20:
                    return tt.model_id;
                case 21:
                    return tt.model;
                case 22:
                    return tt.product_qty;
                case 23:
                    return tt.unit;
                case 24:
                    return tt.conversion;
                case 25:
                    return tt.cost;
                case 26:
                    return tt.selling_price;
                case 27:
                    return tt.discount_amount;
                case 28:
                    return tt.item_type;
                case 29:
                    return tt.supplier_id;
                case 30:
                    return tt.supplier;
                case 31:
                    return tt.branch_id;
                case 32:
                    return tt.branch;
                case 33:
                    return tt.location_id;
                case 34:
                    return tt.location;
                default:
                    return tt.status;
            }
        }
    }
//</editor-fold> 

    List<Inventory.to_inventory> items = new ArrayList();

    private void init_occupancies2() {
        String search = "";
        items.clear();
        items = Inventory.ret_data(search);
        Object[][] obj = new Object[items.size()][4];
        int i = 0;
        for (Inventory.to_inventory to : items) {
            obj[i][0] = " " + FitIn.fmt_woc(to.product_qty);
            obj[i][1] = " " + to.item_code;
            obj[i][2] = " " + to.barcode;
            obj[i][3] = " " + to.description;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {60, 60, 160, jTextField1.getWidth() - 360};
        int width = 0;
        String[] col_names = {"", "", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField1, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {

                Inventory.to_inventory to = items.get(data.selected_row);
                add_item(to);
            }
        });
    }

    private void add_item(final Inventory.to_inventory to) {
        Window p = (Window) this;
        Dlg_qty_cost nd = Dlg_qty_cost.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_qty_cost.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_qty_cost.OutputData data) {
                closeDialog.ok();

                int id = 0;
                String stock_in_no = "";
                String date_added = DateType.now();
                String date_updated = DateType.now();
                String added_by_id = MyUser.getUser_id();
                String update_by_id = MyUser.getUser_id();
                String remarks = "";
                String date_delivered = "";
                String date_received = "";
                String reference_no = "";
                String item_code = to.item_code;
                String barcode = to.barcode;
                String description = to.description;
                String category_id = to.category_id;
                String category = to.category;
                String classification_id = to.classification_id;
                String sub_classification_id = to.sub_classification_id;
                String sub_classification = to.sub_classification;
                String brand_id = to.brand_id;
                String brand = to.brand;
                String model_id = to.model_id;
                String model = to.model;
                double product_qty = data.qty;
                String unit = to.unit;
                double conversion = to.conversion;
                double cost = data.cost;
                double selling_price = to.selling_price;
                double discount_amount = 0;
                String item_type = to.item_type;
                String supplier_id = "";
                String supplier = "";
                String branch_id = to.branch_id;
                String branch = to.branch;
                String location_id = to.location_id;
                String location = to.location;
                int status = 1;
                Stock_in_items.to_stock_in_items field = new to_stock_in_items(id, stock_in_no, date_added, date_updated, added_by_id, update_by_id, remarks, date_delivered, date_received, reference_no, item_code, barcode, description, category_id, category, classification_id, sub_classification_id, sub_classification, brand_id, brand, model_id, model, product_qty, unit, conversion, cost, selling_price, discount_amount, item_type, supplier_id, supplier, branch_id, branch, location_id, location, status);
                tbl_stock_in_items_ALM.add(field);
                tbl_stock_in_items_M.fireTableDataChanged();
                compute();
            }
        });
        nd.setLocationRelativeTo(jScrollPane1);
        nd.setVisible(true);
    }

    private void post() {
        Field.Combo supp = (Field.Combo) jTextField2;
        int id = 0;
        String stock_in_no = Stock_ins.increment_id();
        String date_added = DateType.now();
        String date_updated = DateType.now();
        String added_by_id = MyUser.getUser_id();
        String update_by_id = MyUser.getUser_id();
        String supplier_id = supp.getId();
        String supplier = supp.getText();
        String remarks = jTextArea1.getText();
        String date_delivered = DateType.sf.format(jDateChooser1.getDate());
        String date_received = DateType.sf.format(jDateChooser2.getDate());
        String reference_no = jTextField3.getText();
        double gross_total = FitIn.toDouble(jLabel8.getText());
        double discount_amount = FitIn.toDouble(jLabel9.getText());
        double net_total = gross_total - discount_amount;
        int status = 1;

        Stock_ins.to_stock_ins to = new Stock_ins.to_stock_ins(id, stock_in_no, date_added, date_updated, added_by_id, update_by_id, supplier_id, supplier, remarks, date_delivered, date_received, reference_no, gross_total, discount_amount, net_total, status);
        List<to_stock_in_items> datas = tbl_stock_in_items_ALM;
        if (datas.isEmpty()) {
            return;
        }
        Stock_in_items.add_data(to, datas);
        Alert.set(1, remarks);
        clear();
    }

    private void clear() {
        tbl_stock_in_items_ALM.clear();
        tbl_stock_in_items_M.fireTableDataChanged();
        jTextField2.setText("");
        jTextField3.setText("");
        jTextArea1.setText("");
        jLabel2.setText("0");
        jLabel9.setText("0.00");
        jLabel8.setText("0.00");
        compute();
    }

    private void compute() {
        List<to_stock_in_items> datas = tbl_stock_in_items_ALM;
        double gross = 0;
        double discount = 0;
        double qty = 0;
        for (to_stock_in_items to : datas) {
            gross += to.product_qty * to.cost;
            qty += to.product_qty;
        }
        jLabel2.setText(FitIn.fmt_woc(qty));
        jLabel8.setText(FitIn.fmt_wc_0(gross));
    }

    List<Suppliers.to_suppliers> suppliers = new ArrayList();

    private void init_suppliers() {

        Object[][] obj = new Object[suppliers.size()][1];
        int i = 0;
        for (Suppliers.to_suppliers to : suppliers) {
            obj[i][0] = " " + to.supplier;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {jTextField2.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField2, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo sup = (Field.Combo) jTextField2;
                Suppliers.to_suppliers to = suppliers.get(data.selected_row);
                sup.setText(to.supplier);
                sup.setId("" + to.id);
            }
        });
    }
}
