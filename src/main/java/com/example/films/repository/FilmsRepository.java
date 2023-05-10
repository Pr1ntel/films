package com.example.films.repository;


import com.example.films.model.FilmsItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmsRepository extends JpaRepository<FilmsItem, Integer> {
    List<FilmsItem> findAllByStyleFilm(String style);
    FilmsItem findFilmsItemById(int id);
}