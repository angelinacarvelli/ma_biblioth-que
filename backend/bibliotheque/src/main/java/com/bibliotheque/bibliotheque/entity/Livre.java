package com.bibliotheque.bibliotheque.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "livres")
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String titre;

    @Column(nullable = false, unique = true)
    private String slug;

    @Column(nullable = false)
    private String auteur;

    @Column(name = "annee_parution")
    private Integer anneeParution;

    @Column(columnDefinition = "TEXT")
    private String resume;

    private String image;

    public Livre() {}

    public Integer getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getSlug() {
        return slug;
    }

    public String getAuteur() {
        return auteur;
    }

    public Integer getAnneeParution() {
        return anneeParution;
    }

    public String getResume() {
        return resume;
    }

    public String getImage() {
        return image;
    }
}
