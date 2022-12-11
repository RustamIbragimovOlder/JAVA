package Java_Seminars.Seminar6_9dec.Task2b;

public class Award {
    private String contest; // название конкурса
    private String place; // место проведения
    private int year; // год проведения
    private String range; // занятое место
    
    
    public Award(String contest, String place, int year, String range) {
        this.contest = contest;
        this.place = place;
        this.year = year;
        this.range = range;
    }


    @Override
    public String toString() {
        return "Award [contest=" + contest + ", place=" + place + ", year=" + year + ", range=" + range + "]";
    }

    

}
