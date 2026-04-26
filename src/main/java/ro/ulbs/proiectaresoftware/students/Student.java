package ro.ulbs.proiectaresoftware.students;
public final class Student {
    private final int numarMatricol;
    private final String prenume;
    private final String nume;
    private final String formatieDeStudiu;
    private final double nota;

    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu,double nota) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota = nota;
    }
    public int getNumarMatricol() {
        return numarMatricol;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }
    public double getNota() {
        return nota;
    }
    public Student withFormatieDeStudiu(String formatieDeStudiu) {
        return new Student(numarMatricol, prenume, nume, formatieDeStudiu, nota);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return numarMatricol == student.numarMatricol;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(numarMatricol);
    }

    @Override
    public String toString() {
        return String.format("%15d %15s %15s %15s",numarMatricol, prenume, nume, formatieDeStudiu,nota);
    }
}


