package designpatterns.creational.prototype;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
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

}
