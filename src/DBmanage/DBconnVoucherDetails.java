package DBmanage;

import MainPackeg.VoucherDetails;
import java.util.ArrayList;


public class DBconnVoucherDetails extends DBcon{
    public DBconnVoucherDetails(){
    super();
    }
    public String InsartVoucherDetails(String pid, String quantity,String vNo){
    String notice="";
        try {
            s = c.createStatement();
            rs = s.executeQuery("INSERT INTO voucher_details (p_id,quantity,voucher_no) values('" + pid + "','" + quantity + "','" + vNo + "')");
            notice="Successfully Inserted";
            rs.close();
            s.close();
        } catch (Exception e) {
            notice="Insert Failed";
        }
        return notice;
    }
    public ArrayList<VoucherDetails> fullVoucherDetails(String vNo){
    ArrayList<VoucherDetails> list=new ArrayList();
        try {
            s = c.createStatement();
            rs = s.executeQuery("select * from voucher_details where voucher_no = '"+ vNo +"'");
            while(rs.next()){
            list.add(new VoucherDetails(rs.getInt("p_id"), rs.getInt("quantity"), rs.getInt("voucher_no")));
            }
            s.close();
            rs.close();
            System.out.println("no error");
        } catch (Exception e) {
            System.out.println("error");
        }
    return list;
    }
}
