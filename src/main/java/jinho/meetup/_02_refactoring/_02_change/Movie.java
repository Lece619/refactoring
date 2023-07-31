package jinho.meetup._02_refactoring._02_change;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    protected int daysRented;

    protected Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    //switch expression 으로 변경 Java 17
    public static Movie createRentaledMovie(String title, int priceCode, int daysRented){
        return switch (priceCode) {
            case Movie.CHILDRENS -> new ChildrensMovie(title, daysRented);
            case Movie.NEW_RELEASE -> new NewReleaseMovie(title, daysRented);
            case Movie.REGULAR -> new RegularMovie(title, daysRented);
            default -> throw new IllegalArgumentException("코드가 잘못되었습니다.");
        };
    }


    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    public String getTitle() {
        return title;
    };

    //기본 Movie에서는 getAmount() 를 사용할 수 없기 때문에 UnsupportedOperationException() 던짐
    public double getAmount() {
        throw new UnsupportedOperationException();
    }
    public int addFrequentRenterPoints(int frequentRenterPoints) {
        frequentRenterPoints++;
        return frequentRenterPoints;
    }
}

