package OgrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;

    double avarage;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1,int note2,int note3){

        if (note1 >= 0 && note1 <= 100){c1.note = note1;}
        if (note2 >= 0 && note2 <= 100){c2.note = note2;}
        if (note3 >= 0 && note3 <= 100){c3.note = note3;}
    }

    public void addBulkQuizNote(int extra1, int extra2, int extra3) {
        if (extra1 >= 0 && extra1 <= 100) {
            this.c1.extra = extra1;
        }
        if (extra2 >= 0 && extra2 <= 100) {
            this.c2.extra = extra2;
        }
        if (extra3 >= 0 && extra3 <= 100) {
            this.c3.extra = extra3;
        }
    }

    public void NoteAverage(int note1, int note2, int note3, int extra1, int extra2, int extra3) {
        this.c1.finale = ((note1 * 80)/100) + ((extra1 * 20)/100);
        this.c2.finale = ((note2 * 80)/100) + ((extra2 * 20)/100);
        this.c3.finale = ((note3 * 80)/100) + ((extra3 * 20)/100);
    }

    public boolean isPass() {
        System.out.println("====================================");
        this.avarage = (c1.finale + c2.finale + c3.finale) / 3;
        if (this.avarage >= 55) {

            System.out.println("Sınıfı Geçti");
            printNotes();
            return true;
        } else {

            System.out.println("Sınıfta Kaldı");
            printNotes();
            return false;
        }
    }

    void printNotes () {
        System.out.println("Notlar");
        System.out.println(c1.name + " Notu\t\t: " + "Sınav : " + this.c1.note + " (" + ((c1.note * 80) / 100) + ")"
                + " - " + "Sözlü : " + this.c1.extra + " (" + ((c1.extra * 20) / 100) + ")" + " - " + "Ortalama : " + this.c1.finale);
        System.out.println(c2.name + " Notu\t\t: " + "Sınav : " + this.c2.note + " (" + ((c2.note * 80) / 100) + ")"
                + " - " + "Sözlü : " + this.c2.extra + " (" + ((c2.extra * 20) / 100) + ")" + " - " + "Ortalama : " + this.c2.finale);
        System.out.println(c3.name + " Notu\t: " + "Sınav : "   + this.c3.note + " (" + ((c3.note * 80) / 100) + ")"
                + " - " + "Sözlü : " + this.c3.extra + " (" + ((c3.extra * 20) / 100) + ")" + " - " + "Ortalama : " + this.c3.finale);
        System.out.println("Ortalama\t\t: " + this.avarage);
    }
}
