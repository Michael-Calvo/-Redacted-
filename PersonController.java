public class PersonController {

    Housing housing = new Housing();
    MentalHealth mhealth = new MentalHealth();
    MilitaryBranch branch = new MilitaryBranch();
    PhysicalHealth phealth = new PhysicalHealth();
    SubstanceAbuse subAbuse = new SubstanceAbuse();

    Person person = new Person(mhealth, housing, branch, phealth, subAbuse);

    //grabing values from the GUI


    //Allow other classes to access this person instance.
    public Person getPerson(){
        return person;
    }


}
