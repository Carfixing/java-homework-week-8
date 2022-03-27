package q26encapsulation26;
/*Encapsulations example (Create package name ‘encapsulation26’ and create all
        below classes in this package)*/
public class Encapsulate {

    private String name;
    private int rollNo;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {

        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public class TestEncapsulation {
    }

    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        System.out.println("Prime's name : " + obj.getName());
        System.out.println("Prime's age : " + obj.getAge());
        System.out.println("Prime's rollNo : " + obj.getRollNo());

    }
}

