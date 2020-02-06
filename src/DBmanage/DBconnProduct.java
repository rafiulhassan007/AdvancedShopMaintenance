package DBmanage;

import java.util.ArrayList;
import MainPackeg.ProductInfo;
public class DBconnProduct extends DBcon{
    public DBconnProduct(){
    super();
    }
    public String productInsart(String pname, String cname,String cost,String profit,String quantity,String user){
    String notice="";
        try {
            s = c.createStatement();
            rs = s.executeQuery("INSERT INTO product_info (p_name,company,cost,profit_perc,quantity,user_name) values('" + pname + "','" + cname + "','" + cost + "','" + profit + "','" + quantity + "','" + user + "')");
            notice="Successfully Inserted";
            rs.close();
            s.close();
        } catch (Exception e) {
            notice="Insert Failed";
        }
        return notice;
    }
    public ArrayList<ProductInfo> searchProductInfo(String search){
        ArrayList<ProductInfo> list=new ArrayList();
        try {
            s=c.createStatement();
            rs=s.executeQuery("select * FROM product_info WHERE p_name LIKE '%" + search + "%' or company LIKE '%" + search + "%'");
            while(rs.next()){
                list.add(new ProductInfo(rs.getInt("p_id"),rs.getInt("quantity"),rs.getString("p_name"),rs.getString("company"),rs.getString("cost"),rs.getString("profit_perc"),rs.getString("user_name"),rs.getString("current_time")));
            }
            rs.close();
            s.close();
        } catch (Exception e) {
        }
        return list;
    }
    public ArrayList<String> searchProductInfoAll(){
        ArrayList<String> list=new ArrayList();
        try {
            s=c.createStatement();
            rs=s.executeQuery("select * FROM product_info");
            while(rs.next()){
                list.add(rs.getString("p_name")+"_"+rs.getString("p_id")+"");
            }
            rs.close();
            s.close();
        } catch (Exception e) {
        }
        return list;
    }
     
    public String productInfoUpdate(String pid,String pname,String cname, String cost,String profit, String quantity, String user,String t){
        String notice="";
        try {
            s = c.createStatement();
            String sql="UPDATE product_info SET p_name = '" + pname + "',company = '" + cname + "',cost = '" + cost + "',profit_perc = '" + profit + "',quantity = '" + quantity + "',user_name = '" + user + "',current_time = '" + t + "' WHERE p_id = '" + pid + "'";
            s.executeUpdate(sql);
            notice="Successfully updated";
            s.close();
        } catch (Exception e) {
            notice="failed";
        }
        return notice;
    }
    public String productQuantityCheck(String pid){
        String q="";
        try {
            s=c.createStatement();
            String sql="SELECT quantity FROM product_info WHERE p_id = '" + pid + "'";
            rs=s.executeQuery(sql);
            q=rs.getString("quantity");
            rs.close();
            s.close();            
        } catch (Exception e) {
            q="error";
        }
        return q;
    }
    public ArrayList<ProductInfo> searchProductInfotest(String s1,String s2){
        ArrayList<ProductInfo> list=new ArrayList();
        try {
            String sql="SELECT * FROM product_info WHERE product_info.current_time BETWEEN '" + s1 + "' AND '" + s2 + "'";
            s=c.createStatement();   //Date >= '2011/02/25' and Date <= '2011/02/27'
            rs=s.executeQuery(sql);
            System.out.println(sql);
            while(rs.next()){
                list.add(new ProductInfo(rs.getInt("p_id"),rs.getInt("quantity"),rs.getString("p_name"),rs.getString("company"),rs.getString("cost"),rs.getString("profit_perc"),rs.getString("user_name"),rs.getString("current_time")));
            }
            rs.close();
            s.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        return list;
    }
    public ArrayList<ProductInfo> searchProductForSale(String id){
        ArrayList<ProductInfo> list=new ArrayList();
        try {
            s=c.createStatement();
            rs=s.executeQuery("select * FROM product_info WHERE p_id = '" + id + "'");
            while(rs.next()){
                list.add(new ProductInfo(rs.getInt("p_id"),rs.getInt("quantity"),rs.getString("p_name"),rs.getString("company"),rs.getString("cost"),rs.getString("profit_perc"),rs.getString("user_name"),rs.getString("current_time")));
            }
            rs.close();
            s.close();
        } catch (Exception e) {
        }
        return list;
    }
    public String updateProQuanAfterSale(String pid,String q) {
        String notice = "";
        try {
            s=c.createStatement();
            String sql="UPDATE product_info SET quantity = '" + q + "' WHERE p_id = '" + pid + "'";
            s.executeUpdate(sql);
            notice="Successfully updated";
            s.close();
        } catch (Exception e) {
        notice="error";
        }
        return notice;
    }
}
