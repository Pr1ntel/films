package com.example.films.service;


import com.example.films.model.FilmsItem;
import com.example.films.repository.FilmsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FilmsService {

    private final FilmsRepository filmsRepository;

    public List<FilmsItem> getAll() {
        return filmsRepository.findAll();
    }

    public void deleteById(int id) {
        filmsRepository.deleteById(id);
    }

    public FilmsItem findFilmById(int id) {
       return filmsRepository.findFilmsItemById(id);
    }

    public void addNew(FilmsItem filmsItem) {
        filmsRepository.save(filmsItem);
    }

    public List<FilmsItem> getFilmsByStyle(String style) {
        return filmsRepository.findAllByStyleFilm(style);
    }

}