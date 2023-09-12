package jinho.meetup._02_refactoring._02_change;

class ChildrensMovie extends Movie {
    public ChildrensMovie(String title, int daysRented) {
        super(title, Movie.CHILDRENS);
        this.daysRented = daysRented;
    }

    @Override
    public int addFrequentRenterPoints(int frequentRenterPoints) {
        return frequentRenterPoints + DEFAULT_FREQUENT_RENTER_POINT;
    }

    @Override
    public double getAmount() {
        double thisAmount = 1.5;
        if (this.daysRented > 3)
            thisAmount += (this.daysRented - 3) * 1.5;
        return thisAmount;
    }
}
