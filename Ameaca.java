package Modelo;

public class Ameaca {
	private String tipo;
    private int severidade; // 1 (Baixa) a 10 (Alta)
    private double probabilidade; // 0.0 (Nenhuma) a 1.0 (Certa)
    private String origem;

    // Getters and setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSeveridade() {
        return severidade;
    }

    public void setSeveridade(int severidade) {
        this.severidade = severidade;
    }

    public double getProbabilidade() {
        return probabilidade;
    }

    public void setProbabilidade(double probabilidade) {
        this.probabilidade = probabilidade;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void prever() {
       
        if (severidade >= 7 && probabilidade >= 0.7) {
            System.out.println("Ameaça Crítica: Alta severidade e alta probabilidade");
        } else if (severidade >= 5 && probabilidade >= 0.5) {
            System.out.println("Ameaça Significativa: Severidade moderada e probabilidade moderada");
        } else if (severidade < 5 && probabilidade < 0.5) {
            System.out.println("Ameaça Baixa: Baixa severidade e baixa probabilidade");
        } else {
            System.out.println("Ameaça Indeterminada: Severidade e probabilidade não são consistentes");
        }
    }
}
