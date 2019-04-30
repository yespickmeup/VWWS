/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.readings;

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
import vwws.meter_readers.Meter_reader_assignments;
import vwws.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Rpt_meter_reader_assignments_status {

    public final String meter_reader_id;
    public final String meter_reader;
    public final String month;
    public final String year;
    public final List<Rpt_meter_reader_assignments_status.field> fields;

    public Rpt_meter_reader_assignments_status(String meter_reader_id, String meter_reader, String month, String year) {
        this.meter_reader_id = meter_reader_id;
        this.meter_reader = meter_reader;
        this.fields = new ArrayList();
        this.month = month;
        this.year = year;
    }

    public static class field {

        String customer_no;
        String customer_name;
        String meter_no;
        String barangay;
        String occupancy;
        String pipe_size;
        String meter_reader;
        String status;

        public field() {
        }

        public field(String customer_no, String customer_name, String meter_no, String barangay, String occupancy, String pipe_size, String meter_reader, String status) {
            this.customer_no = customer_no;
            this.customer_name = customer_name;
            this.meter_no = meter_no;
            this.barangay = barangay;
            this.occupancy = occupancy;
            this.pipe_size = pipe_size;
            this.meter_reader = meter_reader;
            this.status = status;
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

        public String getOccupancy() {
            return occupancy;
        }

        public void setOccupancy(String occupancy) {
            this.occupancy = occupancy;
        }

        public String getPipe_size() {
            return pipe_size;
        }

        public void setPipe_size(String pipe_size) {
            this.pipe_size = pipe_size;
        }

        public String getMeter_reader() {
            return meter_reader;
        }

        public void setMeter_reader(String meter_reader) {
            this.meter_reader = meter_reader;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }

    public static void main(String[] args) {
        String meter_reader_id = "1";
        String meter_reader = "Ronald Pascua";
        String month = "03";
        String year = "2015";
        List<Rpt_meter_reader_assignments_status.field> fields = Rpt_meter_reader_assignments_status.ret_data("", month, year);
        Rpt_meter_reader_assignments_status rpt = new Rpt_meter_reader_assignments_status(meter_reader_id, meter_reader, month, year);
        rpt.fields.addAll(fields);
        String jrxml = "rpt_meter_reader_assignments_status.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Rpt_meter_reader_assignments_status.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Rpt_meter_reader_assignments_status to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static List<Rpt_meter_reader_assignments_status.field> ret_data(String where, String month, String year) {
        List<Rpt_meter_reader_assignments_status.field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "mra.id"
                    + ",mra.meter_reader_id"
                    + ",mra.meter_reader_no"
                    + ",mra.meter_reader_name"
                    + ",mra.customer_id"
                    + ",mra.customer_no"
                    + ",mra.customer_name"
                    + ",mra.barangay"
                    + ",mra.barangay_id"
                    + ",mra.purok"
                    + ",mra.purok_id"
                    + ",mra.date_added"
                    + ",mra.date_updated"
                    + ",mra.added_by_id"
                    + ",mra.update_by_id"
                    + ",mra.status"
                    + ",mra.occupancy_id"
                    + ",mra.occupancy"
                    + ",mra.occupancy_type_id"
                    + ",mra.occupancy_type"
                    + ",mra.occupancy_type_code"
                    + ",ifnull((select r.id from readings r where MONTH(r.date_added)='" + month + "' and YEAR(r.date_added)='" + year + "' and r.customer_id=mra.customer_id),0)"
                    + " from meter_reader_assignments mra "
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
                int a = rs.getInt(22);

                String state = "Pending";
                if (a != 0) {
                    state = "Ok";
                }
//                Rpt_meter_reader_assignments_status.field f = new field(customer_no, customer_name, state);
//                datas.add(f);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<Rpt_meter_reader_assignments_status.field> ret_assignments(String where) {
        List<Rpt_meter_reader_assignments_status.field> datas = new ArrayList();
//+ ",concat(c.lname,', ',c.fname,' ',c.mi)"
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "c.id"
                    + ",c.customer_no"
                    + ",concat(c.lname,'',ifnull(c.fname,''),'',ifnull(c.mi,'')) as name"
                    + ",c.barangay"
                    + ",c.barangay_id"
                    + ",c.purok"
                    + ",c.purok_id"
                    + ",c.date_added"
                    + ",c.date_updated"
                    + ",c.added_by_id"
                    + ",c.updated_by_id"
                    + ",c.status"
                    + ",c.occupancy_id"
                    + ",c.occupancy"
                    + ",c.occupancy_type_id"
                    + ",c.occupancy_type"
                    + ",c.occupancy_type_code"
                    + ",c.city"
                    + ",c.city_id"
                    + ",c.sitio"
                    + ",c.sitio_id"
                    + ",ifnull(c.meter_no,'')"
                    + ",c.pipe_size"
                    + ",mra.meter_reader_id"
                    + ",mra.meter_reader_no"
                    + ",ifnull(mra.meter_reader_name,'')"
                    + ",mra.customer_id"
                    + " from customers c  "
                    + " left join meter_reader_assignments mra "
                    + " on c.customer_no=mra.customer_no "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);

                String customer_no = rs.getString(2);
                String customer_name = rs.getString(3);
                String barangay = rs.getString(4);
                String barangay_id = rs.getString(5);
                String purok = rs.getString(6);
                String purok_id = rs.getString(7);
                String date_added = rs.getString(8);
                String date_updated = rs.getString(9);
                String added_by_id = rs.getString(10);
                String update_by_id = rs.getString(11);
                int status = rs.getInt(12);
                String occupancy_id = rs.getString(13);
                String occupancy = rs.getString(14);
                String occupancy_type_id = rs.getString(15);
                String occupancy_type = rs.getString(16);
                String occupancy_type_code = rs.getString(17);
                String city = rs.getString(18);
                String city_id = rs.getString(19);
                String sitio = rs.getString(20);
                String sitio_id = rs.getString(21);
                String meter_no = rs.getString(22);
                String pipe_size = rs.getString(23);

                String meter_reader_id = rs.getString(24);
                String meter_reader_no = rs.getString(25);
                String meter_reader_name = rs.getString(26);
                String customer_id = "" + id;

                occupancy = occupancy_type_code + " - " + occupancy_type;
                String meter_reader = meter_reader_name;
                String status1 = "";
                Rpt_meter_reader_assignments_status.field f = new field(customer_no, customer_name, meter_no, barangay, occupancy, pipe_size, meter_reader, status1);
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
