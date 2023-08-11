public class Person extends Human implements Info, Runnable, MathOperation {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getInfo() {
        System.out.println("Person");
    }

    @Override
    public int getSpeedRun() {
        return 20;
    }

    @Override
    public int getSum() {
        return 200;
    }
}
