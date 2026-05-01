package br.com.cursoudemy.calculadora.model;

@FunctionalInterface
public interface MemoriaObservador {

    void valorAlterado(String novoValor);
}
