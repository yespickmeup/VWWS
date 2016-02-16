/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.occupancies;

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
public class Occupancies {

    public static class to_occupancies {

        public final int id;
        public final String occupancy;
        public final String occupancy_code;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final int status;

        public to_occupancies(int id, String occupancy, String occupancy_code, String date_added, String date_updated, String added_by_id, String update_by_id, int status) {
            this.id = id;
            this.occupancy = occupancy;
            this.occupancy_code = occupancy_code;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.status = status;
        }
    }

    public static void add_data(to_occupancies to_occupancies) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into occupancies("
                    + "occupancy"
                    + ",occupancy_code"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ")values("
                    + ":occupancy"
                    + ",:occupancy_code"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("occupancy", to_occupancies.occupancy)
                    .setString("occupancy_code", to_occupancies.occupancy_code)
                    .setString("date_added", to_occupancies.date_added)
                    .setString("date_updated", to_occupancies.date_updated)
                    .setString("added_by_id", to_occupancies.added_by_id)
                    .setString("update_by_id", to_occupancies.update_by_id)
                    .setNumber("status", to_occupancies.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Occupancies.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_occupancies to_occupancies) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update occupancies set "
                    + "occupancy= :occupancy "
                    + ",occupancy_code= :occupancy_code "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + ",status= :status "
                    + " where id='" + to_occupancies.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("occupancy", to_occupancies.occupancy)
                    .setString("occupancy_code", to_occupancies.occupancy_code)
                    .setString("date_added", to_occupancies.date_added)
                    .setString("date_updated", to_occupancies.date_updated)
                    .setString("added_by_id", to_occupancies.added_by_id)
                    .setString("update_by_id", to_occupancies.update_by_id)
                    .setNumber("status", to_occupancies.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Occupancies.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_occupancies to_occupancies) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from occupancies  "
                    + " where id='" + to_occupancies.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Occupancies.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_occupancies> ret_data(String where) {
        List<to_occupancies> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",occupancy"
                    + ",occupancy_code"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + " from occupancies"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String occupancy = rs.getString(2);
                String occupancy_code = rs.getString(3);
                String date_added = rs.getString(4);
                String date_updated = rs.getString(5);
                String added_by_id = rs.getString(6);
                String update_by_id = rs.getString(7);
                int status = rs.getInt(8);

                to_occupancies to = new to_occupancies(id, occupancy, occupancy_code, date_added, date_updated, added_by_id, update_by_id, status);
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
