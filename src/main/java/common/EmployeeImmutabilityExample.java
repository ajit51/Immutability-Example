package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class EmployeeImmutabilityExample {

    private final String name;
    private final Date doj;
    private final List<String> moile;
    private final Address address;

    public EmployeeImmutabilityExample(String name, Date doj, List<String> moile, Address address) {
        this.name = name;
        this.doj = doj;
        this.moile = moile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {
        return (Date) doj.clone();
    }

    public List<String> getMoile() {
        return new ArrayList<>(moile);
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getZip());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", moile=" + moile +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Date date = new Date();
        Address address = new Address("Banglore", "1012");
        EmployeeImmutabilityExample employee = new EmployeeImmutabilityExample("Basant", date,
                Arrays.stream(new String[]{"789546", "56564654"}).collect(Collectors.toList()), address);
        employee.getDoj().setDate(20);
        employee.getMoile().add("264646");
        employee.getAddress().setCity("Pune");
        System.out.println(employee);
    }
}
