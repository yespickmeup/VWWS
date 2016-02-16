/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.stock_out;

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
public class Stock_outs {

    public static class to_stock_outs {

        public final int id;
        public final String stock_out_no;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final String remarks;
        public final String reference_no;
        public final double gross_total;
        public final double discount_amount;
        public final double net_total;
        public final int status;

        public to_stock_outs(int id, String stock_out_no, String date_added, String date_updated, String added_by_id, String update_by_id, String remarks, String reference_no, double gross_total, double discount_amount, double net_total, int status) {
            this.id = id;
            this.stock_out_no = stock_out_no;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.remarks = remarks;
            this.reference_no = reference_no;
            this.gross_total = gross_total;
            this.discount_amount = discount_amount;
            this.net_total = net_total;
            this.status = status;
        }
    }

    public static void add_data(to_stock_outs to_stock_outs) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into stock_outs("
                    + "stock_out_no"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",remarks"
                    + ",reference_no"
                    + ",gross_total"
                    + ",discount_amount"
                    + ",net_total"
                    + ",status"
                    + ")values("
                    + ":stock_out_no"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ",:remarks"
                    + ",:reference_no"
                    + ",:gross_total"
                    + ",:discount_amount"
                    + ",:net_total"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("stock_out_no", to_stock_outs.stock_out_no)
                    .setString("date_added", to_stock_outs.date_added)
                    .setString("date_updated", to_stock_outs.date_updated)
                    .setString("added_by_id", to_stock_outs.added_by_id)
                    .setString("update_by_id", to_stock_outs.update_by_id)
                    .setString("remarks", to_stock_outs.remarks)
                    .setString("reference_no", to_stock_outs.reference_no)
                    .setNumber("gross_total", to_stock_outs.gross_total)
                    .setNumber("discount_amount", to_stock_outs.discount_amount)
                    .setNumber("net_total", to_stock_outs.net_total)
                    .setNumber("status", to_stock_outs.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Stock_outs.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_stock_outs to_stock_outs) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update stock_outs set "
                    + "stock_out_no= :stock_out_no "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + ",remarks= :remarks "
                    + ",reference_no= :reference_no "
                    + ",gross_total= :gross_total "
                    + ",discount_amount= :discount_amount "
                    + ",net_total= :net_total "
                    + ",status= :status "
                    + " where id='" + to_stock_outs.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("stock_out_no", to_stock_outs.stock_out_no)
                    .setString("date_added", to_stock_outs.date_added)
                    .setString("date_updated", to_stock_outs.date_updated)
                    .setString("added_by_id", to_stock_outs.added_by_id)
                    .setString("update_by_id", to_stock_outs.update_by_id)
                    .setString("remarks", to_stock_outs.remarks)
                    .setString("reference_no", to_stock_outs.reference_no)
                    .setNumber("gross_total", to_stock_outs.gross_total)
                    .setNumber("discount_amount", to_stock_outs.discount_amount)
                    .setNumber("net_total", to_stock_outs.net_total)
                    .setNumber("status", to_stock_outs.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Stock_outs.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_stock_outs to_stock_outs) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from stock_outs  "
                    + " where id='" + to_stock_outs.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Stock_outs.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_stock_outs> ret_data(String where) {
        List<to_stock_outs> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",stock_out_no"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",remarks"
                    + ",reference_no"
                    + ",gross_total"
                    + ",discount_amount"
                    + ",net_total"
                    + ",status"
                    + " from stock_outs"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String stock_out_no = rs.getString(2);
                String date_added = rs.getString(3);
                String date_updated = rs.getString(4);
                String added_by_id = rs.getString(5);
                String update_by_id = rs.getString(6);
                String remarks = rs.getString(7);
                String reference_no = rs.getString(8);
                double gross_total = rs.getDouble(9);
                double discount_amount = rs.getDouble(10);
                double net_total = rs.getDouble(11);
                int status = rs.getInt(12);

                to_stock_outs to = new to_stock_outs(id, stock_out_no, date_added, date_updated, added_by_id, update_by_id, remarks, reference_no, gross_total, discount_amount, net_total, status);
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
        String id = "00000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from stock_outs";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select stock_out_no from stock_outs where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "00000000";
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
