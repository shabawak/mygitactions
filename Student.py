"""
Module containing student entity classes.
"""

class Student:
    """Represents a student with name, age, and major."""

    def __init__(self, name: str, age: int, major: str) -> None:
        """
        Initialize a new Student.

        Args:
            name: The student's name
            age: The student's age in years
            major: The student's academic major
        """
        self.name = name
        self.age = age
        self.major = major

    def get_name(self) -> str:
        """Return the student's name."""
        return self.name

    def get_age(self) -> int:
        """Return the student's age."""
        return self.age

    def get_major(self) -> str:
        """Return the student's major."""
        return self.major

    def __str__(self) -> str:
        """Return string representation of the student."""
        return f'Student{{name="{self.name}", age={self.age}, major="{self.major}"}}'

    @staticmethod
    def main() -> None:
        """Demonstration method."""
        student_age = 23
        student = Student(
            "John Doe",
            student_age,
            "Software Engineering"
        )
        print(student)


if __name__ == "__main__":
    Student.main()
