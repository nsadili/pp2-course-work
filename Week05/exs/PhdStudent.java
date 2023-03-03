package exs;

public class PhdStudent extends Student {
    private String department;
    private List<String> courses;

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, List<String> courses) {
        super(firstName, lastName, gender,
