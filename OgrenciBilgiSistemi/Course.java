package OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int extra;
    int finale;

   // Course(String name,String code,String prefix , Teacher teacher){
    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        //this.teacher = teacher;
        int note = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Hata: Öğretmenin branşı ile ders branşı uyuşmuyor.");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }

}
