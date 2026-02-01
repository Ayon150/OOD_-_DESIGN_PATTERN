import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> SinglePersons = new ArrayList<Person>();

        for (Person person:persons){
            if(person.getMaritialStatus().equalsIgnoreCase("Single")){
                SinglePersons.add(person);
            }
        }

        return SinglePersons;
    }
}
