package report1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]){
        Person man = new Person(“홍길동", "남자", 27);
                man.setName(“홍길동”);
        man.setAge(man.getAge( ) + 1);
        System.out.println(man.getName() + "/" +
                man.getGender( ) + "/" + man.getAge( ));

        public String toString() {
            return("반갑습니다.");

            @Override
            public String toString() {
                return " [name = " + name + ", age = " + age + ", gender = "
                        + gender + "]";
            }
        }
    }
}
