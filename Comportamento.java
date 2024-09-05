package Modelo;

public class Comportamento {
	private String padrao;
    private double frequenciaDeMovimento;
    private String interacaoComFauna;

    // Getters and setters
    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }

    public double getFrequenciaDeMovimento() {
        return frequenciaDeMovimento;
    }

    public void setFrequenciaDeMovimento(double frequenciaDeMovimento) {
        this.frequenciaDeMovimento = frequenciaDeMovimento;
    }

    public String getInteracaoComFauna() {
        return interacaoComFauna;
    }

    public void setInteracaoComFauna(String interacaoComFauna) {
        this.interacaoComFauna = interacaoComFauna;
    }

    public void analisar() {
        
        if (frequenciaDeMovimento > 5.0) {
            padrao = "Alta atividade";
        } else if (frequenciaDeMovimento > 1.0) {
            padrao = "Atividade moderada";
        } else {
            padrao = "Baixa atividade";
        }

        if (interacaoComFauna.equalsIgnoreCase("Alta")) {
            padrao += " com alta interação com a fauna";
        } else if (interacaoComFauna.equalsIgnoreCase("Moderada")) {
            padrao += " com interação moderada com a fauna";
        } else {
            padrao += " com baixa interação com a fauna";
        }
        
        System.out.println("Análise de comportamento: " + padrao);
    }
}
