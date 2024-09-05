package Modelo;

import java.util.List;

public class Cientista {
    private String nome;
    private String especializacao;
    private String afiliacao;

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacao(String afiliacao) {
        this.afiliacao = afiliacao;
    }

    public void coletarDados(Coral coral) {
        
        coral.coletarDados();
        System.out.println("Dados coletados pelo cientista " + nome + " do coral.");
    }

    public void analisarComportamento(Comportamento comportamento) {
        
        comportamento.analisar();
        System.out.println("Comportamento analisado pelo cientista " + nome + ": " + comportamento.getPadrao());
    }

    public void preverAmeacas(Ameaca ameaca) {
        
        ameaca.prever();
        System.out.println("Ameaça prevista pelo cientista " + nome + ": " + ameaca.getTipo());
    }

    public void publicarResultados() {
      
        System.out.println("Resultados publicados pelo cientista " + nome + " da afiliacao " + afiliacao);
    }
}
