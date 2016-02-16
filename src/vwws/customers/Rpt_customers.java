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

    public final List<Rpt_customers.field> fields;

    public Rpt_customers() {
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

        public field() {
        }

        public field(String customer_no, String name, String bday, String city, String barangay, String purok, String address, String occupancy) {
            this.customer_no = customer_no;
            this.name = name;
            this.bday = bday;
            this.city = city;
            this.barangay = barangay;
            this.purok = purok;
            this.address = address;
            this.occupancy = occupancy;
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

    }

    public static void main(String[] args) {
        List<Rpt_customers.field> fields = ret_data("");
        Rpt_customers rpt = new Rpt_customers();
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
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",bday"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",address"
                    + ",balance"
                    + ",tax_dec_no"
                    + ",meter_is_paid"
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
                String address = rs.getString(13);
                double balance = rs.getDouble(14);
                String tax_dec_no = rs.getString(15);
                int meter_is_paid = rs.getInt(16);
                String date_added = rs.getString(17);
                String date_updated = rs.getString(18);
                String added_by_id = rs.getString(19);
                String update_by_id = rs.getString(20);
                int status = rs.getInt(21);
                String occupancy_id = rs.getString(22);
                String occupancy = rs.getString(23);
                String occupancy_type_id = rs.getString(24);
                String occupancy_type = rs.getString(25);
                String occupancy_type_code = rs.getString(26);

                String name = lname + ", " + fname + " " + mi;
                String bdate = DateType.convert_slash_datetime2(bday);
                String occupancies = occupancy_type_code + "" + occupancy;
                Rpt_customers.field to = new field(customer_no, name, bdate, city, barangay, purok, address, occupancies);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
