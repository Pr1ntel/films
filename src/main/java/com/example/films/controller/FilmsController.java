package com.example.films.controller;


import com.example.films.model.FilmsItem;
import com.example.films.service.FilmsService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/films")
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor
public class FilmsController {
    private final FilmsService filmsService;

    @GetMapping(value = "/getAllFilms")
    public List<FilmsItem> getAll() {
        return filmsService.getAll();
    }

    @GetMapping(value = "/horror")
    public List<FilmsItem> getHorrorFilms() {
        return filmsService.getFilmsByStyle("Horror");
    }

    @GetMapping(value = "/fantasy")
    public List<FilmsItem> getFantasyFilms() {
        return filmsService.getFilmsByStyle("Fantasy");
    }

    @GetMapping(value = "/action")
    public List<FilmsItem> getActionFilms() {
        return filmsService.getFilmsByStyle("Action");
    }

    @GetMapping(value = "/comedy")
    public List<FilmsItem> getComedyFilms() {
        return filmsService.getFilmsByStyle("Comedy");
    }



    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable int id) {
        filmsService.deleteById(id);
    }

    @PostMapping(value = "/addNew")
    public void addNew(@RequestBody FilmsItem filmsItem) {
        filmsService.addNew(filmsItem);
    }

    @GetMapping(value = "/byStyle/{style}")
    public List<FilmsItem> getFilmsByStyle(@PathVariable String style){
        return filmsService.getFilmsByStyle(style);
    }

}