package MainPackeg;


public class PaymentInstallment {
    int vno;
    int installmnt_no;
    String payment;
    String tdate;

    public PaymentInstallment(int vno, int installmnt_no, String payment, String tdate) {
        this.vno = vno;
        this.installmnt_no = installmnt_no;
        this.payment = payment;
        this.tdate = tdate;
    }

    public int getVno() {
        return vno;
    }

    public void setVno(int vno) {
        this.vno = vno;
    }

    public int getInstallmnt_no() {
        return installmnt_no;
    }

    public void setInstallmnt_no(int installmnt_no) {
        this.installmnt_no = installmnt_no;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getTdate() {
        return tdate;
    }

    public void setTdate(String tdate) {
        this.tdate = tdate;
    }
}
