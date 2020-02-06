package DBmanage;

import MainPackeg.PaymentInstallment;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DBconnPaymentInstallments extends DBcon {

    public DBconnPaymentInstallments() {
        super();
    }

    public void insertPaymentIns(String vn,int inum, String payment) {
        DateFormat updt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date date = new Date();
                    String t = updt.format(date).toString();
        String notice = "";
        try {
            s = c.createStatement();
            rs = s.executeQuery("INSERT INTO paying_installments (voucher_no,installment_no,payment,current_time) values('" + vn + "','" + inum + "','" + payment + "','" + t + "')");
            rs.close();
            s.close();
            notice = "inserted installment";
        } catch (Exception e) {
            System.out.println("error installment");
        }
    }

    public ArrayList<PaymentInstallment> installmentDetails(String vn) {
        ArrayList<PaymentInstallment> list = new ArrayList();
        try {
            s = c.createStatement();
            String sql = "select * from paying_installments where voucher_no='" + vn + "'";
            rs = s.executeQuery(sql);
            while (rs.next()) {
                list.add(new PaymentInstallment(rs.getInt("voucher_no"), rs.getInt("installment_no"), rs.getString("payment"), rs.getString("current_time")));
            }
            s.close();
            rs.close();
        } catch (Exception e) {
        }
        return list;
    }

    public int checkInstallmentNo(String vn) {
        
        int num = 0;
        try {
            s = c.createStatement();
            String sql = "select max(installment_no) from paying_installments where voucher_no='" + vn + "'";
            rs = s.executeQuery(sql);
            num=rs.getInt("max(installment_no)");
            rs.close();
            s.close();
        } catch (Exception e) {
            num=-99;
        }
        return num;
    }
}
