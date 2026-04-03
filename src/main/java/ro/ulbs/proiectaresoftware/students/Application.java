package ro.ulbs.proiectaresoftware.students;

public class Application {
    public static void main(String[] args) {
        Student s1=new Student(112, "Ioan", "Popa", "TI21/1",9);
        Student s2=new Student(112, "Maria", "Oprea", "TI21/1",8);
        Student s3=new Student(120, "Alis", "Popa", "TI21/2",10);
        Student s4=new Student(122, "Mihai", "Vercedea", "TI22/1",4);
        Student s5=new Student(122, "Eugen", "Uritescu", "TI22/2",5);
        System.out.println(String.format("%15s %15s %15s %15s","numar matricol", "prenume", "nume", "formatieDeStudiu","nota"));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }

}
