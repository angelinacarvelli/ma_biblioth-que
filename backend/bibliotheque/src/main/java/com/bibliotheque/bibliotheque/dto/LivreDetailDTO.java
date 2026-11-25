package com.bibliotheque.bibliotheque.dto;

public record LivreDetailDTO(
    String titre,
    String slug,
    String auteur,
    Integer anneeParution,
    String resume,
    String image
) {}
