/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.customers;

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
import synsoftech.util.DateType;
import vwws.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Rpt_customers {

    public final String barangay;
    public final String purok;
    public final String sitio;
    public final String occupancy;
    public final String type;
    public final String status;
    public final String date;
    public final String printed_by;
    public final List<Rpt_customers.field> fields;

    public Rpt_customers(String barangay, String purok, String sitio, String occupancy,String type, String status, String date, String printed_by) {
        this.barangay = barangay;
        this.purok = purok;
        this.sitio = sitio;
        this.occupancy = occupancy;
        this.type=type;
        this.status = status;
        this.date = date;
        this.printed_by = printed_by;
        this.fields = new ArrayList();
    }

    public static class field {

        String customer_no;
        String name;
        String bday;
        String city;
        String barangay;
        String purok;
        String address;
        String occupancy;
        double balance;
        String meter_no;
        String meter_is_paid;
        String pipe_size;
        String status;

        public field() {
        }

        public field(String customer_no, String name, String bday, String city, String barangay, String purok, String address, String occupancy, double balance, String meter_no, String meter_is_paid, String pipe_size, String status) {
            this.customer_no = customer_no;
            this.name = name;
            this.bday = bday;
            this.city = city;
            this.barangay = barangay;
            this.purok = purok;
            this.address = address;
            this.occupancy = occupancy;
            this.balance = balance;
            this.meter_no = meter_no;
            this.meter_is_paid = meter_is_paid;
            this.pipe_size = pipe_size;
            this.status = status;
        }

        public String getCustomer_no() {
            return customer_no;
        }

        public void setCustomer_no(String customer_no) {
            this.customer_no = customer_no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBday() {
            return bday;
        }

        public void setBday(String bday) {
            this.bday = bday;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getBarangay() {
            return barangay;
        }

        public void setBarangay(String barangay) {
            this.barangay = barangay;
        }

        public String getPurok() {
            return purok;
        }

        public void setPurok(String purok) {
            this.purok = purok;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getOccupancy() {
            return occupancy;
        }

        public void setOccupancy(String occupancy) {
            this.occupancy = occupancy;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getMeter_no() {
            return meter_no;
        }

        public void setMeter_no(String meter_no) {
            this.meter_no = meter_no;
        }

        public String getMeter_is_paid() {
            return meter_is_paid;
        }

        public void setMeter_is_paid(String meter_is_paid) {
            this.meter_is_paid = meter_is_paid;
        }

        public String getPipe_size() {
            return pipe_size;
        }

        public void setPipe_size(String pipe_size) {
            this.pipe_size = pipe_size;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }

    public static void main(String[] args) {
        String barangay = "";
        String purok = "";
        String sitio = "";
        String occupancy = "";
        String type="";
        String status = "";
        String date = "";
        String printed_by = "";
        List<Rpt_customers.field> fields = ret_data("");
        Rpt_customers rpt = new Rpt_customers(barangay, purok, sitio, occupancy,type, status, date, printed_by);
        rpt.fields.addAll(fields);
        String jrxml = "rpt_customers.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Rpt_customers.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Rpt_customers to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static List<Rpt_customers.field> ret_data(String where) {
        List<Rpt_customers.field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",customer_no"
                    + ",ifnull(fname,'')"
                    + ",ifnull(mi,'')"
                    + ",lname"
                    + ",bday"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",sitio"
                    + ",sitio_id"
                    + ",address"
                    + ",balance"
                    + ",tax_dec_no"
                    + ",meter_is_paid"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",updated_by_id"
                    + ",occupancy_id"
                    + ",occupancy"
                    + ",occupancy_type_id"
                    + ",occupancy_type"
                    + ",occupancy_type_code"
                    + ",gender"
                    + ",religion"
                    + ",height"
                    + ",weight"
                    + ",civil_status"
                    + ",contact_landline"
                    + ",contact_mobile"
                    + ",contact_email"
                    + ",meter_no"
                    + ",meter_description"
                    + ",serial_no"
                    + ",status"
                    + ",pipe_size"
                    + " from customers"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String customer_no = rs.getString(2);
                String fname = rs.getString(3);
                String mi = rs.getString(4);
                String lname = rs.getString(5);
                String bday = rs.getString(6);
                String city = rs.getString(7);
                String city_id = rs.getString(8);
                String barangay = rs.getString(9);
                String barangay_id = rs.getString(10);
                String purok = rs.getString(11);
                String purok_id = rs.getString(12);
                String sitio = rs.getString(13);
                String sitio_id = rs.getString(14);
                String address = rs.getString(15);
                double balance = rs.getDouble(16);
                String tax_dec_no = rs.getString(17);
                int meter_is_paid = rs.getInt(18);
                String date_added = rs.getString(19);
                String date_updated = rs.getString(20);
                String added_by_id = rs.getString(21);
                String updated_by_id = rs.getString(22);
                String occupancy_id = rs.getString(23);
                String occupancy = rs.getString(24);
                String occupancy_type_id = rs.getString(25);
                String occupancy_type = rs.getString(26);
                String occupancy_type_code = rs.getString(27);
                String gender = rs.getString(28);
                String religion = rs.getString(29);
                String height = rs.getString(30);
                String weight = rs.getString(31);
                String civil_status = rs.getString(32);
                String contact_landline = rs.getString(33);
                String contact_mobile = rs.getString(34);
                String contact_email = rs.getString(35);
                String meter_no = rs.getString(36);
                String meter_description = rs.getString(37);
                String serial_no = rs.getString(38);
                int status = rs.getInt(39);
                boolean selected = false;
                String pipe_size = rs.getString(40);

                String name = lname + ", " + fname + " " + mi;

                occupancy = occupancy_type_code + " - " + occupancy_type;

                String status1 = "New";
                if (status == 1) {
                    status1 = "Active";
                }
                if (status == 2) {
                    status1 = "Disconnected";
                }
                if (status == 3) {
                    status1 = "For Reconnection";
                }
                if (status == 4) {
                    status1 = "Closed";
                }
                Rpt_customers.field f = new field(customer_no, name, bday, city, barangay, purok, address, occupancy, balance, meter_no, meter_no, pipe_size, status1);
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
