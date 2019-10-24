package creational.prototype;

/**
 * @author Froy
 */
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

    public String getHouseNo() {
        return houseNo;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EmployeeAddress [houseNo=");
        builder.append(houseNo);
        builder.append(", street=");
        builder.append(street);
        builder.append(", city=");
        builder.append(city);
        builder.append("]");
        return builder.toString();
    }

}
