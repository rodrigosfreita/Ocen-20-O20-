package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ComunidadeLocal {
    private String nome;
    private String regiao;
    private int numeroDeMembros;
    private List<String> eventos;

    public ComunidadeLocal() {
        this.eventos = new ArrayList<>();
    }

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public int getNumeroDeMembros() {
        return numeroDeMembros;
    }

    public void setNumeroDeMembros(int numeroDeMembros) {
        this.numeroDeMembros = numeroDeMembros;
    }

    public List<String> getEventos() {
        return eventos;
    }

    public void colaborar(String colaboracao) {
        
        System.out.println("A comunidade " + nome + " da região " + regiao + " está colaborando em: " + colaboracao);
    }

    public void organizarEventos(String evento) {
       
        eventos.add(evento);
        System.out.println("A comunidade " + nome + " da região " + regiao + " organizou o evento: " + evento);
    }
}
