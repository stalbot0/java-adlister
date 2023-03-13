import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Ad implements Serializable {
    private int id;
    private String title;
    private String description;
    private int price;
    private User user;

    public Ad(int id, String title, String description, double price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = (int) price;
    }
}
