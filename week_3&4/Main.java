public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ali", "101");
        Person p2 = new Student("Ahmad", "102");
        Person p3 = new Lecturer("Dr John", "103");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}   