/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.inventory;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
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
import vwws.inventory.Inventory.to_inventory;
import vwws.stock_in.Dlg_stock_ins;
import vwws.stock_out.Dlg_stock_out;
import vwws.util.Alert;
import vwws.util.Dlg_confirm;
import vwws.util.MyUser;

/**
 *
 * @author Guinness
 */
public class Dlg_inventory extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_inventory
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
    private Dlg_inventory(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_inventory(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_inventory() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_inventory myRef;

    private void setThisRef(Dlg_inventory myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_inventory> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_inventory create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_inventory create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_inventory dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_inventory((java.awt.Frame) parent, false);
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
            Dlg_inventory dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_inventory((java.awt.Dialog) parent, false);
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

        Dlg_inventory dialog = Dlg_inventory.create(new javax.swing.JFrame(), true);
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new Button.Default();
        jTextField1 = new Field.Search();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new Field.Combo();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new Field.Combo();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new Field.Combo();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new Field.Combo();
        jTextField6 = new Field.Combo();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new Button.Search();
        jButton2 = new Button.Default();
        jButton4 = new Button.Default();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_inventory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/add169.png"))); // NOI18N
        jButton1.setText("Add New Item - [F1]");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Category:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Classification:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Sub-Classification:");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Model:");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Brand:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Description:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/search19.png"))); // NOI18N
        jButton3.setToolTipText("Search");
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/down88.png"))); // NOI18N
        jButton2.setText("Stock In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/send11.png"))); // NOI18N
        jButton4.setText("Stock Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jTextField2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField3)
                    .addComponent(jTextField6))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbl_inventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_inventoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_inventory);

        jLabel1.setText("Total No.:");

        jLabel2.setText("0");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel3.setText("Status:");

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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        data_cols();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add_item();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_inventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_inventoryMouseClicked
        select_item();
    }//GEN-LAST:event_tbl_inventoryMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        stock_in();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        stock_out();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tbl_inventory;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_tbl_inventory(tbl_inventory);
        data_cols();
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

    //<editor-fold defaultstate="collapsed" desc=" inventory "> 
    public static ArrayListModel tbl_inventory_ALM;
    public static TblinventoryModel tbl_inventory_M;

    public static void init_tbl_inventory(JTable tbl_inventory) {
        tbl_inventory_ALM = new ArrayListModel();
        tbl_inventory_M = new TblinventoryModel(tbl_inventory_ALM);
        tbl_inventory.setModel(tbl_inventory_M);
        tbl_inventory.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_inventory.setRowHeight(25);
        int[] tbl_widths_inventory = {40, 80, 120, 100, 100, 80, 80, 50, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_inventory.length; i < n; i++) {
            if (i == 3) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_inventory, i, tbl_widths_inventory[i]);
        }
        Dimension d = tbl_inventory.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_inventory.getTableHeader().setPreferredSize(d);
        tbl_inventory.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_inventory.setRowHeight(25);
        tbl_inventory.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_inventory, 5);
        TableWidthUtilities.setColumnRightRenderer(tbl_inventory, 6);
    }

    public static void loadData_inventory(List<to_inventory> acc) {
        tbl_inventory_ALM.clear();
        tbl_inventory_ALM.addAll(acc);
    }

    public static class TblinventoryModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Qty", "Item Code", "Barcode", "Description", "Category", "Cost", "Selling Price", "", "", "category", "classification_id", "sub_classification_id", "sub_classification", "brand_id", "brand", "model_id", "model", "product_qty", "unit", "conversion", "cost", "selling_price", "item_type", "supplier_id", "supplier", "status", "branch_id", "branch", "location_id", "location"
        };

        public TblinventoryModel(ListModel listmodel) {
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
            to_inventory tt = (to_inventory) getRow(row);
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
                    return " " + tt.category;
                case 5:
                    return FitIn.fmt_wc_0(tt.cost) + " ";
                case 6:
                    return FitIn.fmt_wc_0(tt.selling_price) + " ";
                case 7:
                    return " Update";
                case 8:
                    return " Delete";
                case 9:
                    return tt.category;
                case 10:
                    return tt.classification_id;
                case 11:
                    return tt.sub_classification_id;
                case 12:
                    return tt.sub_classification;
                case 13:
                    return tt.brand_id;
                case 14:
                    return tt.brand;
                case 15:
                    return tt.model_id;
                case 16:
                    return tt.model;
                case 17:
                    return tt.product_qty;
                case 18:
                    return tt.unit;
                case 19:
                    return tt.conversion;
                case 20:
                    return tt.cost;
                case 21:
                    return tt.selling_price;
                case 22:
                    return tt.item_type;
                case 23:
                    return tt.supplier_id;
                case 24:
                    return tt.supplier;
                case 25:
                    return tt.status;
                case 26:
                    return tt.branch_id;
                case 27:
                    return tt.branch;
                case 28:
                    return tt.location_id;
                default:
                    return tt.location;
            }
        }
    }

    private void data_cols() {
        String where = "";
        List<Inventory.to_inventory> datas = Inventory.ret_data(where);
        loadData_inventory(datas);
        jLabel2.setText("" + datas.size());
    }
//</editor-fold> 

    private void add_item() {
        Window p = (Window) this;
        Dlg_inventory_add nd = Dlg_inventory_add.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_inventory_add.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_inventory_add.OutputData data) {
                closeDialog.ok();
                int id = 0;
                String date_added = DateType.now();
                String date_updated = DateType.now();
                String added_by_id = MyUser.getUser_id();
                String update_by_id = MyUser.getUser_id();
                String item_code = Inventory.increment_id();
                String barcode = data.barcode;
                String description = data.description;
                String category_id = data.category_id;
                String category = data.category;
                String classification_id = data.classification_id;
                String classification = data.classification;
                String sub_classification_id = data.sub_classification_id;
                String sub_classification = data.sub_classification;
                String brand_id = data.brand_id;
                String brand = data.brand;
                String model_id = data.model_id;
                String model = data.model;
                double product_qty = 0;
                String unit = data.unit;
                double conversion = 1;
                double cost = data.cost;
                double selling_price = data.selling_price;
                String item_type = "Regular";
                String supplier_id = "";
                String supplier = "";
                int status = 1;
                String branch_id = "";
                String branch = "";
                String location_id = "";
                String location = "";
                Inventory.to_inventory inv = new Inventory.to_inventory(id, date_added, date_updated, added_by_id, update_by_id, item_code, barcode, description, category_id, category, classification_id, classification, sub_classification_id, sub_classification, brand_id, brand, model_id, model, product_qty, unit, conversion, cost, selling_price, item_type, supplier_id, supplier, status, branch_id, branch, location_id, location);
                Inventory.add_data(inv);
                data_cols();
                Alert.set(1, unit);
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_item() {
        int row = tbl_inventory.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_inventory to = (to_inventory) tbl_inventory_ALM.get(row);
        int col = tbl_inventory.getSelectedColumn();
        if (col == 8) {
            Window p = (Window) this;
            Dlg_confirm nd = Dlg_confirm.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                    closeDialog.ok();
                    Inventory.delete_data(to);
                    data_cols();
                    Alert.set(3, "");
                }
            });
            nd.setLocationRelativeTo(jScrollPane1);
            nd.setVisible(true);
        }
        if (col == 7) {
            update_item();
        }
    }

    private void update_item() {
        int row = tbl_inventory.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_inventory to = (to_inventory) tbl_inventory_ALM.get(row);

        Window p = (Window) this;
        Dlg_inventory_add nd = Dlg_inventory_add.create(p, true);
        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_inventory_add.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_inventory_add.OutputData data) {
                closeDialog.ok();
                int id = to.id;
                String date_added = to.date_added;
                String date_updated = DateType.now();
                String added_by_id = to.added_by_id;
                String update_by_id = MyUser.getUser_id();
                String item_code = to.item_code;
                String barcode = data.barcode;
                String description = data.description;
                String category_id = data.category_id;
                String category = data.category;
                String classification_id = data.classification_id;
                String classification = data.classification;
                String sub_classification_id = data.sub_classification_id;
                String sub_classification = data.sub_classification;
                String brand_id = data.brand_id;
                String brand = data.brand;
                String model_id = data.model_id;
                String model = data.model;
                double product_qty = 0;
                String unit = data.unit;
                double conversion = 1;
                double cost = data.cost;
                double selling_price = data.selling_price;
                String item_type = "Regular";
                String supplier_id = "";
                String supplier = "";
                int status = to.status;
                String branch_id = to.branch_id;
                String branch = to.branch;
                String location_id = to.location_id;
                String location = to.location;
                Inventory.to_inventory inv = new Inventory.to_inventory(id, date_added, date_updated, added_by_id, update_by_id, item_code, barcode, description, category_id, category, classification_id, classification, sub_classification_id, sub_classification, brand_id, brand, model_id, model, product_qty, unit, conversion, cost, selling_price, item_type, supplier_id, supplier, status, branch_id, branch, location_id, location);
                Inventory.update_data(inv);
                data_cols();
                Alert.set(2, unit);
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void stock_in() {
        Window p = (Window) this;
        Dlg_stock_ins nd = Dlg_stock_ins.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_stock_ins.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_stock_ins.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void stock_out() {
        Window p = (Window) this;
        Dlg_stock_out nd = Dlg_stock_out.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_stock_out.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_stock_out.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
}
