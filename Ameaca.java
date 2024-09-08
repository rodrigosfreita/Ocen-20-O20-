package Model;

public class Threat {
    private String type;
    private int severity; // 1 (Low) to 10 (High)
    private double probability; // 0.0 (None) to 1.0 (Certain)
    private String source;

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void predict() {
        
        if (severity >= 7 && probability >= 0.7) {
            System.out.println("Critical Threat: High severity and high probability");
        } else if (severity >= 5 && probability >= 0.5) {
            System.out.println("Significant Threat: Moderate severity and moderate probability");
        } else if (severity < 5 && probability < 0.5) {
            System.out.println("Low Threat: Low severity and low probability");
        } else {
            System.out.println("Indeterminate Threat: Severity and probability are inconsistent");
        }
    }
}
