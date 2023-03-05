package com.practica.iticket.controller;

import com.practica.iticket.entity.Artista;
import com.practica.iticket.entity.Evento;
import com.practica.iticket.service.IArtistaService;
import com.practica.iticket.service.IEventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Pablo Guerrero
 */
@Controller
public class EventoController {
    
    @Autowired
    private IEventoService eventoService;
    
    @Autowired
    private IArtistaService artistaService;
    
    @GetMapping("/evento")
    public String index(Model model){
        List<Evento> listaEvento=eventoService.getAllEvento();
        model.addAttribute("titulo", "Tabla de Eventos");
        model.addAttribute("personas",listaEvento);
        return "eventos";
    }
    
    @GetMapping("/eventoN")
    public String crearEvento(Model model){
        List<Artista> listaArtistas = artistaService.listArtist();
        model.addAttribute("evento", new Evento());
        model.addAttribute("artistas", listaArtistas);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarEvento(@PathVariable("id") Long idEvento){
        eventoService.delete(idEvento);
        return "redirect:/evento";
    }
    
    @PostMapping("/save")
    public String guardarEvento(@ModelAttribute Evento evento){
        eventoService.saveEvento(evento);
        return "redirect:/evento";
    }
    
    @GetMapping("/editEvento/{id}")
    public String editarEvento(@PathVariable("id") Long idEvento, Model model){
        Evento evento = eventoService.getEventoById(idEvento);
        List<Artista> listaArtistas = artistaService.listArtist();
        model.addAttribute("evento",evento);
        model.addAttribute("artistas",listaArtistas);
        return "crear";
    }
}
