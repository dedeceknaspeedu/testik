import java.util.ArrayList;

// Třída pro reprezentaci třídy
class Clazz {
    private String nazev;
    private ArrayList<Student> studenti; // Bod 7: atribut studenti do třídy Clazz

    // Konstruktor třídy Clazz
    public Clazz(String nazev) {
        this.nazev = nazev;
        this.studenti = new ArrayList<>(); // Inicializace seznamu studentů
    }

    // Metoda pro získání názvu třídy
    public String getNazev() {
        return nazev;
    }

    // Metoda pro přidání studenta do třídy
    public void pridatStudenta(Student student) {
        this.studenti.add(student);
    }

    // Metoda pro získání seznamu studentů ve třídě
    public ArrayList<Student> getStudenti() {
        return studenti;
    }
}

// Třída pro reprezentaci studenta
class Student {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String nazevTridy;

    // Konstruktor třídy Student
    public Student(String jmeno, String prijmeni, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
    }

    // Metoda pro získání jména studenta
    public String getJmeno() {
        return jmeno;
    }

    // Metoda pro získání příjmení studenta
    public String getPrijmeni() {
        return prijmeni;
    }

    // Metoda pro získání věku studenta
    public int getVek() {
        return vek;
    }

    // Metoda pro získání názvu třídy, do které student patří
    public String getNazevTridy() {
        return nazevTridy;
    }

    // Metoda pro nastavení názvu třídy, do které student patří
    public void setNazevTridy(String nazevTridy) {
        this.nazevTridy = nazevTridy;
    }
}

// Hlavní třída programu
public class Main {
    public static void main(String[] args) {
        // Bod 8: Vytvoření dvou tříd classA a classB
        Clazz classA = new Clazz("classA");
        Clazz classB = new Clazz("classB");

        // Vytvoření a přidání studentů do tříd podle věku
        for (int i = 0; i < 10; i++) {
            Student student;
            if (i < 5) {
                student = new Student("Student" + i, "Prijmeni" + i, i + 10);
                classA.pridatStudenta(student); // Bod 9: Vložení studentů s věkem pod 18 do třídy A
            } else {
                student = new Student("Student" + i, "Prijmeni" + i, i + 10);
                classB.pridatStudenta(student); // Vložení studentů s věkem 18 a více do třídy B
            }
            // Bod 10: Nastavení atributu název třídy studentům podle jejich věku
            student.setNazevTridy(student.getVek() < 18 ? classA.getNazev() : classB.getNazev());
        }

        // Výpis studentů
        // Bod 11: Výpis studentů ve formátu Jméno Příjmení Trida
        System.out.println("Studenti ve třídě A:");
        for (Student student : classA.getStudenti()) {
            System.out.println(student.getJmeno() + " " + student.getPrijmeni() + " " + student.getNazevTridy());
        }

        System.out.println("\nStudenti ve třídě B:");
        for (Student student : classB.getStudenti()) {
            System.out.println(student.getJmeno() + " " + student.getPrijmeni() + " " + student.getNazevTridy());
        }
    }
}
