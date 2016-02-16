/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.cities;

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
public class Cities {

    public static class to_cities {

        public final int id;
        public final String city;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final int no_of_barangays;

        public to_cities(int id, String city, String date_added, String date_updated, String added_by_id, String update_by_id, int no_of_barangays) {
            this.id = id;
            this.city = city;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.no_of_barangays = no_of_barangays;
        }
    }

    public static void add_data(to_cities to_cities) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into cities("
                    + "city"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ")values("
                    + ":city"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("city", to_cities.city)
                    .setString("date_added", to_cities.date_added)
                    .setString("date_updated", to_cities.date_updated)
                    .setString("added_by_id", to_cities.added_by_id)
                    .setString("update_by_id", to_cities.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Cities.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_cities to_cities) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update cities set "
                    + "city= :city "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + " where id='" + to_cities.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("city", to_cities.city)
                    .setString("date_added", to_cities.date_added)
                    .setString("date_updated", to_cities.date_updated)
                    .setString("added_by_id", to_cities.added_by_id)
                    .setString("update_by_id", to_cities.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Cities.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_cities to_cities) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from cities  "
                    + " where id='" + to_cities.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Cities.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_cities> ret_data(String where) {
        List<to_cities> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "c.id"
                    + ",c.city"
                    + ",c.date_added"
                    + ",c.date_updated"
                    + ",c.added_by_id"
                    + ",c.update_by_id"
                    + ",(select count(b.id) from barangays b where b.city_id=c.id) "
                    + " from cities c"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String city = rs.getString(2);
                String date_added = rs.getString(3);
                String date_updated = rs.getString(4);
                String added_by_id = rs.getString(5);
                String update_by_id = rs.getString(6);
                int no_of_barangays = rs.getInt(7);

                to_cities to = new to_cities(id, city, date_added, date_updated, added_by_id, update_by_id, no_of_barangays);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_cities> ret_data2(String where) {
        List<to_cities> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "c.id"
                    + ",c.city"
                    + ",c.date_added"
                    + ",c.date_updated"
                    + ",c.added_by_id"
                    + ",c.update_by_id"
                    + " from cities c"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String city = rs.getString(2);
                String date_added = rs.getString(3);
                String date_updated = rs.getString(4);
                String added_by_id = rs.getString(5);
                String update_by_id = rs.getString(6);

                to_cities to = new to_cities(id, city, date_added, date_updated, added_by_id, update_by_id, 0);
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
