package com.example.films.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name =  "films")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FilmsItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_films")
    private String nameFilms;

    @Column(name = "release_date")
    private int releaseDate;

    @Column(name = "duration_film")
    private int durationFilm;

    @Column(name = "photo_film")
    private String photoFilm;

    @Column(name = "description_film")
    private String descriptionFilm;

    @Column(name = "style_film")
    private String styleFilm;
}