package DBmanage;

import java.util.ArrayList;
import MainPackeg.VoucherCustomer;

public class DBconnVoucherCustomer extends DBcon{
    public DBconnVoucherCustomer(){
    super();
    }
    public String InsartVoucherCustomer(String custname, String phn,String payable,String paid,String username,String discount){
    String notice="";
        try {
            s = c.createStatement();
            rs = s.executeQuery("INSERT INTO voucher_customer (customer_name,phone,payable,paid,user_name,discount) values('" + custname + "','" + phn + "','" + payable + "','" + paid + "','" + username + "','" + discount + "')");
            notice="Successfully Inserted";
            rs.close();
            s.close();
        } catch (Exception e) {
            notice="Insert Failed";
        }
        return notice;
    }
    public String checkVoucherNo(){
    String vNo="";
        try {
            s=c.createStatement();
            String sql="select max(voucher_no) from voucher_customer";
            rs=s.executeQuery(sql);
            vNo=rs.getString("max(voucher_no)");
            rs.close();
            s.close();
        } catch (Exception e) {
            vNo="not found";
        }
    return vNo;
    }
    public ArrayList<String> searchCustomerByPhone(){
        ArrayList<String> list=new ArrayList();
        try {
            s=c.createStatement();
            rs=s.executeQuery("select * FROM customer");
            while(rs.next()){
                list.add(rs.getString("phone"));
            }
            rs.close();
            s.close();
        } catch (Exception e) {
        }
        return list;
    }
    public ArrayList<VoucherCustomer> searchVoucherBetweenDate(String dt1, String dt2) {
        ArrayList<VoucherCustomer> list = new ArrayList();
        try {
            s = c.createStatement();
            rs = s.executeQuery("select * from voucher_customer where voucher_customer.current_time BETWEEN '" + dt1 + "' AND '" + dt2 + "'");
            while (rs.next()) {
                list.add(new VoucherCustomer(rs.getInt("voucher_no"), rs.getString("customer_name"), rs.getString("phone"), rs.getString("payable"), rs.getString("paid"), rs.getString("user_name"), rs.getString("current_time"),rs.getString("discount")));
            }
            rs.close();
            s.close();
        } catch (Exception e) {
        }
        return list;
    }
    public ArrayList<VoucherCustomer> searchVoucherBetweenDateDueOnly(String dt1, String dt2) {
        ArrayList<VoucherCustomer> list = new ArrayList();
        try {
            s = c.createStatement();
            rs = s.executeQuery("select * from voucher_customer where payable > paid and  voucher_customer.current_time BETWEEN '" + dt1 + "' AND '" + dt2 + "'");
            while (rs.next()) {
                list.add(new VoucherCustomer(rs.getInt("voucher_no"), rs.getString("customer_name"), rs.getString("phone"), rs.getString("payable"), rs.getString("paid"), rs.getString("user_name"), rs.getString("current_time"),rs.getString("discount")));
            }
            rs.close();
            s.close();
        } catch (Exception e) {
        }
        return list;
    }
    public ArrayList<VoucherCustomer> searchByVoucherNo(String vn) {
        ArrayList<VoucherCustomer> list = new ArrayList();
        try {
            s = c.createStatement();
            rs = s.executeQuery("Select * from voucher_customer where voucher_no = '" + vn + "'");
            while (rs.next()) {
                list.add(new VoucherCustomer(rs.getInt("voucher_no"), rs.getString("customer_name"), rs.getString("phone"), rs.getString("payable"), rs.getString("paid"), rs.getString("user_name"), rs.getString("current_time"),rs.getString("discount")));
                
            }
            rs.close();
            s.close();
        } catch (Exception e) {
        }
        return list;
    }
    public ArrayList<VoucherCustomer> lastFiveSales(){
    ArrayList<VoucherCustomer> list=new ArrayList();
        try {
            s = c.createStatement();
            rs = s.executeQuery("SELECT * FROM voucher_customer order by voucher_customer.current_time desc limit 5");
            while(rs.next()){
            list.add(new VoucherCustomer(rs.getInt("voucher_no"), rs.getString("customer_name"), rs.getString("phone"), rs.getString("payable"), rs.getString("paid"), rs.getString("user_name"), rs.getString("current_time"),rs.getString("discount")));
            }
            rs.close();
            s.close();
        } catch (Exception e) {
        }
    return list;
    }
    public void addRepayableAmount(String v,String nwAmount){
        try {
            c = s.getConnection();
            String sql="UPDATE voucher_customer SET paid='" + nwAmount + "' WHERE voucher_no='" + v + "'";
            s.executeUpdate(sql);
            s.close();
            rs.close();
        } catch (Exception e) {
        }
    }
}
