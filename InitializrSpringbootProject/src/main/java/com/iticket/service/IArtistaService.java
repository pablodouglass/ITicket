/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iticket.service;
import com.iticket.entity.Artista;
import java.util.List;
import com.iticket.repository.ArtistaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author v-pablodou
 */
public interface IArtistaService {
    public List<Artista> getAllPerson();
    public void saveArtist(Artista artista);
    public void getArtistById (long id);
    public void delete(long id);  
    

}
