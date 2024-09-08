package Model;
import java.util.ArrayList;
import java.util.List;

public class Coral {
    private double growthRate;
    private int polypDensity;
    private String stressResponse;
    private String color;
    private double waterTemperature;
    private double pHLevel;
    private double luminosity;
    private List<Sensor> sensors;

    public Coral() {
        this.sensors = new ArrayList<>();
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public int getPolypDensity() {
        return polypDensity;
    }

    public void setPolypDensity(int polypDensity) {
        this.polypDensity = polypDensity;
    }

    public String getStressResponse() {
        return stressResponse;
    }

    public void setStressResponse(String stressResponse) {
        this.stressResponse = stressResponse;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(double waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public double getPHLevel() {
        return pHLevel;
    }

    public void setPHLevel(double pHLevel) {
        this.pHLevel = pHLevel;
    }

    public double getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }

    public void collectData() {
        for (Sensor sensor : sensors) {
            List<String> data = sensor.collectData();
            for (String datum : data) {
                System.out.println("Data collected by sensor " + sensor.getType() + ": " + datum);
            }
        }
    }

    public double calculateGrowthRate() {
        // Growth rate calculation based on polyp density
        return growthRate * (1 + (polypDensity / 100.0));
    }

    public int measurePolypDensity() {
        return polypDensity;
    }

    public String detectStressResponse() {
        if (waterTemperature > 30 || pHLevel < 7.5) {
            stressResponse = "High";
        } else {
            stressResponse = "Low";
        }
        return stressResponse;
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public List<Sensor> getSensors() {
        return sensors;
    }
}
