/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.stock_in;

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
public class Stock_in_items {

    public static class to_stock_in_items {

        public final int id;
        public final String stock_in_no;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final String remarks;
        public final String date_delivered;
        public final String date_received;
        public final String reference_no;
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

        public to_stock_in_items(int id, String stock_in_no, String date_added, String date_updated, String added_by_id, String update_by_id, String remarks, String date_delivered, String date_received, String reference_no, String item_code, String barcode, String description, String category_id, String category, String classification_id, String sub_classification_id, String sub_classification, String brand_id, String brand, String model_id, String model, double product_qty, String unit, double conversion, double cost, double selling_price, double discount_amount, String item_type, String supplier_id, String supplier, String branch_id, String branch, String location_id, String location, int status) {
            this.id = id;
            this.stock_in_no = stock_in_no;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.remarks = remarks;
            this.date_delivered = date_delivered;
            this.date_received = date_received;
            this.reference_no = reference_no;
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

    public static void add_data(Stock_ins.to_stock_ins to_stock_ins, List<to_stock_in_items> to_stock_in_items1) {
        try {
            Connection conn = MyConnection.connect();

            String s2 = "insert into stock_ins("
                    + "stock_in_no"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",supplier_id"
                    + ",supplier"
                    + ",remarks"
                    + ",date_delivered"
                    + ",date_received"
                    + ",reference_no"
                    + ",gross_total"
                    + ",discount_amount"
                    + ",net_total"
                    + ",status"
                    + ")values("
                    + ":stock_in_no"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ",:supplier_id"
                    + ",:supplier"
                    + ",:remarks"
                    + ",:date_delivered"
                    + ",:date_received"
                    + ",:reference_no"
                    + ",:gross_total"
                    + ",:discount_amount"
                    + ",:net_total"
                    + ",:status"
                    + ")";

            s2 = SqlStringUtil.parse(s2)
                    .setString("stock_in_no", to_stock_ins.stock_in_no)
                    .setString("date_added", to_stock_ins.date_added)
                    .setString("date_updated", to_stock_ins.date_updated)
                    .setString("added_by_id", to_stock_ins.added_by_id)
                    .setString("update_by_id", to_stock_ins.update_by_id)
                    .setString("supplier_id", to_stock_ins.supplier_id)
                    .setString("supplier", to_stock_ins.supplier)
                    .setString("remarks", to_stock_ins.remarks)
                    .setString("date_delivered", to_stock_ins.date_delivered)
                    .setString("date_received", to_stock_ins.date_received)
                    .setString("reference_no", to_stock_ins.reference_no)
                    .setNumber("gross_total", to_stock_ins.gross_total)
                    .setNumber("discount_amount", to_stock_ins.discount_amount)
                    .setNumber("net_total", to_stock_ins.net_total)
                    .setNumber("status", to_stock_ins.status)
                    .ok();

            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();
            Lg.s(Stock_ins.class, "Successfully Added");

            for (to_stock_in_items to_stock_in_items : to_stock_in_items1) {
                String s0 = "insert into stock_in_items("
                        + "stock_in_no"
                        + ",date_added"
                        + ",date_updated"
                        + ",added_by_id"
                        + ",update_by_id"
                        + ",remarks"
                        + ",date_delivered"
                        + ",date_received"
                        + ",reference_no"
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
                        + ":stock_in_no"
                        + ",:date_added"
                        + ",:date_updated"
                        + ",:added_by_id"
                        + ",:update_by_id"
                        + ",:remarks"
                        + ",:date_delivered"
                        + ",:date_received"
                        + ",:reference_no"
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
                        .setString("stock_in_no", to_stock_ins.stock_in_no)
                        .setString("date_added", to_stock_ins.date_added)
                        .setString("date_updated", to_stock_ins.date_updated)
                        .setString("added_by_id", to_stock_ins.added_by_id)
                        .setString("update_by_id", to_stock_ins.update_by_id)
                        .setString("remarks", to_stock_ins.remarks)
                        .setString("date_delivered", to_stock_ins.date_delivered)
                        .setString("date_received", to_stock_ins.date_received)
                        .setString("reference_no", to_stock_ins.reference_no)
                        .setString("item_code", to_stock_in_items.item_code)
                        .setString("barcode", to_stock_in_items.barcode)
                        .setString("description", to_stock_in_items.description)
                        .setString("category_id", to_stock_in_items.category_id)
                        .setString("category", to_stock_in_items.category)
                        .setString("classification_id", to_stock_in_items.classification_id)
                        .setString("sub_classification_id", to_stock_in_items.sub_classification_id)
                        .setString("sub_classification", to_stock_in_items.sub_classification)
                        .setString("brand_id", to_stock_in_items.brand_id)
                        .setString("brand", to_stock_in_items.brand)
                        .setString("model_id", to_stock_in_items.model_id)
                        .setString("model", to_stock_in_items.model)
                        .setNumber("product_qty", to_stock_in_items.product_qty)
                        .setString("unit", to_stock_in_items.unit)
                        .setNumber("conversion", to_stock_in_items.conversion)
                        .setNumber("cost", to_stock_in_items.cost)
                        .setNumber("selling_price", to_stock_in_items.selling_price)
                        .setNumber("discount_amount", to_stock_in_items.discount_amount)
                        .setString("item_type", to_stock_in_items.item_type)
                        .setString("supplier_id", to_stock_in_items.supplier_id)
                        .setString("supplier", to_stock_in_items.supplier)
                        .setString("branch_id", to_stock_in_items.branch_id)
                        .setString("branch", to_stock_in_items.branch)
                        .setString("location_id", to_stock_in_items.location_id)
                        .setString("location", to_stock_in_items.location)
                        .setNumber("status", to_stock_in_items.status)
                        .ok();

                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(Stock_in_items.class, "Successfully Added");

                String where3 = " where item_code='" + to_stock_in_items.item_code + "' ";
                String s3 = "select "
                        + "product_qty"
                        + " from inventory"
                        + " " + where3;

                Statement stmt3 = conn.createStatement();
                ResultSet rs3 = stmt3.executeQuery(s3);
                double prev_qty = 0;
                while (rs3.next()) {
                    prev_qty = rs3.getDouble(1);
                }

                double new_qty = prev_qty + to_stock_in_items.product_qty;
                String s4 = "update inventory set "
                        + "product_qty= :product_qty "
                        + ",cost= :cost "
                        + " where item_code='" + to_stock_in_items.item_code + "' "
                        + " ";

                s4 = SqlStringUtil.parse(s4)
                        .setNumber("product_qty", new_qty)
                        .setNumber("cost", to_stock_in_items.cost)
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

    public static void update_data(to_stock_in_items to_stock_in_items) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update stock_in_items set "
                    + "stock_in_no= :stock_in_no "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + ",remarks= :remarks "
                    + ",date_delivered= :date_delivered "
                    + ",date_received= :date_received "
                    + ",reference_no= :reference_no "
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
                    + " where id='" + to_stock_in_items.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("stock_in_no", to_stock_in_items.stock_in_no)
                    .setString("date_added", to_stock_in_items.date_added)
                    .setString("date_updated", to_stock_in_items.date_updated)
                    .setString("added_by_id", to_stock_in_items.added_by_id)
                    .setString("update_by_id", to_stock_in_items.update_by_id)
                    .setString("remarks", to_stock_in_items.remarks)
                    .setString("date_delivered", to_stock_in_items.date_delivered)
                    .setString("date_received", to_stock_in_items.date_received)
                    .setString("reference_no", to_stock_in_items.reference_no)
                    .setString("item_code", to_stock_in_items.item_code)
                    .setString("barcode", to_stock_in_items.barcode)
                    .setString("description", to_stock_in_items.description)
                    .setString("category_id", to_stock_in_items.category_id)
                    .setString("category", to_stock_in_items.category)
                    .setString("classification_id", to_stock_in_items.classification_id)
                    .setString("sub_classification_id", to_stock_in_items.sub_classification_id)
                    .setString("sub_classification", to_stock_in_items.sub_classification)
                    .setString("brand_id", to_stock_in_items.brand_id)
                    .setString("brand", to_stock_in_items.brand)
                    .setString("model_id", to_stock_in_items.model_id)
                    .setString("model", to_stock_in_items.model)
                    .setNumber("product_qty", to_stock_in_items.product_qty)
                    .setString("unit", to_stock_in_items.unit)
                    .setNumber("conversion", to_stock_in_items.conversion)
                    .setNumber("cost", to_stock_in_items.cost)
                    .setNumber("selling_price", to_stock_in_items.selling_price)
                    .setNumber("discount_amount", to_stock_in_items.discount_amount)
                    .setString("item_type", to_stock_in_items.item_type)
                    .setString("supplier_id", to_stock_in_items.supplier_id)
                    .setString("supplier", to_stock_in_items.supplier)
                    .setString("branch_id", to_stock_in_items.branch_id)
                    .setString("branch", to_stock_in_items.branch)
                    .setString("location_id", to_stock_in_items.location_id)
                    .setString("location", to_stock_in_items.location)
                    .setNumber("status", to_stock_in_items.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Stock_in_items.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_stock_in_items to_stock_in_items) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from stock_in_items  "
                    + " where id='" + to_stock_in_items.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Stock_in_items.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_stock_in_items> ret_data(String where) {
        List<to_stock_in_items> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",stock_in_no"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",remarks"
                    + ",date_delivered"
                    + ",date_received"
                    + ",reference_no"
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
                    + " from stock_in_items"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String stock_in_no = rs.getString(2);
                String date_added = rs.getString(3);
                String date_updated = rs.getString(4);
                String added_by_id = rs.getString(5);
                String update_by_id = rs.getString(6);
                String remarks = rs.getString(7);
                String date_delivered = rs.getString(8);
                String date_received = rs.getString(9);
                String reference_no = rs.getString(10);
                String item_code = rs.getString(11);
                String barcode = rs.getString(12);
                String description = rs.getString(13);
                String category_id = rs.getString(14);
                String category = rs.getString(15);
                String classification_id = rs.getString(16);
                String sub_classification_id = rs.getString(17);
                String sub_classification = rs.getString(18);
                String brand_id = rs.getString(19);
                String brand = rs.getString(20);
                String model_id = rs.getString(21);
                String model = rs.getString(22);
                double product_qty = rs.getDouble(23);
                String unit = rs.getString(24);
                double conversion = rs.getDouble(25);
                double cost = rs.getDouble(26);
                double selling_price = rs.getDouble(27);
                double discount_amount = rs.getDouble(28);
                String item_type = rs.getString(29);
                String supplier_id = rs.getString(30);
                String supplier = rs.getString(31);
                String branch_id = rs.getString(32);
                String branch = rs.getString(33);
                String location_id = rs.getString(34);
                String location = rs.getString(35);
                int status = rs.getInt(36);

                to_stock_in_items to = new to_stock_in_items(id, stock_in_no, date_added, date_updated, added_by_id, update_by_id, remarks, date_delivered, date_received, reference_no, item_code, barcode, description, category_id, category, classification_id, sub_classification_id, sub_classification, brand_id, brand, model_id, model, product_qty, unit, conversion, cost, selling_price, discount_amount, item_type, supplier_id, supplier, branch_id, branch, location_id, location, status);
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
