package MainPackeg;


public class VoucherDetails {
    private int pid;
    private int quant;
    private int vno;

    public VoucherDetails(int pid, int quant, int vno) {
        this.pid = pid;
        this.quant = quant;
        this.vno = vno;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getVno() {
        return vno;
    }

    public void setVno(int vno) {
        this.vno = vno;
    }
    
}
