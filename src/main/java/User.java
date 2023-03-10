import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class User implements Serializable {
    private String name;
    private int age;
    private String phoneNumber;
}
