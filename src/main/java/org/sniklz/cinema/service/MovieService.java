package org.sniklz.cinema.service;

import java.util.List;
import org.sniklz.cinema.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
