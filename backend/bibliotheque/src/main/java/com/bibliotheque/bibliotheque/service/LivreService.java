package com.bibliotheque.bibliotheque.service;

import com.bibliotheque.bibliotheque.dto.LivreDetailDTO;
import com.bibliotheque.bibliotheque.dto.LivreListeDTO;
import com.bibliotheque.bibliotheque.entity.Livre;
import com.bibliotheque.bibliotheque.repository.LivreRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * Service handling read operations for books.
 */
@Service
public class LivreService {

    private final LivreRepository repository;

    public LivreService(LivreRepository repository) {
        this.repository = repository;
    }

    public List<LivreListeDTO> getAllLivres() {
        return repository.findAll().stream()
            .map(livre -> new LivreListeDTO(
                livre.getTitre(),
                livre.getSlug(),
                livre.getAuteur(),
                livre.getImage()
            ))
            .toList();
    }

    public LivreDetailDTO getLivreBySlug(String slug) {
        Livre livre = repository.findBySlug(slug)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Livre introuvable"));

        return new LivreDetailDTO(
            livre.getTitre(),
            livre.getSlug(),
            livre.getAuteur(),
            livre.getAnneeParution(),
            livre.getResume(),
            livre.getImage()
        );
    }
}
