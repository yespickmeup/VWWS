/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.statement_of_account;

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
public class Rpt_statement_of_account {

    public final List<field> fields;
    public final String barangay;
    public final String date_of_billing;
    public final String due_date;
    public final String customer_name;
    public final String tax_declaration_no;
    public final String water_meter_no;

    public Rpt_statement_of_account(String barangay, String date_of_billing, String due_date, String customer_name, String tax_declaration_no, String water_meter_no) {
        this.barangay = barangay;
        this.date_of_billing = date_of_billing;
        this.due_date = due_date;
        this.customer_name = customer_name;
        this.tax_declaration_no = tax_declaration_no;
        this.water_meter_no = water_meter_no;
        this.fields = new ArrayList();
    }

    public static class field {

        String period_from;
        String period_to;
        double present_reading;
        double previous_reading;
        double total_consumption;
        double interest;
        double less_amount;
        double amortization;
        double charge_amount;
        double amount_due;

        public field() {
        }

        public field(String period_from, String period_to, double present_reading, double previous_reading, double total_consumption, double interest, double less_amount, double amortization, double charge_amount, double amount_due) {
            this.period_from = period_from;
            this.period_to = period_to;
            this.present_reading = present_reading;
            this.previous_reading = previous_reading;
            this.total_consumption = total_consumption;
            this.interest = interest;
            this.less_amount = less_amount;
            this.amortization = amortization;
            this.charge_amount = charge_amount;
            this.amount_due = amount_due;
        }

        public String getPeriod_from() {
            return period_from;
        }

        public void setPeriod_from(String period_from) {
            this.period_from = period_from;
        }

        public String getPeriod_to() {
            return period_to;
        }

        public void setPeriod_to(String period_to) {
            this.period_to = period_to;
        }

        public double getPresent_reading() {
            return present_reading;
        }

        public void setPresent_reading(double present_reading) {
            this.present_reading = present_reading;
        }

        public double getPrevious_reading() {
            return previous_reading;
        }

        public void setPrevious_reading(double previous_reading) {
            this.previous_reading = previous_reading;
        }

        public double getTotal_consumption() {
            return total_consumption;
        }

        public void setTotal_consumption(double total_consumption) {
            this.total_consumption = total_consumption;
        }

        public double getInterest() {
            return interest;
        }

        public void setInterest(double interest) {
            this.interest = interest;
        }

        public double getLess_amount() {
            return less_amount;
        }

        public void setLess_amount(double less_amount) {
            this.less_amount = less_amount;
        }

        public double getAmortization() {
            return amortization;
        }

        public void setAmortization(double amortization) {
            this.amortization = amortization;
        }

        public double getCharge_amount() {
            return charge_amount;
        }

        public void setCharge_amount(double charge_amount) {
            this.charge_amount = charge_amount;
        }

        public double getAmount_due() {
            return amount_due;
        }

        public void setAmount_due(double amount_due) {
            this.amount_due = amount_due;
        }
    }

    public static void main(String[] args) {
        String barangay = "";
        String date_of_billing = "";
        String due_date = "";
        String customer_name = "";
        String tax_declaration_no = "";
        String water_meter_no = "";
        List<Rpt_statement_of_account.field> fields = Rpt_statement_of_account.ret_data("");
        Rpt_statement_of_account rpt = new Rpt_statement_of_account(barangay, date_of_billing, due_date, customer_name, tax_declaration_no, water_meter_no);
        rpt.fields.addAll(fields);
        String jrxml = "rpt_statement_of_account.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Rpt_statement_of_account.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Rpt_statement_of_account to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static List<Rpt_statement_of_account.field> ret_data(String where) {
        List<Rpt_statement_of_account.field> datas = new ArrayList();

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

                String where2 = " where occupancy='" + occupancy + "' and occupancy_type_id='" + occupancy_type_id + "' ";
                List<Occupancy_types.to_occupancy_types> occupancy_types = Occupancy_types.ret_data(where2);
                double amount = 0;
                double amortization = 0;
                double charge_amount = 0;
                double amount_due = 0;
                for (Occupancy_types.to_occupancy_types tt : occupancy_types) {
                    String[] cubics = tt.cubic.split(",");
                    double low = FitIn.toDouble(cubics[0]);
                    double high = FitIn.toDouble(cubics[1]);
                    if (cubics[1].equalsIgnoreCase("above")) {
                        high = 100000;
                    }
                    double total_cubic = current_reading - previous_reading;

                    if (total_cubic >= low && total_cubic <= high) {
                        amount_due = total_cubic * tt.charge + (tt.mf + tt.mr);
                        charge_amount = tt.mf;
                        amortization = tt.mr;
                        break;
                    }
                }
                String period_from = DateType.convert_slash_datetime(previous_reading_date);
                if (period_from.equals("02/08/1991")) {
                    period_from = "";
                }
                amount_due = (amount_due + charge_amount + amortization);
                String period_to = DateType.convert_slash_datetime(date_added);
                double present_reading = current_reading;
                double previous_reading1 = previous_reading;
                double total_consumption = present_reading - previous_reading1;
                double interest = 0;
                double less_amount = 0;

                Rpt_statement_of_account.field f = new field(period_from, period_to, present_reading, previous_reading, total_consumption, interest, less_amount, amortization, charge_amount, amount_due);
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
