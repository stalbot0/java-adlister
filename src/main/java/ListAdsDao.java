import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    private List<Ad> generateAds() {
//        User user = new User();
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                "Car for Sale",
                "2005 Mustang GT for sale. Terrible condition.",
                2500,
                new User("Stephen Talbot", 28, "2672752474")
        ));
        ads.add(new Ad(
                2,
                "Barbie Dolls for Sale",
                "Mint condition Barbie Dolls for sale from 1998.",
                10000,
                new User("Shawn Hardin", 21, "3215551000")
        ));
        ads.add(new Ad(
                3,
                "Looking for refrigerator",
                "In need of a sick fridge for all of my monster and redbull duuuuude",
                123,
                new User("Tyler Whitman", 23, "6108093987")
        ));
        return ads;
    }
}




