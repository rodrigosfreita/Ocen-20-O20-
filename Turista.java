package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Turista {
    private String nome;
    private String paisOrigem;
    private List<String> interesses;
    private List<String> atividades;

    public Turista() {
        this.interesses = new ArrayList<>();
        this.atividades = new ArrayList<>();
    }

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public List<String> getInteresses() {
        return interesses;
    }

    public void setInteresses(List<String> interesses) {
        this.interesses = interesses;
    }

    public List<String> getAtividades() {
        return atividades;
    }

    public void colaborar(String colaboracao) {
        
        System.out.println(nome + " do país " + paisOrigem + " está colaborando em: " + colaboracao);
    }

    public void participarAtividades(String atividade) {
        
        atividades.add(atividade);
        System.out.println(nome + " do país " + paisOrigem + " está participando da atividade: " + atividade);
    }
}