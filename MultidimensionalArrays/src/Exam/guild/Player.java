package Exam.guild;

public class Player {

    private String name;
    private String clazz;
    private String rank;
    private String description;

    public Player(String name, String clazz, String rank, String description) {
        this.name = name;
        this.clazz = clazz;
        this.rank = rank;
        this.description = description;
    }

    public Player(String name, String clazz, String rank) {
        this.name = name;
        this.clazz = clazz;
        this.rank = rank;
    }

    public Player(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }
}
