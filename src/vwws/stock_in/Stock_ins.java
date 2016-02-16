/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.stock_in;

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
public class Stock_ins {

    public static class to_stock_ins {

        public final int id;
        public final String stock_in_no;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final String supplier_id;
        public final String supplier;
        public final String remarks;
        public final String date_delivered;
        public final String date_received;
        public final String reference_no;
        public final double gross_total;
        public final double discount_amount;
        public final double net_total;
        public final int status;

        public to_stock_ins(int id, String stock_in_no, String date_added, String date_updated, String added_by_id, String update_by_id, String supplier_id, String supplier, String remarks, String date_delivered, String date_received, String reference_no, double gross_total, double discount_amount, double net_total, int status) {
            this.id = id;
            this.stock_in_no = stock_in_no;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.supplier_id = supplier_id;
            this.supplier = supplier;
            this.remarks = remarks;
            this.date_delivered = date_delivered;
            this.date_received = date_received;
            this.reference_no = reference_no;
            this.gross_total = gross_total;
            this.discount_amount = discount_amount;
            this.net_total = net_total;
            this.status = status;
        }
    }

    public static void add_data(to_stock_ins to_stock_ins) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into stock_ins("
                    + "stock_in_no"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",supplier_id"
                    + ",supplier"
                    + ",remarks"
                    + ",date_delivered"
                    + ",date_received"
                    + ",reference_no"
                    + ",gross_total"
                    + ",discount_amount"
                    + ",net_total"
                    + ",status"
                    + ")values("
                    + ":stock_in_no"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ",:supplier_id"
                    + ",:supplier"
                    + ",:remarks"
                    + ",:date_delivered"
                    + ",:date_received"
                    + ",:reference_no"
                    + ",:gross_total"
                    + ",:discount_amount"
                    + ",:net_total"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("stock_in_no", to_stock_ins.stock_in_no)
                    .setString("date_added", to_stock_ins.date_added)
                    .setString("date_updated", to_stock_ins.date_updated)
                    .setString("added_by_id", to_stock_ins.added_by_id)
                    .setString("update_by_id", to_stock_ins.update_by_id)
                    .setString("supplier_id", to_stock_ins.supplier_id)
                    .setString("supplier", to_stock_ins.supplier)
                    .setString("remarks", to_stock_ins.remarks)
                    .setString("date_delivered", to_stock_ins.date_delivered)
                    .setString("date_received", to_stock_ins.date_received)
                    .setString("reference_no", to_stock_ins.reference_no)
                    .setNumber("gross_total", to_stock_ins.gross_total)
                    .setNumber("discount_amount", to_stock_ins.discount_amount)
                    .setNumber("net_total", to_stock_ins.net_total)
                    .setNumber("status", to_stock_ins.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Stock_ins.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_stock_ins to_stock_ins) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update stock_ins set "
                    + "stock_in_no= :stock_in_no "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + ",supplier_id= :supplier_id "
                    + ",supplier= :supplier "
                    + ",remarks= :remarks "
                    + ",date_delivered= :date_delivered "
                    + ",date_received= :date_received "
                    + ",reference_no= :reference_no "
                    + ",gross_total= :gross_total "
                    + ",discount_amount= :discount_amount "
                    + ",net_total= :net_total "
                    + ",status= :status "
                    + " where id='" + to_stock_ins.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("stock_in_no", to_stock_ins.stock_in_no)
                    .setString("date_added", to_stock_ins.date_added)
                    .setString("date_updated", to_stock_ins.date_updated)
                    .setString("added_by_id", to_stock_ins.added_by_id)
                    .setString("update_by_id", to_stock_ins.update_by_id)
                    .setString("supplier_id", to_stock_ins.supplier_id)
                    .setString("supplier", to_stock_ins.supplier)
                    .setString("remarks", to_stock_ins.remarks)
                    .setString("date_delivered", to_stock_ins.date_delivered)
                    .setString("date_received", to_stock_ins.date_received)
                    .setString("reference_no", to_stock_ins.reference_no)
                    .setNumber("gross_total", to_stock_ins.gross_total)
                    .setNumber("discount_amount", to_stock_ins.discount_amount)
                    .setNumber("net_total", to_stock_ins.net_total)
                    .setNumber("status", to_stock_ins.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Stock_ins.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_stock_ins to_stock_ins) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from stock_ins  "
                    + " where id='" + to_stock_ins.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Stock_ins.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_stock_ins> ret_data(String where) {
        List<to_stock_ins> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",stock_in_no"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",supplier_id"
                    + ",supplier"
                    + ",remarks"
                    + ",date_delivered"
                    + ",date_received"
                    + ",reference_no"
                    + ",gross_total"
                    + ",discount_amount"
                    + ",net_total"
                    + ",status"
                    + " from stock_ins"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String stock_in_no = rs.getString(2);
                String date_added = rs.getString(3);
                String date_updated = rs.getString(4);
                String added_by_id = rs.getString(5);
                String update_by_id = rs.getString(6);
                String supplier_id = rs.getString(7);
                String supplier = rs.getString(8);
                String remarks = rs.getString(9);
                String date_delivered = rs.getString(10);
                String date_received = rs.getString(11);
                String reference_no = rs.getString(12);
                double gross_total = rs.getDouble(13);
                double discount_amount = rs.getDouble(14);
                double net_total = rs.getDouble(15);
                int status = rs.getInt(16);

                to_stock_ins to = new to_stock_ins(id, stock_in_no, date_added, date_updated, added_by_id, update_by_id, supplier_id, supplier, remarks, date_delivered, date_received, reference_no, gross_total, discount_amount, net_total, status);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String increment_id() {
        String id = "0000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from stock_ins";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select stock_in_no from stock_ins where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "0000000";
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
