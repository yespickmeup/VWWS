/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.customers;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
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
import vwws.barangays.Barangays;
import vwws.cities.Cities;
import vwws.customers.Customer_ordered_items.to_customer_ordered_items;
import vwws.customers.Customers.to_customers;
import vwws.inventory.Inventory;
import vwws.occupancy_types.Occupancy_types;
import vwws.stock_out.Dlg_qty;
import vwws.util.Alert;
import vwws.util.Dlg_confirm;
import vwws.util.MyUser;
import vwws.util.TableRenderer;

/**
 *
 * @author Guinness
 */
public class Dlg_customers extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_customers
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
    private Dlg_customers(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_customers(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_customers() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_customers myRef;

    private void setThisRef(Dlg_customers myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_customers> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_customers create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_customers create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_customers dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_customers((java.awt.Frame) parent, false);
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
            Dlg_customers dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_customers((java.awt.Dialog) parent, false);
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

        Dlg_customers dialog = Dlg_customers.create(new javax.swing.JFrame(), true);
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
        jPanel5 = new javax.swing.JPanel();
        pnl_list = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_customers = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new Button.Default();
        tf_fname1 = new Field.Search();
        pnl_details = new javax.swing.JPanel();
        pnl_holder = new javax.swing.JPanel();
        pnl_personal_info = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_fname = new Field.Input();
        jLabel3 = new javax.swing.JLabel();
        tf_lname = new Field.Input();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_mi = new Field.Input();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        tf_lname1 = new Field.Combo();
        jLabel18 = new javax.swing.JLabel();
        tf_lname2 = new Field.Combo();
        jLabel19 = new javax.swing.JLabel();
        tf_lname3 = new Field.Input();
        jLabel20 = new javax.swing.JLabel();
        tf_lname4 = new Field.Input();
        jLabel21 = new javax.swing.JLabel();
        tf_lname5 = new Field.Combo();
        jButton19 = new Button.Default();
        jButton15 = new Button.Primary();
        pnl_contact_details = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_city = new Field.Combo();
        jLabel8 = new javax.swing.JLabel();
        tf_barangay = new Field.Combo();
        tf_purok = new Field.Combo();
        jLabel9 = new javax.swing.JLabel();
        tf_address = new Field.Input();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tf_lname6 = new Field.Input();
        jLabel23 = new javax.swing.JLabel();
        tf_lname7 = new Field.Input();
        jLabel24 = new javax.swing.JLabel();
        tf_lname8 = new Field.Input();
        jButton20 = new Button.Default();
        jButton17 = new Button.Primary();
        pnl_meter_details = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_tax_dec_no = new Field.Input();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        tf_occupancy_type_name = new Field.Combo();
        jButton21 = new Button.Default();
        jButton18 = new Button.Success();
        jLabel28 = new javax.swing.JLabel();
        tf_tax_dec_no1 = new Field.Input();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_customer_ordered_items = new javax.swing.JTable();
        tf_occupancy_type_name1 = new Field.Search();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.CardLayout());

        pnl_list.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel11.setText("Total No:");

        jLabel12.setText("0");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel13.setText("Status:");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/family24.png"))); // NOI18N
        jLabel16.setText("Customers");

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tf_fname1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnl_listLayout = new javax.swing.GroupLayout(pnl_list);
        pnl_list.setLayout(pnl_listLayout);
        pnl_listLayout.setHorizontalGroup(
            pnl_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_fname1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                    .addGroup(pnl_listLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_listLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        pnl_listLayout.setVerticalGroup(
            pnl_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnl_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(pnl_list, "card3");

        pnl_details.setBackground(new java.awt.Color(244, 244, 244));

        pnl_holder.setBackground(new java.awt.Color(255, 255, 255));
        pnl_holder.setLayout(new java.awt.CardLayout());

        pnl_personal_info.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("PERSONAL INFORMATION");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("First Name:");

        tf_fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Last Name:");

        tf_lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Birth Date:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Middle Name:");

        tf_mi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jDateChooser1.setDate(new Date());
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Gender:");

        tf_lname1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_lname1.setText("Male");
        tf_lname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_lname1MouseClicked(evt);
            }
        });
        tf_lname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lname1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Religion:");

        tf_lname2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_lname2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_lname2MouseClicked(evt);
            }
        });
        tf_lname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lname2ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Weight:");

        tf_lname3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Height:");

        tf_lname4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Civil Status:");

        tf_lname5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_lname5.setText("Married");
        tf_lname5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_lname5MouseClicked(evt);
            }
        });
        tf_lname5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lname5ActionPerformed(evt);
            }
        });

        jButton19.setText("Cancel");
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton15.setText("Next");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_personal_infoLayout = new javax.swing.GroupLayout(pnl_personal_info);
        pnl_personal_info.setLayout(pnl_personal_infoLayout);
        pnl_personal_infoLayout.setHorizontalGroup(
            pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_personal_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_personal_infoLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_personal_infoLayout.createSequentialGroup()
                        .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_personal_infoLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_lname5))
                            .addGroup(pnl_personal_infoLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(502, 502, 502))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_personal_infoLayout.createSequentialGroup()
                        .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_personal_infoLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_lname2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_personal_infoLayout.createSequentialGroup()
                                .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_fname)
                                    .addComponent(tf_lname))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(tf_mi)))
                            .addGroup(pnl_personal_infoLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(tf_lname3)
                                .addGap(185, 185, 185)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_lname4))
                            .addGroup(pnl_personal_infoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
        );
        pnl_personal_infoLayout.setVerticalGroup(
            pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_personal_infoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_mi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lname2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lname3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lname4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lname5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addGroup(pnl_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnl_holder.add(pnl_personal_info, "card2");

        pnl_contact_details.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setText("Contact Information");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setText("Present Address:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("City:");

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Barangay:");

        tf_barangay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_barangay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_barangayMouseClicked(evt);
            }
        });
        tf_barangay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_barangayActionPerformed(evt);
            }
        });

        tf_purok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Purok:");

        tf_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Others Info.");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Landline:");

        tf_lname6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Email Address:");

        tf_lname7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Mobile:");

        tf_lname8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton20.setText("Cancel");
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton17.setText("Next");
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_contact_detailsLayout = new javax.swing.GroupLayout(pnl_contact_details);
        pnl_contact_details.setLayout(pnl_contact_detailsLayout);
        pnl_contact_detailsLayout.setHorizontalGroup(
            pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contact_detailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_contact_detailsLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_lname7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_contact_detailsLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_lname6, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_lname8, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                    .addGroup(pnl_contact_detailsLayout.createSequentialGroup()
                        .addGroup(pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_address)
                            .addGroup(pnl_contact_detailsLayout.createSequentialGroup()
                                .addGroup(pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_city, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                    .addComponent(tf_barangay, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(4, 4, 4)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_purok, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
                    .addGroup(pnl_contact_detailsLayout.createSequentialGroup()
                        .addGroup(pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_contact_detailsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        pnl_contact_detailsLayout.setVerticalGroup(
            pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contact_detailsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lname6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lname8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lname7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_barangay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_purok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addGroup(pnl_contact_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnl_holder.add(pnl_contact_details, "card3");

        pnl_meter_details.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setText("Other Information");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tax Decleration:");

        tf_tax_dec_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Meter is Paid:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("Yes/No");
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Occupancy:");

        tf_occupancy_type_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_occupancy_type_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_occupancy_type_nameMouseClicked(evt);
            }
        });
        tf_occupancy_type_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_occupancy_type_nameActionPerformed(evt);
            }
        });

        jButton21.setText("Cancel");
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton18.setText("Add");
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Meter No:");

        tf_tax_dec_no1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbl_customer_ordered_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_customer_ordered_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_customer_ordered_itemsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_customer_ordered_items);

        tf_occupancy_type_name1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_occupancy_type_name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_occupancy_type_name1MouseClicked(evt);
            }
        });
        tf_occupancy_type_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_occupancy_type_name1ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Orders");

        jLabel30.setText("Total No. of Items:");

        jLabel31.setText("0");

        jLabel32.setText("Total Amount:");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("0.00");

        javax.swing.GroupLayout pnl_meter_detailsLayout = new javax.swing.GroupLayout(pnl_meter_details);
        pnl_meter_details.setLayout(pnl_meter_detailsLayout);
        pnl_meter_detailsLayout.setHorizontalGroup(
            pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_meter_detailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_meter_detailsLayout.createSequentialGroup()
                        .addGroup(pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_meter_detailsLayout.createSequentialGroup()
                                .addComponent(tf_occupancy_type_name)
                                .addGap(26, 26, 26))
                            .addGroup(pnl_meter_detailsLayout.createSequentialGroup()
                                .addGroup(pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_tax_dec_no)
                                    .addComponent(jCheckBox1)
                                    .addComponent(tf_tax_dec_no1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                                .addGap(413, 413, 413))))
                    .addGroup(pnl_meter_detailsLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addContainerGap(574, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_meter_detailsLayout.createSequentialGroup()
                        .addGroup(pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_meter_detailsLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_occupancy_type_name1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_meter_detailsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
        );
        pnl_meter_detailsLayout.setVerticalGroup(
            pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_meter_detailsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_tax_dec_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tax_dec_no1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_occupancy_type_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_occupancy_type_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addGap(9, 9, 9)
                .addGroup(pnl_meter_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnl_holder.add(pnl_meter_details, "card4");

        jPanel3.setBackground(new java.awt.Color(244, 244, 244));

        jButton5.setBackground(new java.awt.Color(28, 172, 233));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/customers/Untitled-1.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setOpaque(true);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(244, 244, 244));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/customers/basic Info.png"))); // NOI18N
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setFocusable(false);
        jButton16.setOpaque(true);
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(244, 244, 244));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/customers/technical.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setOpaque(true);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_detailsLayout = new javax.swing.GroupLayout(pnl_details);
        pnl_details.setLayout(pnl_detailsLayout);
        pnl_detailsLayout.setHorizontalGroup(
            pnl_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_detailsLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_detailsLayout.setVerticalGroup(
            pnl_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.add(pnl_details, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
        tf_tax_dec_no.setText("");
        tf_city.setText("");
        tf_barangay.setText("");
        tf_purok.setText("");
        tf_address.setText("");

        jButton18.setText("Add");
        cardLayout1.show(jPanel5, "1");
        cardLayout2.show(pnl_holder, "1");
        tbl_customer_ordered_items_ALM.clear();
        tbl_customer_ordered_items_M.fireTableDataChanged();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customersMouseClicked
        select_customers();
    }//GEN-LAST:event_tbl_customersMouseClicked

    private void tf_occupancy_type_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_occupancy_type_nameActionPerformed
        init_occupancies();
    }//GEN-LAST:event_tf_occupancy_type_nameActionPerformed

    private void tf_occupancy_type_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_occupancy_type_nameMouseClicked
        init_occupancies();
    }//GEN-LAST:event_tf_occupancy_type_nameMouseClicked

    private void tf_barangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_barangayActionPerformed
        init_barangays(tf_barangay);
    }//GEN-LAST:event_tf_barangayActionPerformed

    private void tf_barangayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_barangayMouseClicked
        init_barangays(tf_barangay);
    }//GEN-LAST:event_tf_barangayMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setBackground(new java.awt.Color(28, 172, 233));
        jButton16.setBackground(new java.awt.Color(244, 244, 244));
        jButton6.setBackground(new java.awt.Color(244, 244, 244));

        cardLayout2.show(pnl_holder, "1");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jButton16.setBackground(new java.awt.Color(28, 172, 233));
        jButton5.setBackground(new java.awt.Color(244, 244, 244));
        jButton6.setBackground(new java.awt.Color(244, 244, 244));
        cardLayout2.show(pnl_holder, "2");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked

    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setBackground(new java.awt.Color(28, 172, 233));
        jButton16.setBackground(new java.awt.Color(244, 244, 244));
        jButton5.setBackground(new java.awt.Color(244, 244, 244));

        cardLayout2.show(pnl_holder, "3");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        cardLayout1.show(jPanel5, "2");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        cardLayout2.show(pnl_holder, "2");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        cardLayout2.show(pnl_holder, "1");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        cardLayout2.show(pnl_holder, "3");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        cardLayout2.show(pnl_holder, "2");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        cardLayout1.show(jPanel5, "2");

        if (jButton18.getText().equalsIgnoreCase("Add")) {
            add_customers();
        } else {
            update_customers();
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void tf_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cityActionPerformed
        init_cities(tf_city);
    }//GEN-LAST:event_tf_cityActionPerformed

    private void tf_cityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cityMouseClicked
        init_cities(tf_city);
    }//GEN-LAST:event_tf_cityMouseClicked

    private void tf_lname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lname1ActionPerformed
        init_gender();
    }//GEN-LAST:event_tf_lname1ActionPerformed

    private void tf_lname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_lname1MouseClicked
        init_gender();
    }//GEN-LAST:event_tf_lname1MouseClicked

    private void tf_lname5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lname5ActionPerformed
        init_civil_status();
    }//GEN-LAST:event_tf_lname5ActionPerformed

    private void tf_lname5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_lname5MouseClicked
        init_civil_status();
    }//GEN-LAST:event_tf_lname5MouseClicked

    private void tf_lname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lname2ActionPerformed

    }//GEN-LAST:event_tf_lname2ActionPerformed

    private void tf_lname2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_lname2MouseClicked

    }//GEN-LAST:event_tf_lname2MouseClicked

    private void tf_occupancy_type_name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_occupancy_type_name1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_occupancy_type_name1MouseClicked

    private void tf_occupancy_type_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_occupancy_type_name1ActionPerformed
        init_occupancies2();
    }//GEN-LAST:event_tf_occupancy_type_name1ActionPerformed

    private void tbl_customer_ordered_itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customer_ordered_itemsMouseClicked
       select_order();
    }//GEN-LAST:event_tbl_customer_ordered_itemsMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnl_contact_details;
    private javax.swing.JPanel pnl_details;
    private javax.swing.JPanel pnl_holder;
    private javax.swing.JPanel pnl_list;
    private javax.swing.JPanel pnl_meter_details;
    private javax.swing.JPanel pnl_personal_info;
    private javax.swing.JTable tbl_customer_ordered_items;
    private javax.swing.JTable tbl_customers;
    private javax.swing.JTextField tf_address;
    private javax.swing.JTextField tf_barangay;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_fname1;
    private javax.swing.JTextField tf_lname;
    private javax.swing.JTextField tf_lname1;
    private javax.swing.JTextField tf_lname2;
    private javax.swing.JTextField tf_lname3;
    private javax.swing.JTextField tf_lname4;
    private javax.swing.JTextField tf_lname5;
    private javax.swing.JTextField tf_lname6;
    private javax.swing.JTextField tf_lname7;
    private javax.swing.JTextField tf_lname8;
    private javax.swing.JTextField tf_mi;
    private javax.swing.JTextField tf_occupancy_type_name;
    private javax.swing.JTextField tf_occupancy_type_name1;
    private javax.swing.JTextField tf_purok;
    private javax.swing.JTextField tf_tax_dec_no;
    private javax.swing.JTextField tf_tax_dec_no1;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        String where = " group by occupancy_type_id,occupancy ";
        occupancies = Occupancy_types.ret_data(where);

        cities = Cities.ret_data2(" order by city asc");
        barangays = Barangays.ret_data(" order by barangay asc");

        init_tbl_customers(tbl_customers);
        data_cols();

        init_card_layout();
        init_tbl_customer_ordered_items(tbl_customer_ordered_items);
    }
    CardLayout cardLayout1 = new CardLayout();
    CardLayout cardLayout2 = new CardLayout();

    private void init_card_layout() {

        cardLayout1 = (CardLayout) jPanel5.getLayout();
        cardLayout1.addLayoutComponent("1", pnl_details);
        cardLayout1.addLayoutComponent("2", pnl_list);

        cardLayout2 = (CardLayout) pnl_holder.getLayout();
        cardLayout2.addLayoutComponent("1", pnl_personal_info);
        cardLayout2.addLayoutComponent("2", pnl_contact_details);
        cardLayout2.addLayoutComponent("3", pnl_meter_details);

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
        int[] tbl_widths_customers = {80, 150, 100, 100, 80, 50, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_customers.length; i < n; i++) {
            if (i == 2 || i == 3) {
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

    public static void loadData_customers(List<to_customers> acc) {
        tbl_customers_ALM.clear();
        tbl_customers_ALM.addAll(acc);
    }

    public static class TblcustomersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "ID #", "Name", "City/Municipality", "Barangay", "Occupancy", "", "", "city_id", "barangay", "barangay_id", "purok", "purok_id", "address", "balance", "tax_dec_no", "meter_is_paid", "date_added", "date_updated", "added_by_id", "update_by_id", "status"
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
            to_customers tt = (to_customers) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.customer_no;
                case 1:
                    return " " + tt.lname + ", " + tt.fname + " " + tt.mi;
                case 2:
                    return " " + tt.city;
                case 3:
                    return " " + tt.barangay;
                case 4:
                    return " " + tt.occupancy_type_code + tt.occupancy;
                case 5:
                    return " Update";
                case 6:
                    return " Delete";
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
                  return tt.added_by_id;
                default:
                    return tt.status;
            }
        }
    }

    private void data_cols() {
        String where = " order by lname asc";
        List<Customers.to_customers> datas = Customers.ret_data(where);
        loadData_customers(datas);
        jLabel12.setText("" + datas.size());
    }

//</editor-fold> 
    private void add_customers() {
        Field.Combo ct = (Field.Combo) tf_city;
        Field.Combo brgy = (Field.Combo) tf_barangay;
        Field.Combo prk = (Field.Combo) tf_purok;

        int id = 0;
        String customer_no = Customers.increment_id();
        String fname = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String bday = DateType.sf.format(jDateChooser1.getDate());
        String city = tf_city.getText();
        String city_id = ct.getId();
        String barangay = brgy.getText();
        String barangay_id = brgy.getId();
        String purok = prk.getText();
        String purok_id = prk.getId();
        String address = tf_address.getText();
        double balance = 0;
        String tax_dec_no = tf_tax_dec_no.getText();
        int meter_is_paid = 1;
        if (!jCheckBox1.isSelected()) {
            meter_is_paid = 0;
        }
        String date_added = DateType.now();
        String date_updated = DateType.now();
        String added_by_id = MyUser.getUser_id();
        String update_by_id = MyUser.getUser_id();
        int status = 1;

        String occupancy_id = my_occupancy_id;
        String occupancy = my_occupancy;
        String occupancy_type_id = my_occupancy_type_id;
        String occupancy_type = my_occupancy_type;
        String occupancy_type_code = my_occupancy_type_code;
        String gender = tf_lname1.getText();
        String religion = tf_lname2.getText();
        String height = tf_lname3.getText();
        String weight = tf_lname4.getText();
        String civil_status = tf_lname5.getText();
        String contact_landline = tf_lname6.getText();
        String contact_mobile = tf_lname8.getText();
        String contact_email = tf_lname7.getText();
        String meter_no = tf_tax_dec_no1.getText();
//        to_customers to = new to_customers(id, customer_no, fname, mi, lname, bday, city, city_id, barangay, barangay_id, purok, purok_id, address, balance, tax_dec_no, meter_is_paid, date_added, date_updated, added_by_id, update_by_id, status, false, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, gender, religion, height, weight, civil_status, contact_landline, contact_mobile, contact_email, meter_no);
//        List<Customer_ordered_items.to_customer_ordered_items> datas = tbl_customer_ordered_items_ALM;
//        String customer_name = to.lname + ", " + to.fname + " " + to.mi;
//        Customers.add_data(to);
//        Customer_ordered_items.add_data(datas, customer_no, customer_name);
//        data_cols();
//        Alert.set(1, "");
//        tf_fname.setText("");
//        tf_mi.setText("");
//        tf_lname.setText("");
//        tf_city.setText("");
//        tf_barangay.setText("");
//        tf_purok.setText("");
//        tf_address.setText("");
//        tf_tax_dec_no.setText("");
//        tf_fname.grabFocus();

        cardLayout1.show(jPanel5, "2");
    }

    private void select_customers() {

        int row = tbl_customers.getSelectedRow();
        if (row < 0) {
            return;
        }
        Field.Combo ct = (Field.Combo) tf_city;
        Field.Combo brgy = (Field.Combo) tf_barangay;
        Field.Combo pr = (Field.Combo) tf_city;

        to_customers to = (to_customers) tbl_customers_ALM.get(row);
        int col = tbl_customers.getSelectedColumn();
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
        tf_tax_dec_no.setText(to.tax_dec_no);
        if (to.meter_is_paid == 1) {
            jCheckBox1.setSelected(true);
        } else {
            jCheckBox1.setSelected(false);
        }

        tf_lname1.setText(to.gender);
        tf_lname2.setText(to.religion);
        tf_lname3.setText(to.height);
        tf_lname4.setText(to.weight);
        tf_lname5.setText(to.civil_status);
        tf_lname6.setText(to.contact_landline);
        tf_lname8.setText(to.contact_landline);
        tf_lname7.setText(to.contact_email);
        tf_tax_dec_no1.setText(to.meter_no);

        String occupancy_id = my_occupancy_id;
        String occupancy = my_occupancy;
        String occupancy_type_id = my_occupancy_type_id;
        String occupancy_type = my_occupancy_type;
        String occupancy_type_code = my_occupancy_type_code;

        my_occupancy_id = to.occupancy_id;
        my_occupancy = to.occupancy;
        my_occupancy_type_id = to.occupancy_type_id;
        my_occupancy_type = to.occupancy_type;
        my_occupancy_type_code = to.occupancy_type_code;
        tf_occupancy_type_name.setText(my_occupancy_type_code + "" + my_occupancy);
        if (col == 5) {

            jButton18.setText("Update");
            cardLayout1.show(jPanel5, "1");
            cardLayout2.show(pnl_holder, "1");
            data_cols_orders();

        }
        if (col == 6) {
            delete_customers();
        }

    }

    private void update_customers() {

        int row = tbl_customers.getSelectedRow();
        if (row < 0) {
            return;
        }
        Field.Combo ct = (Field.Combo) tf_city;
        Field.Combo brgy = (Field.Combo) tf_barangay;
        Field.Combo prk = (Field.Combo) tf_purok;
        to_customers to = (to_customers) tbl_customers_ALM.get(row);
        int id = to.id;
        String customer_no = to.customer_no;
        String fname = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String bday = DateType.sf.format(jDateChooser1.getDate());
        String city = tf_city.getText();
        String city_id = ct.getId();
        String barangay = brgy.getText();
        String barangay_id = brgy.getId();
        String purok = prk.getText();
        String purok_id = prk.getId();
        String address = tf_address.getText();
        double balance = 0;
        String tax_dec_no = tf_tax_dec_no.getText();
        int meter_is_paid = 1;
        if (!jCheckBox1.isSelected()) {
            meter_is_paid = 0;
        }
        String date_added = to.date_added;
        String date_updated = DateType.now();
        String added_by_id = to.added_by_id;
        String update_by_id = MyUser.getUser_id();
        int status = 1;

        String occupancy_id = my_occupancy_id;
        String occupancy = my_occupancy;
        String occupancy_type_id = my_occupancy_type_id;
        String occupancy_type = my_occupancy_type;
        String occupancy_type_code = my_occupancy_type_code;
        String gender = tf_lname1.getText();
        String religion = tf_lname2.getText();
        String height = tf_lname3.getText();
        String weight = tf_lname4.getText();
        String civil_status = tf_lname5.getText();
        String contact_landline = tf_lname6.getText();
        String contact_mobile = tf_lname8.getText();
        String contact_email = tf_lname7.getText();
        String meter_no = tf_tax_dec_no1.getText();
//        to_customers to1 = new to_customers(id, customer_no, fname, mi, lname, bday, city, city_id, barangay, barangay_id, purok, purok_id, address, balance, tax_dec_no, meter_is_paid, date_added, date_updated, added_by_id, update_by_id, status, false, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, gender, religion, height, weight, civil_status, contact_landline, contact_mobile, contact_email, meter_no);
//        Customers.update_data(to1);

        data_cols();
        Alert.set(2, "");
        tf_fname.setText("");
        tf_mi.setText("");
        tf_lname.setText("");
        tf_city.setText("");
        tf_barangay.setText("");
        tf_purok.setText("");
        tf_address.setText("");
        tf_tax_dec_no.setText("");
        tf_fname.grabFocus();

        jButton18.setText("Add");
        cardLayout1.show(jPanel5, "2");
    }

    private void delete_customers() {

        int row = tbl_customers.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_customers to = (to_customers) tbl_customers_ALM.get(row);
        Window p = (Window) this;
        Dlg_confirm nd = Dlg_confirm.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_confirm.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                closeDialog.ok();
                Customers.delete_data(to);
                data_cols();
                Alert.set(3, "");
                tf_fname.setText("");
                tf_mi.setText("");
                tf_lname.setText("");
                tf_city.setText("");
                tf_barangay.setText("");
                tf_purok.setText("");
                tf_address.setText("");
                tf_tax_dec_no.setText("");
                tf_fname.grabFocus();
            }
        });
        nd.setLocationRelativeTo(tbl_customers);
        nd.setVisible(true);

    }

    String my_occupancy_id = "";
    String my_occupancy = "";
    String my_occupancy_type_id = "";
    String my_occupancy_type = "";
    String my_occupancy_type_code = "";

    List<Occupancy_types.to_occupancy_types> occupancies = new ArrayList();

    private void init_occupancies() {

        Object[][] obj = new Object[occupancies.size()][1];
        int i = 0;
        for (Occupancy_types.to_occupancy_types to : occupancies) {
            obj[i][0] = " " + to.occupancy_type_code + to.occupancy;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_occupancy_type_name.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_occupancy_type_name, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo tf = (Field.Combo) tf_occupancy_type_name;
                Occupancy_types.to_occupancy_types to = occupancies.get(data.selected_row);

                my_occupancy_id = "" + to.id;
                my_occupancy = to.occupancy;
                my_occupancy_type_id = to.occupancy_type_id;
                my_occupancy_type = to.occupancy_type_name;
                my_occupancy_type_code = to.occupancy_type_code;

                tf_occupancy_type_name.setText(my_occupancy_type_code + "" + my_occupancy);
            }
        });
    }

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

    List<Barangays.to_barangays> barangays = new ArrayList();

    private void init_barangays(final JTextField tf) {

        Object[][] obj = new Object[barangays.size()][1];
        int i = 0;
        for (Barangays.to_barangays to : barangays) {
            obj[i][0] = " " + to.barangay;
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
                Barangays.to_barangays to = barangays.get(data.selected_row);
                tfs.setText(to.barangay);
                tfs.setId("" + to.id);
            }
        });
    }

    private void init_gender() {
        final List<String> gender = new ArrayList();
        gender.add("Male");
        gender.add("Female");
        Object[][] obj = new Object[gender.size()][1];
        int i = 0;
        for (String to : gender) {
            obj[i][0] = " " + to;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_lname1.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_lname1, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo tfs = (Field.Combo) tf_lname1;
                String to = gender.get(data.selected_row);
                tfs.setText(to);

            }
        });
    }

    private void init_civil_status() {
        final List<String> gender = new ArrayList();
        gender.add("Single");
        gender.add("Married");
        gender.add("Widowed");
        gender.add("Annulled");
        gender.add("Divorsed");
        Object[][] obj = new Object[gender.size()][1];
        int i = 0;
        for (String to : gender) {
            obj[i][0] = " " + to;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_lname5.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_lname5, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo tfs = (Field.Combo) tf_lname5;
                String to = gender.get(data.selected_row);
                tfs.setText(to);

            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc=" customer_ordered_items "> 
    public static ArrayListModel tbl_customer_ordered_items_ALM;
    public static Tblcustomer_ordered_itemsModel tbl_customer_ordered_items_M;

    public static void init_tbl_customer_ordered_items(JTable tbl_customer_ordered_items) {
        tbl_customer_ordered_items_ALM = new ArrayListModel();
        tbl_customer_ordered_items_M = new Tblcustomer_ordered_itemsModel(tbl_customer_ordered_items_ALM);
        tbl_customer_ordered_items.setModel(tbl_customer_ordered_items_M);
        tbl_customer_ordered_items.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_customer_ordered_items.setRowHeight(25);
        int[] tbl_widths_customer_ordered_items = {60, 100, 100, 100, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_customer_ordered_items.length; i < n; i++) {
            if (i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_customer_ordered_items, i, tbl_widths_customer_ordered_items[i]);
        }
        Dimension d = tbl_customer_ordered_items.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_customer_ordered_items.getTableHeader().setPreferredSize(d);
        tbl_customer_ordered_items.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_customer_ordered_items.setRowHeight(25);
        tbl_customer_ordered_items.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_customer_ordered_items, 3);
    }

    public static void loadData_customer_ordered_items(List<Customer_ordered_items.to_customer_ordered_items> acc) {
        tbl_customer_ordered_items_ALM.clear();
        tbl_customer_ordered_items_ALM.addAll(acc);
    }

    public static class Tblcustomer_ordered_itemsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Qty", "Item Code", "Description", "Amount", "", "", "update_by_id", "item_code", "barcode", "description", "category_id", "category", "classification_id", "sub_classification_id", "sub_classification", "brand_id", "brand", "model_id", "model", "product_qty", "unit", "conversion", "cost", "selling_price", "discount_amount", "item_type", "supplier_id", "supplier", "branch_id", "branch", "location_id", "location", "status"
        };

        public Tblcustomer_ordered_itemsModel(ListModel listmodel) {
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
            Customer_ordered_items.to_customer_ordered_items tt = (Customer_ordered_items.to_customer_ordered_items) getRow(row);
            switch (col) {
                case 0:
                    return " " + FitIn.fmt_woc(tt.product_qty);
                case 1:
                    return " " + tt.item_code;
                case 2:
                    return " " + tt.description;
                case 3:
                    return FitIn.fmt_wc_0(tt.product_qty * tt.selling_price) + " ";
                case 4:
                    return " Delete";
                case 5:
                    return " Delete";
                case 6:
                    return tt.update_by_id;
                case 7:
                    return tt.item_code;
                case 8:
                    return tt.barcode;
                case 9:
                    return tt.description;
                case 10:
                    return tt.category_id;
                case 11:
                    return tt.category;
                case 12:
                    return tt.classification_id;
                case 13:
                    return tt.sub_classification_id;
                case 14:
                    return tt.sub_classification;
                case 15:
                    return tt.brand_id;
                case 16:
                    return tt.brand;
                case 17:
                    return tt.model_id;
                case 18:
                    return tt.model;
                case 19:
                    return tt.product_qty;
                case 20:
                    return tt.unit;
                case 21:
                    return tt.conversion;
                case 22:
                    return tt.cost;
                case 23:
                    return tt.selling_price;
                case 24:
                    return tt.discount_amount;
                case 25:
                    return tt.item_type;
                case 26:
                    return tt.supplier_id;
                case 27:
                    return tt.supplier;
                case 28:
                    return tt.branch_id;
                case 29:
                    return tt.branch;
                case 30:
                    return tt.location_id;
                case 31:
                    return tt.location;
                default:
                    return tt.status;
            }
        }
    }

    private void data_cols_orders() {
        int row = tbl_customers.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_customers to = (to_customers) tbl_customers_ALM.get(row);
        String where = " where customer_no='" + to.customer_no + "'";
        List<Customer_ordered_items.to_customer_ordered_items> datas = Customer_ordered_items.ret_data(where);
        loadData_customer_ordered_items(datas);
        compute();
    }

    private void compute() {
        List<Customer_ordered_items.to_customer_ordered_items> datas = tbl_customer_ordered_items_ALM;
        double qty = 0;
        double amount = 0;
        for (Customer_ordered_items.to_customer_ordered_items to1 : datas) {
            qty += to1.product_qty;
            amount += to1.product_qty * to1.selling_price;

        }

        jLabel31.setText(FitIn.fmt_woc(qty));
        jLabel33.setText(FitIn.fmt_wc_0(amount));
    }
//</editor-fold> 

    List<Inventory.to_inventory> items = new ArrayList();

    private void init_occupancies2() {
        String search = "";
        items.clear();
        items = Inventory.ret_data(search);
        Object[][] obj = new Object[items.size()][3];
        int i = 0;
        for (Inventory.to_inventory to : items) {
            obj[i][0] = " " + FitIn.fmt_woc(to.product_qty);
            obj[i][1] = " " + to.item_code;
            obj[i][2] = " " + to.description;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {60, 60, tf_occupancy_type_name1.getWidth() - 200};
        int width = 0;
        String[] col_names = {"", "", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_occupancy_type_name1, obj, labels, tbl_widths_customers, col_names);
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
        Dlg_qty nd = Dlg_qty.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_qty.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_qty.OutputData data) {
                closeDialog.ok();

                int id = 0;
                String customer_no = "";
                String customer_name = "";
                String date_added = DateType.now();
                String date_updated = DateType.now();
                String added_by_id = MyUser.getUser_id();
                String update_by_id = MyUser.getUser_id();
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
                double cost = to.cost;
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

                if (jButton18.getText().equalsIgnoreCase("Add")) {
                    Customer_ordered_items.to_customer_ordered_items field = new to_customer_ordered_items(id, customer_no, customer_name, date_added, date_updated, added_by_id, update_by_id, item_code, barcode, description, category_id, category, classification_id, sub_classification_id, sub_classification, brand_id, brand, model_id, model, product_qty, unit, conversion, cost, selling_price, discount_amount, item_type, supplier_id, supplier, branch_id, branch, location_id, location, status);

                    tbl_customer_ordered_items_ALM.add(field);
                    tbl_customer_ordered_items_M.fireTableDataChanged();
                    compute();
                } else {
                    int row = tbl_customers.getSelectedRow();
                    if (row < 0) {
                        return;
                    }
                    to_customers to = (to_customers) tbl_customers_ALM.get(row);
                    customer_no = to.customer_no;
                    customer_name = to.lname + ", " + to.fname + " " + to.mi;
                    Customer_ordered_items.to_customer_ordered_items field = new to_customer_ordered_items(id, customer_no, customer_name, date_added, date_updated, added_by_id, update_by_id, item_code, barcode, description, category_id, category, classification_id, sub_classification_id, sub_classification, brand_id, brand, model_id, model, product_qty, unit, conversion, cost, selling_price, discount_amount, item_type, supplier_id, supplier, branch_id, branch, location_id, location, status);
                    List<Customer_ordered_items.to_customer_ordered_items> datas = new ArrayList();
                    datas.add(field);
                    Customer_ordered_items.add_data(datas, customer_no, customer_name);
                    data_cols_orders();
                }

            }
        });
        nd.setLocationRelativeTo(jScrollPane2);
        nd.setVisible(true);
    }

    private void select_order() {
        int row = tbl_customer_ordered_items.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_customer_ordered_items to = (to_customer_ordered_items) tbl_customer_ordered_items_ALM.get(row);
        int col = tbl_customer_ordered_items.getSelectedColumn();
        if (col == 4) {
            if (jButton18.getText().equalsIgnoreCase("Add")) {
                tbl_customer_ordered_items_ALM.remove(row);
                tbl_customer_ordered_items_M.fireTableDataChanged();
                compute();
            } else {
                Window p = (Window) this;
                Dlg_confirm nd = Dlg_confirm.create(p, true);
                nd.setTitle("");
                nd.setCallback(new Dlg_confirm.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                        closeDialog.ok();
                        Customer_ordered_items.delete_data(to);
                        data_cols_orders();
                    }
                });
                nd.setLocationRelativeTo(jScrollPane2);
                nd.setVisible(true);

            }
        }
    }
}
