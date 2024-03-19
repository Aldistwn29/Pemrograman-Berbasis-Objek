package Encapsution;

public class Person {
    String name, address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Nama : " + name + ", Alamat: " + address ;
    }
    
}

