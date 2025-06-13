package designpatterns.creational.prototype;

public class EmployeeAddress {
    private String houseNo;
    private String street;
    private String city;

    public EmployeeAddress(String houseNo, String street, String city) {
        super();
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
    }

    @java.lang.SuppressWarnings("all")
    public String getHouseNo() {
        return this.houseNo;
    }

    @java.lang.SuppressWarnings("all")
    public String getStreet() {
        return this.street;
    }

    @java.lang.SuppressWarnings("all")
    public String getCity() {
        return this.city;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "EmployeeAddress(houseNo=" + this.getHouseNo() + ", street=" + this.getStreet() + ", city=" + this.getCity() + ")";
    }
}
