package Model;

import java.util.ArrayList;
import java.util.List;

public class Tourist {
    private String name;
    private String countryOfOrigin;
    private List<String> interests;
    private List<String> activities;

    public Tourist() {
        this.interests = new ArrayList<>();
        this.activities = new ArrayList<>();
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void collaborate(String collaboration) {
        System.out.println(name + " from " + countryOfOrigin + " is collaborating on: " + collaboration);
    }

    public void participateInActivities(String activity) {
        activities.add(activity);
        System.out.println(name + " from " + countryOfOrigin + " is participating in the activity: " + activity);
    }
}
