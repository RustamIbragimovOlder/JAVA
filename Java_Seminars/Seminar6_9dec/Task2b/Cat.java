package Java_Seminars.Seminar6_9dec.Task2b;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cat {
    private String name;
    private String breed;
    private String color;
    private LocalDate birthDate;
    private List<Award> awards;
    private String owner;
    
    public Cat(String name, String breed, String color, LocalDate birthDate, String owner) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.birthDate = birthDate;
        this.owner = owner;
        this.awards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", breed=" + breed + ", color=" + color + ", birthDate=" + birthDate + ", awards="
                + awards + ", owner=" + owner + "]";
    }


    // метод добавления награды (участия в конкурсе)
    public void addAward (Award award) {
        awards.add(award);
    }





    
    
}
