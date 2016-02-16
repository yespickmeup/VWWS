/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.inventory;

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
public class Inventory {

    public static class to_inventory {

        public final int id;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final String item_code;
        public final String barcode;
        public final String description;
        public final String category_id;
        public final String category;
        public final String classification_id;
        public final String classification;
        public final String sub_classification_id;
        public final String sub_classification;
        public final String brand_id;
        public final String brand;
        public final String model_id;
        public final String model;
        public final double product_qty;
        public final String unit;
        public final double conversion;
        public final double cost;
        public final double selling_price;
        public final String item_type;
        public final String supplier_id;
        public final String supplier;
        public final int status;
        public final String branch_id;
        public final String branch;
        public final String location_id;
        public final String location;

        public to_inventory(int id, String date_added, String date_updated, String added_by_id, String update_by_id, String item_code, String barcode, String description, String category_id, String category, String classification_id, String classification, String sub_classification_id, String sub_classification, String brand_id, String brand, String model_id, String model, double product_qty, String unit, double conversion, double cost, double selling_price, String item_type, String supplier_id, String supplier, int status, String branch_id, String branch, String location_id, String location) {
            this.id = id;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.item_code = item_code;
            this.barcode = barcode;
            this.description = description;
            this.category_id = category_id;
            this.category = category;
            this.classification_id = classification_id;
            this.classification = classification;
            this.sub_classification_id = sub_classification_id;
            this.sub_classification = sub_classification;
            this.brand_id = brand_id;
            this.brand = brand;
            this.model_id = model_id;
            this.model = model;
            this.product_qty = product_qty;
            this.unit = unit;
            this.conversion = conversion;
            this.cost = cost;
            this.selling_price = selling_price;
            this.item_type = item_type;
            this.supplier_id = supplier_id;
            this.supplier = supplier;
            this.status = status;
            this.branch_id = branch_id;
            this.branch = branch;
            this.location_id = location_id;
            this.location = location;
        }
    }

    public static void add_data(to_inventory to_inventory) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into inventory("
                    + "date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",item_code"
                    + ",barcode"
                    + ",description"
                    + ",category_id"
                    + ",category"
                    + ",classification_id"
                    + ",classification"
                    + ",sub_classification_id"
                    + ",sub_classification"
                    + ",brand_id"
                    + ",brand"
                    + ",model_id"
                    + ",model"
                    + ",product_qty"
                    + ",unit"
                    + ",conversion"
                    + ",cost"
                    + ",selling_price"
                    + ",item_type"
                    + ",supplier_id"
                    + ",supplier"
                    + ",status"
                    + ",branch_id"
                    + ",branch"
                    + ",location_id"
                    + ",location"
                    + ")values("
                    + ":date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ",:item_code"
                    + ",:barcode"
                    + ",:description"
                    + ",:category_id"
                    + ",:category"
                    + ",:classification_id"
                    + ",:classification"
                    + ",:sub_classification_id"
                    + ",:sub_classification"
                    + ",:brand_id"
                    + ",:brand"
                    + ",:model_id"
                    + ",:model"
                    + ",:product_qty"
                    + ",:unit"
                    + ",:conversion"
                    + ",:cost"
                    + ",:selling_price"
                    + ",:item_type"
                    + ",:supplier_id"
                    + ",:supplier"
                    + ",:status"
                    + ",:branch_id"
                    + ",:branch"
                    + ",:location_id"
                    + ",:location"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("date_added", to_inventory.date_added)
                    .setString("date_updated", to_inventory.date_updated)
                    .setString("added_by_id", to_inventory.added_by_id)
                    .setString("update_by_id", to_inventory.update_by_id)
                    .setString("item_code", to_inventory.item_code)
                    .setString("barcode", to_inventory.barcode)
                    .setString("description", to_inventory.description)
                    .setString("category_id", to_inventory.category_id)
                    .setString("category", to_inventory.category)
                    .setString("classification_id", to_inventory.classification_id)
                    .setString("classification", to_inventory.classification_id)
                    .setString("sub_classification_id", to_inventory.sub_classification_id)
                    .setString("sub_classification", to_inventory.sub_classification)
                    .setString("brand_id", to_inventory.brand_id)
                    .setString("brand", to_inventory.brand)
                    .setString("model_id", to_inventory.model_id)
                    .setString("model", to_inventory.model)
                    .setNumber("product_qty", to_inventory.product_qty)
                    .setString("unit", to_inventory.unit)
                    .setNumber("conversion", to_inventory.conversion)
                    .setNumber("cost", to_inventory.cost)
                    .setNumber("selling_price", to_inventory.selling_price)
                    .setString("item_type", to_inventory.item_type)
                    .setString("supplier_id", to_inventory.supplier_id)
                    .setString("supplier", to_inventory.supplier)
                    .setNumber("status", to_inventory.status)
                    .setString("branch_id", to_inventory.branch_id)
                    .setString("branch", to_inventory.branch)
                    .setString("location_id", to_inventory.location_id)
                    .setString("location", to_inventory.location)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Inventory.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_inventory to_inventory) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update inventory set "
                    + "date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + ",item_code= :item_code "
                    + ",barcode= :barcode "
                    + ",description= :description "
                    + ",category_id= :category_id "
                    + ",category= :category "
                    + ",classification_id= :classification_id "
                    + ",classification= :classification "
                    + ",sub_classification_id= :sub_classification_id "
                    + ",sub_classification= :sub_classification "
                    + ",brand_id= :brand_id "
                    + ",brand= :brand "
                    + ",model_id= :model_id "
                    + ",model= :model "
                    + ",product_qty= :product_qty "
                    + ",unit= :unit "
                    + ",conversion= :conversion "
                    + ",cost= :cost "
                    + ",selling_price= :selling_price "
                    + ",item_type= :item_type "
                    + ",supplier_id= :supplier_id "
                    + ",supplier= :supplier "
                    + ",status= :status "
                    + ",branch_id= :branch_id "
                    + ",branch= :branch "
                    + ",location_id= :location_id "
                    + ",location= :location "
                    + " where id='" + to_inventory.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("date_added", to_inventory.date_added)
                    .setString("date_updated", to_inventory.date_updated)
                    .setString("added_by_id", to_inventory.added_by_id)
                    .setString("update_by_id", to_inventory.update_by_id)
                    .setString("item_code", to_inventory.item_code)
                    .setString("barcode", to_inventory.barcode)
                    .setString("description", to_inventory.description)
                    .setString("category_id", to_inventory.category_id)
                    .setString("category", to_inventory.category)
                    .setString("classification_id", to_inventory.classification_id)
                    .setString("classification", to_inventory.classification_id)
                    .setString("sub_classification_id", to_inventory.sub_classification_id)
                    .setString("sub_classification", to_inventory.sub_classification)
                    .setString("brand_id", to_inventory.brand_id)
                    .setString("brand", to_inventory.brand)
                    .setString("model_id", to_inventory.model_id)
                    .setString("model", to_inventory.model)
                    .setNumber("product_qty", to_inventory.product_qty)
                    .setString("unit", to_inventory.unit)
                    .setNumber("conversion", to_inventory.conversion)
                    .setNumber("cost", to_inventory.cost)
                    .setNumber("selling_price", to_inventory.selling_price)
                    .setString("item_type", to_inventory.item_type)
                    .setString("supplier_id", to_inventory.supplier_id)
                    .setString("supplier", to_inventory.supplier)
                    .setNumber("status", to_inventory.status)
                    .setString("branch_id", to_inventory.branch_id)
                    .setString("branch", to_inventory.branch)
                    .setString("location_id", to_inventory.location_id)
                    .setString("location", to_inventory.location)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Inventory.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_inventory to_inventory) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from inventory  "
                    + " where id='" + to_inventory.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Inventory.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_inventory> ret_data(String where) {
        List<to_inventory> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",item_code"
                    + ",barcode"
                    + ",description"
                    + ",category_id"
                    + ",category"
                    + ",classification_id"
                    + ",classification"
                    + ",sub_classification_id"
                    + ",sub_classification"
                    + ",brand_id"
                    + ",brand"
                    + ",model_id"
                    + ",model"
                    + ",product_qty"
                    + ",unit"
                    + ",conversion"
                    + ",cost"
                    + ",selling_price"
                    + ",item_type"
                    + ",supplier_id"
                    + ",supplier"
                    + ",status"
                    + ",branch_id"
                    + ",branch"
                    + ",location_id"
                    + ",location"
                    + " from inventory"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String date_added = rs.getString(2);
                String date_updated = rs.getString(3);
                String added_by_id = rs.getString(4);
                String update_by_id = rs.getString(5);
                String item_code = rs.getString(6);
                String barcode = rs.getString(7);
                String description = rs.getString(8);
                String category_id = rs.getString(9);
                String category = rs.getString(10);
                String classification_id = rs.getString(11);
                String classification = rs.getString(12);
                String sub_classification_id = rs.getString(13);
                String sub_classification = rs.getString(14);
                String brand_id = rs.getString(15);
                String brand = rs.getString(16);
                String model_id = rs.getString(17);
                String model = rs.getString(18);
                double product_qty = rs.getDouble(19);
                String unit = rs.getString(20);
                double conversion = rs.getDouble(21);
                double cost = rs.getDouble(22);
                double selling_price = rs.getDouble(23);
                String item_type = rs.getString(24);
                String supplier_id = rs.getString(25);
                String supplier = rs.getString(26);
                int status = rs.getInt(27);
                String branch_id = rs.getString(28);
                String branch = rs.getString(29);
                String location_id = rs.getString(30);
                String location = rs.getString(31);

                to_inventory to = new to_inventory(id, date_added, date_updated, added_by_id, update_by_id, item_code, barcode, description, category_id, category, classification_id, classification, sub_classification_id, sub_classification, brand_id, brand, model_id, model, product_qty, unit, conversion, cost, selling_price, item_type, supplier_id, supplier, status, branch_id, branch, location_id, location);
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
        String id = "00000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from inventory";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select item_code from inventory where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "00000";
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
