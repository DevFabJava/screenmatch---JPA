package br.com.alura.screenmatchJpa.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record DadosEpisodio(@JsonAlias("Title") String titulo,
                                @JsonAlias("Episode") Integer numero,
                                @JsonAlias("imdbRating") String avaliacao,
                                @JsonAlias("Released") String dataLancamento) {
    }

