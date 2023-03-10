package models;

import java.io.Serializable;
import java.util.ArrayList;

public class BeanTest implements Serializable {
    public static void main(String[] args) {
        //DON'T USE ALL ARG CONSTRUCTOR FOR WORKING W BEANS, YOU'LL HAVE TO GO THROUGH AND ACTUALLY ADD THE INDIVIDUAL VARIABLES
        Album rockNRoll = new Album(1, "DoodleBob", "The Hash Slinging Slasher", 1994, 320.75, "The Hardest Rock'N'Roll you've ever heard");
        Album rap = new Album();
        Album tightJeans = new Album();

        Author stephen = new Author(1, "Stephen", "Talbot");
        Author bettyCrocker = new Author(2, "Betty", "Crocker");

        ArrayList<Quote> stephensQuotes = new ArrayList<>();
        Quote quote = new Quote(1, "He who waits is he who has time.", stephen);
        stephensQuotes.add(quote);

        quote = new Quote(2, "This is the end.", bettyCrocker);
        Quote iWroteThis = new Quote(3, "Hello, it me.", stephen);
        stephensQuotes.add(quote);

//        System.out.println(rockNRoll);
//        System.out.println(bettyCrocker);
//        System.out.println(glockenspiel);
        System.out.format("Stephen's Favorite Quotes:%n");
        for (Quote quotes : stephensQuotes) {
            System.out.format("Author: %s | Quote: %s%n", quotes.getAuthor(), quotes.getContent());
        }
    }
}
