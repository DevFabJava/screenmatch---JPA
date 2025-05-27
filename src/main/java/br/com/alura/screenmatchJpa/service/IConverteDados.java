package br.com.alura.screenmatchJpa.service;


    public interface IConverteDados {
        <T> T  obterDados(String json, Class<T> classe);
    }


