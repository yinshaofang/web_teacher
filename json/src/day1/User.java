package day1;

public class User {
    String address;

    public User(String address) {
        this.address = address;
    }

    public User() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "address='" + address + '\'' +
                '}';
    }
}
