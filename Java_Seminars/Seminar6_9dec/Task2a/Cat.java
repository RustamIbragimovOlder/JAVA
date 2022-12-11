package Java_Seminars.Seminar6_9dec.Task2a;

import java.time.LocalDate;

public class Cat {
    private String nameCat; // кличка кота
    private String ownerCat; // хозяин кота
    private LocalDate birthDayCat; // дата рождения кота
    private String breedCat; // порода кота // enum
    private String colorCat; // цвет кота
    private float weightCat; // вес кота в кг
    // private List<Visit> visit; // история посещений (болезни, прививки и т.д.)
    
    
    // метод конструктор (инициализация полей) - все, кроме коллекций
    public Cat (String nameCat, String ownerCat, LocalDate birthDayCat, String breedCat, String colorCat, float weightCat) {
        this.nameCat = nameCat;
        this.ownerCat = ownerCat;
        this.birthDayCat = birthDayCat;
        this.breedCat = breedCat;
        this.colorCat = colorCat;
        this.weightCat = weightCat;
    }
    
    // функции открывания прав (на каждое поле)
    public String getNameCat() { return nameCat; }
    public void setNameCat(String nameCat) { this.nameCat = nameCat; }
    
    public String getOwnerCat() { return ownerCat; }
    public void setOwnerCat(String ownerCat) { this.ownerCat = ownerCat; }
    
    public LocalDate getBirthDayCat() { return birthDayCat; }
    public void setBirthDayCat(LocalDate birthDayCat) { this.birthDayCat = birthDayCat; }
    
    public String getBreedCat() { return breedCat; }
    public void setBreedCat(String breedCat) { this.breedCat = breedCat; }
    
    public String getColorCat() { return colorCat; }
    public void setColorCat(String colorCat) { this.colorCat = colorCat; }
    
    public float getWeightCat() { return weightCat; }
    public void setWeightCat(float weightCat) { this.weightCat = weightCat; }
    
    // метод вывода данных
    @Override
    public String toString() {
        return String.format("%s %s %s %d.%d.%d %s %s", nameCat, ownerCat, breedCat, birthDayCat, colorCat, weightCat);
    }

    // функция мяуканья
    public void meow () {
        System.out.println("Meow!");
    }
    
    // // метод добавления посещения клиники
    // public void addVisit (Visit visit) {
    //     visit.add(visit);
    // }

    // функция вычисления возраста
    // age ()


}


