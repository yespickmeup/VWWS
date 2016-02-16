/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.stock_out;

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
public class Stock_out_items {

    public static class to_stock_out_items {

        public final int id;
        public final String stock_out_no;
        public final String date_added;
        public final String date_updated;
        public final String added_by_id;
        public final String update_by_id;
        public final String remarks;
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

        public to_stock_out_items(int id, String stock_out_no, String date_added, String date_updated, String added_by_id, String update_by_id, String remarks, String reference_no, String item_code, String barcode, String description, String category_id, String category, String classification_id, String sub_classification_id, String sub_classification, String brand_id, String brand, String model_id, String model, double product_qty, String unit, double conversion, double cost, double selling_price, double discount_amount, String item_type, String supplier_id, String supplier, String branch_id, String branch, String location_id, String location, int status) {
            this.id = id;
            this.stock_out_no = stock_out_no;
            this.date_added = date_added;
            this.date_updated = date_updated;
            this.added_by_id = added_by_id;
            this.update_by_id = update_by_id;
            this.remarks = remarks;
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

    public static void add_data(Stock_outs.to_stock_outs to_stock_outs, List<to_stock_out_items> to_stock_out_items1) {
        try {
            Connection conn = MyConnection.connect();

            String s1 = "insert into stock_outs("
                    + "stock_out_no"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",remarks"
                    + ",reference_no"
                    + ",gross_total"
                    + ",discount_amount"
                    + ",net_total"
                    + ",status"
                    + ")values("
                    + ":stock_out_no"
                    + ",:date_added"
                    + ",:date_updated"
                    + ",:added_by_id"
                    + ",:update_by_id"
                    + ",:remarks"
                    + ",:reference_no"
                    + ",:gross_total"
                    + ",:discount_amount"
                    + ",:net_total"
                    + ",:status"
                    + ")";

            s1 = SqlStringUtil.parse(s1)
                    .setString("stock_out_no", to_stock_outs.stock_out_no)
                    .setString("date_added", to_stock_outs.date_added)
                    .setString("date_updated", to_stock_outs.date_updated)
                    .setString("added_by_id", to_stock_outs.added_by_id)
                    .setString("update_by_id", to_stock_outs.update_by_id)
                    .setString("remarks", to_stock_outs.remarks)
                    .setString("reference_no", to_stock_outs.reference_no)
                    .setNumber("gross_total", to_stock_outs.gross_total)
                    .setNumber("discount_amount", to_stock_outs.discount_amount)
                    .setNumber("net_total", to_stock_outs.net_total)
                    .setNumber("status", to_stock_outs.status)
                    .ok();

            PreparedStatement stmt1 = conn.prepareStatement(s1);
            stmt1.execute();
            Lg.s(Stock_outs.class, "Successfully Added");

            for (to_stock_out_items to_stock_out_items : to_stock_out_items1) {
                String s0 = "insert into stock_out_items("
                        + "stock_out_no"
                        + ",date_added"
                        + ",date_updated"
                        + ",added_by_id"
                        + ",update_by_id"
                        + ",remarks"
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
                        + ":stock_out_no"
                        + ",:date_added"
                        + ",:date_updated"
                        + ",:added_by_id"
                        + ",:update_by_id"
                        + ",:remarks"
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
                        .setString("stock_out_no", to_stock_out_items.stock_out_no)
                        .setString("date_added", to_stock_out_items.date_added)
                        .setString("date_updated", to_stock_out_items.date_updated)
                        .setString("added_by_id", to_stock_out_items.added_by_id)
                        .setString("update_by_id", to_stock_out_items.update_by_id)
                        .setString("remarks", to_stock_out_items.remarks)
                        .setString("reference_no", to_stock_out_items.reference_no)
                        .setString("item_code", to_stock_out_items.item_code)
                        .setString("barcode", to_stock_out_items.barcode)
                        .setString("description", to_stock_out_items.description)
                        .setString("category_id", to_stock_out_items.category_id)
                        .setString("category", to_stock_out_items.category)
                        .setString("classification_id", to_stock_out_items.classification_id)
                        .setString("sub_classification_id", to_stock_out_items.sub_classification_id)
                        .setString("sub_classification", to_stock_out_items.sub_classification)
                        .setString("brand_id", to_stock_out_items.brand_id)
                        .setString("brand", to_stock_out_items.brand)
                        .setString("model_id", to_stock_out_items.model_id)
                        .setString("model", to_stock_out_items.model)
                        .setNumber("product_qty", to_stock_out_items.product_qty)
                        .setString("unit", to_stock_out_items.unit)
                        .setNumber("conversion", to_stock_out_items.conversion)
                        .setNumber("cost", to_stock_out_items.cost)
                        .setNumber("selling_price", to_stock_out_items.selling_price)
                        .setNumber("discount_amount", to_stock_out_items.discount_amount)
                        .setString("item_type", to_stock_out_items.item_type)
                        .setString("supplier_id", to_stock_out_items.supplier_id)
                        .setString("supplier", to_stock_out_items.supplier)
                        .setString("branch_id", to_stock_out_items.branch_id)
                        .setString("branch", to_stock_out_items.branch)
                        .setString("location_id", to_stock_out_items.location_id)
                        .setString("location", to_stock_out_items.location)
                        .setNumber("status", to_stock_out_items.status)
                        .ok();

                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(Stock_out_items.class, "Successfully Added");

                String where3 = " where item_code='" + to_stock_out_items.item_code + "' ";
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

                double new_qty = prev_qty - to_stock_out_items.product_qty;
                String s4 = "update inventory set "
                        + "product_qty= :product_qty "
                        + " where item_code='" + to_stock_out_items.item_code + "' "
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

    public static void update_data(to_stock_out_items to_stock_out_items) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update stock_out_items set "
                    + "stock_out_no= :stock_out_no "
                    + ",date_added= :date_added "
                    + ",date_updated= :date_updated "
                    + ",added_by_id= :added_by_id "
                    + ",update_by_id= :update_by_id "
                    + ",remarks= :remarks "
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
                    + " where id='" + to_stock_out_items.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("stock_out_no", to_stock_out_items.stock_out_no)
                    .setString("date_added", to_stock_out_items.date_added)
                    .setString("date_updated", to_stock_out_items.date_updated)
                    .setString("added_by_id", to_stock_out_items.added_by_id)
                    .setString("update_by_id", to_stock_out_items.update_by_id)
                    .setString("remarks", to_stock_out_items.remarks)
                    .setString("reference_no", to_stock_out_items.reference_no)
                    .setString("item_code", to_stock_out_items.item_code)
                    .setString("barcode", to_stock_out_items.barcode)
                    .setString("description", to_stock_out_items.description)
                    .setString("category_id", to_stock_out_items.category_id)
                    .setString("category", to_stock_out_items.category)
                    .setString("classification_id", to_stock_out_items.classification_id)
                    .setString("sub_classification_id", to_stock_out_items.sub_classification_id)
                    .setString("sub_classification", to_stock_out_items.sub_classification)
                    .setString("brand_id", to_stock_out_items.brand_id)
                    .setString("brand", to_stock_out_items.brand)
                    .setString("model_id", to_stock_out_items.model_id)
                    .setString("model", to_stock_out_items.model)
                    .setNumber("product_qty", to_stock_out_items.product_qty)
                    .setString("unit", to_stock_out_items.unit)
                    .setNumber("conversion", to_stock_out_items.conversion)
                    .setNumber("cost", to_stock_out_items.cost)
                    .setNumber("selling_price", to_stock_out_items.selling_price)
                    .setNumber("discount_amount", to_stock_out_items.discount_amount)
                    .setString("item_type", to_stock_out_items.item_type)
                    .setString("supplier_id", to_stock_out_items.supplier_id)
                    .setString("supplier", to_stock_out_items.supplier)
                    .setString("branch_id", to_stock_out_items.branch_id)
                    .setString("branch", to_stock_out_items.branch)
                    .setString("location_id", to_stock_out_items.location_id)
                    .setString("location", to_stock_out_items.location)
                    .setNumber("status", to_stock_out_items.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Stock_out_items.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_stock_out_items to_stock_out_items) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from stock_out_items  "
                    + " where id='" + to_stock_out_items.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Stock_out_items.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_stock_out_items> ret_data(String where) {
        List<to_stock_out_items> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",stock_out_no"
                    + ",date_added"
                    + ",date_updated"
                    + ",added_by_id"
                    + ",update_by_id"
                    + ",remarks"
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
                    + " from stock_out_items"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String stock_out_no = rs.getString(2);
                String date_added = rs.getString(3);
                String date_updated = rs.getString(4);
                String added_by_id = rs.getString(5);
                String update_by_id = rs.getString(6);
                String remarks = rs.getString(7);
                String reference_no = rs.getString(8);
                String item_code = rs.getString(9);
                String barcode = rs.getString(10);
                String description = rs.getString(11);
                String category_id = rs.getString(12);
                String category = rs.getString(13);
                String classification_id = rs.getString(14);
                String sub_classification_id = rs.getString(15);
                String sub_classification = rs.getString(16);
                String brand_id = rs.getString(17);
                String brand = rs.getString(18);
                String model_id = rs.getString(19);
                String model = rs.getString(20);
                double product_qty = rs.getDouble(21);
                String unit = rs.getString(22);
                double conversion = rs.getDouble(23);
                double cost = rs.getDouble(24);
                double selling_price = rs.getDouble(25);
                double discount_amount = rs.getDouble(26);
                String item_type = rs.getString(27);
                String supplier_id = rs.getString(28);
                String supplier = rs.getString(29);
                String branch_id = rs.getString(30);
                String branch = rs.getString(31);
                String location_id = rs.getString(32);
                String location = rs.getString(33);
                int status = rs.getInt(34);

                to_stock_out_items to = new to_stock_out_items(id, stock_out_no, date_added, date_updated, added_by_id, update_by_id, remarks, reference_no, item_code, barcode, description, category_id, category, classification_id, sub_classification_id, sub_classification, brand_id, brand, model_id, model, product_qty, unit, conversion, cost, selling_price, discount_amount, item_type, supplier_id, supplier, branch_id, branch, location_id, location, status);
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
