package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Colaboracao {
    private String tipo;
    private List<String> participantes;
    private String data;
    private String local;

    public Colaboracao() {
        this.participantes = new ArrayList<>();
    }

    // Getters and setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<String> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<String> participantes) {
        this.participantes = participantes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void facilitar() {
        
        System.out.println("Facilitando colaboração do tipo " + tipo + " no local " + local + " na data " + data);
    }

    public void registrarParticipantes(String participante) {
       
        participantes.add(participante);
        System.out.println("Participante " + participante + " registrado na colaboração do tipo " + tipo);
    }

    public void definirDataLocal(String data, String local) {
       
        this.data = data;
        this.local = local;
        System.out.println("Data e local definidos: " + data + " em " + local);
    }
}