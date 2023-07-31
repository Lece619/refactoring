package jinho.meetup._02_refactoring._02_change;

class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String title, int daysRented) {
        super(title, Movie.NEW_RELEASE);
        this.daysRented = daysRented;
    }

    @Override
    public double getAmount() {
        return this.daysRented * 3;
    }

    @Override
    public int addFrequentRenterPoints(int frequentRenterPoints) {

        if(this.daysRented > 1)
            frequentRenterPoints++;

        return super.addFrequentRenterPoints(frequentRenterPoints);
    }
}
