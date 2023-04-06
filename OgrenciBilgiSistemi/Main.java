package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "0555 555 55 55");
        Teacher t2 = new Teacher("Ahmet Hoca", "FZK", "0555 555 55 54");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "0555 555 55 53");

        Course tarih = new Course ("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course ("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course ("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote (100, 80, 50);
        s1.addBulkQuizNote (90, 70, 80);
        s1.NoteAverage(100, 80, 50, 90, 70, 80);
        s1.isPass = s1.isPass();

        Student s2 = new Student("Güdük Necmi", "124", "4", tarih, fizik, biyoloji);
        s2.addBulkExamNote(50,30,70);
        s2.addBulkQuizNote(70, 50, 80);
        s2.NoteAverage(50,30,70,70, 50, 80);
        s2.isPass();
    }
}