package Model;

import java.util.List;

public class Scientist {
    private String name;
    private String specialization;
    private String affiliation;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public void collectData(Coral coral) {
        
        coral.collectData();
        System.out.println("Data collected by scientist " + name + " from the coral.");
    }

    public void analyzeBehavior(Behavior behavior) {
        
        behavior.analyze();
        System.out.println("Behavior analyzed by scientist " + name + ": " + behavior.getPattern());
    }

    public void predictThreats(Threat threat) {
        
        threat.predict();
        System.out.println("Threat predicted by scientist " + name + ": " + threat.getType());
    }

    public void publishResults() {
      
        System.out.println("Results published by scientist " + name + " from affiliation " + affiliation);
    }
}
