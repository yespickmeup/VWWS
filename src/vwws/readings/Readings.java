/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.readings;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import vwws.meter_readers.Meter_reader_assignments.to_meter_reader_assignments;
import vwws.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Readings {

    public static class to_readings {

        public final int id;
        public final String meter_reader_id;
        public final String meter_reader_no;
        public final String meter_reader_name;
        public final String customer_id;
        public final String customer_no;
        public final String customer_name;
        public final String customer_tax_dec_no;
        public final double previous_reading;
        public final double current_reading;
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
        public boolean selected;
        public final String occupancy_id;
        public final String occupancy;
        public final String occupancy_type_id;
        public final String occupancy_type;
        public final String occupancy_type_code;
        public final String previous_reading_date;
        public final int is_paid;
        public final String or_id;
        public final String or_no;
        public double mf;
        public double mr;
        public double interest;
        public double amount;
        public to_readings(int id, String meter_reader_id, String meter_reader_no, String meter_reader_name, String customer_id, String customer_no
                , String customer_name, String customer_tax_dec_no, double previous_reading, double current_reading, String city
                , String city_id, String barangay, String barangay_id, String purok, String purok_id
                , String address, String date_added, String date_updated, String added_by_id
                , String update_by_id, int status, boolean selected, String occupancy_id
                , String occupancy, String occupancy_type_id, String occupancy_type, String occupancy_type_code, String previous_reading_date
                , int is_paid, String or_id, String or_no,double mf,double mr,double interest,double amount) {
            this.id = id;
            this.meter_reader_id = meter_reader_id;
            this.meter_reader_no = meter_reader_no;
            this.meter_reader_name = meter_reader_name;
            this.customer_id = customer_id;
            this.customer_no = customer_no;
            this.customer_name = customer_name;
            this.customer_tax_dec_no = customer_tax_dec_no;
            this.previous_reading = previous_reading;
            this.current_reading = current_reading;
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
            this.selected = selected;
            this.occupancy_id = occupancy_id;
            this.occupancy = occupancy;
            this.occupancy_type_id = occupancy_type_id;
            this.occupancy_type = occupancy_type;
            this.occupancy_type_code = occupancy_type_code;
            this.previous_reading_date = previous_reading_date;
            this.is_paid = is_paid;
            this.or_id = or_id;
            this.or_no = or_no;
            this.mf=mf;
            this.mr=mr;
            this.interest=interest;
            this.amount=amount;
        }

        public double getMf() {
            return mf;
        }

        public void setMf(double mf) {
            this.mf = mf;
        }

        public double getMr() {
            return mr;
        }

        public void setMr(double mr) {
            this.mr = mr;
        }

        public double getInterest() {
            return interest;
        }

        public void setInterest(double interest) {
            this.interest = interest;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        
        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

    }

    public static void add_data(to_readings to_readings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into readings("
                    + "meter_reader_id"
                    + ",meter_reader_no"
                    + ",meter_reader_name"
                    + ",customer_id"
                    + ",customer_no"
                    + ",customer_name"
                    + ",customer_tax_dec_no"
                    + ",previous_reading"
                    + ",current_reading"
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
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + ",previous_reading_date"
                    + ",is_paid"
                    + ",or_id"
                    + ",or_no"
                    + ")values("
                    + ":meter_reader_id"
                    + ",:meter_reader_no"
                    + ",:meter_reader_name"
                    + ",:customer_id"
                    + ",:customer_no"
                    + ",:customer_name"
                    + ",:customer_tax_dec_no"
                    + ",:previous_reading"
                    + ",:current_reading"
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
                    + ",:occupancy_id"
                    + ",:occupancy"
                    + ",:occupancy_type_id"
                    + ",:occupancy_type"
                    + ",:occupancy_type_code"
                    + ",:previous_reading_date"
                    + ",:is_paid"
                    + ",:or_id"
                    + ",:or_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("meter_reader_id", to_readings.meter_reader_id)
                    .setString("meter_reader_no", to_readings.meter_reader_no)
                    .setString("meter_reader_name", to_readings.meter_reader_name)
                    .setString("customer_id", to_readings.customer_id)
                    .setString("customer_no", to_readings.customer_no)
                    .setString("customer_name", to_readings.customer_name)
                    .setString("customer_tax_dec_no", to_readings.customer_tax_dec_no)
                    .setNumber("previous_reading", to_readings.previous_reading)
                    .setNumber("current_reading", to_readings.current_reading)
                    .setString("city", to_readings.city)
                    .setString("city_id", to_readings.city_id)
                    .setString("barangay", to_readings.barangay)
                    .setString("barangay_id", to_readings.barangay_id)
                    .setString("purok", to_readings.purok)
                    .setString("purok_id", to_readings.purok_id)
                    .setString("address", to_readings.address)
                    .setString("date_added", to_readings.date_added)
                    .setString("date_updated", to_readings.date_updated)
                    .setString("added_by_id", to_readings.added_by_id)
                    .setString("update_by_id", to_readings.update_by_id)
                    .setNumber("status", to_readings.status)
                    .setString("occupancy_id", to_readings.occupancy_id)
                    .setString("occupancy", to_readings.occupancy)
                    .setString("occupancy_type_id", to_readings.occupancy_type_id)
                    .setString("occupancy_type", to_readings.occupancy_type)
                    .setString("occupancy_type_code", to_readings.occupancy_type_code)
                    .setString("previous_reading_date", to_readings.previous_reading_date)
                    .setNumber("is_paid", to_readings.is_paid)
                    .setString("or_id", to_readings.or_id)
                    .setString("or_no", to_readings.or_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Readings.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_readings to_readings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update readings set "
                    + "meter_reader_id= :meter_reader_id "
                    + ",meter_reader_no= :meter_reader_no "
                    + ",meter_reader_name= :meter_reader_name "
                    + ",customer_id= :customer_id "
                    + ",customer_no= :customer_no "
                    + ",customer_name= :customer_name "
                    + ",customer_tax_dec_no= :customer_tax_dec_no "
                    + ",previous_reading= :previous_reading "
                    + ",current_reading= :current_reading "
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
                    + ",occupancy_id= :occupancy_id "
                    + ",occupancy= :occupancy "
                    + ",occupancy_type_id= :occupancy_type_id "
                    + ",occupancy_type= :occupancy_type "
                    + ",occupancy_type_code= :occupancy_type_code "
                    + ",previous_reading_date= :previous_reading_date"
                    + ",is_paid= :is_paid "
                    + ",or_id= :or_id "
                    + ",or_no= :or_no "
                    + " where id='" + to_readings.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("meter_reader_id", to_readings.meter_reader_id)
                    .setString("meter_reader_no", to_readings.meter_reader_no)
                    .setString("meter_reader_name", to_readings.meter_reader_name)
                    .setString("customer_id", to_readings.customer_id)
                    .setString("customer_no", to_readings.customer_no)
                    .setString("customer_name", to_readings.customer_name)
                    .setString("customer_tax_dec_no", to_readings.customer_tax_dec_no)
                    .setNumber("previous_reading", to_readings.previous_reading)
                    .setNumber("current_reading", to_readings.current_reading)
                    .setString("city", to_readings.city)
                    .setString("city_id", to_readings.city_id)
                    .setString("barangay", to_readings.barangay)
                    .setString("barangay_id", to_readings.barangay_id)
                    .setString("purok", to_readings.purok)
                    .setString("purok_id", to_readings.purok_id)
                    .setString("address", to_readings.address)
                    .setString("date_added", to_readings.date_added)
                    .setString("date_updated", to_readings.date_updated)
                    .setString("added_by_id", to_readings.added_by_id)
                    .setString("update_by_id", to_readings.update_by_id)
                    .setNumber("status", to_readings.status)
                    .setString("occupancy_id", to_readings.occupancy_id)
                    .setString("occupancy", to_readings.occupancy)
                    .setString("occupancy_type_id", to_readings.occupancy_type_id)
                    .setString("occupancy_type", to_readings.occupancy_type)
                    .setString("occupancy_type_code", to_readings.occupancy_type_code)
                    .setString("previous_reading_date", to_readings.previous_reading_date)
                    .setNumber("is_paid", to_readings.is_paid)
                    .setString("or_id", to_readings.or_id)
                    .setString("or_no", to_readings.or_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Readings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_readings to_readings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from readings  "
                    + " where id='" + to_readings.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Readings.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_readings> ret_data(String where) {
        List<to_readings> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",meter_reader_id"
                    + ",meter_reader_no"
                    + ",meter_reader_name"
                    + ",customer_id"
                    + ",customer_no"
                    + ",customer_name"
                    + ",customer_tax_dec_no"
                    + ",previous_reading"
                    + ",current_reading"
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
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + ",previous_reading_date"
                    + ",is_paid"
                    + ",or_id"
                    + ",or_no"
                    + " from readings"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String meter_reader_id = rs.getString(2);
                String meter_reader_no = rs.getString(3);
                String meter_reader_name = rs.getString(4);
                String customer_id = rs.getString(5);
                String customer_no = rs.getString(6);
                String customer_name = rs.getString(7);
                String customer_tax_dec_no = rs.getString(8);
                double previous_reading = rs.getDouble(9);
                double current_reading = rs.getDouble(10);
                String city = rs.getString(11);
                String city_id = rs.getString(12);
                String barangay = rs.getString(13);
                String barangay_id = rs.getString(14);
                String purok = rs.getString(15);
                String purok_id = rs.getString(16);
                String address = rs.getString(17);
                String date_added = rs.getString(18);
                String date_updated = rs.getString(19);
                String added_by_id = rs.getString(20);
                String update_by_id = rs.getString(21);
                int status = rs.getInt(22);
                String occupancy_id = rs.getString(23);
                String occupancy = rs.getString(24);
                String occupancy_type_id = rs.getString(25);
                String occupancy_type = rs.getString(26);
                String occupancy_type_code = rs.getString(27);
                String previous_reading_date = rs.getString(28);
                int is_paid = rs.getInt(29);
                String or_id = rs.getString(30);
                String or_no = rs.getString(31);
                to_readings to = new to_readings(id, meter_reader_id, meter_reader_no, meter_reader_name, customer_id, customer_no, customer_name, customer_tax_dec_no, previous_reading, current_reading, city, city_id, barangay, barangay_id, purok, purok_id, address, date_added, date_updated, added_by_id, update_by_id, status, true, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, previous_reading_date, is_paid, or_id, or_no,0,0,0,0);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_meter_reader_assignments> ret_reader_assignments(String where) {
        List<to_meter_reader_assignments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",meter_reader_id"
                    + ",meter_reader_no"
                    + ",meter_reader_name"
                    + ",customer_id"
                    + ",customer_no"
                    + ",customer_name"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + " from meter_reader_assignments "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String meter_reader_id = rs.getString(2);
                String meter_reader_no = rs.getString(3);
                String meter_reader_name = rs.getString(4);
                String customer_id = rs.getString(5);
                String customer_no = rs.getString(6);
                String customer_name = rs.getString(7);
                String barangay = rs.getString(8);
                String barangay_id = rs.getString(9);
                String purok = rs.getString(10);
                String purok_id = rs.getString(11);
                String date_added = rs.getString(12);
                String date_updated = rs.getString(13);
                String added_by_id = rs.getString(14);
                String update_by_id = rs.getString(15);
                int status = rs.getInt(16);
                String occupancy_id = rs.getString(17);
                String occupancy = rs.getString(18);
                String occupancy_type_id = rs.getString(19);
                String occupancy_type = rs.getString(20);
                String occupancy_type_code = rs.getString(21);
                to_meter_reader_assignments to = new to_meter_reader_assignments(id, meter_reader_id, meter_reader_no, meter_reader_name, customer_id, customer_no, customer_name, barangay, barangay_id, purok, purok_id, date_added, date_updated, added_by_id, update_by_id, status, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_reading(to_readings to_readings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update readings set "
                    + " previous_reading= :previous_reading "
                    + ",current_reading= :current_reading "
                    + ",date_updated= :date_updated "
                    + ",update_by_id= :update_by_id "
                    + " where id='" + to_readings.id + "' "
                    + " ";
            s0 = SqlStringUtil.parse(s0)
                    .setNumber("previous_reading", to_readings.previous_reading)
                    .setNumber("current_reading", to_readings.current_reading)
                    .setString("date_updated", to_readings.date_updated)
                    .setString("update_by_id", to_readings.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Readings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
