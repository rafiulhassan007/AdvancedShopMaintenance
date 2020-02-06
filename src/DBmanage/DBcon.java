package DBmanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBcon {
    public String notice = "";
    Connection c = null;
    Statement s = null;
    ResultSet rs = null;
    public static boolean visualCheck;
    public DBcon(){
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:asm.sqlite");
            System.out.println("Successfully connected");
        } catch (Exception e) {
        }
    }
}
