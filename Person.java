public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //copy constructor
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    public static void main(String[] args) {
        Person person = new Person("John", 20);
        System.out.println(person.name + " ," + person.age);
        Person person2 = new Person(person);
        System.out.println("After using Copy constructor ---- ");
        System.out.print(person2.name + " ," + person2.age);
    }
}
//John ,20
//After using Copy constructor ----
//John ,20
