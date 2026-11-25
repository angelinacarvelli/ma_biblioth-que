package com.bibliotheque.bibliotheque.controller;

import com.bibliotheque.bibliotheque.dto.LivreDetailDTO;
import com.bibliotheque.bibliotheque.dto.LivreListeDTO;
import com.bibliotheque.bibliotheque.service.LivreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/livres")
@CrossOrigin(origins = {"http://localhost:4200", "http://127.0.0.1:4200"})
public class LivreController {

    private final LivreService service;

    public LivreController(LivreService service) {
        this.service = service;
    }

    @GetMapping
    public List<LivreListeDTO> getAllLivres() {
        return service.getAllLivres();
    }

    @GetMapping("/{slug}")
    public ResponseEntity<LivreDetailDTO> getLivre(@PathVariable String slug) {
        return ResponseEntity.ok(service.getLivreBySlug(slug));
    }
}
