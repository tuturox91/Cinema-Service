package org.sniklz.cinema.dao.impl;

import org.hibernate.SessionFactory;
import org.sniklz.cinema.dao.AbstractDao;
import org.sniklz.cinema.dao.MovieDao;
import org.sniklz.cinema.model.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
