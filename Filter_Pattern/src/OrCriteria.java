import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person>firstCriteriaPerson = criteria.meetCriteria(persons);
        List<Person>secondCriteriaPerson = otherCriteria.meetCriteria(persons);

        for(Person person:secondCriteriaPerson){
            if(!firstCriteriaPerson.contains(person)){
                firstCriteriaPerson.add(person);
            }
        }

        return firstCriteriaPerson;
    }
}
