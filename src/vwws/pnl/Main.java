/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwws.pnl;

import java.awt.Toolkit;
import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.CloseDialog;
import vwws.util.Center;

/**
 *
 * @author Guinness
 */
public class Main {

    public static void main(final String[] args) {

        try {
            String conf = (args.length > 0 ? args[0]
                    : null);
            Properties prop = new Properties();

            String userHome = System.getProperty("user.home");
            System.out.println(userHome);
            conf = (conf == null
                    ? "vwws.conf"
                    : conf);
            System.out.println(conf);
            File file = new File(userHome + "/" + conf);
            if (file.exists()) {
                InputStream is = new FileInputStream(file);
                prop.load(is);
            } else {
                file = new File(conf);
                if (file.exists()) {
                    InputStream is = new FileInputStream(file);
                    prop.load(is);
                }
            }

            Properties info = new Properties();
            info.setProperty("proxool.maximum-connection-count", "5000000");
            System.setProperty("HOST_CONN_PYOP_SEND", prop.getProperty("server_conn", "localhost"));
            System.setProperty("HOST_PARAM_PYOP_SEND", prop.getProperty("server_param", "?user=root&password=password"));
            System.setProperty("pool_host", prop.getProperty("pool_host", "localhost:3306"));
            System.setProperty("pool_user", prop.getProperty("pool_user", "root"));
            System.setProperty("pool_password", prop.getProperty("pool_password", "password"));
            System.out.println(prop.getProperty("pool_host", "localhost"));
            System.setProperty("img_path", prop.getProperty("img_path", "C:\\Users\\i1\\"));
            System.setProperty("mydb", prop.getProperty("mydb", "db_algorithm"));
            String mydb = System.getProperty("mydb", "db_vwwws");
            System.setProperty("business_name", prop.getProperty("business_name", "Synapse Software Tech"));
            System.setProperty("operated_by", prop.getProperty("operated_by", "Operated by: Ronald Pascua"));
            System.setProperty("address", prop.getProperty("address", "Address: Dumaguete City"));
            System.setProperty("telephone_number", prop.getProperty("telephone_number", "Tel No: 09261625529"));
            System.setProperty("print_to_receipts", prop.getProperty("print_to_receipts", "false"));

        } catch (IOException ex) {

            throw new RuntimeException(ex);
        }

        Window p = (Window) new JFrame();
        loading nd = loading.create(p, true);
        nd.setTitle("");
        nd.setCallback(new loading.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, loading.OutputData data) {
                new Main().start();
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);
        nd.setVisible(true);

    }

    public void start() {
        Application.setSystemLookAndFeel();
        DashBoard pnl = new DashBoard();

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());
        pnl.setSize(xSize, ySize);

        pnl.setVisible(true);
    }
}
