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
    private double price;
    private User user;
}
