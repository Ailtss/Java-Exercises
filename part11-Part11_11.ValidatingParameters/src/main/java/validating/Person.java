package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        // this.name = name;
        // this.age = age;

        if (name == null || name.isEmpty() || name.length() > 40 || age < 0 || age > 120) {
            throw new IllegalArgumentException("Name or Age does not fit the criteria" );
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + this.age;
    }
}
