package Instances;

public class Crew {
    private String name;
    private int age;
    private String rank;
    private String position;

    public crewMember(String name, int age, String rank, String position) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.position = position;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getRank {
        return rank;
    }
    public String getPosition() {
        return position;
    }
}
