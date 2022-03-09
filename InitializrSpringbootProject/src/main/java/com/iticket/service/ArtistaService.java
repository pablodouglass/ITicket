/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iticket.service;
import com.iticket.entity.Artista;
import com.iticket.repository.ArtistaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author v-pablodou
 */
@Service
public class ArtistaService implements IArtistaService {
    //Inyección de dependencias que están en "PersonaRepository".
    @Autowired
    private ArtistaRepository artistaRepository;

    @Override
    public List<Artista> getAllPerson() {
        return (List<Artista>)artistaRepository.findAll();
    }

    @Override
    public void saveArtist(Artista artista) {
        artistaRepository.save(artista);
    }

    public void getArtistaById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   

    @Override
    public void getArtistById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
