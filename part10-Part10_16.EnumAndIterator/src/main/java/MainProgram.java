
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here

        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));

        university.print();

        university.print(Education.PHD);
    }
}
