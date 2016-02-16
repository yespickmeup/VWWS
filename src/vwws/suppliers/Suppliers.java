/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.suppliers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import vwws.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Suppliers {

    public static class to_suppliers {

        public final int id;
        public final String supplier;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;

        public to_suppliers(int id, String supplier, String date_added, String date_updated, String added_by_id, String update_by_id) {
            this.id = id;
            this.supplier = supplier;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
        }
    }

    public static void add_data(to_suppliers to_suppliers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into suppliers("
                    + "supplier"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ")values("
                    + ":supplier"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("supplier", to_suppliers.supplier)
                    .setString("date_added", to_suppliers.date_added)
                    .setString("date_updated", to_suppliers.date_updated)
                    .setString("added_by_id", to_suppliers.added_by_id)
                    .setString("update_by_id", to_suppliers.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Suppliers.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_suppliers to_suppliers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update suppliers set "
                    + "supplier= :supplier "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + " where id='" + to_suppliers.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("supplier", to_suppliers.supplier)
                    .setString("date_added", to_suppliers.date_added)
                    .setString("date_updated", to_suppliers.date_updated)
                    .setString("added_by_id", to_suppliers.added_by_id)
                    .setString("update_by_id", to_suppliers.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Suppliers.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_suppliers to_suppliers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from suppliers  "
                    + " where id='" + to_suppliers.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Suppliers.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_suppliers> ret_data(String where) {
        List<to_suppliers> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",supplier"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + " from suppliers"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String supplier = rs.getString(2);
                String date_added = rs.getString(3);
                String date_updated = rs.getString(4);
                String added_by_id = rs.getString(5);
                String update_by_id = rs.getString(6);

                to_suppliers to = new to_suppliers(id, supplier, date_added, date_updated, added_by_id, update_by_id);
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
