/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.meter_readers;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.DateType;
import vwws.customers.Dlg_customers;
import vwws.meter_readers.Meter_readers.to_meter_readers;
import vwws.util.DeEncrypter;
import vwws.util.MyUser;

/**
 *
 * @author Guinness
 */
public class Dlg_meter_readers extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_meter_readers
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
    private Dlg_meter_readers(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_meter_readers(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_meter_readers() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_meter_readers myRef;

    private void setThisRef(Dlg_meter_readers myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_meter_readers> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_meter_readers create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_meter_readers create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_meter_readers dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_meter_readers((java.awt.Frame) parent, false);
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
            Dlg_meter_readers dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_meter_readers((java.awt.Dialog) parent, false);
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

        Dlg_meter_readers dialog = Dlg_meter_readers.create(new javax.swing.JFrame(), true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_fname = new Field.Input();
        jLabel2 = new javax.swing.JLabel();
        tf_mi = new Field.Input();
        jLabel3 = new javax.swing.JLabel();
        tf_lname = new Field.Input();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        tf_city = new Field.Combo();
        tf_barangay = new Field.Combo();
        jLabel8 = new javax.swing.JLabel();
        tf_purok = new Field.Combo();
        jLabel9 = new javax.swing.JLabel();
        tf_address = new Field.Input();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new Button.Default();
        jButton2 = new Button.Success();
        jButton3 = new Button.Info();
        jButton4 = new Button.Warning();
        jLabel14 = new javax.swing.JLabel();
        tf_barangay1 = new Field.Combo();
        jLabel15 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_meter_readers = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Birth Date:");

        tf_fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Middle Name:");

        tf_mi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Last Name:");

        tf_lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("First Name:");

        jDateChooser1.setDate(new Date());
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("City:");

        tf_city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_barangay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Barangay:");

        tf_purok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Purok:");

        tf_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Address:");

        jPanel4.setOpaque(false);

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Username:");

        tf_barangay1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Password:");

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_fname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(tf_city, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(tf_barangay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_mi, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tf_lname, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addGap(71, 71, 71))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_barangay1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jPasswordField1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_address, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(437, 437, 437)
                                .addComponent(tf_purok, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_mi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_barangay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_purok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_barangay1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbl_meter_readers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_meter_readers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_meter_readersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_meter_readers);

        jLabel11.setText("Total No:");

        jLabel12.setText("0");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel13.setText("Status:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tf_fname.setText("");
        tf_mi.setText("");
        tf_lname.setText("");
        tf_city.setText("");
        tf_barangay.setText("");
        tf_purok.setText("");
        tf_address.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        add_meter_readers();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        update_meter_readers();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        delete_meter_readers();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbl_meter_readersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_meter_readersMouseClicked
        select_meter_readers();
    }//GEN-LAST:event_tbl_meter_readersMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_meter_readers;
    private javax.swing.JTextField tf_address;
    private javax.swing.JTextField tf_barangay;
    private javax.swing.JTextField tf_barangay1;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_lname;
    private javax.swing.JTextField tf_mi;
    private javax.swing.JTextField tf_purok;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_tbl_meter_readers(tbl_meter_readers);
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

    //<editor-fold defaultstate="collapsed" desc=" meter_readers "> 
    public static ArrayListModel tbl_meter_readers_ALM;
    public static Tblmeter_readersModel tbl_meter_readers_M;

    public static void init_tbl_meter_readers(JTable tbl_meter_readers) {
        tbl_meter_readers_ALM = new ArrayListModel();
        tbl_meter_readers_M = new Tblmeter_readersModel(tbl_meter_readers_ALM);
        tbl_meter_readers.setModel(tbl_meter_readers_M);
        tbl_meter_readers.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_meter_readers.setRowHeight(25);
        int[] tbl_widths_meter_readers = {80, 150, 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_meter_readers.length; i < n; i++) {
            if (i == 2 || i == 3) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_meter_readers, i, tbl_widths_meter_readers[i]);
        }
        Dimension d = tbl_meter_readers.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_meter_readers.getTableHeader().setPreferredSize(d);
        tbl_meter_readers.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_meter_readers.setRowHeight(25);
        tbl_meter_readers.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_meter_readers(List<to_meter_readers> acc) {
        tbl_meter_readers_ALM.clear();
        tbl_meter_readers_ALM.addAll(acc);
    }

    public static class Tblmeter_readersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "ID #", "Name", "Barangay", "Purok", "lname", "bday", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "address", "date_added", "date_updated", "added_by_id", "update_by_id", "status"
        };

        public Tblmeter_readersModel(ListModel listmodel) {
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
            to_meter_readers tt = (to_meter_readers) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.meter_reader_no;
                case 1:
                    return " " + tt.lname + ", " + tt.fname + " " + tt.mi;
                case 2:
                    return " " + tt.barangay;
                case 3:
                    return " " + tt.purok;
                case 4:
                    return tt.lname;
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
                    return tt.date_added;
                case 14:
                    return tt.date_updated;
                case 15:
                    return tt.added_by_id;
                case 16:
                    return tt.update_by_id;
                default:
                    return tt.status;
            }
        }
    }

    private void data_cols() {
        String where = "";
        List<Meter_readers.to_meter_readers> datas = Meter_readers.ret_data(where);
        loadData_meter_readers(datas);
    }
//</editor-fold> 

    private void add_meter_readers() {

        Field.Combo ct = (Field.Combo) tf_city;
        Field.Combo brgy = (Field.Combo) tf_barangay;
        Field.Combo prk = (Field.Combo) tf_purok;

        int id = 0;
        String meter_reader_no = Meter_readers.increment_id();
        String fname = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String bday = DateType.sf.format(jDateChooser1.getDate());
        String city = tf_city.getText();
        String city_id = ct.getId();
        String barangay = tf_barangay.getText();
        String barangay_id = brgy.getId();
        String purok = tf_purok.getText();
        String purok_id = prk.getId();
        String address = tf_address.getText();
        String date_added = DateType.now();
        String date_updated = DateType.now();
        String added_by_id = MyUser.getUser_id();
        String update_by_id = MyUser.getUser_id();
        String user_name = tf_barangay1.getText();
        String password = DeEncrypter.encrypt(jPasswordField1.getText());
        int status = 1;
        to_meter_readers to = new to_meter_readers(id, meter_reader_no, fname, mi, lname, bday, city, city_id, barangay, barangay_id, purok, purok_id, address, date_added, date_updated, added_by_id, update_by_id, status, user_name, password);
        Meter_readers.add_data(to);
        data_cols();
        tf_fname.setText("");
        tf_mi.setText("");
        tf_lname.setText("");
        tf_city.setText("");
        tf_barangay.setText("");
        tf_purok.setText("");
        tf_address.setText("");

    }

    private void select_meter_readers() {

        int row = tbl_meter_readers.getSelectedRow();
        if (row < 0) {
            return;
        }
        Field.Combo ct = (Field.Combo) tf_city;
        Field.Combo brgy = (Field.Combo) tf_barangay;
        Field.Combo pr = (Field.Combo) tf_city;

        to_meter_readers to = (to_meter_readers) tbl_meter_readers_ALM.get(row);

        tf_fname.setText(to.fname);
        tf_mi.setText(to.mi);
        tf_lname.setText(to.lname);
        try {
            Date bday = DateType.sf.parse(to.bday);
            jDateChooser1.setDate(bday);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_customers.class.getName()).log(Level.SEVERE, null, ex);
        }
        tf_city.setText(to.city);
        ct.setId(to.city_id);
        tf_barangay.setText(to.barangay);
        brgy.setId(to.barangay_id);
        tf_purok.setText(to.purok);
        pr.setId(to.purok_id);
        tf_address.setText(to.address);
        String password = DeEncrypter.decrypt(to.password);
        jPasswordField1.setText(password);

    }

    private void update_meter_readers() {

        int row = tbl_meter_readers.getSelectedRow();
        if (row < 0) {
            return;
        }
        Field.Combo ct = (Field.Combo) tf_city;
        Field.Combo brgy = (Field.Combo) tf_barangay;
        Field.Combo prk = (Field.Combo) tf_purok;
        to_meter_readers to = (to_meter_readers) tbl_meter_readers_ALM.get(row);
        int id = to.id;
        String meter_reader_no = to.meter_reader_no;
        String fname = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String bday = DateType.sf.format(jDateChooser1.getDate());
        String city = tf_city.getText();
        String city_id = ct.getId();
        String barangay = tf_barangay.getText();
        String barangay_id = brgy.getId();
        String purok = tf_purok.getText();
        String purok_id = prk.getId();
        String address = tf_address.getText();
        String date_added = DateType.now();
        String date_updated = DateType.now();
        String added_by_id = MyUser.getUser_id();
        String update_by_id = MyUser.getUser_id();
        int status = to.status;
        String user_name = tf_barangay1.getText();
        String password = DeEncrypter.encrypt(jPasswordField1.getText());
        to_meter_readers to1 = new to_meter_readers(id, meter_reader_no, fname, mi, lname, bday, city, city_id, barangay, barangay_id, purok, purok_id, address, date_added, date_updated, added_by_id, update_by_id, status, user_name, password);
        Meter_readers.update_data(to1);
        data_cols();
        tf_fname.setText("");
        tf_mi.setText("");
        tf_lname.setText("");
        tf_city.setText("");
        tf_barangay.setText("");
        tf_purok.setText("");
        tf_address.setText("");

    }

    private void delete_meter_readers() {

        int row = tbl_meter_readers.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_meter_readers to = (to_meter_readers) tbl_meter_readers_ALM.get(row);
        Meter_readers.delete_data(to);
        data_cols();
        tf_fname.setText("");
        tf_mi.setText("");
        tf_lname.setText("");
        tf_city.setText("");
        tf_barangay.setText("");
        tf_purok.setText("");
        tf_address.setText("");

    }
}
