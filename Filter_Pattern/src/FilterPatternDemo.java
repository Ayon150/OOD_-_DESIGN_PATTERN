import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {
    public static void main(String[] args){
        List<Person> persons =  new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();

        for(Person person: male.meetCriteria(persons)){
            System.out.println(person.getGender()+person.getName()+person.getMaritialStatus());
        }
    }
}
