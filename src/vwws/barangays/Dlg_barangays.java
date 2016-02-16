/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.barangays;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.fields.Label;
import synsoftech.util.DateType;
import vwws.barangays.Barangays.to_barangays;
import vwws.cities.Cities;
import vwws.occupancies.Occupancies;
import vwws.util.MyUser;
import vwws.util.TableRenderer;

/**
 *
 * @author Guinness
 */
public class Dlg_barangays extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_barangays
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
    private Dlg_barangays(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_barangays(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_barangays() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_barangays myRef;

    private void setThisRef(Dlg_barangays myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_barangays> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_barangays create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_barangays create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_barangays dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_barangays((java.awt.Frame) parent, false);
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
            Dlg_barangays dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_barangays((java.awt.Dialog) parent, false);
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

        Dlg_barangays dialog = Dlg_barangays.create(new javax.swing.JFrame(), true);
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_barangays = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tf_city = new Field.Combo();
        jButton2 = new Button.Success();
        jButton3 = new Button.Info();
        jButton4 = new Button.Warning();
        jButton5 = new Button.Default();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_barangay = new Field.Input();
        jLabel45 = new Label.Separator();
        jLabel5 = new javax.swing.JLabel();
        tf_city2 = new Field.Combo();
        jLabel6 = new javax.swing.JLabel();
        tf_city3 = new Field.Search();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton6 = new Button.Search();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tbl_barangays.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_barangays.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangaysMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_barangays);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("City:");

        tf_city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_city.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_cityMouseClicked(evt);
            }
        });
        tf_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cityActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("New");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("0");

        jLabel2.setText("No. of barangays:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Barangay:");

        tf_barangay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("City:");

        tf_city2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_city2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_city2MouseClicked(evt);
            }
        });
        tf_city2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_city2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Barangay:");

        tf_city3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/search67.png"))); // NOI18N
        jLabel7.setText("Search");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("All");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/search19.png"))); // NOI18N
        jButton6.setToolTipText("Search");
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_barangay))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_city))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 120, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(tf_city3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_city2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_barangay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_city2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_city3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_barangaysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangaysMouseClicked
        select_barangays();
    }//GEN-LAST:event_tbl_barangaysMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        add_barangays();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        update_barangays();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        delete_barangays();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        tf_city.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        data_cols();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tf_city2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_city2ActionPerformed
        init_cities(tf_city2);
    }//GEN-LAST:event_tf_city2ActionPerformed

    private void tf_city2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_city2MouseClicked
        init_cities(tf_city2);
    }//GEN-LAST:event_tf_city2MouseClicked

    private void tf_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cityActionPerformed
        init_cities(tf_city);
    }//GEN-LAST:event_tf_cityActionPerformed

    private void tf_cityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cityMouseClicked
        init_cities(tf_city);
    }//GEN-LAST:event_tf_cityMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_barangays;
    private javax.swing.JTextField tf_barangay;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_city2;
    private javax.swing.JTextField tf_city3;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        cities = Cities.ret_data("");

        init_tbl_barangays(tbl_barangays);
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

    //<editor-fold defaultstate="collapsed" desc=" barangays "> 
    public static ArrayListModel tbl_barangays_ALM;
    public static TblbarangaysModel tbl_barangays_M;

    public static void init_tbl_barangays(JTable tbl_barangays) {
        tbl_barangays_ALM = new ArrayListModel();
        tbl_barangays_M = new TblbarangaysModel(tbl_barangays_ALM);
        tbl_barangays.setModel(tbl_barangays_M);
        tbl_barangays.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_barangays.setRowHeight(25);
        int[] tbl_widths_barangays = {100, 100, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_barangays.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_barangays, i, tbl_widths_barangays[i]);
        }
        Dimension d = tbl_barangays.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_barangays.getTableHeader().setPreferredSize(d);
        tbl_barangays.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_barangays.setRowHeight(25);
        tbl_barangays.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_barangays(List<to_barangays> acc) {
        tbl_barangays_ALM.clear();
        tbl_barangays_ALM.addAll(acc);
    }

    public static class TblbarangaysModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Barangay", "City", "city", "barangay", "date_added", "date_updated", "added_by_id", "update_by_id"
        };

        public TblbarangaysModel(ListModel listmodel) {
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
            to_barangays tt = (to_barangays) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.barangay;
                case 1:
                    return " " + tt.city;
                case 2:
                    return tt.city;
                case 3:
                    return tt.barangay;
                case 4:
                    return tt.date_added;
                case 5:
                    return tt.date_updated;
                case 6:
                    return tt.added_by_id;
                default:
                    return tt.update_by_id;
            }
        }
    }

    private void data_cols() {
        String where = " ";
        if (!jCheckBox1.isSelected()) {
            Field.Combo tfs = (Field.Combo) tf_city2;
            where = " where city_id='" + tfs.getId() + "' ";
        }
        List<Barangays.to_barangays> datas = Barangays.ret_data(where);
        loadData_barangays(datas);
        jLabel3.setText("" + datas.size());

    }
//</editor-fold> 

    List<Cities.to_cities> cities = new ArrayList();

    private void init_cities(final JTextField tf) {

        Object[][] obj = new Object[cities.size()][1];
        int i = 0;
        for (Cities.to_cities to : cities) {
            obj[i][0] = " " + to.city;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo tfs = (Field.Combo) tf;
                Cities.to_cities to = cities.get(data.selected_row);
                tfs.setText(to.city);
                tfs.setId("" + to.id);
            }
        });
    }

    private void add_barangays() {

        Field.Combo tfs = (Field.Combo) tf_city;
        if (tfs.getId() == null) {
            return;
        }
        int id = 0;
        String city_id = tfs.getId();
        String city = tf_city.getText();
        String barangay = tf_barangay.getText();
        String date_added = DateType.now();
        String date_updated = DateType.now();
        String added_by_id = MyUser.getUser_id();
        String update_by_id = MyUser.getUser_id();

        to_barangays to = new to_barangays(id, city_id, city, barangay, date_added, date_updated, added_by_id, update_by_id);
        Barangays.add_data(to);

        data_cols();
        tf_barangay.setText("");

    }

    private void select_barangays() {

        int row = tbl_barangays.getSelectedRow();
        if (row < 0) {
            return;
        }
        Field.Combo tfs = (Field.Combo) tf_city;
        to_barangays to = (to_barangays) tbl_barangays_ALM.get(row);
        tfs.setId(to.city_id);
        tf_city.setText(to.city);
        tf_barangay.setText(to.barangay);

    }

    private void update_barangays() {

        int row = tbl_barangays.getSelectedRow();
        if (row < 0) {
            return;
        }
        Field.Combo tfs = (Field.Combo) tf_city;
        to_barangays to = (to_barangays) tbl_barangays_ALM.get(row);
        int id = to.id;
        String city_id = tfs.getId();
        String city = tf_city.getText();
        String barangay = tf_barangay.getText();
        String date_added = to.date_added;
        String date_updated = DateType.now();
        String added_by_id = to.added_by_id;
        String update_by_id = MyUser.getUser_id();

        to_barangays to1 = new to_barangays(id, city_id, city, barangay, date_added, date_updated, added_by_id, update_by_id);
        Barangays.update_data(to1);
        data_cols();
        tf_barangay.setText("");

    }

    private void delete_barangays() {

        int row = tbl_barangays.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_barangays to = (to_barangays) tbl_barangays_ALM.get(row);
        Barangays.delete_data(to);
        data_cols();
        tf_barangay.setText("");

    }
}
