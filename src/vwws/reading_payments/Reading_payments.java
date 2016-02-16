/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.reading_payments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import vwws.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Reading_payments {

    public static class to_reading_payments {

        public final int id;
        public final String or_no;
        public final String customer_id;
        public final String customer_name;
        public final String reading_ids;
        public final double amount_due;
        public final double amount_paid;
        public final double cash_paid;
        public final double check_amount;
        public final String check_bank;
        public final String check_no;
        public final String check_holder;
        public final String check_date;
        public final String discount_name;
        public final double discount_amount;
        public final double discount_rate;
        public final String discount_customer_name;
        public final String discount_customer_id;
        public final String city;
        public final String city_id;
        public final String barangay;
        public final String barangay_id;
        public final String purok;
        public final String purok_id;
        public final String address;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final int status;
        public final int is_counted;

        public to_reading_payments(int id, String or_no, String customer_id, String customer_name, String reading_ids, double amount_due, double amount_paid, double cash_paid, double check_amount, String check_bank, String check_no, String check_holder, String check_date, String discount_name, double discount_amount, double discount_rate, String discount_customer_name, String discount_customer_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, String address, String date_added, String date_updated, String added_by_id, String update_by_id, int status, int is_counted) {
            this.id = id;
            this.or_no = or_no;
            this.customer_id = customer_id;
            this.customer_name = customer_name;
            this.reading_ids = reading_ids;
            this.amount_due = amount_due;
            this.amount_paid = amount_paid;
            this.cash_paid = cash_paid;
            this.check_amount = check_amount;
            this.check_bank = check_bank;
            this.check_no = check_no;
            this.check_holder = check_holder;
            this.check_date = check_date;
            this.discount_name = discount_name;
            this.discount_amount = discount_amount;
            this.discount_rate = discount_rate;
            this.discount_customer_name = discount_customer_name;
            this.discount_customer_id = discount_customer_id;
            this.city = city;
            this.city_id = city_id;
            this.barangay = barangay;
            this.barangay_id = barangay_id;
            this.purok = purok;
            this.purok_id = purok_id;
            this.address = address;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.status = status;
            this.is_counted = is_counted;
        }
    }

    public static int add_data(to_reading_payments to_reading_payments) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            String s0 = "insert into reading_payments("
                    + "or_no"
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
                    + ")values("
                    + ":or_no"
                    + ",:customer_id"
                    + ",:customer_name"
                    + ",:reading_ids"
                    + ",:amount_due"
                    + ",:amount_paid"
                    + ",:cash_paid"
                    + ",:check_amount"
                    + ",:check_bank"
                    + ",:check_no"
                    + ",:check_holder"
                    + ",:check_date"
                    + ",:discount_name"
                    + ",:discount_amount"
                    + ",:discount_rate"
                    + ",:discount_customer_name"
                    + ",:discount_customer_id"
                    + ",:city"
                    + ",:city_id"
                    + ",:barangay"
                    + ",:barangay_id"
                    + ",:purok"
                    + ",:purok_id"
                    + ",:address"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ",:status"
                    + ",:is_counted"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("or_no", to_reading_payments.or_no)
                    .setString("customer_id", to_reading_payments.customer_id)
                    .setString("customer_name", to_reading_payments.customer_name)
                    .setString("reading_ids", to_reading_payments.reading_ids)
                    .setNumber("amount_due", to_reading_payments.amount_due)
                    .setNumber("amount_paid", to_reading_payments.amount_paid)
                    .setNumber("cash_paid", to_reading_payments.cash_paid)
                    .setNumber("check_amount", to_reading_payments.check_amount)
                    .setString("check_bank", to_reading_payments.check_bank)
                    .setString("check_no", to_reading_payments.check_no)
                    .setString("check_holder", to_reading_payments.check_holder)
                    .setString("check_date", to_reading_payments.check_date)
                    .setString("discount_name", to_reading_payments.discount_name)
                    .setNumber("discount_amount", to_reading_payments.discount_amount)
                    .setNumber("discount_rate", to_reading_payments.discount_rate)
                    .setString("discount_customer_name", to_reading_payments.discount_customer_name)
                    .setString("discount_customer_id", to_reading_payments.discount_customer_id)
                    .setString("city", to_reading_payments.city)
                    .setString("city_id", to_reading_payments.city_id)
                    .setString("barangay", to_reading_payments.barangay)
                    .setString("barangay_id", to_reading_payments.barangay_id)
                    .setString("purok", to_reading_payments.purok)
                    .setString("purok_id", to_reading_payments.purok_id)
                    .setString("address", to_reading_payments.address)
                    .setString("date_added", to_reading_payments.date_added)
                    .setString("date_updated", to_reading_payments.date_updated)
                    .setString("added_by_id", to_reading_payments.added_by_id)
                    .setString("update_by_id", to_reading_payments.update_by_id)
                    .setNumber("status", to_reading_payments.status)
                    .setNumber("is_counted", to_reading_payments.is_counted)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.addBatch(s0);

            Lg.s(Reading_payments.class, "Successfully Added");

            String[] ids = to_reading_payments.reading_ids.split(",");
            for (String id : ids) {
                String s2 = "update readings set "
                        + "is_paid= :is_paid "
                        + ",or_id= :or_id "
                        + ",or_no= :or_no "
                        + " where id='" + id + "' "
                        + " ";

                s2 = SqlStringUtil.parse(s2)
                        .setNumber("is_paid", 1)
                        .setString("or_id", "")
                        .setString("or_no", to_reading_payments.or_no)
                        .ok();
                stmt.addBatch(s2);
            }
            stmt.executeBatch();
            conn.commit();
            return 1;
        } catch (SQLException e) {
            return 0;
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_reading_payments to_reading_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update reading_payments set "
                    + "or_no= :or_no "
                    + ",customer_id= :customer_id "
                    + ",customer_name= :customer_name "
                    + ",reading_ids= :reading_ids "
                    + ",amount_due= :amount_due "
                    + ",amount_paid= :amount_paid "
                    + ",cash_paid= :cash_paid "
                    + ",check_amount= :check_amount "
                    + ",check_bank= :check_bank "
                    + ",check_no= :check_no "
                    + ",check_holder= :check_holder "
                    + ",check_date= :check_date "
                    + ",discount_name= :discount_name "
                    + ",discount_amount= :discount_amount "
                    + ",discount_rate= :discount_rate "
                    + ",discount_customer_name= :discount_customer_name "
                    + ",discount_customer_id= :discount_customer_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + ",address= :address "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + ",status= :status "
                    + ",is_counted= :is_counted"
                    + " where id='" + to_reading_payments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("or_no", to_reading_payments.or_no)
                    .setString("customer_id", to_reading_payments.customer_id)
                    .setString("customer_name", to_reading_payments.customer_name)
                    .setString("reading_ids", to_reading_payments.reading_ids)
                    .setNumber("amount_due", to_reading_payments.amount_due)
                    .setNumber("amount_paid", to_reading_payments.amount_paid)
                    .setNumber("cash_paid", to_reading_payments.cash_paid)
                    .setNumber("check_amount", to_reading_payments.check_amount)
                    .setString("check_bank", to_reading_payments.check_bank)
                    .setString("check_no", to_reading_payments.check_no)
                    .setString("check_holder", to_reading_payments.check_holder)
                    .setString("check_date", to_reading_payments.check_date)
                    .setString("discount_name", to_reading_payments.discount_name)
                    .setNumber("discount_amount", to_reading_payments.discount_amount)
                    .setNumber("discount_rate", to_reading_payments.discount_rate)
                    .setString("discount_customer_name", to_reading_payments.discount_customer_name)
                    .setString("discount_customer_id", to_reading_payments.discount_customer_id)
                    .setString("city", to_reading_payments.city)
                    .setString("city_id", to_reading_payments.city_id)
                    .setString("barangay", to_reading_payments.barangay)
                    .setString("barangay_id", to_reading_payments.barangay_id)
                    .setString("purok", to_reading_payments.purok)
                    .setString("purok_id", to_reading_payments.purok_id)
                    .setString("address", to_reading_payments.address)
                    .setString("date_added", to_reading_payments.date_added)
                    .setString("date_updated", to_reading_payments.date_updated)
                    .setString("added_by_id", to_reading_payments.added_by_id)
                    .setString("update_by_id", to_reading_payments.update_by_id)
                    .setNumber("status", to_reading_payments.status)
                    .setNumber("is_counted", to_reading_payments.is_counted)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Reading_payments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_reading_payments to_reading_payments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from reading_payments  "
                    + " where id='" + to_reading_payments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Reading_payments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_reading_payments> ret_data(String where) {
        List<to_reading_payments> datas = new ArrayList();

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
                int is_counted=rs.getInt(31);
                to_reading_payments to = new to_reading_payments(id, or_no, customer_id, customer_name, reading_ids, amount_due
                        , amount_paid, cash_paid, check_amount, check_bank, check_no, check_holder, check_date, discount_name
                        , discount_amount, discount_rate, discount_customer_name, discount_customer_id, city, city_id, barangay
                        , barangay_id, purok, purok_id, address, date_added, date_updated, added_by_id, update_by_id, status,is_counted);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void main(String[] args) {
        System.out.println(increment_id());
    }

    public static String increment_id() {
        String id = "000000000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from reading_payments";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select or_no from reading_payments where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }

            if (id == null) {
                id = "000000000000";
            }
            id = ReceiptIncrementor.increment(id);
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
