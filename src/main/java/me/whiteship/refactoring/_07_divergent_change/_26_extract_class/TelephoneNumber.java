package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public class TelephoneNumber {
    String areaCode;
    String number;

    public TelephoneNumber() {
    }

    public String areaCode() {
        return areaCode;
    }

    public TelephoneNumber setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    public String number() {
        return number;
    }

    public TelephoneNumber setNumber(String number) {
        this.number = number;
        return this;
    }

    public String telephoneNumber() {
        return this.areaCode + " " + this.number;
    }
}