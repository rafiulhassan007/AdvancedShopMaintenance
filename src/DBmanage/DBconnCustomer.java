/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBmanage;

import java.util.ArrayList;
import MainPackeg.CustomerInfo;

/**
 *
 * @author romio-pc
 */
public class DBconnCustomer extends DBcon{
    public DBconnCustomer(){
    super();
}
    public ArrayList<CustomerInfo> searchCustomerbyphone(String search){
        ArrayList<CustomerInfo> list=new ArrayList();
        try {
            s=c.createStatement();
            rs=s.executeQuery("select * FROM customer WHERE phone like '%"+search+"%'");
            while(rs.next()){
                list.add(new CustomerInfo(rs.getString("customer_name"),rs.getString("phone"),rs.getString("address")));
            }
            rs.close();
            s.close();
        } catch (Exception e) {
        }
        return list;
    }
    public String customerInsart(String cname, String phn,String addr){
    String notice="";
        try {
            s = c.createStatement();
            rs = s.executeQuery("INSERT INTO customer (customer_name,phone,address) values('" + cname + "','" + phn + "','" + addr + "')");
            notice="Successfully Inserted";
            rs.close();
            s.close();
        } catch (Exception e) {
            notice="Insert Failed";
        }
        return notice;
    }
}
