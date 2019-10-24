package creational.prototype;

/**
 * @author Froy
 */
public class Employee implements Cloneable {

    private String name;
    private Integer age;
    private EmployeeAddress address;

    public Employee(String name, Integer age, EmployeeAddress address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public EmployeeAddress getAddress() {
        return address;
    }

    public void setAddress(EmployeeAddress address) {
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Employee [name=");
        builder.append(name);
        builder.append(", age=");
        builder.append(age);
        builder.append(", address=");
        builder.append(address);
        builder.append("]");
        return builder.toString();
    }


}
