package com.bibliotheque.bibliotheque.repository;

import com.bibliotheque.bibliotheque.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LivreRepository extends JpaRepository<Livre, Integer> {

    Optional<Livre> findBySlug(String slug);
}
