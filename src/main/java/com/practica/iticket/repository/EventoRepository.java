package com.practica.iticket.repository;
import com.practica.iticket.entity.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Pablo Guerrero
 */
@Repository
public interface EventoRepository extends CrudRepository<Evento, Long>{
    
}
