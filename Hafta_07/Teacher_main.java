public class Teacher_main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        int grading = teacher.grade();
        System.out.println("Alınan Not: " + grading);

        Teacher first = new Teacher();
        Teacher second = new Teacher();

        double average = (first.grade() + second.grade()) / 3.0;
        System.out.println("Not ortalması: " + average);
    }
}
