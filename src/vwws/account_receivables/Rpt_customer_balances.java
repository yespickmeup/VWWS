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
import java.util.ArrayList;
import java.util.List;
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
import vwws.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Rpt_customer_balances {

    public final List<Rpt_customer_balances.field> fields;

    public Rpt_customer_balances() {
        this.fields = new ArrayList();
    }

    public static class field {

        String customer_no;
        String customer_name;
        double balance;

        public field() {
        }

        public field(String customer_no, String customer_name, double balance) {
            this.customer_no = customer_no;
            this.customer_name = customer_name;
            this.balance = balance;
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

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

    }

    public static void main(String[] args) {
        List<Rpt_customer_balances.field> fields = ret_data("");
        Rpt_customer_balances rpt = new Rpt_customer_balances();
        rpt.fields.addAll(fields);
        String jrxml = "rpt_customer_balances.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Rpt_customer_balances.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Rpt_customer_balances to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static List<Rpt_customer_balances.field> ret_data(String where) {
        List<Rpt_customer_balances.field> datas = new ArrayList();
        String where2 = " ";
        List<Occupancy_types.to_occupancy_types> occupancy_types = Occupancy_types.ret_data(where2);

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
                double balances = 0;

                String where3 = " where customer_id='" + id + "' and is_paid='" + "0" + "' ";
                String s2 = "select "
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
                        + " " + where3;
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                while (rs2.next()) {

                    String meter_reader_id = rs2.getString(2);
                    String meter_reader_no = rs2.getString(3);
                    String meter_reader_name = rs2.getString(4);
                    String customer_id = rs2.getString(5);
                    String customer_name = rs2.getString(7);
                    String customer_tax_dec_no = rs2.getString(8);
                    double previous_reading = rs2.getDouble(9);
                    double current_reading = rs2.getDouble(10);
                    String previous_reading_date = rs2.getString(28);
                    int is_paid = rs2.getInt(29);
                    String or_id = rs2.getString(30);
                    String or_no = rs2.getString(31);

                    double amount = 0;
                    double amortization = 0;
                    double charge_amount = 0;
                    double amount_due = 0;

                    for (Occupancy_types.to_occupancy_types tt : occupancy_types) {
                        if (tt.occupancy_type_id.equals(occupancy_type_id)) {
                            double total_cubic = current_reading - previous_reading;
                            String[] cubics = tt.cubic.split(",");
                            double low = FitIn.toDouble(cubics[0]);
                            double high = FitIn.toDouble(cubics[1]);
                            if (cubics[1].equalsIgnoreCase("above")) {
                                high = 100000;
                            }
                            if (total_cubic >= low && total_cubic <= high) {

                                amount_due = total_cubic * tt.charge + (tt.mf + tt.mr);
                                charge_amount = tt.charge;
                                amortization = tt.mr;
                                break;
                            }

                        }
                    }
                    String period_from = DateType.convert_slash_datetime(previous_reading_date);
                    if (period_from.equals("02/08/1991")) {
                        period_from = "";
                    }

                    String period_to = DateType.convert_slash_datetime(date_added);
                    double present_reading = current_reading;
                    double previous_reading1 = previous_reading;
                    double total_consumption = present_reading - previous_reading1;
                    double interest = 0;
                    double less_amount = 0;
                    balances += amount_due;

                }

                Rpt_customer_balances.field to = new Rpt_customer_balances.field(customer_no, name, balances);
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
