package Modelo;
import java.util.ArrayList;
import java.util.List;

public class Coral {
	 private double taxaCrescimento;
	    private int densidadePolipos;
	    private String respostaEstresse;
	    private String cor;
	    private double temperaturaAgua;
	    private double nivelPH;
	    private double luminosidade;
	    private List<Sensor> sensores;

	    public Coral() {
	        this.sensores = new ArrayList<>();
	    }

	   
	    public double getTaxaCrescimento() {
	        return taxaCrescimento;
	    }

	    public void setTaxaCrescimento(double taxaCrescimento) {
	        this.taxaCrescimento = taxaCrescimento;
	    }

	    public int getDensidadePolipos() {
	        return densidadePolipos;
	    }

	    public void setDensidadePolipos(int densidadePolipos) {
	        this.densidadePolipos = densidadePolipos;
	    }

	    public String getRespostaEstresse() {
	        return respostaEstresse;
	    }

	    public void setRespostaEstresse(String respostaEstresse) {
	        this.respostaEstresse = respostaEstresse;
	    }

	    public String getCor() {
	        return cor;
	    }

	    public void setCor(String cor) {
	        this.cor = cor;
	    }

	    public double getTemperaturaAgua() {
	        return temperaturaAgua;
	    }

	    public void setTemperaturaAgua(double temperaturaAgua) {
	        this.temperaturaAgua = temperaturaAgua;
	    }

	    public double getNivelPH() {
	        return nivelPH;
	    }

	    public void setNivelPH(double nivelPH) {
	        this.nivelPH = nivelPH;
	    }

	    public double getLuminosidade() {
	        return luminosidade;
	    }

	    public void setLuminosidade(double luminosidade) {
	        this.luminosidade = luminosidade;
	    }

	    public void coletarDados() {
	        for (Sensor sensor : sensores) {
	            List<String> dados = sensor.coletarDados();
	            for (String dado : dados) {
	                System.out.println("Dado coletado pelo sensor " + sensor.getTipo() + ": " + dado);
	            }
	        }
	    }

	    public double calcularTaxaCrescimento() {
	       
	        return taxaCrescimento * (1 + (densidadePolipos / 100.0));
	    }

	    public int medirDensidadePolipos() {
	       
	        return densidadePolipos;
	    }

	    public String detectarRespostaEstresse() {
	       
	        if (temperaturaAgua > 30 || nivelPH < 7.5) {
	            respostaEstresse = "Alta";
	        } else {
	            respostaEstresse = "Baixa";
	        }
	        return respostaEstresse;
	    }

	    public void adicionarSensor(Sensor sensor) {
	        this.sensores.add(sensor);
	    }

	    public List<Sensor> getSensores() {
	        return sensores;
	    }
}
