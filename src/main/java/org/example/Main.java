package org.example;

import ro.ulbs.proiectaresoftware.students.Student;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Student> listaStudenti=new ArrayList<Student>();
        listaStudenti.add(new Student(112, "Ioan", "Popa", "TI21/1"));
        listaStudenti.add(new Student(112, "Maria", "Oprea", "TI21/1"));
        listaStudenti.add(new Student(120,"Alis","Popa","TI21/2"));
        listaStudenti.add(new Student(122, "Mihai", "Vercedea", "TI22/1"));
        listaStudenti.add(new Student(122, "Eugen", "Uritescu", "TI22/2"));

        System.out.println("Lista studenti: ");
        for(Student s:listaStudenti){
            System.out.println(s);
        }
        Student s1=new Student(120,"Alis","Popa","TI21/2");
        boolean containsStudent=verificaStudent(listaStudenti,s1);
        System.out.println(containsStudent);


    }
    public static boolean verificaStudent(List<Student>listaStudenti,Student s1)
    {
        for(Student s:listaStudenti){
            if(s.getNume().equals(s1.getNume())&&s.getPrenume().equals(s1.getPrenume())&&s.getFormatieDeStudiu().equals(s1.getFormatieDeStudiu())){
                return true;
            }
        }
        return false;
    }
}
