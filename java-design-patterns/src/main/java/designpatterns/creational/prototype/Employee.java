package designpatterns.creational.prototype;

import lombok.Data;

@Data
public class Employee implements Cloneable {

    private String name;
    private Integer age;
    private EmployeeAddress address;

    public Employee(String name, Integer age, EmployeeAddress address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();

        //deep copy
        employee.setAddress(
                new EmployeeAddress(
                        this.getAddress().getHouseNo(),
                        this.getAddress().getStreet(),
                        this.getAddress().getCity())
        );
        return employee;

    }


}
