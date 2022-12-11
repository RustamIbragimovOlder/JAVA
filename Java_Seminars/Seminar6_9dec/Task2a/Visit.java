package Java_Seminars.Seminar6_9dec.Task2a;

public class Visit {

    // private LocalDate visitDate; // дата посещения
    private String clinic; // название клиники
    private String veterinarian; // ветеринарный врач
    private String procedures; // процедуры
    private String condition; // состояние
    
    public Visit(String clinic, String veterinarian, String procedures, String condition) {
        // this.visitDate = visitDate;
        this.clinic = clinic;
        this.veterinarian = veterinarian;
        this.procedures = procedures;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Visit [clinic=" + clinic + ", veterinarian=" + veterinarian
                + ", procedures=" + procedures + ", condition=" + condition + "]";
    }
    
}
