package encapsulation;
public class Admission {

    // Private variable
    private int marks;
    private String grade; // determined internally

    // Setter with internal processing
    public void setMarks(int marks) {
        this.marks = marks;

        // Internal logic: assign grade based on marks
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 75) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Getter for grade
    public String getGrade() {
        return grade;
    }
}
