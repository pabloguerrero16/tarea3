package com.practica.iticket.service;

import java.util.List;
import com.practica.iticket.entity.Evento;

/**
 *
 * @author Pablo Guerrero
 */
public interface IEventoService {
    public List<Evento> getAllEvento();
    public Evento getEventoById(long id);
    public void saveEvento(Evento evento);
    public void delete (long id);
}
