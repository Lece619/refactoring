package jinho.meetup._02_refactoring._02_change;

import java.util.ArrayList;
import java.util.List;

class Customer {
    public static final String HEADER = "Rental Record for %s \n";
    public static final String MAIN_SENTENCE = "\t %f(%s)\n";
    public static final String AMOUNT_OWED = "Amount owed is %f\n";
    public static final String YOU_EARNED = "You earned %d frequent renter pointers";
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    };

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    };

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        StringBuilder result = new StringBuilder();
        result.append(header());

        for(Rental rental : rentals) {

            double thisAmount = rental.getAmount();
            totalAmount  += thisAmount;
            frequentRenterPoints = rental.getFrequentRenterPoints(frequentRenterPoints);

            result.append(mainSentence(rental, thisAmount));
        }

        result.append(footer(totalAmount, frequentRenterPoints));

        return result.toString();
    }

    private String header() {
        return String.format(HEADER, getName());
    }

    private String mainSentence(Rental rental, double thisAmount) {
        return String.format(MAIN_SENTENCE, thisAmount, rental.getMovie().getTitle());
    }

    private String footer(double totalAmount, int frequentRenterPoints) {
        return String.format(AMOUNT_OWED, totalAmount) + String.format(YOU_EARNED, frequentRenterPoints);
    }

}