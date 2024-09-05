package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
	private int id;
    private String tipo;
    private String localizacao;
    private String status;
    private List<String> dadosColetados;

    public Sensor(int id, String tipo, String localizacao) {
        this.id = id;
        this.tipo = tipo;
        this.localizacao = localizacao;
        this.status = "ativo";
        this.dadosColetados = new ArrayList<>();
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getDadosColetados() {
        return dadosColetados;
    }

    public void ativar() {
        this.status = "ativo";
    }

    public void desativar() {
        this.status = "inativo";
    }

    public List<String> coletarDados() {
        
        dadosColetados.add("Dado simulado do sensor " + tipo);
        return dadosColetados;
    }

    public void enviarDados() {
        
        for (String dado : dadosColetados) {
            System.out.println("Enviando dado: " + dado);
        }
    }
}
