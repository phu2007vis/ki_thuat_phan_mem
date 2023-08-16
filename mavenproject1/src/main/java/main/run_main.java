
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import login.login;
import main_process.main_process;
public class run_main {
    public static void main(String[] args) {
        

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
             new login().setVisible(true);
            }
        });
    }
    
    public static void showmessage(String mess){
        JOptionPane.showMessageDialog(null, mess,"Thong bao", JOptionPane.INFORMATION_MESSAGE);
    }

}
