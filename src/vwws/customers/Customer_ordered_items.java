/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.customers;

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
public class Customer_ordered_items {

    public static class to_customer_ordered_items {

        public final int id;
        public final String customer_no;
        public final String customer_name;
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
        public final double discount_amount;
        public final String item_type;
        public final String supplier_id;
        public final String supplier;
        public final String branch_id;
        public final String branch;
        public final String location_id;
        public final String location;
        public final int status;

        public to_customer_ordered_items(int id, String customer_no, String customer_name, String date_added, String date_updated, String added_by_id, String update_by_id, String item_code, String barcode, String description, String category_id, String category, String classification_id, String sub_classification_id, String sub_classification, String brand_id, String brand, String model_id, String model, double product_qty, String unit, double conversion, double cost, double selling_price, double discount_amount, String item_type, String supplier_id, String supplier, String branch_id, String branch, String location_id, String location, int status) {
            this.id = id;
            this.customer_no = customer_no;
            this.customer_name = customer_name;
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
            this.discount_amount = discount_amount;
            this.item_type = item_type;
            this.supplier_id = supplier_id;
            this.supplier = supplier;
            this.branch_id = branch_id;
            this.branch = branch;
            this.location_id = location_id;
            this.location = location;
            this.status = status;
        }
    }

    public static void add_data(List<to_customer_ordered_items> to_customer_ordered_items1, String customer_no, String customer_name) {
        try {
            Connection conn = MyConnection.connect();
            for (to_customer_ordered_items to_customer_ordered_items : to_customer_ordered_items1) {
                String s0 = "insert into customer_ordered_items("
                        + "customer_no"
                        + ",customer_name"
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
                        + ",discount_amount"
                        + ",item_type"
                        + ",supplier_id"
                        + ",supplier"
                        + ",branch_id"
                        + ",branch"
                        + ",location_id"
                        + ",location"
                        + ",status"
                        + ")values("
                        + ":customer_no"
                        + ",:customer_name"
                        + ",:date_added"
                        + ",:date_updated"
                        + ",:added_by_id"
                        + ",:update_by_id"
                        + ",:item_code"
                        + ",:barcode"
                        + ",:description"
                        + ",:category_id"
                        + ",:category"
                        + ",:classification_id"
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
                        + ",:discount_amount"
                        + ",:item_type"
                        + ",:supplier_id"
                        + ",:supplier"
                        + ",:branch_id"
                        + ",:branch"
                        + ",:location_id"
                        + ",:location"
                        + ",:status"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("customer_no", customer_no)
                        .setString("customer_name", customer_name)
                        .setString("date_added", to_customer_ordered_items.date_added)
                        .setString("date_updated", to_customer_ordered_items.date_updated)
                        .setString("added_by_id", to_customer_ordered_items.added_by_id)
                        .setString("update_by_id", to_customer_ordered_items.update_by_id)
                        .setString("item_code", to_customer_ordered_items.item_code)
                        .setString("barcode", to_customer_ordered_items.barcode)
                        .setString("description", to_customer_ordered_items.description)
                        .setString("category_id", to_customer_ordered_items.category_id)
                        .setString("category", to_customer_ordered_items.category)
                        .setString("classification_id", to_customer_ordered_items.classification_id)
                        .setString("sub_classification_id", to_customer_ordered_items.sub_classification_id)
                        .setString("sub_classification", to_customer_ordered_items.sub_classification)
                        .setString("brand_id", to_customer_ordered_items.brand_id)
                        .setString("brand", to_customer_ordered_items.brand)
                        .setString("model_id", to_customer_ordered_items.model_id)
                        .setString("model", to_customer_ordered_items.model)
                        .setNumber("product_qty", to_customer_ordered_items.product_qty)
                        .setString("unit", to_customer_ordered_items.unit)
                        .setNumber("conversion", to_customer_ordered_items.conversion)
                        .setNumber("cost", to_customer_ordered_items.cost)
                        .setNumber("selling_price", to_customer_ordered_items.selling_price)
                        .setNumber("discount_amount", to_customer_ordered_items.discount_amount)
                        .setString("item_type", to_customer_ordered_items.item_type)
                        .setString("supplier_id", to_customer_ordered_items.supplier_id)
                        .setString("supplier", to_customer_ordered_items.supplier)
                        .setString("branch_id", to_customer_ordered_items.branch_id)
                        .setString("branch", to_customer_ordered_items.branch)
                        .setString("location_id", to_customer_ordered_items.location_id)
                        .setString("location", to_customer_ordered_items.location)
                        .setNumber("status", to_customer_ordered_items.status)
                        .ok();
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(Customer_ordered_items.class, "Successfully Added");

                String where3 = " where item_code='" + to_customer_ordered_items.item_code + "' ";
                String s3 = "select "
                        + " product_qty"
                        + " from inventory"
                        + " " + where3;

                Statement stmt3 = conn.createStatement();
                ResultSet rs3 = stmt3.executeQuery(s3);
                double prev_qty = 0;
                while (rs3.next()) {
                    prev_qty = rs3.getDouble(1);
                }

                double new_qty = prev_qty - to_customer_ordered_items.product_qty;
                System.out.println("New Qty: "+new_qty);
                String s4 = "update inventory set "
                        + "product_qty= :product_qty "
                        + " where item_code='" + to_customer_ordered_items.item_code + "' "
                        + " ";

                s4 = SqlStringUtil.parse(s4)
                        .setNumber("product_qty", new_qty)
                        .ok();
                PreparedStatement stmt4 = conn.prepareStatement(s4);
                stmt4.execute();

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_customer_ordered_items to_customer_ordered_items) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update customer_ordered_items set "
                    + "customer_no= :customer_no "
                    + ",customer_name= :customer_name "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + ",item_code= :item_code "
                    + ",barcode= :barcode "
                    + ",description= :description "
                    + ",category_id= :category_id "
                    + ",category= :category "
                    + ",classification_id= :classification_id "
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
                    + ",discount_amount= :discount_amount "
                    + ",item_type= :item_type "
                    + ",supplier_id= :supplier_id "
                    + ",supplier= :supplier "
                    + ",branch_id= :branch_id "
                    + ",branch= :branch "
                    + ",location_id= :location_id "
                    + ",location= :location "
                    + ",status= :status "
                    + " where id='" + to_customer_ordered_items.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("customer_no", to_customer_ordered_items.customer_no)
                    .setString("customer_name", to_customer_ordered_items.customer_name)
                    .setString("date_added", to_customer_ordered_items.date_added)
                    .setString("date_updated", to_customer_ordered_items.date_updated)
                    .setString("added_by_id", to_customer_ordered_items.added_by_id)
                    .setString("update_by_id", to_customer_ordered_items.update_by_id)
                    .setString("item_code", to_customer_ordered_items.item_code)
                    .setString("barcode", to_customer_ordered_items.barcode)
                    .setString("description", to_customer_ordered_items.description)
                    .setString("category_id", to_customer_ordered_items.category_id)
                    .setString("category", to_customer_ordered_items.category)
                    .setString("classification_id", to_customer_ordered_items.classification_id)
                    .setString("sub_classification_id", to_customer_ordered_items.sub_classification_id)
                    .setString("sub_classification", to_customer_ordered_items.sub_classification)
                    .setString("brand_id", to_customer_ordered_items.brand_id)
                    .setString("brand", to_customer_ordered_items.brand)
                    .setString("model_id", to_customer_ordered_items.model_id)
                    .setString("model", to_customer_ordered_items.model)
                    .setNumber("product_qty", to_customer_ordered_items.product_qty)
                    .setString("unit", to_customer_ordered_items.unit)
                    .setNumber("conversion", to_customer_ordered_items.conversion)
                    .setNumber("cost", to_customer_ordered_items.cost)
                    .setNumber("selling_price", to_customer_ordered_items.selling_price)
                    .setNumber("discount_amount", to_customer_ordered_items.discount_amount)
                    .setString("item_type", to_customer_ordered_items.item_type)
                    .setString("supplier_id", to_customer_ordered_items.supplier_id)
                    .setString("supplier", to_customer_ordered_items.supplier)
                    .setString("branch_id", to_customer_ordered_items.branch_id)
                    .setString("branch", to_customer_ordered_items.branch)
                    .setString("location_id", to_customer_ordered_items.location_id)
                    .setString("location", to_customer_ordered_items.location)
                    .setNumber("status", to_customer_ordered_items.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Customer_ordered_items.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_customer_ordered_items to_customer_ordered_items) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from customer_ordered_items  "
                    + " where id='" + to_customer_ordered_items.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Customer_ordered_items.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_customer_ordered_items> ret_data(String where) {
        List<to_customer_ordered_items> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",customer_no"
                    + ",customer_name"
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
                    + ",discount_amount"
                    + ",item_type"
                    + ",supplier_id"
                    + ",supplier"
                    + ",branch_id"
                    + ",branch"
                    + ",location_id"
                    + ",location"
                    + ",status"
                    + " from customer_ordered_items"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String customer_no = rs.getString(2);
                String customer_name = rs.getString(3);
                String date_added = rs.getString(4);
                String date_updated = rs.getString(5);
                String added_by_id = rs.getString(6);
                String update_by_id = rs.getString(7);
                String item_code = rs.getString(8);
                String barcode = rs.getString(9);
                String description = rs.getString(10);
                String category_id = rs.getString(11);
                String category = rs.getString(12);
                String classification_id = rs.getString(13);
                String sub_classification_id = rs.getString(14);
                String sub_classification = rs.getString(15);
                String brand_id = rs.getString(16);
                String brand = rs.getString(17);
                String model_id = rs.getString(18);
                String model = rs.getString(19);
                double product_qty = rs.getDouble(20);
                String unit = rs.getString(21);
                double conversion = rs.getDouble(22);
                double cost = rs.getDouble(23);
                double selling_price = rs.getDouble(24);
                double discount_amount = rs.getDouble(25);
                String item_type = rs.getString(26);
                String supplier_id = rs.getString(27);
                String supplier = rs.getString(28);
                String branch_id = rs.getString(29);
                String branch = rs.getString(30);
                String location_id = rs.getString(31);
                String location = rs.getString(32);
                int status = rs.getInt(33);

                to_customer_ordered_items to = new to_customer_ordered_items(id, customer_no, customer_name, date_added, date_updated, added_by_id, update_by_id, item_code, barcode, description, category_id, category, classification_id, sub_classification_id, sub_classification, brand_id, brand, model_id, model, product_qty, unit, conversion, cost, selling_price, discount_amount, item_type, supplier_id, supplier, branch_id, branch, location_id, location, status);
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
