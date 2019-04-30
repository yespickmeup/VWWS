/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.account_receivables;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import synsoftech.util.DateType;
import vwws.occupancy_types.Occupancy_types;
import vwws.util.DateUtils1;
import vwws.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Rpt_ar_aging {

    public final List<Rpt_ar_aging.field> fields;

    public Rpt_ar_aging() {
        this.fields = new ArrayList();
    }

    public static class field {

        String customer_no;
        String customer_name;
        String date_applied;
        String transaction_no;
        String days;
        double one;
        double two;
        double three;
        double four;
        double five;
        String meter_no;
        String barangay;
        String type;

        public field() {
        }

        public field(String customer_no, String customer_name, String date_applied, String transaction_no, String days, double one, double two, double three, double four, double five, String meter_no, String barangay, String type) {
            this.customer_no = customer_no;
            this.customer_name = customer_name;
            this.date_applied = date_applied;
            this.transaction_no = transaction_no;
            this.days = days;
            this.one = one;
            this.two = two;
            this.three = three;
            this.four = four;
            this.five = five;
            this.meter_no = meter_no;
            this.barangay = barangay;
            this.type = type;
        }

        public String getCustomer_no() {
            return customer_no;
        }

        public void setCustomer_no(String customer_no) {
            this.customer_no = customer_no;
        }

        public String getCustomer_name() {
            return customer_name;
        }

        public void setCustomer_name(String customer_name) {
            this.customer_name = customer_name;
        }

        public String getDate_applied() {
            return date_applied;
        }

        public void setDate_applied(String date_applied) {
            this.date_applied = date_applied;
        }

        public String getTransaction_no() {
            return transaction_no;
        }

        public void setTransaction_no(String transaction_no) {
            this.transaction_no = transaction_no;
        }

        public String getDays() {
            return days;
        }

        public void setDays(String days) {
            this.days = days;
        }

        public double getOne() {
            return one;
        }

        public void setOne(double one) {
            this.one = one;
        }

        public double getTwo() {
            return two;
        }

        public void setTwo(double two) {
            this.two = two;
        }

        public double getThree() {
            return three;
        }

        public void setThree(double three) {
            this.three = three;
        }

        public double getFour() {
            return four;
        }

        public void setFour(double four) {
            this.four = four;
        }

        public double getFive() {
            return five;
        }

        public void setFive(double five) {
            this.five = five;
        }

        public String getMeter_no() {
            return meter_no;
        }

        public void setMeter_no(String meter_no) {
            this.meter_no = meter_no;
        }

        public String getBarangay() {
            return barangay;
        }

        public void setBarangay(String barangay) {
            this.barangay = barangay;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

    }

    public static void main(String[] args) {
        List<Rpt_ar_aging.field> fields = ret_data("");
        Rpt_ar_aging rpt = new Rpt_ar_aging();
        rpt.fields.addAll(fields);
        String jrxml = "rpt_ar_aging.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Rpt_ar_aging.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Rpt_ar_aging to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static List<Rpt_ar_aging.field> ret_data(String where) {
        List<Rpt_ar_aging.field> datas = new ArrayList();
        List<Occupancy_types.to_occupancy_types> occupancy_types = Occupancy_types.ret_data("");
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",reading_no"
                    + ",meter_reader_id"
                    + ",meter_reader_name"
                    + ",customer_id"
                    + ",customer_no"
                    + ",customer_name"
                    + ",customer_meter_no"
                    + ",previous_reading_date"
                    + ",previous_reading"
                    + ",current_reading"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",sitio"
                    + ",sitio_id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + ",actual_consumption"
                    + ",amount_due"
                    + ",mf"
                    + ",mr"
                    + ",interest"
                    + ",discount"
                    + ",net_due"
                    + ",is_paid"
                    + ",or_id"
                    + ",or_no"
                    + ",date_uploaded"
                    + ",is_uploaded"
                    + " from readings"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String reading_no = rs.getString(2);
                String meter_reader_id = rs.getString(3);
                String meter_reader_name = rs.getString(4);
                String customer_id = rs.getString(5);
                String customer_no = rs.getString(6);
                String customer_name = rs.getString(7);
                String customer_meter_no = rs.getString(8);
                String previous_reading_date = rs.getString(9);
                double previous_reading = rs.getDouble(10);
                double current_reading = rs.getDouble(11);
                String city = rs.getString(12);
                String city_id = rs.getString(13);
                String barangay = rs.getString(14);
                String barangay_id = rs.getString(15);
                String purok = rs.getString(16);
                String purok_id = rs.getString(17);
                String sitio = rs.getString(18);
                String sitio_id = rs.getString(19);
                String created_at = rs.getString(20);
                String updated_at = rs.getString(21);
                String created_by = rs.getString(22);
                String updated_by = rs.getString(23);
                int status = rs.getInt(24);
                String occupancy_id = rs.getString(25);
                String occupancy = rs.getString(26);
                String occupancy_type_id = rs.getString(27);
                String occupancy_type = rs.getString(28);
                String occupancy_type_code = rs.getString(29);
                double actual_consumption = rs.getDouble(30);
                double amount_due = rs.getDouble(31);
                double mf = rs.getDouble(32);
                double mr = rs.getDouble(33);
                double interest = rs.getDouble(34);
                double discount = rs.getDouble(35);
                double net_due = rs.getDouble(36);
                int is_paid = rs.getInt(37);
                String or_id = rs.getString(38);
                String or_no = rs.getString(39);
                String date_uploaded = rs.getString(40);
                int is_uploaded = rs.getInt(41);
                String date_applied = DateType.convert_slash_datetime(created_at);
                String transaction_no = "" + id;
                int day = 0;
                try {
                    Date d = DateType.datetime.parse(created_at);
                    day = DateUtils1.count_days(d, new Date());
                } catch (ParseException ex) {
                    Logger.getLogger(Rpt_ar_aging.class.getName()).log(Level.SEVERE, null, ex);
                }

                double one = 0;
                if (day >= 0 && day <= 30) {
                    one = amount_due;
                }
                double two = 0;
                if (day >= 31 && day <= 60) {
                    two = amount_due;
                }

                double three = 0;
                if (day >= 61 && day <= 90) {
                    three = amount_due;
                }
                double four = 0;
                if (day >= 91 && day <= 120) {
                    four = amount_due;
                }
                double five = 0;
                if (day > 120) {
                    five = amount_due;
                }
                occupancy = occupancy_type_code + " - " + occupancy_type;

                Rpt_ar_aging.field field = new field(customer_no, customer_name, date_applied, transaction_no, "" + day, one, two, three, four, five, customer_meter_no, barangay, occupancy);
                datas.add(field);

            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
