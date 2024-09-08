package Model;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private int id;
    private String type;
    private String location;
    private String status;
    private List<String> collectedData;

    public Sensor(int id, String type, String location) {
        this.id = id;
        this.type = type;
        this.location = location;
        this.status = "active";
        this.collectedData = new ArrayList<>();
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getCollectedData() {
        return collectedData;
    }

    public void activate() {
        this.status = "active";
    }

    public void deactivate() {
        this.status = "inactive";
    }

    public List<String> collectData() {
        // Simulating data collection
        collectedData.add("Simulated data from sensor " + type);
        return collectedData;
    }

    public void sendData() {
        // Simulating data transmission
        for (String data : collectedData) {
            System.out.println("Sending data: " + data);
        }
    }
}

