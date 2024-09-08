#Coral Preservation Project
#Description
This project simulates a collaboration system between scientists, tourists, sensors, and local communities for coral preservation. It allows different entities to collect data, organize events, and participate in environmental preservation projects, promoting an interconnected system to monitor and protect marine ecosystems.

#Project Structure
The project is composed of various Java classes that represent the different entities involved in the system:

#1. Class Threat
Description: Represents a threat to the environment, based on severity, probability, and origin. The class predicts the threat level (low, moderate, or critical) depending on these variables.
#Key Methods:
predict(): Calculates and displays the threat level based on severity and probability values.
#2. Class Scientist
Description: Represents a scientist who collects coral data, analyzes behaviors, predicts threats, and publishes their findings.
#Key Methods:
collectData(Coral coral): Collects data from a Coral object.
analyzeBehavior(Behavior behavior): Analyzes the behavior of a coral.
predictThreats(Threat threat): Predicts threats to the marine environment.
publishResults(): Publishes the results of the research.
#3. Class Collaboration
Description: Represents a collaboration between different entities (scientists, communities, tourists), enabling the facilitation of preservation activities.
#Key Methods:
facilitate(): Facilitates collaboration between participants.
registerParticipant(String participant): Registers new participants in the collaboration.
setDateAndLocation(String date, String location): Sets the date and location of the collaboration.
#4. Class Behavior
Description: Represents coral behavior, including movement frequency and interaction with local fauna.
#Key Methods:
analyze(): Analyzes coral behavior and defines patterns based on movement frequency and interaction with fauna.
#5. Class LocalCommunity
Description: Represents a local community that can organize events and collaborate on preservation projects.
#Key Methods:
collaborate(String collaboration): Collaborates on a project.
organizeEvents(String event): Organizes events related to environmental preservation.
#6. Class Coral
Description: Models the characteristics of a coral, such as growth rate, polyp density, stress response, and other environmental parameters.
#Key Methods:
collectData(): Collects data from the sensors attached to the coral.
calculateGrowthRate(): Calculates the growth rate of the coral.
detectStressResponse(): Detects the stress response based on environmental conditions, such as water temperature and pH.
#7. Class Sensor
Description: Simulates a sensor that collects environmental data from the coral, such as water temperature and luminosity.
#Key Methods:
collectData(): Collects simulated data from the sensors.
sendData(): Sends the collected data for processing.
#8. Class Tourist
Description: Represents a tourist who participates in preservation activities and has interests related to the environment.
#Key Methods:
collaborate(String collaboration): Collaborates on preservation projects.
participateInActivities(String activity): Participates in organized activities, such as beach cleanups and workshops.
#9. Class Main
#Description: The main class that initializes and runs the system, prompting for data input for the entities and demonstrating interactions between scientists, tourists, local communities, and collaborations.
How to Run
Clone the repository to your local machine.
Compile the .java files using the Java compiler.
Run the Main.java file to start the interaction between the classes.
Enter the data as prompted by the program.
Contributions
Contributions to improve the system or add new functionalities are welcome. Please submit a pull request or open an issue to discuss any changes you'd like to propose.

