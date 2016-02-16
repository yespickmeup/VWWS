/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.cashiering;

import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.DateType;
import vwws.util.KeyCodes;
import vwws.util.RenderButtons;

/**
 *
 * @author Guinness
 */
public class Dlg_cashiering_payment extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_cashiering_payment
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

        public final double amount_due;
        public final double amount_paid;
        public final double cash_paid;
        public final double check_amount;
        public final String check_bank;
        public final String check_no;
        public final String check_holder;
        public final String check_date;

        public OutputData(double amount_due, double amount_paid, double cash_paid, double check_amount, String check_bank, String check_no, String check_holder, String check_date) {
            this.amount_due = amount_due;
            this.amount_paid = amount_paid;
            this.cash_paid = cash_paid;
            this.check_amount = check_amount;
            this.check_bank = check_bank;
            this.check_no = check_no;
            this.check_holder = check_holder;
            this.check_date = check_date;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_cashiering_payment(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_cashiering_payment(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_cashiering_payment() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_cashiering_payment myRef;

    private void setThisRef(Dlg_cashiering_payment myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_cashiering_payment> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_cashiering_payment create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_cashiering_payment create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_cashiering_payment dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashiering_payment((java.awt.Frame) parent, false);
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
            Dlg_cashiering_payment dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashiering_payment((java.awt.Dialog) parent, false);
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

        Dlg_cashiering_payment dialog = Dlg_cashiering_payment.create(new javax.swing.JFrame(), true);
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
        jPanel6 = new javax.swing.JPanel();
        btn_charge11 = new javax.swing.JButton();
        btn_charge13 = new javax.swing.JButton();
        btn_charge14 = new javax.swing.JButton();
        btn_charge15 = new javax.swing.JButton();
        btn_charge16 = new javax.swing.JButton();
        btn_charge12 = new javax.swing.JButton();
        btn_charge17 = new javax.swing.JButton();
        btn_charge18 = new javax.swing.JButton();
        btn_charge19 = new javax.swing.JButton();
        btn_charge20 = new javax.swing.JButton();
        btn_charge21 = new javax.swing.JButton();
        btn_charge22 = new javax.swing.JButton();
        btn_charge23 = new javax.swing.JButton();
        btn_charge24 = new javax.swing.JButton();
        btn_charge25 = new javax.swing.JButton();
        btn_charge26 = new javax.swing.JButton();
        tf_amount_tendered = new Field.Input();
        btn_cash1 = new javax.swing.JButton();
        btn_cash4 = new javax.swing.JButton();
        lbl_p_amount_due = new javax.swing.JButton();
        lbl_p_balance_due = new javax.swing.JButton();
        btn_charge7 = new javax.swing.JButton();
        btn_charge8 = new javax.swing.JButton();
        btn_cash = new javax.swing.JButton();
        lbl_cash = new javax.swing.JButton();
        btn_charge1 = new javax.swing.JButton();
        btn_charge2 = new javax.swing.JButton();
        lbl_check_amount = new javax.swing.JButton();
        btn_credit = new javax.swing.JButton();
        btn_gift = new javax.swing.JButton();
        lbl_gift = new javax.swing.JButton();
        btn_charge3 = new javax.swing.JButton();
        btn_charge4 = new javax.swing.JButton();
        lbl_prepaid = new javax.swing.JButton();
        btn_prepaid = new javax.swing.JButton();
        btn_cheque = new javax.swing.JButton();
        lbl_cheque = new javax.swing.JButton();
        btn_charge5 = new javax.swing.JButton();
        btn_charge6 = new javax.swing.JButton();
        lbl_charge = new javax.swing.JButton();
        btn_charge = new javax.swing.JButton();
        btn_cash2 = new javax.swing.JButton();
        lbl_p_all_tendered = new javax.swing.JButton();
        lbl_p_change = new javax.swing.JButton();
        btn_cash3 = new javax.swing.JButton();
        btn_charge10 = new javax.swing.JButton();
        btn_charge9 = new javax.swing.JButton();
        jButton1 = new Button.Success();
        jButton2 = new Button.Default();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btn_charge11.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge11.setText("C");
        btn_charge11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge11.setContentAreaFilled(false);
        btn_charge11.setFocusable(false);
        btn_charge11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge11.setOpaque(true);
        btn_charge11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge11ActionPerformed(evt);
            }
        });

        btn_charge13.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge13.setText("0");
        btn_charge13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge13.setContentAreaFilled(false);
        btn_charge13.setFocusable(false);
        btn_charge13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge13.setOpaque(true);
        btn_charge13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge13ActionPerformed(evt);
            }
        });

        btn_charge14.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge14.setText(".");
        btn_charge14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge14.setContentAreaFilled(false);
        btn_charge14.setFocusable(false);
        btn_charge14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge14.setOpaque(true);
        btn_charge14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge14ActionPerformed(evt);
            }
        });

        btn_charge15.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge15.setText("2");
        btn_charge15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge15.setContentAreaFilled(false);
        btn_charge15.setFocusable(false);
        btn_charge15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge15.setOpaque(true);
        btn_charge15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge15ActionPerformed(evt);
            }
        });

        btn_charge16.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge16.setText("3");
        btn_charge16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge16.setContentAreaFilled(false);
        btn_charge16.setFocusable(false);
        btn_charge16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge16.setOpaque(true);
        btn_charge16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge16ActionPerformed(evt);
            }
        });

        btn_charge12.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge12.setText("1");
        btn_charge12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge12.setContentAreaFilled(false);
        btn_charge12.setFocusable(false);
        btn_charge12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge12.setOpaque(true);
        btn_charge12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge12ActionPerformed(evt);
            }
        });

        btn_charge17.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge17.setText("4");
        btn_charge17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge17.setContentAreaFilled(false);
        btn_charge17.setFocusable(false);
        btn_charge17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge17.setOpaque(true);
        btn_charge17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge17ActionPerformed(evt);
            }
        });

        btn_charge18.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge18.setText("6");
        btn_charge18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge18.setContentAreaFilled(false);
        btn_charge18.setFocusable(false);
        btn_charge18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge18.setOpaque(true);
        btn_charge18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge18ActionPerformed(evt);
            }
        });

        btn_charge19.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge19.setText("5");
        btn_charge19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge19.setContentAreaFilled(false);
        btn_charge19.setFocusable(false);
        btn_charge19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge19.setOpaque(true);
        btn_charge19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge19ActionPerformed(evt);
            }
        });

        btn_charge20.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge20.setText("7");
        btn_charge20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge20.setContentAreaFilled(false);
        btn_charge20.setFocusable(false);
        btn_charge20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge20.setOpaque(true);
        btn_charge20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge20ActionPerformed(evt);
            }
        });

        btn_charge21.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge21.setText("8");
        btn_charge21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge21.setContentAreaFilled(false);
        btn_charge21.setFocusable(false);
        btn_charge21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge21.setOpaque(true);
        btn_charge21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge21ActionPerformed(evt);
            }
        });

        btn_charge22.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge22.setText("9");
        btn_charge22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge22.setContentAreaFilled(false);
        btn_charge22.setFocusable(false);
        btn_charge22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge22.setOpaque(true);
        btn_charge22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge22ActionPerformed(evt);
            }
        });

        btn_charge23.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge23.setText("50");
        btn_charge23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge23.setContentAreaFilled(false);
        btn_charge23.setFocusable(false);
        btn_charge23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge23.setOpaque(true);
        btn_charge23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge23ActionPerformed(evt);
            }
        });

        btn_charge24.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge24.setText("1000");
        btn_charge24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge24.setContentAreaFilled(false);
        btn_charge24.setFocusable(false);
        btn_charge24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge24.setOpaque(true);
        btn_charge24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge24ActionPerformed(evt);
            }
        });

        btn_charge25.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge25.setText("500");
        btn_charge25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge25.setContentAreaFilled(false);
        btn_charge25.setFocusable(false);
        btn_charge25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge25.setOpaque(true);
        btn_charge25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge25ActionPerformed(evt);
            }
        });

        btn_charge26.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_charge26.setText("100");
        btn_charge26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge26.setContentAreaFilled(false);
        btn_charge26.setFocusable(false);
        btn_charge26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge26.setOpaque(true);
        btn_charge26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge26ActionPerformed(evt);
            }
        });

        tf_amount_tendered.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tf_amount_tendered.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_amount_tendered.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tf_amount_tendered.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_amount_tenderedKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_amount_tendered)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btn_charge20, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge21, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge22, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btn_charge17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge19, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btn_charge12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge16, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btn_charge11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_charge14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_charge23, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge26, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge25, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge24, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_amount_tendered, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btn_charge23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_charge26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_charge25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_charge24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_charge20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_charge17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_charge12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_charge11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_charge14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        btn_cash1.setBackground(new java.awt.Color(255, 255, 255));
        btn_cash1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cash1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/money13 (Custom).png"))); // NOI18N
        btn_cash1.setText("Amount Due");
        btn_cash1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_cash1.setContentAreaFilled(false);
        btn_cash1.setFocusable(false);
        btn_cash1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cash1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cash1.setOpaque(true);
        btn_cash1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cash1ActionPerformed(evt);
            }
        });

        btn_cash4.setBackground(new java.awt.Color(255, 255, 255));
        btn_cash4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cash4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/money25 (Custom).png"))); // NOI18N
        btn_cash4.setText("Balance Due");
        btn_cash4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_cash4.setContentAreaFilled(false);
        btn_cash4.setFocusable(false);
        btn_cash4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cash4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cash4.setOpaque(true);

        lbl_p_amount_due.setBackground(new java.awt.Color(255, 255, 255));
        lbl_p_amount_due.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_p_amount_due.setText("0.00");
        lbl_p_amount_due.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_p_amount_due.setContentAreaFilled(false);
        lbl_p_amount_due.setFocusable(false);
        lbl_p_amount_due.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_p_amount_due.setOpaque(true);

        lbl_p_balance_due.setBackground(new java.awt.Color(255, 255, 255));
        lbl_p_balance_due.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_p_balance_due.setText("0.00");
        lbl_p_balance_due.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_p_balance_due.setContentAreaFilled(false);
        lbl_p_balance_due.setFocusable(false);
        lbl_p_balance_due.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_p_balance_due.setOpaque(true);

        btn_charge7.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge7.setContentAreaFilled(false);
        btn_charge7.setFocusable(false);
        btn_charge7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge7.setOpaque(true);
        btn_charge7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge7ActionPerformed(evt);
            }
        });

        btn_charge8.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge8.setContentAreaFilled(false);
        btn_charge8.setFocusable(false);
        btn_charge8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge8.setOpaque(true);
        btn_charge8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge8ActionPerformed(evt);
            }
        });

        btn_cash.setBackground(new java.awt.Color(255, 255, 255));
        btn_cash.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_cash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/money17 (Custom).png"))); // NOI18N
        btn_cash.setText("Cash         ");
        btn_cash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_cash.setContentAreaFilled(false);
        btn_cash.setFocusable(false);
        btn_cash.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cash.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cash.setOpaque(true);
        btn_cash.setSelected(true);
        btn_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cashActionPerformed(evt);
            }
        });

        lbl_cash.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cash.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_cash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_cash.setContentAreaFilled(false);
        lbl_cash.setFocusable(false);
        lbl_cash.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_cash.setOpaque(true);
        lbl_cash.setSelected(true);

        btn_charge1.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/close33 (Custom).png"))); // NOI18N
        btn_charge1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge1.setContentAreaFilled(false);
        btn_charge1.setFocusable(false);
        btn_charge1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge1.setOpaque(true);
        btn_charge1.setSelected(true);
        btn_charge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge1ActionPerformed(evt);
            }
        });

        btn_charge2.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/close33 (Custom).png"))); // NOI18N
        btn_charge2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge2.setContentAreaFilled(false);
        btn_charge2.setFocusable(false);
        btn_charge2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge2.setOpaque(true);
        btn_charge2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge2ActionPerformed(evt);
            }
        });

        lbl_check_amount.setBackground(new java.awt.Color(255, 255, 255));
        lbl_check_amount.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_check_amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_check_amount.setContentAreaFilled(false);
        lbl_check_amount.setFocusable(false);
        lbl_check_amount.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_check_amount.setOpaque(true);
        lbl_check_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_check_amountActionPerformed(evt);
            }
        });

        btn_credit.setBackground(new java.awt.Color(255, 255, 255));
        btn_credit.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_credit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/cheque.png"))); // NOI18N
        btn_credit.setText("F1 - Cheque");
        btn_credit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_credit.setContentAreaFilled(false);
        btn_credit.setFocusable(false);
        btn_credit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_credit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_credit.setOpaque(true);
        btn_credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creditActionPerformed(evt);
            }
        });

        btn_gift.setBackground(new java.awt.Color(255, 255, 255));
        btn_gift.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_gift.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_gift.setContentAreaFilled(false);
        btn_gift.setFocusable(false);
        btn_gift.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_gift.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_gift.setOpaque(true);
        btn_gift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giftActionPerformed(evt);
            }
        });

        lbl_gift.setBackground(new java.awt.Color(255, 255, 255));
        lbl_gift.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_gift.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_gift.setContentAreaFilled(false);
        lbl_gift.setFocusable(false);
        lbl_gift.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_gift.setOpaque(true);
        lbl_gift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_giftActionPerformed(evt);
            }
        });

        btn_charge3.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge3.setContentAreaFilled(false);
        btn_charge3.setFocusable(false);
        btn_charge3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge3.setOpaque(true);
        btn_charge3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge3ActionPerformed(evt);
            }
        });

        btn_charge4.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge4.setContentAreaFilled(false);
        btn_charge4.setFocusable(false);
        btn_charge4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge4.setOpaque(true);
        btn_charge4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge4ActionPerformed(evt);
            }
        });

        lbl_prepaid.setBackground(new java.awt.Color(255, 255, 255));
        lbl_prepaid.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_prepaid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_prepaid.setContentAreaFilled(false);
        lbl_prepaid.setFocusable(false);
        lbl_prepaid.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_prepaid.setOpaque(true);
        lbl_prepaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_prepaidActionPerformed(evt);
            }
        });

        btn_prepaid.setBackground(new java.awt.Color(255, 255, 255));
        btn_prepaid.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_prepaid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_prepaid.setContentAreaFilled(false);
        btn_prepaid.setFocusable(false);
        btn_prepaid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_prepaid.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_prepaid.setOpaque(true);
        btn_prepaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prepaidActionPerformed(evt);
            }
        });

        btn_cheque.setBackground(new java.awt.Color(255, 255, 255));
        btn_cheque.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_cheque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_cheque.setContentAreaFilled(false);
        btn_cheque.setFocusable(false);
        btn_cheque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cheque.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cheque.setOpaque(true);
        btn_cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chequeActionPerformed(evt);
            }
        });

        lbl_cheque.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cheque.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_cheque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_cheque.setContentAreaFilled(false);
        lbl_cheque.setFocusable(false);
        lbl_cheque.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_cheque.setOpaque(true);
        lbl_cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_chequeActionPerformed(evt);
            }
        });

        btn_charge5.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge5.setContentAreaFilled(false);
        btn_charge5.setFocusable(false);
        btn_charge5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge5.setOpaque(true);
        btn_charge5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge5ActionPerformed(evt);
            }
        });

        btn_charge6.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge6.setContentAreaFilled(false);
        btn_charge6.setFocusable(false);
        btn_charge6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge6.setOpaque(true);
        btn_charge6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge6ActionPerformed(evt);
            }
        });

        lbl_charge.setBackground(new java.awt.Color(255, 255, 255));
        lbl_charge.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_charge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_charge.setContentAreaFilled(false);
        lbl_charge.setFocusable(false);
        lbl_charge.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_charge.setOpaque(true);
        lbl_charge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_chargeActionPerformed(evt);
            }
        });

        btn_charge.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_charge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge.setContentAreaFilled(false);
        btn_charge.setFocusable(false);
        btn_charge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_charge.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_charge.setOpaque(true);
        btn_charge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chargeActionPerformed(evt);
            }
        });

        btn_cash2.setBackground(new java.awt.Color(255, 255, 255));
        btn_cash2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cash2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/money28 (Custom).png"))); // NOI18N
        btn_cash2.setText("Tendered");
        btn_cash2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_cash2.setContentAreaFilled(false);
        btn_cash2.setFocusable(false);
        btn_cash2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cash2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cash2.setOpaque(true);

        lbl_p_all_tendered.setBackground(new java.awt.Color(255, 255, 255));
        lbl_p_all_tendered.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_p_all_tendered.setText("0.00");
        lbl_p_all_tendered.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_p_all_tendered.setContentAreaFilled(false);
        lbl_p_all_tendered.setFocusable(false);
        lbl_p_all_tendered.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_p_all_tendered.setOpaque(true);

        lbl_p_change.setBackground(new java.awt.Color(255, 255, 255));
        lbl_p_change.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_p_change.setText("0.00");
        lbl_p_change.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lbl_p_change.setContentAreaFilled(false);
        lbl_p_change.setFocusable(false);
        lbl_p_change.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_p_change.setOpaque(true);

        btn_cash3.setBackground(new java.awt.Color(255, 255, 255));
        btn_cash3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cash3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/POS/icon_payment/coins14 (Custom).png"))); // NOI18N
        btn_cash3.setText("Change");
        btn_cash3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_cash3.setContentAreaFilled(false);
        btn_cash3.setFocusable(false);
        btn_cash3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cash3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cash3.setOpaque(true);

        btn_charge10.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge10.setContentAreaFilled(false);
        btn_charge10.setFocusable(false);
        btn_charge10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge10.setOpaque(true);
        btn_charge10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge10ActionPerformed(evt);
            }
        });

        btn_charge9.setBackground(new java.awt.Color(255, 255, 255));
        btn_charge9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_charge9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_charge9.setContentAreaFilled(false);
        btn_charge9.setFocusable(false);
        btn_charge9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_charge9.setOpaque(true);
        btn_charge9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charge9ActionPerformed(evt);
            }
        });

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_cash1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(lbl_p_amount_due, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_cash4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(lbl_p_balance_due, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_charge7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_charge8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_gift, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_prepaid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_gift, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_charge3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_prepaid, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_charge4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_charge5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_charge6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_check_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_charge2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_charge1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_cash3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_cash2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_p_all_tendered, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_p_change, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_charge9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_charge10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_charge7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_cash1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_p_amount_due, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_cash4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_p_balance_due, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_charge8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_charge1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_check_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_charge2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_gift, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_prepaid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_gift, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_charge3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbl_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_prepaid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_charge4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_charge5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(btn_charge6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_cash2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_p_all_tendered, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_cash3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_p_change, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_charge9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_charge10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_charge11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge11ActionPerformed

    private void btn_charge13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge13ActionPerformed

    private void btn_charge14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge14ActionPerformed

    private void btn_charge15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge15ActionPerformed

    private void btn_charge16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge16ActionPerformed

    private void btn_charge12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge12ActionPerformed

    private void btn_charge17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge17ActionPerformed

    private void btn_charge18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge18ActionPerformed

    private void btn_charge19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge19ActionPerformed

    private void btn_charge20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge20ActionPerformed

    private void btn_charge21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge21ActionPerformed

    private void btn_charge22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge22ActionPerformed

    private void btn_charge23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge23ActionPerformed

    private void btn_charge24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge24ActionPerformed

    private void btn_charge25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge25ActionPerformed

    private void btn_charge26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge26ActionPerformed

    private void tf_amount_tenderedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_amount_tenderedKeyReleased
        enter_cash();
    }//GEN-LAST:event_tf_amount_tenderedKeyReleased

    private void btn_cash1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cash1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cash1ActionPerformed

    private void btn_charge7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge7ActionPerformed

    private void btn_charge8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge8ActionPerformed

    private void btn_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cashActionPerformed

    private void btn_charge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge1ActionPerformed

    private void btn_charge2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge2ActionPerformed

    }//GEN-LAST:event_btn_charge2ActionPerformed

    private void lbl_check_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_check_amountActionPerformed

    }//GEN-LAST:event_lbl_check_amountActionPerformed

    private void btn_creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creditActionPerformed
        payment_cheque();
    }//GEN-LAST:event_btn_creditActionPerformed

    private void btn_giftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giftActionPerformed

    }//GEN-LAST:event_btn_giftActionPerformed

    private void lbl_giftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_giftActionPerformed

    }//GEN-LAST:event_lbl_giftActionPerformed

    private void btn_charge3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge3ActionPerformed

    }//GEN-LAST:event_btn_charge3ActionPerformed

    private void btn_charge4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge4ActionPerformed

    }//GEN-LAST:event_btn_charge4ActionPerformed

    private void lbl_prepaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_prepaidActionPerformed

    }//GEN-LAST:event_lbl_prepaidActionPerformed

    private void btn_prepaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prepaidActionPerformed

    }//GEN-LAST:event_btn_prepaidActionPerformed

    private void btn_chequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chequeActionPerformed

    }//GEN-LAST:event_btn_chequeActionPerformed

    private void lbl_chequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_chequeActionPerformed

    }//GEN-LAST:event_lbl_chequeActionPerformed

    private void btn_charge5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge5ActionPerformed

    }//GEN-LAST:event_btn_charge5ActionPerformed

    private void btn_charge6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge6ActionPerformed

    }//GEN-LAST:event_btn_charge6ActionPerformed

    private void lbl_chargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_chargeActionPerformed

    }//GEN-LAST:event_lbl_chargeActionPerformed

    private void btn_chargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chargeActionPerformed

    }//GEN-LAST:event_btn_chargeActionPerformed

    private void btn_charge10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge10ActionPerformed

    private void btn_charge9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charge9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_charge9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ok();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cash;
    private javax.swing.JButton btn_cash1;
    private javax.swing.JButton btn_cash2;
    private javax.swing.JButton btn_cash3;
    private javax.swing.JButton btn_cash4;
    private javax.swing.JButton btn_charge;
    private javax.swing.JButton btn_charge1;
    private javax.swing.JButton btn_charge10;
    private javax.swing.JButton btn_charge11;
    private javax.swing.JButton btn_charge12;
    private javax.swing.JButton btn_charge13;
    private javax.swing.JButton btn_charge14;
    private javax.swing.JButton btn_charge15;
    private javax.swing.JButton btn_charge16;
    private javax.swing.JButton btn_charge17;
    private javax.swing.JButton btn_charge18;
    private javax.swing.JButton btn_charge19;
    private javax.swing.JButton btn_charge2;
    private javax.swing.JButton btn_charge20;
    private javax.swing.JButton btn_charge21;
    private javax.swing.JButton btn_charge22;
    private javax.swing.JButton btn_charge23;
    private javax.swing.JButton btn_charge24;
    private javax.swing.JButton btn_charge25;
    private javax.swing.JButton btn_charge26;
    private javax.swing.JButton btn_charge3;
    private javax.swing.JButton btn_charge4;
    private javax.swing.JButton btn_charge5;
    private javax.swing.JButton btn_charge6;
    private javax.swing.JButton btn_charge7;
    private javax.swing.JButton btn_charge8;
    private javax.swing.JButton btn_charge9;
    private javax.swing.JButton btn_cheque;
    private javax.swing.JButton btn_credit;
    private javax.swing.JButton btn_gift;
    private javax.swing.JButton btn_prepaid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton lbl_cash;
    private javax.swing.JButton lbl_charge;
    private javax.swing.JButton lbl_check_amount;
    private javax.swing.JButton lbl_cheque;
    private javax.swing.JButton lbl_gift;
    private javax.swing.JButton lbl_p_all_tendered;
    private javax.swing.JButton lbl_p_amount_due;
    private javax.swing.JButton lbl_p_balance_due;
    private javax.swing.JButton lbl_p_change;
    private javax.swing.JButton lbl_prepaid;
    private javax.swing.JTextField tf_amount_tendered;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_payment();
        input_amount();
    }

    public void do_pass(double amount) {
        lbl_p_amount_due.setText(FitIn.fmt_wc_0(amount));
        lbl_p_balance_due.setText(FitIn.fmt_wc_0(amount));

        compute();
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

        KeyCodes.numpad(tf_amount_tendered, new JLabel());

    }

    // </editor-fold>
    private void input_amount() {
        double tendered = FitIn.toDouble(tf_amount_tendered.getText());
        JButton[] btns = {btn_charge20, btn_charge21, btn_charge22, btn_charge17, btn_charge19, btn_charge18, btn_charge12, btn_charge15, btn_charge16, btn_charge13, btn_charge14};
        for (final JButton b : btns) {
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String amount = tf_amount_tendered.getText();
                    amount = amount + b.getText();
                    tf_amount_tendered.setText(amount);

                }
            });
        }
    }

    private void init_payment() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                JButton[] b1 = {btn_cash, btn_credit, btn_gift, btn_prepaid, btn_cheque, btn_cash1, btn_cash2};
                RenderButtons.border1(b1);
                JButton[] b2 = {btn_charge, btn_cash3, btn_cash4};
                RenderButtons.border2(b2);
                JButton[] b3 = {lbl_cash, lbl_check_amount, lbl_gift, lbl_prepaid, lbl_cheque, btn_charge1, btn_charge2, btn_charge3, btn_charge4, btn_charge5};
                RenderButtons.border3(b3);
                JButton[] b4 = {lbl_p_balance_due, btn_charge6, btn_charge8, btn_charge10};
                RenderButtons.border4(b4);
                JButton[] b5 = {btn_cash1};
                RenderButtons.border5(b5);
                JButton[] b6 = {btn_charge7, btn_charge9};
                RenderButtons.border6(b6);
                JButton[] b7 = {lbl_p_all_tendered, lbl_p_amount_due};
                RenderButtons.border7(b7);
                JButton[] b8 = {lbl_p_change, lbl_p_balance_due};
                RenderButtons.border8(b8);
                JButton[] b9 = {lbl_charge};
                RenderButtons.border9(b9);
                JTextField[] b10 = {tf_amount_tendered};
                RenderButtons.border2(b10);
                JButton[] btns1 = {btn_cash, btn_credit, btn_gift, btn_prepaid, btn_cheque, btn_charge};
                JButton[] btns2 = {lbl_cash, lbl_check_amount, lbl_gift, lbl_prepaid, lbl_cheque, lbl_charge};
                JButton[] btns3 = {btn_charge1, btn_charge2, btn_charge3, btn_charge4, btn_charge5, btn_charge6};
                RenderButtons.hover_touchscreen(btns1, btns2, btns3);
                JButton[] btns4 = {btn_charge11, btn_charge13, btn_charge14, btn_charge12, btn_charge15, btn_charge16, btn_charge17, btn_charge19, btn_charge18, btn_charge20, btn_charge21, btn_charge22, btn_charge23, btn_charge26, btn_charge25, btn_charge24};
                RenderButtons.hover_numpad(btns4);
            }
        });
        t.start();

    }
    String check_holder = "";
    String check_bank = "";
    String check_no = "";
    String check_date = DateType.sf.format(new Date());
    double check_amount = 0;

    private void payment_cheque() {
        Window p = (Window) this;
        Dlg_cashiering_cheque nd = Dlg_cashiering_cheque.create(p, true);
        nd.setTitle("");
        nd.do_pass(check_holder, check_bank, check_no, check_date, check_amount);
        nd.setCallback(new Dlg_cashiering_cheque.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_cashiering_cheque.OutputData data) {
                closeDialog.ok();
                check_holder = data.check_holder;
                check_bank = data.check_bank;
                check_no = data.check_no;
                check_date = data.check_date;
                check_amount = data.check_amount;
                lbl_check_amount.setText(FitIn.fmt_wc_0(data.check_amount));
                compute();
            }
        });
        Point loc = btn_charge2.getLocationOnScreen();
        nd.setLocation(loc.x + 46, loc.y - 137);
        nd.setVisible(true);
    }

    private void enter_cash() {
        double tendered = FitIn.toDouble(tf_amount_tendered.getText());
        lbl_cash.setText(FitIn.fmt_wc_0(tendered));
        compute();
    }

    private void compute() {
        double balance_due = FitIn.toDouble(lbl_p_balance_due.getText());
        double cash = FitIn.toDouble(lbl_cash.getText());
        double cheque = FitIn.toDouble(lbl_check_amount.getText());
        double tendered = cash + cheque;
        double change = tendered - balance_due;
        lbl_p_all_tendered.setText(FitIn.fmt_wc_0(tendered));
        lbl_p_change.setText(FitIn.fmt_wc_0(change));
    }

    private void ok() {

        double amount_due = FitIn.toDouble(lbl_p_balance_due.getText());
        double amount_paid = FitIn.toDouble(lbl_p_all_tendered.getText());
        double cash_paid = FitIn.toDouble(lbl_cash.getText());
        double check_amount1 = check_amount;
        String check_bank1 = check_bank;
        String check_no1 = check_no;
        String check_holder1 = check_holder;
        String check_date1 = check_date;
        double change = FitIn.toDouble(lbl_p_change.getText());
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(amount_due, amount_paid, cash_paid, check_amount, check_bank, check_no, check_holder, check_date));
        }
    }
}
