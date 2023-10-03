package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private static final String DEFAULT_MESSAGE = "Data not available";
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;




    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String errorMessage = "Data not available";
        if (name.isEmpty()) name = errorMessage;
        if (employer.getValue().isEmpty()) employer.value = errorMessage;
        if (location.getValue().isEmpty()) location.value = errorMessage;
        if (positionType.getValue().isEmpty()) positionType.value = errorMessage;
        if (coreCompetency.getValue().isEmpty()) coreCompetency.value =errorMessage;

        return System.lineSeparator() +
                "ID: " + id +
                "\nName: " + name +
                "\nEmployer: " + employer.getValue() +
                "\nLocation: " + location.getValue() +
                "\nPosition Type: " + positionType.getValue() +
                "\nCore Competency: " + coreCompetency.getValue() +
                System.lineSeparator();


//    @Override
//    public String toString() {
//        return System.lineSeparator() +
//                String.format("ID: %s\nName: %s\nEmployer: %s\nLocation: %s\nPosition Type: %s\nCore Competency: %s",
//                id,
//                name == null ? DEFAULT_MESSAGE : name,
//                employer == null ? DEFAULT_MESSAGE : employer.getValue(),
//                location == null ? DEFAULT_MESSAGE : location.getValue(),
//                positionType == null ? DEFAULT_MESSAGE : positionType.getValue(),
//                coreCompetency == null ? DEFAULT_MESSAGE : coreCompetency.getValue() ) +
//                System.lineSeparator();

//        if (name == null){
//            System.out.println(errorMessage);
//        }
//        if (employer == null){
//            System.out.println(errorMessage);}
//
//        if (location == null) {
//            System.out.println(errorMessage);}
//
//        if (positionType == null) {
//            System.out.println(errorMessage);}
//
//        if (coreCompetency == null) {
//            System.out.println(errorMessage);}
//    }

    }
}
