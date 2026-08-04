public class StudentGrade {
    public static void main(String[] args) {
        String studentName = "Ali";
        int score = 85;
        char grade;

        if (score >= 80) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Student Name : " + studentName);
        System.out.println("Score        : " + score);
        System.out.println("Grade        : " + grade);
    }
}