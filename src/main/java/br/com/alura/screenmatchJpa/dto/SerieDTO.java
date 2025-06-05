package br.com.alura.screenmatchJpa.dto;

import br.com.alura.screenmatchJpa.model.Categoria;

public record SerieDTO (

         Long id,
         String titulo,
         Integer totalTemporadas,
         Double avaliacao,
         Categoria genero,
         String atores,
         String poster,
         String sinopse) {
}
