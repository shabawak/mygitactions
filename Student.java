/**
 * Represents a student with name, age, and major.
 */
public class Student {
    private final String name;
    private final int age;
    private final String major;

    public Student(String name, String major, int age) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{name=\"" + name + "\", age=" + age + ", major=\"" + major + "\"}";
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", "Software Engineering", 23);
        System.out.println(student);
    }
}
