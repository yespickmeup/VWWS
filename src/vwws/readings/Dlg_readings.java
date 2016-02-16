/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.readings;

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
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.fields.Label;
import synsoftech.util.DateType;
import synsoftech.util.ImageRenderer;
import vwws.meter_readers.Meter_reader_assignments;
import vwws.meter_readers.Meter_readers;
import vwws.util.DatePrevious;
import vwws.util.MyUser;
import vwws.util.TableRenderer;

/**
 *
 * @author Guinness
 */
public class Dlg_readings extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_readings
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
    private Dlg_readings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_readings(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_readings() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_readings myRef;

    private void setThisRef(Dlg_readings myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_readings> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_readings create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_readings create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_readings dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_readings((java.awt.Frame) parent, false);
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
            Dlg_readings dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_readings((java.awt.Dialog) parent, false);
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

        Dlg_readings dialog = Dlg_readings.create(new javax.swing.JFrame(), true);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_fname = new Field.Combo();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new Label.Separator();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_customers = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new Button.Default();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Meter Reader:");

        tf_fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_fnameMouseClicked(evt);
            }
        });
        tf_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fnameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Month:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jMonthChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Total No of Customers:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 51, 0));
        jLabel8.setText("Pending:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 51, 0));
        jLabel9.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Checked:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("0");

        jDateChooser1.setDate(new Date());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/search19.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(3, 170, 244));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/expand22.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tf_fname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jMonthChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(22, 22, 22))
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
        add_reading();
    }//GEN-LAST:event_tbl_customersMouseClicked

    private void tf_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fnameActionPerformed
        init_readers();
    }//GEN-LAST:event_tf_fnameActionPerformed

    private void tf_fnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_fnameMouseClicked
        init_readers();
    }//GEN-LAST:event_tf_fnameMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        data_cols_customers();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       sync();
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_customers;
    private javax.swing.JTextField tf_fname;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        meter_readers = Meter_readers.ret_data("");
        init_tbl_customers(tbl_customers);

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
        int[] tbl_widths_customers = {100, 150, 50, 0};
        for (int i = 0, n = tbl_widths_customers.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_customers, i, tbl_widths_customers[i]);
        }
        Dimension d = tbl_customers.getTableHeader().getPreferredSize();
        d.height = 0;
        tbl_customers.getTableHeader().setPreferredSize(d);
        tbl_customers.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_customers.setRowHeight(40);
        tbl_customers.setFont(new java.awt.Font("Arial", 0, 16));
        tbl_customers.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_customers(List<Meter_reader_assignments.to_meter_reader_assignments> acc) {
        tbl_customers_ALM.clear();
        tbl_customers_ALM.addAll(acc);
    }

    public static class TblcustomersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "ID #", "Name", "", ""
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
            Meter_reader_assignments.to_meter_reader_assignments tt = (Meter_reader_assignments.to_meter_reader_assignments) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.customer_no;
                case 1:
                    return " " + tt.customer_name;
                case 2:
                    if (tt.status == 1) {
                        return "/vwws/icons/check52 (3).png";
                    } else {
                        return "/vwws/icons/cross29 (1).png";
                    }
                default:
                    return tt.status;
            }
        }
    }

    private void data_cols_customers() {
        Field.Combo tf = (Field.Combo) tf_fname;
        String month = DateType.m1.format(jDateChooser1.getDate());
        String year = DateType.y.format(jDateChooser1.getDate());
        String where = " where meter_reader_id='" + tf.getId() + "' ";
        List<Meter_reader_assignments.to_meter_reader_assignments> datas = Meter_reader_assignments.ret_assignments(where);
        String where2 = " where MONTH(date_added)='" + month + "' and YEAR(date_added)='" + year + "' ";
        List<Readings.to_readings> readings = Readings.ret_data(where2);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println("Assignments size: " + datas.size());
        System.out.println("Readings size: " + readings.size());
        System.out.println("****************************");
        for (Readings.to_readings r : readings) {
            for (Meter_reader_assignments.to_meter_reader_assignments to : datas) {
                if (r.customer_id.equals(to.customer_id)) {
                    to.setStatus(1);
                    to.setUpdate_by_id("" + r.id);
                    break;
                }
            }
        }

        int not_assigned = 0;
        int assigned = 0;
        for (Meter_reader_assignments.to_meter_reader_assignments to : datas) {
            if (to.status == 0) {
                not_assigned++;
            } else {
                assigned++;
            }
        }
        loadData_customers(datas);
        jLabel7.setText("" + datas.size());
        jLabel9.setText("" + not_assigned);
        jLabel11.setText("" + assigned);
    }

    private void add_reading() {
        int row = tbl_customers.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Meter_reader_assignments.to_meter_reader_assignments to = (Meter_reader_assignments.to_meter_reader_assignments) tbl_customers_ALM.get(row);

        Window p = (Window) this;
        Dlg_readings_add nd = Dlg_readings_add.create(p, true);
        nd.setTitle("");
        if (to.status == 1) {
            String month = DateType.m1.format(jDateChooser1.getDate());
            String year = DateType.y.format(jDateChooser1.getDate());
            double previous_reading = 0;
            double current_reading = 0;
            String where = " where MONTH(date_added)='" + month + "' and YEAR(date_added)='" + year + "' and  customer_id='" + to.customer_id + "' ";

            String prev_reading_date = "";
            String current_reading_date = "";

            List<Readings.to_readings> field = Readings.ret_data(where);
            for (Readings.to_readings r : field) {
                previous_reading = r.previous_reading;
                current_reading = r.current_reading;
                current_reading_date = DateType.convert_slash_datetime(r.date_added);
                prev_reading_date = DateType.convert_slash_datetime(r.previous_reading_date);
            }

            System.out.println("Current: " + current_reading);
            nd.do_pass(previous_reading, current_reading, prev_reading_date, current_reading_date);
        } else {
            double previous_reading = 0;
            double current_reading = 0;
            String month = DateType.m1.format(jDateChooser1.getDate());
            String year = DateType.y.format(jDateChooser1.getDate());
            String[] str = DatePrevious.get(month, year);
            String where = " where customer_id='" + to.customer_id + "' order by id desc limit 1";
            String prev_reading_date = "None";
            String current_reading_date = "None";
            List<Readings.to_readings> field = Readings.ret_data(where);
            for (Readings.to_readings r : field) {
                previous_reading = r.current_reading;
                current_reading = r.current_reading;
                prev_reading_date = DateType.convert_slash_datetime(r.date_added);
            }

            nd.do_pass2(previous_reading, prev_reading_date);
        }

        nd.setCallback(new Dlg_readings_add.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_readings_add.OutputData data) {
                closeDialog.ok();
                Field.Combo reader = (Field.Combo) tf_fname;
                int id = 0;
                String meter_reader_id = reader.getId();
                String meter_reader_no = "";
                String meter_reader_name = reader.getText();
                String customer_id = to.customer_id;
                String customer_no = to.customer_no;
                String customer_name = to.customer_name;
                String customer_tax_dec_no = "";
                double previous_reading = data.previous_reading;
                double current_reading = data.current_reading;
                String city = "";
                String city_id = "";
                String barangay = to.barangay;
                String barangay_id = to.barangay_id;
                String purok = to.purok;
                String purok_id = to.purok_id;
                String address = "";
//                String date_added = DateType.now();
//                String date_updated = DateType.now();
                String date_added = DateType.sf.format(jDateChooser1.getDate());
                String date_updated = DateType.sf.format(jDateChooser1.getDate());
                String added_by_id = MyUser.getUser_id();
                String update_by_id = MyUser.getUser_id();
                int status = 0;
                String my_occupancy_id = to.occupancy_id;
                String my_occupancy = to.occupancy;
                String my_occupancy_type_id = to.occupancy_type_id;
                String my_occupancy_type = to.occupancy_type;
                String my_occupancy_type_code = to.occupancy_type_code;
                String previous_reading_date = data.previous_reading_date;
                int is_paid = 0;
                String or_id = "";
                String or_no = "";
                Readings.to_readings to1 = new Readings.to_readings(id, meter_reader_id, meter_reader_no, meter_reader_name, customer_id, customer_no, customer_name, customer_tax_dec_no, previous_reading, current_reading, city, city_id, barangay, barangay_id, purok, purok_id, address, date_added, date_updated, added_by_id, update_by_id, status, false, my_occupancy_id, my_occupancy, my_occupancy_type_id, my_occupancy_type, my_occupancy_type_code, previous_reading_date, is_paid, or_id, or_no, 0, 0, 0, 0);
                Readings.add_data(to1);
//                if (to.status == 0) {
//
//                } else {
//                    int id = FitIn.toInt(to.update_by_id);
//                    String meter_reader_id = reader.getId();
//                    String meter_reader_no = "";
//                    String meter_reader_name = reader.getText();
//                    String customer_id = "" + to.id;
//                    String customer_no = to.customer_no;
//                    String customer_name = to.customer_name;
//                    String customer_tax_dec_no = "";
//                    double previous_reading = data.previous_reading;
//                    double current_reading = data.current_reading;
//                    String city = "";
//                    String city_id = "";
//                    String barangay = to.barangay;
//                    String barangay_id = to.barangay_id;
//                    String purok = to.purok;
//                    String purok_id = to.purok_id;
//                    String address = "";
//                    String date_added = DateType.now();
//                    String date_updated = DateType.now();
//                    String added_by_id = MyUser.getUser_id();
//                    String update_by_id = MyUser.getUser_id();
//                    int status = 1;
//                    String my_occupancy_id = to.occupancy_id;
//                    String my_occupancy = to.occupancy;
//                    String my_occupancy_type_id = to.occupancy_type_id;
//                    String my_occupancy_type = to.occupancy_type;
//                    String my_occupancy_type_code = to.occupancy_type_code;
//                    Readings.to_readings to1 = new Readings.to_readings(id, meter_reader_id, meter_reader_no, meter_reader_name, customer_id, customer_no, customer_name, customer_tax_dec_no, previous_reading, current_reading, city, city_id, barangay, barangay_id, purok, purok_id, address, date_added, date_updated, added_by_id, update_by_id, status, false, my_occupancy_id, my_occupancy, my_occupancy_type_id, my_occupancy_type, my_occupancy_type_code);
//                    Readings.update_reading(to1);
//                }

                data_cols_customers();
            }

        });
        nd.setLocationRelativeTo(jScrollPane1);
        nd.setVisible(true);
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
        int[] tbl_widths_customers = {tf_fname.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_fname, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo tf = (Field.Combo) tf_fname;
                Meter_readers.to_meter_readers to = meter_readers.get(data.selected_row);
                tf_fname.setText(to.lname + ", " + to.fname + " " + to.mi);
                tf.setId("" + to.id);
                data_cols_customers();
            }
        });
    }

    private void sync() {
        Window p = (Window) this;
        Dlg_sync nd = Dlg_sync.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_sync.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_sync.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
}
