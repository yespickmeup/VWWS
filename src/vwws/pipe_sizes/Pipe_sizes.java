/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.pipe_sizes;

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
public class Pipe_sizes {

    public static class to_pipe_sizes {

        public final int id;
        public final String pipe_size;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final int status;

        public to_pipe_sizes(int id, String pipe_size, String date_added, String date_updated, String added_by_id, String update_by_id, int status) {
            this.id = id;
            this.pipe_size = pipe_size;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.status = status;
        }
    }

    public static void add_data(to_pipe_sizes to_pipe_sizes) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into pipe_sizes("
                    + "pipe_size"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + ")values("
                    + ":pipe_size"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("pipe_size", to_pipe_sizes.pipe_size)
                    .setString("date_added", to_pipe_sizes.date_added)
                    .setString("date_updated", to_pipe_sizes.date_updated)
                    .setString("added_by_id", to_pipe_sizes.added_by_id)
                    .setString("update_by_id", to_pipe_sizes.update_by_id)
                    .setNumber("status", to_pipe_sizes.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Pipe_sizes.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_pipe_sizes to_pipe_sizes) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update pipe_sizes set "
                    + "pipe_size= :pipe_size "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + ",status= :status "
                    + " where id='" + to_pipe_sizes.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("pipe_size", to_pipe_sizes.pipe_size)
                    .setString("date_added", to_pipe_sizes.date_added)
                    .setString("date_updated", to_pipe_sizes.date_updated)
                    .setString("added_by_id", to_pipe_sizes.added_by_id)
                    .setString("update_by_id", to_pipe_sizes.update_by_id)
                    .setNumber("status", to_pipe_sizes.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Pipe_sizes.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_pipe_sizes to_pipe_sizes) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from pipe_sizes  "
                    + " where id='" + to_pipe_sizes.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Pipe_sizes.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_pipe_sizes> ret_data(String where) {
        List<to_pipe_sizes> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",pipe_size"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",status"
                    + " from pipe_sizes"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String pipe_size = rs.getString(2);
                String date_added = rs.getString(3);
                String date_updated = rs.getString(4);
                String added_by_id = rs.getString(5);
                String update_by_id = rs.getString(6);
                int status = rs.getInt(7);

                to_pipe_sizes to = new to_pipe_sizes(id, pipe_size, date_added, date_updated, added_by_id, update_by_id, status);
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
