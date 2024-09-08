package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        LocalCommunity community = new LocalCommunity();
        System.out.println("Enter the details of the Local Community:");
        System.out.print("Name: ");
        community.setName(scanner.nextLine());
        System.out.print("Region: ");
        community.setRegion(scanner.nextLine());
        System.out.print("Number of Members: ");
        community.setNumberOfMembers(scanner.nextInt());
        scanner.nextLine();  // Consume the new line

        
        community.collaborate("Coral Preservation Project");

        // Organization of events by the local community
        community.organizeEvents("Beach Cleanup");
        community.organizeEvents("Marine Biology Workshop");

        
        System.out.println("Organized events: " + community.getEvents());

        
        Tourist tourist = new Tourist();
        System.out.println("Enter the details of the Tourist:");
        System.out.print("Name: ");
        tourist.setName(scanner.nextLine());
        System.out.print("Country of Origin: ");
        tourist.setCountryOfOrigin(scanner.nextLine());

        
        System.out.println("Enter the Tourist's interests (separated by commas): ");
        String[] interestsArray = scanner.nextLine().split(",");
        List<String> interests = new ArrayList<>();
        for (String interest : interestsArray) {
            interests.add(interest.trim());
        }
        tourist.setInterests(interests);

        // Tourist collaboration
        tourist.collaborate("Coral Preservation Project");

        // Participation in activities by the tourist
        tourist.participateInActivities("Beach Cleanup");
        tourist.participateInActivities("Marine Biology Workshop");

        // Display activities the tourist participated in
        System.out.println("Activities that " + tourist.getName() + " participated in: " + tourist.getActivities());

        // Input for Collaboration
        Collaboration collaboration = new Collaboration();
        System.out.println("Enter the details of the Collaboration:");
        System.out.print("Type: ");
        collaboration.setType(scanner.nextLine());
        System.out.print("Date (YYYY-MM-DD): ");
        collaboration.setDate(scanner.nextLine());
        System.out.print("Location: ");
        collaboration.setLocation(scanner.nextLine());

        // Facilitation of collaboration
        collaboration.facilitate();

        // Register participants in the collaboration
        collaboration.registerParticipant("Dr. Silva");
        collaboration.registerParticipant("Coastal Community");
        collaboration.registerParticipant("Tourist João");

        // Display registered participants
        System.out.println("Registered participants: " + collaboration.getParticipants());
    }
}
