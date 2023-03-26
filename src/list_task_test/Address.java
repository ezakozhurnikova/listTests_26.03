package list_task_test;

public class Address {
    static int houseNumber;
    static String street;

    public Address(int houseNumber, String street) {
        this.houseNumber = houseNumber;
        this.street = street;
    }

    public static int getHouseNumber() {
        return  houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public static String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
