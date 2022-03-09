/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iticket.controller;

/**
 *
 * @author v-pablodou
 */
import com.iticket.entity.Artista;
import com.iticket.service.IArtistaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
public class ArtistaController {
    @Autowired
    //Se invoca la interfaz y string busca la clase que la implementa.
    private IArtistaService personaService;
    
    @GetMapping("/personas")
    public String index(Model model) {
        List<Artista> listaPersonas=personaService.getAllPerson();
        model.addAttribute("titulo","Artistas");
        model.addAttribute("artistas", listaPersonas);
        return "artistas";
    }
    
    @GetMapping("/nuevoArtista")
    public String nuevaPersona(Artista artista){
        return "modificarArtista";
    }
    
//
    
    @PostMapping("/guardarArtista")
    public String guardarArtista(Artista artista) {
        personaService.saveArtist(artista);
        return "redirect:/artistas";
    }   
}

