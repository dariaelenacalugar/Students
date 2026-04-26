package ro.ulbs.proiectaresoftware.students;

import java.util.Objects;

public class StudentBursieri {

    private final Student student;
    private final double cuantumBursa;

    public StudentBursieri(Student student, double cuantumBursa) {
        this.student = student;
        this.cuantumBursa = cuantumBursa;
    }

    public Student getStudent() {
        return student;
    }

    public double getCuantumBursa() {
        return cuantumBursa;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof StudentBursieri)) return false;
        StudentBursieri b = (StudentBursieri) obj;
        return Double.compare(b.cuantumBursa, cuantumBursa) == 0 &&
                Objects.equals(student, b.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, cuantumBursa);
    }

    @Override
    public String toString() {
        return student.toString() + " Bursa: " + cuantumBursa;
    }
}