/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.applications;

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
 * @author Ronescape
 */
public class Applications_requirements {

    public static class to_applications_requirements {

        public final int id;
        public final String requirement_type;
        public final String requirement;

        public to_applications_requirements(int id, String requirement_type, String requirement) {
            this.id = id;
            this.requirement_type = requirement_type;
            this.requirement = requirement;
        }
    }

    public static void add_data(to_applications_requirements to_applications_requirements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into applications_requirements("
                    + "requirement_type"
                    + ",requirement"
                    + ")values("
                    + ":requirement_type"
                    + ",:requirement"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("requirement_type", to_applications_requirements.requirement_type)
                    .setString("requirement", to_applications_requirements.requirement)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Applications_requirements.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_applications_requirements to_applications_requirements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update applications_requirements set "
                    + "requirement_type= :requirement_type"
                    + ",requirement= :requirement "
                    + " where id='" + to_applications_requirements.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("requirement_type", to_applications_requirements.requirement_type)
                    .setString("requirement", to_applications_requirements.requirement)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Applications_requirements.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_applications_requirements to_applications_requirements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from applications_requirements  "
                    + " where id='" + to_applications_requirements.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Applications_requirements.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_applications_requirements> ret_data(String where) {
        List<to_applications_requirements> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",requirement_type"
                    + ",requirement"
                    + " from applications_requirements"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String requirement_type = rs.getString(2);
                String requirement = rs.getString(3);

                to_applications_requirements to = new to_applications_requirements(id, requirement_type, requirement);
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
