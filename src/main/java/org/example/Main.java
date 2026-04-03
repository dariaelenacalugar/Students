package org.example;

import ro.ulbs.proiectaresoftware.students.Student;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        List<Student> listaStudenti = new ArrayList<Student>();
        listaStudenti.add(new Student(112, "Ioan", "Popa", "TI21/1", 9));
        listaStudenti.add(new Student(112, "Maria", "Oprea", "TI21/1", 8));
        listaStudenti.add(new Student(120, "Alis", "Popa", "TI21/2", 10));
        listaStudenti.add(new Student(122, "Mihai", "Vercedea", "TI22/1", 4));
        listaStudenti.add(new Student(122, "Eugen", "Uritescu", "TI22/2", 5));

        System.out.println("Lista studenti: ");
        for (Student s : listaStudenti) {
            System.out.println(s);
        }
        Student s1 = new Student(120, "Alis", "Popa", "TI21/2", 10);
        boolean containsStudent = verificaStudent(listaStudenti, s1);
        System.out.println(containsStudent);
        //P.3.5.2
        List<Student> listStudenti = new ArrayList<>();
        try {
            List<String> linii = Files.readAllLines(Paths.get("studenti_in.txt"));
            for (String linie : linii) {
                String[] parts = linie.split(",");
                int numarMatricol = Integer.parseInt(parts[0]);
                String prenume = parts[1];
                String nume = parts[2];
                String formatiaDeStudiu = parts[3];
                double nota = 0;
                listStudenti.add(new Student(numarMatricol, prenume, nume, formatiaDeStudiu, nota));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;
        for (Student s : listStudenti) {
            System.out.println(s);
        }
        //listStudenti.sort((s2,s3)->s2.getFormatieDeStudiu().compareTo(s3.getFormatieDeStudiu()));
        listStudenti.sort((s2, s3) -> s2.getNume().compareTo(s3.getNume()));

        try {
            List<String> liniiOut = new ArrayList<>();
            for (Student s : listStudenti) {
                liniiOut.add(s.getNume() + "," + s.getNume() + "," + s.getPrenume() + "," + s.getFormatieDeStudiu());
            }
            Files.write(Paths.get("src/main/java/ro/ulbs/proiectaresoftware/studenti_out.txt"), liniiOut);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //P.3.5.3
        Collections.sort(listStudenti, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int res = s1.getFormatieDeStudiu().compareTo(s2.getFormatieDeStudiu());
                if (res == 0) {
                    res = s1.getNume().compareTo(s2.getNume());
                }
                return res;
            }
        });
        List<String> liniiSort = new ArrayList<>();
        for (Student s : listStudenti) {
            liniiSort.add(s.getNumarMatricol() + "," + s.getNume() + "," + s.getPrenume() + "," + s.getFormatieDeStudiu());
        }
        try {
            Files.write(Path.of("studenti_out_sorted.txt"), liniiSort);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //P.4.5.2
        Map<Integer, Student> mapStudenti = new HashMap<>();
        for (Student s : listStudenti) {
            mapStudenti.put(s.getNumarMatricol(), s);
        }

        try {
            List<String> linieNota = Files.readAllLines(Paths.get("note_anon.txt"));
            for (String linie : linieNota) {
                String[] date = linie.split(",");
                int NumarMatricol = Integer.parseInt(date[0].trim());
                double valNota = Double.parseDouble(date[1].trim());
                Student s = mapStudenti.get(NumarMatricol);
                if (s != null) {
                    s.setNota(valNota);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Student s : mapStudenti.values()) {
            System.out.println(s);
        }
            float notaM = gasesteNota("Bianca", "Popescu", mapStudenti);
            float notaN = gasesteNota("Ioan", "Popa", mapStudenti);

            System.out.println("Nota Bianca Popescu: " + notaM);
            System.out.println("Nota Ioan Popa: " + notaN);
    }

    //Tema lab 4
    public static float gasesteNota(String prenume, String nume, Map<Integer, Student> studenti) {

            Map<String, Student> mapNume = new HashMap<>();

            for (Student s : studenti.values()) {
                String cheie = s.getPrenume() + "-" + s.getNume();
                mapNume.put(cheie, s);
            }

            String cheieCautata = prenume + "-" + nume;
            Student s = mapNume.get(cheieCautata);

            if (s != null) {
                return (float) s.getNota();
            }

            return 0.0f;
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
