package me.whiteship.refactoring._10_data_clumps;

public class Office {
    //smell #10
    private String location;

    private TelephoneNumber officePhoneNumber;


    public Office(String location, TelephoneNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }

    public String officePhoneNumber() {
        return this.officePhoneNumber.toString();
    }

    public String getOfficeAreCode() {
        return this.officePhoneNumber.getNumber();
    }

}
