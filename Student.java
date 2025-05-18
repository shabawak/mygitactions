/**
 * Represents a student with name, age, and major.
 */
// If this is in a package, add package-info.java to fix JavadocPackage error
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
     * @param nameParam  the student's name
     * @param ageParam   the student's age
     * @param majorParam the student's major
     */
    public Student(final String nameParam, final int ageParam, final String majorParam) {
        this.name = nameParam;
        this.age = ageParam;
        this.major = majorParam;
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
        Student student = new Student(
            "John Doe", 
            studentAge, 
            "Software Engineering"
        );
        System.out.println(student);
    }
}
