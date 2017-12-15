package model;

public class Person {
    private final Integer id;
    private final String name;
    private final Character gender;
    private final String birthdate;
    private final float weight;
    private final String mail;
    public Person(Integer id, String name, Character gender, String birthdate, float weight, String mail) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.weight = weight;
        this.mail = mail;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Character getGender() {
        return gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public float getWeight() {
        return weight;
    }

    public String getMail() {
        return mail;
    }
    
}
