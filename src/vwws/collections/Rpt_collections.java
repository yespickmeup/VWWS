/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.collections;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import vwws.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Rpt_collections {

    public final List<Rpt_collections.field> fields;

    public Rpt_collections() {
        this.fields = new ArrayList();
    }

    public static class field {

        String or_no;
        String customer_name;
        double amount_due;
        double cash;
        double check_amount;
        double discount_amount;

        public field() {
        }

        public field(String or_no, String customer_name, double amount_due, double cash, double check_amount, double discount_amount) {
            this.or_no = or_no;
            this.customer_name = customer_name;
            this.amount_due = amount_due;
            this.cash = cash;
            this.check_amount = check_amount;
            this.discount_amount = discount_amount;
        }

        public String getOr_no() {
            return or_no;
        }

        public void setOr_no(String or_no) {
            this.or_no = or_no;
        }

        public String getCustomer_name() {
            return customer_name;
        }

        public void setCustomer_name(String customer_name) {
            this.customer_name = customer_name;
        }

        public double getAmount_due() {
            return amount_due;
        }

        public void setAmount_due(double amount_due) {
            this.amount_due = amount_due;
        }

        public double getCash() {
            return cash;
        }

        public void setCash(double cash) {
            this.cash = cash;
        }

        public double getCheck_amount() {
            return check_amount;
        }

        public void setCheck_amount(double check_amount) {
            this.check_amount = check_amount;
        }

        public double getDiscount_amount() {
            return discount_amount;
        }

        public void setDiscount_amount(double discount_amount) {
            this.discount_amount = discount_amount;
        }

    }

    public static void main(String[] args) {
        List<Rpt_collections.field> fields = ret_data("");
        Rpt_collections rpt = new Rpt_collections();
        rpt.fields.addAll(fields);
        String jrxml = "rpt_collections.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Rpt_collections.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Rpt_collections to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static List<Rpt_collections.field> ret_data(String where) {
        List<Rpt_collections.field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",or_no"
                    + ",customer_id"
                    + ",customer_name"
                    + ",reading_ids"
                    + ",amount_due"
                    + ",amount_paid"
                    + ",cash_paid"
                    + ",check_amount"
                    + ",check_bank"
                    + ",check_no"
                    + ",check_holder"
                    + ",check_date"
                    + ",discount_name"
                    + ",discount_amount"
                    + ",discount_rate"
                    + ",discount_customer_name"
                    + ",discount_customer_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",address"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ",is_counted"
                    + " from reading_payments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String or_no = rs.getString(2);
                String customer_id = rs.getString(3);
                String customer_name = rs.getString(4);
                String reading_ids = rs.getString(5);
                double amount_due = rs.getDouble(6);
                double amount_paid = rs.getDouble(7);
                double cash_paid = rs.getDouble(8);
                double check_amount = rs.getDouble(9);
                String check_bank = rs.getString(10);
                String check_no = rs.getString(11);
                String check_holder = rs.getString(12);
                String check_date = rs.getString(13);
                String discount_name = rs.getString(14);
                double discount_amount = rs.getDouble(15);
                double discount_rate = rs.getDouble(16);
                String discount_customer_name = rs.getString(17);
                String discount_customer_id = rs.getString(18);
                String city = rs.getString(19);
                String city_id = rs.getString(20);
                String barangay = rs.getString(21);
                String barangay_id = rs.getString(22);
                String purok = rs.getString(23);
                String purok_id = rs.getString(24);
                String address = rs.getString(25);
                String date_added = rs.getString(26);
                String date_updated = rs.getString(27);
                String added_by_id = rs.getString(28);
                String update_by_id = rs.getString(29);
                int status = rs.getInt(30);
                int is_counted = rs.getInt(31);

                double cash = amount_due - check_amount;
                Rpt_collections.field f = new field(or_no, customer_name, amount_due, cash, check_amount, discount_amount);
                datas.add(f);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
