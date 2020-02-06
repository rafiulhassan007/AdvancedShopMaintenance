package DBmanage;

import java.sql.*;
import java.util.ArrayList;
import MainPackeg.UserInfoForSalesPerson;

public class DBconnUser extends DBcon{

//    public String notice = "";
//    Connection c = null;
//    Statement s = null;
//    ResultSet rs = null;
//    public static boolean visualCheck;
    public DBconnUser() {
        super();
//        try {
//            Class.forName("org.sqlite.JDBC");
//            c = DriverManager.getConnection("jdbc:sqlite:asm.sqlite");
//            System.out.println("Successfully connected");
//        } catch (Exception e) {
//        }
    }

    public String insertUser(String user_name, String password, String mobile_no, String address, String type,String acce) {

        try {
            s = c.createStatement();
            String sql = "insert into user_details (user_name,password,mobile_no,address,type,acpet_or_not) values('" + user_name + "','" + password + "','" + mobile_no + "','" + address + "','" + type + "','" + acce + "')";
            s.executeUpdate(sql);
            notice = "Seved in database";
            rs.close();
            s.close();
        } catch (Exception e) {
            notice = "Sign up Failed";
            //notice=e.toString();
        }
        return notice;
    }

    public boolean checkUserName(String userName) {
        boolean check = false;
        if (userName.length() >= 4) {
            check = true;
        }
        try {
            s = c.createStatement();
//            String sql = "SELECT * FROM user_details WHERE user_name = '" + userName + "'";
            rs = s.executeQuery("SELECT * FROM user_details WHERE user_name = '" + userName + "'");
            if (rs.next()) {
                check = false;
            }
            rs.close();
            s.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return check;
    }
    public boolean checkLogIn(String userName, String password){
        boolean check=false;
        try {
               s= c.createStatement();
               String sql="SELECT * FROM user_details WHERE user_name = '" + userName + "' AND password= '" + password + "' AND acpet_or_not='yes'";
               rs= s.executeQuery(sql);
               if(rs.next()){
                   check=true;
                   //System.out.println("loged in");
                   visualCheck=true;
               }
               if(check==false){
                   //System.out.println("Wrong");
                   visualCheck=false;
               }
               s.close();
               rs.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return check;
    }
     public void updatePass(String newpass, String user_name){
        try {
            s=c.createStatement();
            String sql = "UPDATE user_details SET password='" + newpass + "' WHERE user_name='" + user_name + "'";
            s.executeUpdate(sql);
            rs.close();
            s.close();
        } catch (Exception e) {
        }
    }
     public ArrayList<UserInfoForSalesPerson> acceptUser(){
         ArrayList<UserInfoForSalesPerson> list=new ArrayList();
         try {
             s=c.createStatement();
             rs=s.executeQuery("select user_name, mobile_no, address, acpet_or_not, currenttime from user_details group by currenttime having type = 'Salesperson'");
             while(rs.next()){
             list.add(new UserInfoForSalesPerson(rs.getString("user_name"), rs.getString("mobile_no"),rs.getString("address"),rs.getString("acpet_or_not"),rs.getString("currenttime")));
             }
             rs.close();
             s.close();
         } catch (Exception e) {
         }
         return list;
     }
     public String updateAuthorization(String user_name,String uPauth,String upt){
         String notice="";
             try {
                 s=c.createStatement();
                 String sql="UPDATE user_details SET acpet_or_not='" + uPauth + "',currenttime='"+upt+"' WHERE user_name='" + user_name + "'";
                 s.executeUpdate(sql);
                 notice="Successfully Changed";
                 rs.close();
                 s.close();
             } catch (Exception e) {
                 notice="Changing Failed";
             } 
             return notice;
     }
     public String checkAdmin(String user){
         String t="";
         try {
            s = c.createStatement();
            String sql="select * from user_details where user_name = '" + user + "'";
            rs=s.executeQuery(sql);
            t=rs.getString("type");
            rs.close();
            s.close();
         } catch (Exception e) {
            t="error";
         }
         return t;
     }
}
