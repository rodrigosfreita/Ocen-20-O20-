package Model;

import java.util.ArrayList;
import java.util.List;

public class Collaboration {
    private String type;
    private List<String> participants;
    private String date;
    private String location;

    public Collaboration() {
        this.participants = new ArrayList<>();
    }

   
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void facilitate() {
        
        System.out.println("Facilitating collaboration of type " + type + " at location " + location + " on date " + date);
    }

    public void registerParticipant(String participant) {
       
        participants.add(participant);
        System.out.println("Participant " + participant + " registered in the collaboration of type " + type);
    }

    public void setDateAndLocation(String date, String location) {
       
        this.date = date;
        this.location = location;
        System.out.println("Date and location set: " + date + " at " + location);
    }
}
