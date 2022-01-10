public class Practic_3 {
    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student("Viktor");
        Student stud3 = new Student(1521);
        Student stud4 = new Student("Viktor",1521);
        System.out.println(stud1.toString());
        System.out.println(stud2.toString());
        System.out.println(stud3.toString());
        System.out.println(stud4.toString());
    }
}
class Student{
    String surname;
    int id;
    public Student(){
        System.out.println("Первый конструктор");
    }
    public Student(String surname){
        this.surname = surname;
    }
    public Student(int id){
        this.id = id;
    }
    public Student(String surname, int id){
        this.id = id;
        this.surname = surname;
    }
    public String toString(){
        return "Student"+surname+"id"+ id;
    }
}

