/**
 * Represents a student with name, age, and major.
 */
public final class Student {
    /** Student's full name. */
    private final String name;
    /** Student's age in years. */
    private final int age;
    /** Student's academic major. */
    private final String major;

    /**
     * Constructs a new Student.
     *
     * @param name  the student's name
     * @param age   the student's age
     * @param major the student's major
     */
    public Student(final String name, final int age, final String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    /**
     * @return the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the student's age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the student's major
     */
    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{"
            + "name=\"" + name + "\", "
            + "age=" + age + ", "
            + "major=\"" + major + "\""
            + "}";
    }

    /**
     * Main method for demonstration.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(final String[] args) {
        final int studentAge = 23;
        Student student = new Student("John Doe", studentAge, "Software Engineering");
        System.out.println(student);
    }
}
