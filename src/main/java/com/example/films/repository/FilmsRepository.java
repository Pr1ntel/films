package com.example.films.repository;


import com.example.films.model.FilmsItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmsRepository extends JpaRepository<FilmsItem, Integer> {
}