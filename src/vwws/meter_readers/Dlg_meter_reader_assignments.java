/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.meter_readers;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
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
import synsoftech.util.ImageRenderer;
import vwws.customers.Customers;
import vwws.util.MyUser;
import vwws.util.TableRenderer;

/**
 *
 * @author Guinness
 */
public class Dlg_meter_reader_assignments extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_meter_reader_assignments
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
    private Dlg_meter_reader_assignments(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_meter_reader_assignments(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_meter_reader_assignments() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_meter_reader_assignments myRef;

    private void setThisRef(Dlg_meter_reader_assignments myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_meter_reader_assignments> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_meter_reader_assignments create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_meter_reader_assignments create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_meter_reader_assignments dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_meter_reader_assignments((java.awt.Frame) parent, false);
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
            Dlg_meter_reader_assignments dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_meter_reader_assignments((java.awt.Dialog) parent, false);
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

        Dlg_meter_reader_assignments dialog = Dlg_meter_reader_assignments.create(new javax.swing.JFrame(), true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_customers = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new Field.Search();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new Field.Combo();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton1 = new Button.Success();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/man216 (1).png"))); // NOI18N
        jMenuItem1.setText("Meter Reader");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_customersMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_customersMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_customers);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/teamwork2.png"))); // NOI18N
        jLabel2.setText("Meter Reader Assigments");

        jLabel4.setText("Total No of Customers:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("0");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(204, 51, 0));
        jLabel6.setText("Not Assigned:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 51, 0));
        jLabel7.setText("0");

        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Assigned:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("0");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Meter Reader:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("All");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Status:");

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("All");

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("Assigned");

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("Not Assigned");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))
                        .addGap(2, 2, 2)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

    private void tbl_customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customersMouseClicked
        select_customer();
    }//GEN-LAST:event_tbl_customersMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        data_cols_customers();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        data_cols_customers();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        meter_reader();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tbl_customersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customersMousePressed
        popup(evt);
    }//GEN-LAST:event_tbl_customersMousePressed

    private void tbl_customersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customersMouseReleased
        popup(evt);
    }//GEN-LAST:event_tbl_customersMouseReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        init_readers();
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbl_customers;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();

        init_tbl_customers(tbl_customers);
        data_cols_customers();
        Field.Search f = (Field.Search) jTextField2;
        f.setPrompt("Search Customer Name");

        String search = "";
        meter_readers = Meter_readers.ret_data(search);
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

//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" customers "> 
    public static ArrayListModel tbl_customers_ALM;
    public static TblcustomersModel tbl_customers_M;

    public static void init_tbl_customers(JTable tbl_customers) {
        tbl_customers_ALM = new ArrayListModel();
        tbl_customers_M = new TblcustomersModel(tbl_customers_ALM);
        tbl_customers.setModel(tbl_customers_M);
        tbl_customers.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_customers.setRowHeight(25);
        int[] tbl_widths_customers = {80, 150, 200, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
        tbl_customers.getColumnModel().getColumn(3).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_customers(List<Customers.to_customers> acc) {
        tbl_customers_ALM.clear();
        tbl_customers_ALM.addAll(acc);
    }

    public static class TblcustomersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "ID #", "Name", "Reader", "", "", "bday", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "address", "balance", "tax_dec_no", "meter_is_paid", "date_added", "date_updated", "added_by_id", "update_by_id", "status"
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
            if (col == 4) {
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
                    return " " + tt.tax_dec_no;
                case 3:
                    if (tt.status == 1) {
                        return "/vwws/icons/check.png";
                    } else {
                        return "/vwws/icons/delete.png";
                    }
                case 4:
                    return tt.selected;
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

    private void data_cols_customers() {
        Field.Combo reader = (Field.Combo) jTextField1;
        String where = " where concat(c.lname,space(1),c.fname,space(1),c.mi) like '%" + jTextField2.getText() + "%' ";
        if (jCheckBox3.isSelected()) {
            where = where + " and mra.status='" + "1" + "' ";
        }
        if (jCheckBox4.isSelected()) {
            where = where + " and mra.status IS NULL ";
        }
        if (!jCheckBox1.isSelected()) {
            where = where + " and mra.meter_reader_id= '" + reader.getId() + "' ";
        }
        System.out.println(where);
        List<Customers.to_customers> datas = Meter_reader_assignments.ret_customers(where);

        int not_assigned = 0;
        int assigned = 0;

        for (Customers.to_customers to : datas) {
            if (to.status == 0) {
                not_assigned++;
            } else {
                assigned++;
            }
        }
        loadData_customers(datas);

        jLabel5.setText("" + datas.size());
        jLabel7.setText("" + not_assigned);
        jLabel9.setText("" + assigned);

    }

//</editor-fold> 
    private void select_customer() {

        int row = tbl_customers.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_customers.getSelectedColumn();
        Customers.to_customers to = (Customers.to_customers) tbl_customers_ALM.get(row);
        if (col == 4) {
            if (to.selected == true) {
                to.setSelected(false);
            } else {
                to.setSelected(true);
            }
            tbl_customers_M.fireTableDataChanged();
        }

    }

    List<Meter_readers.to_meter_readers> meter_readers = new ArrayList();

    private void init_readers() {

        Object[][] obj = new Object[meter_readers.size()][1];
        int i = 0;
        for (Meter_readers.to_meter_readers to : meter_readers) {
            obj[i][0] = " " + to.lname + ", " + to.fname + " " + to.mi;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {jTextField1.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField1, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo tf = (Field.Combo) jTextField1;
                Meter_readers.to_meter_readers to = meter_readers.get(data.selected_row);
                jTextField1.setText(to.lname + ", " + to.fname + " " + to.mi);
                tf.setId("" + to.id);

            }
        });
    }

    private void meter_reader() {
        Window p = (Window) this;
        Dlg_meter_reader_assignments_choose nd = Dlg_meter_reader_assignments_choose.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_meter_reader_assignments_choose.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_meter_reader_assignments_choose.OutputData data) {
                closeDialog.ok();

                List<Customers.to_customers> datas = tbl_customers_ALM;
                List<Meter_reader_assignments.to_meter_reader_assignments> selected = new ArrayList();
                for (Customers.to_customers customer : datas) {
                    if (customer.selected == true) {
                        int id = 0;
                        if (customer.meter_is_paid != 0) {
                            id = customer.meter_is_paid;
                        }
                        String meter_reader_id = data.meter_reader_id;
                        String meter_reader_no = "";
                        String meter_reader_name = data.meter_reader_name;
                        String customer_id = "" + customer.id;
                        String customer_no = "" + customer.customer_no;
                        String customer_name = customer.lname + ", " + customer.fname + " " + customer.mi;
                        String barangay = customer.barangay;
                        String barangay_id = customer.barangay_id;
                        String purok = customer.purok;
                        String purok_id = customer.purok_id;
                        String date_added = DateType.now();
                        String date_updated = DateType.now();
                        String added_by_id = MyUser.getUser_id();
                        String update_by_id = MyUser.getUser_id();
                        int status = 0;
                        String occupancy_id=customer.occupancy_id;
                        String occupancy=customer.occupancy;
                        String occupancy_type_id=customer.occupancy_type_id;
                        String occupancy_type=customer.occupancy_type;
                        String occupancy_type_code=customer.occupancy_type_code;
                        
                        Meter_reader_assignments.to_meter_reader_assignments to = new Meter_reader_assignments.to_meter_reader_assignments(id, meter_reader_id
                                , meter_reader_no, meter_reader_name, customer_id, customer_no, customer_name, barangay, barangay_id, purok, purok_id
                                , date_added, date_updated, added_by_id, update_by_id, status,occupancy_id,occupancy,occupancy_type_id,occupancy_type,occupancy_type_code);

                        selected.add(to);
                    }
                }

                Meter_reader_assignments.add_data(selected);

                data_cols_customers();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void popup(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(tbl_customers, evt.getX(), evt.getY());
        }
    }

}
