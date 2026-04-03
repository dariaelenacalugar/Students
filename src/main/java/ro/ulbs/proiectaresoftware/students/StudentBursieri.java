package ro.ulbs.proiectaresoftware.students;

import java.util.Objects;

public class StudentBursieri extends Student {
    double cuantumBursa;
    public StudentBursieri(int numarMatricol, String prenume, String nume, String formatieDeStudiu, double nota, double cuantumBursa) {
        super(numarMatricol, prenume, nume, formatieDeStudiu, nota);
        this.cuantumBursa = cuantumBursa;
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(!(obj instanceof StudentBursieri)) return false;
        if(!super.equals(obj)) return false;
        StudentBursieri b = (StudentBursieri)obj;
        return Double.compare(b.cuantumBursa,cuantumBursa) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cuantumBursa);
    }
    @Override
    public String toString() {
        return super.toString()+"Bursa: "+cuantumBursa;
    }
}
