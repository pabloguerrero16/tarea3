package com.practica.iticket.service;
import com.practica.iticket.entity.Artista;
import com.practica.iticket.repository.ArtistaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo Guerrero
 */
@Service
public class ArtistaService implements IArtistaService {
    @Autowired
    private ArtistaRepository artistaRepository;

    @Override
    public List<Artista> listArtist(){
        return (List<Artista>)artistaRepository.findAll();
    }
}
