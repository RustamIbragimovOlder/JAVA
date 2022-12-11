package Java_Lectures.Lecture6_9dec.Example5;

public class Worker {
    // описываем сущность, добавляем ПОЛЯ
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        String res = String.format("Имя - %s Фамилия - %s, таб. номер - %d, ЗП - %d", firstName, lastName, id, salary);
        return res;
    }

    @Override
    public boolean equals(Object o) {
        Worker t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }



    public static void main (String[] args) {
        
    }
    
}
