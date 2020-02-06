package MainPackeg;

public class CustomerInfo {

    String customer_name;
    String phone;
    String address;

    public CustomerInfo(String customer_name, String phone, String address) {
        this.customer_name = customer_name;
        this.phone = phone;
        this.address = address;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
