import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    
    private List<Person> employees;
    


    public Employees() {

        this.employees = new ArrayList<Person>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.employees.addAll(peopleToAdd);
    }

    /**
     * Prints all employees in the list.
     */

    public void print() {

        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {

        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation() == education) {
                System.out.println(p);
            }
        }
    }

    /**
     * Remove all employees with the given education level.
     * @param education level of education
     */
    public void fire(Education education) {

        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
