package jinho.meetup._02_refactoring._02_change;

class Rental {
    private Movie movie;
    private int daysRented;


    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getAmount() {

        double thisAmount = 0;

        if (getMovie().getPriceCode() == Movie.REGULAR) {
            thisAmount += 2;
            if (getDaysRented() > 2)
                thisAmount += (getDaysRented() - 2) * 1.5;
            return thisAmount;
        }

        if (getMovie().getPriceCode() == Movie.NEW_RELEASE) {
            thisAmount += getDaysRented() * 3;
            return thisAmount;
        }

        thisAmount += 1.5;
        if (getDaysRented() > 3)
            thisAmount += (getDaysRented() - 3) * 1.5;

        return thisAmount;
    }

    public int getFrequentRenterPoints(int frequentRenterPoints) {
        frequentRenterPoints++;
        // add bonus for a two day new release rental
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
}