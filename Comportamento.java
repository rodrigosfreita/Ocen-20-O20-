package Model;

public class Behavior {
    private String pattern;
    private double movementFrequency;
    private String interactionWithFauna;

  
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public double getMovementFrequency() {
        return movementFrequency;
    }

    public void setMovementFrequency(double movementFrequency) {
        this.movementFrequency = movementFrequency;
    }

    public String getInteractionWithFauna() {
        return interactionWithFauna;
    }

    public void setInteractionWithFauna(String interactionWithFauna) {
        this.interactionWithFauna = interactionWithFauna;
    }

    public void analyze() {
        
        if (movementFrequency > 5.0) {
            pattern = "High activity";
        } else if (movementFrequency > 1.0) {
            pattern = "Moderate activity";
        } else {
            pattern = "Low activity";
        }

        if (interactionWithFauna.equalsIgnoreCase("High")) {
            pattern += " with high interaction with fauna";
        } else if (interactionWithFauna.equalsIgnoreCase("Moderate")) {
            pattern += " with moderate interaction with fauna";
        } else {
            pattern += " with low interaction with fauna";
        }
        
        System.out.println("Behavior analysis: " + pattern);
    }
}
