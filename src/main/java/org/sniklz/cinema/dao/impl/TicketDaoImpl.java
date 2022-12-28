package org.sniklz.cinema.dao.impl;

import org.hibernate.SessionFactory;
import org.sniklz.cinema.dao.AbstractDao;
import org.sniklz.cinema.dao.TicketDao;
import org.sniklz.cinema.model.Ticket;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
