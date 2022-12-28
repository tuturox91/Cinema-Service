package org.sniklz.cinema.dao;

import java.util.List;
import java.util.Optional;
import org.sniklz.cinema.model.CinemaHall;

public interface CinemaHallDao {
    CinemaHall add(CinemaHall cinemaHall);

    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}
