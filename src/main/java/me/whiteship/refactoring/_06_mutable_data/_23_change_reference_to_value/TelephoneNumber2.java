package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

public class TelephoneNumber2 {
//--> record TelephoneNumber(String areaCode, String number){} 로 변경해서 사용 할 수도 있다.
    private String areaCode;

    private String number;

    public String areaCode() {
        return areaCode;
    }

    public TelephoneNumber2 setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    public String number() {
        return number;
    }

    public TelephoneNumber2 setNumber(String number) {
        this.number = number;
        return this;
    }
}
