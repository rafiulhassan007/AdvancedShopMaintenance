package MainPackeg;

public class UserInfoForSalesPerson {

    private String name, mobile, address, accept, current_time;

    public UserInfoForSalesPerson(String name, String mobile, String address,String accept, String current_time) {
        this.name=name;
        this.mobile=mobile;
        this.address=address;
        this.accept=accept;
        this.current_time=current_time;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getaccept() {
        return accept;
    }

    public void setaccept(String accept) {
        this.accept = accept;
    }

    public String getCurrent_time() {
        return current_time;
    }

    public void setCurrent_time(String current_time) {
        this.current_time = current_time;
    }
}
