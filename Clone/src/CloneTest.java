import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CloneTest {

    public static void main (String[] args) {
        Customer customer = new Customer(
                "123",
                66,
                new Address(1, "Street"),
                Collections.singletonList(
                        new CellNumber("777-555-666", 3.14D))
        );

        try {
            Customer clonedCustomer = customer.clone();
            System.out.println(customer.equals(clonedCustomer));
        } catch (Exception exception) {
            System.out.println("error");
        }
    }
}

class Customer implements Cloneable {
    String id;
    int age;
    Address address;
    List<CellNumber> number;

    public Customer(String id, int age, Address address, List<CellNumber> number) {
        this.id = id;
        this.age = age;
        this.address = address;
        this.number = number;
    }

    @Override
    protected Customer clone() throws CloneNotSupportedException {
        return new Customer(this.id, this.age, this.address, this.number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(id, customer.id) && Objects.equals(address, customer.address) && Objects.equals(number, customer.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, address, number);
    }
}

class CellNumber implements Cloneable {
    String number;
    double coveradge;

    public CellNumber(String number, double coveradge) {
        this.number = number;
        this.coveradge = coveradge;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Address implements Cloneable {
    int id;
    String name;

    public Address(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
