/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.banks;

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
public class Banks {

    public static class to_banks {

        public final int id;
        public final String bank;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;

        public to_banks(int id, String bank, String date_added, String date_updated, String added_by_id, String update_by_id) {
            this.id = id;
            this.bank = bank;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
        }
    }

    public static void add_data(to_banks to_banks) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into banks("
                    + "bank"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ")values("
                    + ":bank"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("bank", to_banks.bank)
                    .setString("date_added", to_banks.date_added)
                    .setString("date_updated", to_banks.date_updated)
                    .setString("added_by_id", to_banks.added_by_id)
                    .setString("update_by_id", to_banks.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Banks.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_banks to_banks) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update banks set "
                    + "bank= :bank "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + " where id='" + to_banks.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("bank", to_banks.bank)
                    .setString("date_added", to_banks.date_added)
                    .setString("date_updated", to_banks.date_updated)
                    .setString("added_by_id", to_banks.added_by_id)
                    .setString("update_by_id", to_banks.update_by_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Banks.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_banks to_banks) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from banks  "
                    + " where id='" + to_banks.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Banks.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_banks> ret_data(String where) {
        List<to_banks> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",bank"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + " from banks"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String bank = rs.getString(2);
                String date_added = rs.getString(3);
                String date_updated = rs.getString(4);
                String added_by_id = rs.getString(5);
                String update_by_id = rs.getString(6);

                to_banks to = new to_banks(id, bank, date_added, date_updated, added_by_id, update_by_id);
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
