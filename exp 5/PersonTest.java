// person.java
class Person {
    void speak() {
        System.out.println("The person is speaking");
    }
}

class Student extends Person {
    @Override
    void speak() {
        System.out.println("The student is asking a question");
    }
}

class Teacher extends Person {
    @Override
    void speak() {
        System.out.println("The teacher is giving a lecture");
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();
        Teacher t = new Teacher();
        p.speak();
        s.speak();
        t.speak();
    }
}
