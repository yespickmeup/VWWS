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
        String one;
        String two;
        String three;
        String four;
        String five;

        public field() {
        }

        public field(String customer_no, String customer_name, String date_applied, String transaction_no, String days, String one, String two, String three, String four, String five) {
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

        public String getOne() {
            return one;
        }

        public void setOne(String one) {
            this.one = one;
        }

        public String getTwo() {
            return two;
        }

        public void setTwo(String two) {
            this.two = two;
        }

        public String getThree() {
            return three;
        }

        public void setThree(String three) {
            this.three = three;
        }

        public String getFour() {
            return four;
        }

        public void setFour(String four) {
            this.four = four;
        }

        public String getFive() {
            return five;
        }

        public void setFive(String five) {
            this.five = five;
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

                String date_applied = DateType.convert_slash_datetime(date_added);
                String transaction_no = "" + id;
                int day = 0;
                try {
                    Date d = DateType.datetime.parse(date_added);
                    day = DateUtils1.count_days(d, new Date());
                } catch (ParseException ex) {
                    Logger.getLogger(Rpt_ar_aging.class.getName()).log(Level.SEVERE, null, ex);
                }
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
                            break;
                        }
                    }
                }
                String one = "";
                if (day >= 0 && day <= 30) {
                    one = FitIn.fmt_wc_0(amount_due);
                }
                String two = "";
                if (day >= 31 && day <= 60) {
                    two = FitIn.fmt_wc_0(amount_due);
                }

                String three = "";
                if (day >= 61 && day <= 90) {
                    three = FitIn.fmt_wc_0(amount_due);
                }
                String four = "";
                if (day >= 91 && day <= 120) {
                    four = FitIn.fmt_wc_0(amount_due);
                }
                String five = "";
                if (day > 120) {
                    five = FitIn.fmt_wc_0(amount_due);
                }
                Rpt_ar_aging.field field = new field(customer_no, customer_name, date_applied, transaction_no, "" + day, one, two, three, four, five);
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
