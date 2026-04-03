package ro.ulbs.proiectaresoftware.students;
public class Student {
    int numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;
    float nota;

    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }
    public int getNumarMatricol() {
        return numarMatricol;
    }
    public void setNumarMatricol(int numarMatricol) {
        numarMatricol = numarMatricol;
    }
    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }
    public void setFormatieDeStudiu(String formatieDeStudiu) {
        this.formatieDeStudiu = formatieDeStudiu;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        return String.format("%15d %15s %15s %15s",numarMatricol, prenume, nume, formatieDeStudiu,nota);
    }
}


