package MainPackeg;

public class ProductInfo {
    private int pId,quqntity;
    private String pname,cname,cost,profit,user,date;
    
    public ProductInfo(){
    }

    public ProductInfo(int pId, int quqntity, String pname, String cname, String cost, String profit, String user, String date) {
        this.pId = pId;
        this.quqntity = quqntity;
        this.pname = pname;
        this.cname = cname;
        this.cost = cost;
        this.profit = profit;
        this.user = user;
        this.date = date;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getQuqntity() {
        return quqntity;
    }

    public void setQuqntity(int quqntity) {
        this.quqntity = quqntity;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
