package jinho.meetup._02_refactoring._02_change;

class RegularMovie extends Movie {
    public RegularMovie(String title, int daysRented) {
        super(title, Movie.REGULAR);
        this.daysRented = daysRented;
    }

    @Override
    public double getAmount() {
        double thisAmount = 2;
        if (this.daysRented > 2)
            thisAmount += (this.daysRented - 2) * 1.5;
        return thisAmount;
    }
}
