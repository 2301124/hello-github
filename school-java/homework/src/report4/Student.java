package report4;

public class Student {

    private String name;
    private String rollno;
    private int age;
    public Student(String name, String rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }
    public void setAge(int age) {
        this.age = age;
}
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return String.format("\n 학생 이름 : %s\n" +
                " 학번 : %s\n 나이 : %d\n", name, rollno, age);
    }
}

