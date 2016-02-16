/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.occupancy_types;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
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
import vwws.occupancies.Dlg_occupancies;
import vwws.occupancies.Occupancies;
import vwws.occupancy_types.Occupancy_types.to_occupancy_types;
import vwws.pipe_sizes.Dlg_pipe_sizes;
import vwws.pipe_sizes.Pipe_sizes;
import vwws.util.MyUser;
import vwws.util.TableRenderer;

/**
 *
 * @author Guinness
 */
public class Dlg_occupancy_types extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_occupancy_types
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
    private Dlg_occupancy_types(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_occupancy_types(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_occupancy_types() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_occupancy_types myRef;

    private void setThisRef(Dlg_occupancy_types myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_occupancy_types> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_occupancy_types create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_occupancy_types create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_occupancy_types dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_occupancy_types((java.awt.Frame) parent, false);
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
            Dlg_occupancy_types dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_occupancy_types((java.awt.Dialog) parent, false);
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

        Dlg_occupancy_types dialog = Dlg_occupancy_types.create(new javax.swing.JFrame(), true);
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
        jLabel1 = new javax.swing.JLabel();
        tf_occupancy = new Field.Input();
        tf_occupancy_type_name = new Field.Combo();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_pipe_size = new Field.Combo();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_remarks = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_cubic_to = new Field.Input();
        jCheckBox1 = new javax.swing.JCheckBox();
        tf_cubic_from = new Field.Input();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_mf = new Field.Input();
        tf_mr = new Field.Input();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_charge = new Field.Input();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new Button.Default();
        jButton2 = new Button.Success();
        jButton3 = new Button.Info();
        jButton4 = new Button.Warning();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_occupancy_types = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_occupancy_type_name1 = new Field.Combo();
        jLabel16 = new javax.swing.JLabel();
        tf_occupancy_type_name2 = new Field.Combo();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_occupancy_type_name3 = new Field.Search();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        tf_occupancy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Type:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Size of Pipe:");

        tf_pipe_size.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_pipe_size.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pipe_sizeMouseClicked(evt);
            }
        });
        tf_pipe_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pipe_sizeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Remarks:");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tf_remarks.setColumns(20);
        tf_remarks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_remarks.setLineWrap(true);
        tf_remarks.setRows(5);
        jScrollPane1.setViewportView(tf_remarks);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("+");
        jTextField4.setFocusable(false);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("+");
        jTextField5.setFocusable(false);
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cubic:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("From [");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("]  -  [");

        tf_cubic_to.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("Above");

        tf_cubic_from.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("] ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Maintenance Fee:");

        tf_mf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_mr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Meter Rental:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Charge per cubic:");

        tf_charge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_cubic_from)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_cubic_to)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox1))
                            .addComponent(tf_occupancy)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_pipe_size)
                                    .addComponent(tf_occupancy_type_name))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_charge)
                            .addComponent(tf_mf))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_mr))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_occupancy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tf_occupancy_type_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(tf_pipe_size, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_cubic_to, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1)
                                    .addComponent(tf_cubic_from, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_mf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_mr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbl_occupancy_types.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_occupancy_types.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_occupancy_typesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_occupancy_types);

        jLabel12.setText("Total:");

        jLabel13.setText("0");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel14.setText("Status:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Type:");

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

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Size of Pipe:");

        tf_occupancy_type_name2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_occupancy_type_name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_occupancy_type_name2MouseClicked(evt);
            }
        });
        tf_occupancy_type_name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_occupancy_type_name2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/search67.png"))); // NOI18N
        jLabel17.setText("SEARCH");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Name:");

        tf_occupancy_type_name3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_occupancy_type_name3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_occupancy_type_name3MouseClicked(evt);
            }
        });
        tf_occupancy_type_name3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_occupancy_type_name3ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("All");
        jCheckBox2.setOpaque(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("All");
        jCheckBox3.setOpaque(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(tf_occupancy_type_name3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_occupancy_type_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_occupancy_type_name2)))))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_occupancy_type_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_occupancy_type_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_occupancy_type_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        add_occupancy_types();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_occupancy_type_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_occupancy_type_nameActionPerformed
        init_occupancies();
    }//GEN-LAST:event_tf_occupancy_type_nameActionPerformed

    private void tf_occupancy_type_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_occupancy_type_nameMouseClicked
        init_occupancies();
    }//GEN-LAST:event_tf_occupancy_type_nameMouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        dlg_occupancies();
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        dlg_pipe_sizes();
    }//GEN-LAST:event_jTextField5MouseClicked

    private void tf_pipe_sizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pipe_sizeMouseClicked
        init_pipe_sizes();
    }//GEN-LAST:event_tf_pipe_sizeMouseClicked

    private void tf_pipe_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pipe_sizeActionPerformed
        init_pipe_sizes();
    }//GEN-LAST:event_tf_pipe_sizeActionPerformed

    private void tbl_occupancy_typesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_occupancy_typesMouseClicked
        select_occupancy_types();
    }//GEN-LAST:event_tbl_occupancy_typesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        update_occupancy_types();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        delete_occupancy_types();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tf_occupancy_type_name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_occupancy_type_name1MouseClicked
        init_occupancies2();
    }//GEN-LAST:event_tf_occupancy_type_name1MouseClicked

    private void tf_occupancy_type_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_occupancy_type_name1ActionPerformed
        init_occupancies2();
    }//GEN-LAST:event_tf_occupancy_type_name1ActionPerformed

    private void tf_occupancy_type_name2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_occupancy_type_name2MouseClicked
        init_pipe_sizes2();
    }//GEN-LAST:event_tf_occupancy_type_name2MouseClicked

    private void tf_occupancy_type_name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_occupancy_type_name2ActionPerformed
        init_pipe_sizes2();
    }//GEN-LAST:event_tf_occupancy_type_name2ActionPerformed

    private void tf_occupancy_type_name3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_occupancy_type_name3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_occupancy_type_name3MouseClicked

    private void tf_occupancy_type_name3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_occupancy_type_name3ActionPerformed
        data_cols();
    }//GEN-LAST:event_tf_occupancy_type_name3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        data_cols();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        data_cols();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tbl_occupancy_types;
    private javax.swing.JTextField tf_charge;
    private javax.swing.JTextField tf_cubic_from;
    private javax.swing.JTextField tf_cubic_to;
    private javax.swing.JTextField tf_mf;
    private javax.swing.JTextField tf_mr;
    private javax.swing.JTextField tf_occupancy;
    private javax.swing.JTextField tf_occupancy_type_name;
    private javax.swing.JTextField tf_occupancy_type_name1;
    private javax.swing.JTextField tf_occupancy_type_name2;
    private javax.swing.JTextField tf_occupancy_type_name3;
    private javax.swing.JTextField tf_pipe_size;
    private javax.swing.JTextArea tf_remarks;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_occupancy_types(tbl_occupancy_types);
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

                disposed();
            }
        });
    }
    // </editor-fold>

    List<Occupancies.to_occupancies> occupancies = new ArrayList();

    private void init_occupancies() {
        String search = "";
        occupancies.clear();
        occupancies = Occupancies.ret_data(search);
        Object[][] obj = new Object[occupancies.size()][1];
        int i = 0;
        for (Occupancies.to_occupancies to : occupancies) {
            obj[i][0] = " " + to.occupancy;
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
                Occupancies.to_occupancies to = occupancies.get(data.selected_row);
                tf_occupancy_type_name.setText(to.occupancy);
                tf.setId("" + to.id);
                occupancy_code = to.occupancy_code;
            }
        });
    }

    List<Occupancies.to_occupancies> occupancies2 = new ArrayList();

    private void init_occupancies2() {
        String search = "";
        occupancies2.clear();
        occupancies2 = Occupancies.ret_data(search);
        Object[][] obj = new Object[occupancies2.size()][1];
        int i = 0;
        for (Occupancies.to_occupancies to : occupancies2) {
            obj[i][0] = " " + to.occupancy;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_occupancy_type_name1.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_occupancy_type_name1, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo tf = (Field.Combo) tf_occupancy_type_name1;
                Occupancies.to_occupancies to = occupancies2.get(data.selected_row);
                tf_occupancy_type_name1.setText(to.occupancy);
                tf.setId("" + to.id);
                data_cols();
            }
        });
    }

    List<Pipe_sizes.to_pipe_sizes> pipe_sizes = new ArrayList();

    private void init_pipe_sizes() {
        String search = "";
        pipe_sizes.clear();
        pipe_sizes = Pipe_sizes.ret_data(search);
        Object[][] obj = new Object[pipe_sizes.size()][1];
        int i = 0;
        for (Pipe_sizes.to_pipe_sizes to : pipe_sizes) {
            obj[i][0] = " " + to.pipe_size;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_pipe_size.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_pipe_size, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo tf = (Field.Combo) tf_pipe_size;
                Pipe_sizes.to_pipe_sizes to = pipe_sizes.get(data.selected_row);
                tf_pipe_size.setText(to.pipe_size);
                tf.setId("" + to.id);
            }
        });
    }

    List<Pipe_sizes.to_pipe_sizes> pipe_sizes2 = new ArrayList();

    private void init_pipe_sizes2() {
        String search = "";
        pipe_sizes2.clear();
        pipe_sizes2 = Pipe_sizes.ret_data(search);
        Object[][] obj = new Object[pipe_sizes2.size()][1];
        int i = 0;
        for (Pipe_sizes.to_pipe_sizes to : pipe_sizes2) {
            obj[i][0] = " " + to.pipe_size;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_occupancy_type_name2.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_occupancy_type_name2, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo tf = (Field.Combo) tf_occupancy_type_name2;
                Pipe_sizes.to_pipe_sizes to = pipe_sizes2.get(data.selected_row);
                tf_occupancy_type_name2.setText(to.pipe_size);
                tf.setId("" + to.id);
                data_cols();
            }
        });
    }

    private void dlg_occupancies() {
        Window p = (Window) this;
        Dlg_occupancies nd = Dlg_occupancies.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_occupancies.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_occupancies.OutputData data) {
                closeDialog.ok();
            }
        });
        Point point = jTextField4.getLocationOnScreen();
        nd.setLocation(point.x - 518, point.y + 25);
        nd.setVisible(true);
    }

    private void dlg_pipe_sizes() {
        Window p = (Window) this;
        Dlg_pipe_sizes nd = Dlg_pipe_sizes.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_pipe_sizes.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_pipe_sizes.OutputData data) {
                closeDialog.ok();
            }
        });
        Point point = jTextField5.getLocationOnScreen();
        nd.setLocation(point.x - 322, point.y + 25);

        nd.setVisible(true);
    }

    //<editor-fold defaultstate="collapsed" desc=" occupancy_types "> 
    public static ArrayListModel tbl_occupancy_types_ALM;
    public static Tbloccupancy_typesModel tbl_occupancy_types_M;

    public static void init_tbl_occupancy_types(JTable tbl_occupancy_types) {
        tbl_occupancy_types_ALM = new ArrayListModel();
        tbl_occupancy_types_M = new Tbloccupancy_typesModel(tbl_occupancy_types_ALM);
        tbl_occupancy_types.setModel(tbl_occupancy_types_M);
        tbl_occupancy_types.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_occupancy_types.setRowHeight(25);
        int[] tbl_widths_occupancy_types = {100, 100, 100, 70, 70, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_occupancy_types.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_occupancy_types, i, tbl_widths_occupancy_types[i]);
        }
        Dimension d = tbl_occupancy_types.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_occupancy_types.getTableHeader().setPreferredSize(d);
        tbl_occupancy_types.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_occupancy_types.setRowHeight(25);
        tbl_occupancy_types.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_occupancy_types, 3);
        TableWidthUtilities.setColumnRightRenderer(tbl_occupancy_types, 4);
        TableWidthUtilities.setColumnRightRenderer(tbl_occupancy_types, 5);
    }

    public static void loadData_occupancy_types(List<to_occupancy_types> acc) {
        tbl_occupancy_types_ALM.clear();
        tbl_occupancy_types_ALM.addAll(acc);
    }

    public static class Tbloccupancy_typesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Name", "Pipe", "Cubic", "MF", "MR", "Charge", "mf", "mr", "charge", "date_added", "date_updated", "added_by_id", "update_by_id", "status", "remarks"
        };

        public Tbloccupancy_typesModel(ListModel listmodel) {
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
            to_occupancy_types tt = (to_occupancy_types) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.occupancy_type_code + "" + tt.occupancy;
                case 1:
                    return " " + tt.pipe_size;
                case 2:
                    return " [ " + tt.cubic + " ]";
                case 3:
                    return FitIn.fmt_wc_0(tt.mf) + " ";
                case 4:
                    return FitIn.fmt_wc_0(tt.mr) + " ";
                case 5:
                    return FitIn.fmt_wc_0(tt.charge) + " ";
                case 6:
                    return " " + tt.mf;
                case 7:
                    return " " + tt.mr;
                case 8:
                    return " " + FitIn.fmt_wc_0(tt.charge);
                case 9:
                    return tt.date_added;
                case 10:
                    return tt.date_updated;
                case 11:
                    return tt.added_by_id;
                case 12:
                    return tt.update_by_id;
                case 13:
                    return tt.status;
                default:
                    return tt.remarks;
            }
        }
    }

    private void data_cols() {
        Field.Combo type = (Field.Combo) tf_occupancy_type_name1;
        Field.Combo pipe = (Field.Combo) tf_occupancy_type_name2;
        String occupancy = tf_occupancy_type_name3.getText();

        String where = " where occupancy like '%" + occupancy + "%' ";
        if (!jCheckBox2.isSelected()) {
            where = where + " and occupancy_type_id='" + type.getId() + "' ";
        }
        if (!jCheckBox3.isSelected()) {
            where = where + " and pipe_size='" + pipe.getText() + "' ";
        }
        where = where + "order by id asc ";
        System.out.println(where);
        List<Occupancy_types.to_occupancy_types> datas = Occupancy_types.ret_data(where);
        loadData_occupancy_types(datas);
        jLabel13.setText("" + datas.size());
    }

//</editor-fold> 
    String occupancy_code = "";

    private void add_occupancy_types() {

        Field.Combo type = (Field.Combo) tf_occupancy_type_name;
        int id = 0;
        String occupancy = tf_occupancy.getText();
        String occupancy_type_id = type.getId();
        String occupancy_type_name = tf_occupancy_type_name.getText();
        String occupancy_type_code = occupancy_code;
        String pipe_size = tf_pipe_size.getText();
        String cubic = tf_cubic_from.getText() + "," + tf_cubic_to.getText();
        double mf = FitIn.toDouble(tf_mf.getText());
        double mr = FitIn.toDouble(tf_mr.getText());
        double charge = FitIn.toDouble(tf_charge.getText());
        String date_added = DateType.now();
        String date_updated = DateType.now();
        String added_by_id = MyUser.getUser_id();
        String update_by_id = MyUser.getUser_id();
        int status = 1;
        String remarks = tf_remarks.getText();
        to_occupancy_types to = new to_occupancy_types(id, occupancy, occupancy_type_id, occupancy_type_name, occupancy_type_code, pipe_size, cubic, mf, mr, charge, date_added, date_updated, added_by_id, update_by_id, status, remarks);
        Occupancy_types.add_data(to);
        tf_occupancy.setText("");
        tf_occupancy_type_name.setText("");
        tf_pipe_size.setText("");
        tf_cubic_from.setText("");
        tf_cubic_to.setText("");
        tf_mf.setText("");
        tf_mr.setText("");
        tf_charge.setText("");
        tf_remarks.setText("");
        data_cols();
    }

    private void select_occupancy_types() {

        int row = tbl_occupancy_types.getSelectedRow();
        if (row < 0) {
            return;
        }
        Field.Combo type = (Field.Combo) tf_occupancy_type_name;

        to_occupancy_types to = (to_occupancy_types) tbl_occupancy_types_ALM.get(row);
        tf_occupancy.setText(to.occupancy);
        type.setId(to.occupancy_type_id);
        tf_occupancy_type_name.setText(to.occupancy_type_name);
        occupancy_code = to.occupancy_type_code;
        tf_pipe_size.setText(to.pipe_size);
        String[] cubic = to.cubic.split(",");
        tf_cubic_from.setText(cubic[0]);
        tf_cubic_to.setText(cubic[1]);
        tf_mf.setText(FitIn.fmt_wc_0(to.mf));
        tf_mr.setText(FitIn.fmt_wc_0(to.mr));
        tf_charge.setText(FitIn.fmt_wc_0(to.charge));
        tf_remarks.setText(to.remarks);
    }

    private void update_occupancy_types() {

        int row = tbl_occupancy_types.getSelectedRow();
        if (row < 0) {
            return;
        }
        Field.Combo type = (Field.Combo) tf_occupancy_type_name;
        to_occupancy_types to = (to_occupancy_types) tbl_occupancy_types_ALM.get(row);
        int id = to.id;
        String occupancy = tf_occupancy.getText();
        String occupancy_type_id = type.getId();
        String occupancy_type_name = tf_occupancy_type_name.getText();
        String occupancy_type_code = occupancy_code;
        String pipe_size = tf_pipe_size.getText();
        String cubic = tf_cubic_from.getText() + "," + tf_cubic_to.getText();
        double mf = FitIn.toDouble(tf_mf.getText());
        double mr = FitIn.toDouble(tf_mr.getText());
        double charge = FitIn.toDouble(tf_charge.getText());
        String date_added = DateType.now();
        String date_updated = DateType.now();
        String added_by_id = MyUser.getUser_id();
        String update_by_id = MyUser.getUser_id();
        int status = 1;
        String remarks = tf_remarks.getText();

        to_occupancy_types to1 = new to_occupancy_types(id, occupancy, occupancy_type_id, occupancy_type_name, occupancy_type_code, pipe_size, cubic, mf, mr, charge, date_added, date_updated, added_by_id, update_by_id, status, remarks);
        Occupancy_types.update_data(to1);
        tf_occupancy.setText("");
        tf_occupancy_type_name.setText("");
        tf_pipe_size.setText("");
        tf_cubic_from.setText("");
        tf_cubic_to.setText("");
        tf_mf.setText("");
        tf_mr.setText("");
        tf_charge.setText("");
        tf_remarks.setText("");
        data_cols();
    }

    private void delete_occupancy_types() {

        int row = tbl_occupancy_types.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_occupancy_types to = (to_occupancy_types) tbl_occupancy_types_ALM.get(row);
        Occupancy_types.delete_data(to);
        tf_occupancy.setText("");
        tf_occupancy_type_name.setText("");
        tf_pipe_size.setText("");
        tf_cubic_from.setText("");
        tf_cubic_to.setText("");
        tf_mf.setText("");
        tf_mr.setText("");
        tf_charge.setText("");
        tf_remarks.setText("");
        occupancy_code = "";
        data_cols();
    }
}
