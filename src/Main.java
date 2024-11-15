public class Main {
    public static void main(String[] args) {

        Person driver = new Person("Andries", 43);

        Person student1 = new Person("Elske", 19);
        Person student2 = new Person("Hans", 60);
        Person student3 = new Person("Sjoerd", 81);
        Person student4 = new Person("Marije", 23);
        Person student5 = new Person("Sjors", 16);

        Bus lijn50 = new Bus(driver);
        lijn50.enter(student1);
        lijn50.enter(student2);
        lijn50.enter(student3);
        lijn50.enter(student4);
        lijn50.enter(student5);

//        System.out.println("Hello " + name + "!");
    }
}