package com.example.films.dao;


import com.example.films.dbconnection.DbConnection;
import com.example.films.model.FilmsItem;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import java.util.List;

public class daoAllFilms  {
    protected FilmsItem filmsItem;

    public daoAllFilms(FilmsItem filmsItem) {
        this.filmsItem = filmsItem;
    }
    public List<FilmsItem> getHorrorFilms (){
        Session session = DbConnection.getInstance().getSessionFactory().openSession();
        {
            return (List<FilmsItem>) session.createQuery("From", FilmsItem.class).list();
        }
    }
}
