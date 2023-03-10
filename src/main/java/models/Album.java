package models;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Album implements Serializable {
    private int id;
    private String artist;
    private String nameRecord;
    private int releaseDate;
    private double sales;
    private String genre;
}


