/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.barangays;

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
public class Barangays {

    public static class to_barangays {

        public final int id;
        public final String city_id;
        public final String city;
        public final String barangay;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;

        public to_barangays(int id, String city_id, String city, String barangay, String date_added, String date_updated, String added_by_id, String update_by_id) {
            this.id = id;
            this.city_id = city_id;
            this.city = city;
            this.barangay = barangay;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
        }
    }

    public static void add_data(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into barangays("
                    + "city_id"
                    + ",city"
                    + ",barangay"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ")values("
                    + ":city_id"
                    + ",:city"
                    + ",:barangay"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("city_id", to_barangays.city_id)
                    .setString("city", to_barangays.city)
                    .setString("barangay", to_barangays.barangay)
                    .setString("date_added", to_barangays.date_added)
                    .setString("date_updated", to_barangays.date_updated)
                    .setString("added_by_id", to_barangays.added_by_id)
                    .setString("update_by_id", to_barangays.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangays.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update barangays set "
                    + "city_id= :city_id "
                    + ",city= :city "
                    + ",barangay= :barangay "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + " where id='" + to_barangays.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("city_id", to_barangays.city_id)
                    .setString("city", to_barangays.city)
                    .setString("barangay", to_barangays.barangay)
                    .setString("date_added", to_barangays.date_added)
                    .setString("date_updated", to_barangays.date_updated)
                    .setString("added_by_id", to_barangays.added_by_id)
                    .setString("update_by_id", to_barangays.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangays.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from barangays  "
                    + " where id='" + to_barangays.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangays.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_barangays> ret_data(String where) {
        List<to_barangays> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",city_id"
                    + ",city"
                    + ",barangay"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + " from barangays"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String city_id = rs.getString(2);
                String city = rs.getString(3);
                String barangay = rs.getString(4);
                String date_added = rs.getString(5);
                String date_updated = rs.getString(6);
                String added_by_id = rs.getString(7);
                String update_by_id = rs.getString(8);

                to_barangays to = new to_barangays(id, city_id, city, barangay, date_added, date_updated, added_by_id, update_by_id);
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
