package designpatterns.creational.prototype;

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
        employee.setAddress(new EmployeeAddress(this.getAddress().getHouseNo(), this.getAddress().getStreet(), this.getAddress().getCity()));
        return employee;
    }

    @java.lang.SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @java.lang.SuppressWarnings("all")
    public Integer getAge() {
        return this.age;
    }

    @java.lang.SuppressWarnings("all")
    public EmployeeAddress getAddress() {
        return this.address;
    }

    @java.lang.SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    @java.lang.SuppressWarnings("all")
    public void setAge(final Integer age) {
        this.age = age;
    }

    @java.lang.SuppressWarnings("all")
    public void setAddress(final EmployeeAddress address) {
        this.address = address;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Employee)) return false;
        final Employee other = (Employee) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$age = this.getAge();
        final java.lang.Object other$age = other.getAge();
        if (this$age == null ? other$age != null : !this$age.equals(other$age)) return false;
        final java.lang.Object this$name = this.getName();
        final java.lang.Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final java.lang.Object this$address = this.getAddress();
        final java.lang.Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Employee;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $age = this.getAge();
        result = result * PRIME + ($age == null ? 43 : $age.hashCode());
        final java.lang.Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final java.lang.Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Employee(name=" + this.getName() + ", age=" + this.getAge() + ", address=" + this.getAddress() + ")";
    }
}
