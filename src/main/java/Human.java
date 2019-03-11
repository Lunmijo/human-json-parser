import java.util.ArrayList;

public class Human {
    String name;
    String surname;
    ArrayList<String> phones;
    ArrayList<String> sites;
    Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    public ArrayList<String> getSites() {
        return sites;
    }

    public void setSites(ArrayList<String> sites) {
        this.sites = sites;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Human:\n" +
                "name='" + name +
                ",\nsurname='" + surname +
                ",\nphones=" + phones +
                ",\nsites=" + sites +
                ",\n" + address;
    }
}
