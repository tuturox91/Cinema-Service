package org.sniklz.cinema.dao.impl;

import org.hibernate.SessionFactory;
import org.sniklz.cinema.dao.AbstractDao;
import org.sniklz.cinema.dao.CinemaHallDao;
import org.sniklz.cinema.model.CinemaHall;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
