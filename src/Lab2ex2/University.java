package Lab2ex2;

public class University
{
    private String name;
    private String adress;
    private int students;
    private double average_rank_of_exam;

    public University()
    {
        System.out.println("Информация о ВУЗАХ");
    }
    public University(String name, String adress, int students, double average_rank_of_exam)
    {
        this.name = name;
        this.adress = adress;
        this.students = students;
        this.average_rank_of_exam = average_rank_of_exam;
    }
}
