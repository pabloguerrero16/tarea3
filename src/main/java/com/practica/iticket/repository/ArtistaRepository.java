package com.practica.iticket.repository;
import com.practica.iticket.entity.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pablo Guerrero
 */
@Repository
public interface ArtistaRepository extends CrudRepository<Artista,Long> {
    
}
