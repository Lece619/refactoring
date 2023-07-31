package jinho.meetup._02_refactoring._02_change;

class Rental {
    private Movie movie;
    private int daysRented;


    public Rental(Movie movie, int daysRented) {
        this.movie = Movie.createRentaledMovie(movie.getTitle(), movie.getPriceCode(), daysRented);
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }


}