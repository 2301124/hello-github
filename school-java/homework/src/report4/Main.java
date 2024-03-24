package report4;

public class Main {

    public static void main(String[] args) {
        Student kyungbok = new Student("경복대", "123456", 21);
        kyungbok.setAge(kyungbok.getAge() + 1);
        System.out.println(kyungbok);
    }
}
