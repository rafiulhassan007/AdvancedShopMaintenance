package MainPackeg;

public class VoucherCustomer {

    int vNo;
    String cuName;
    String phone;
    String payable;
    String paid;
    String user;
    String time;
    String discount;

    public VoucherCustomer(int vNo, String cuName, String phone, String payable, String paid, String user, String time,String discount) {
        this.vNo = vNo;
        this.cuName = cuName;
        this.phone = phone;
        this.payable = payable;
        this.paid = paid;
        this.user = user;
        this.time = time;
        this.discount = discount;

    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getvNo() {
        return vNo;
    }

    public void setvNo(int vNo) {
        this.vNo = vNo;
    }

    public String getCuName() {
        return cuName;
    }

    public void setCuName(String cuName) {
        this.cuName = cuName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPayable() {
        return payable;
    }

    public void setPayable(String payable) {
        this.payable = payable;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
