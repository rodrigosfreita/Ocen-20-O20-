package Model;

import java.util.ArrayList;
import java.util.List;

public class LocalCommunity {
    private String name;
    private String region;
    private int numberOfMembers;
    private List<String> events;

    public LocalCommunity() {
        this.events = new ArrayList<>();
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public List<String> getEvents() {
        return events;
    }

    public void collaborate(String collaboration) {
        
        System.out.println("The community " + name + " from the region " + region + " is collaborating on: " + collaboration);
    }

    public void organizeEvents(String event) {
       
        events.add(event);
        System.out.println("The community " + name + " from the region " + region + " organized the event: " + event);
    }
}
