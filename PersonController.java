public class PersonController {
    //Housing Variables
    String rentTrouble;
    String subsidizedHousing;
    String voucher;
    String housingType;

    //Mental Health Variables
    String mentalHealthString;

    //Military Branch Variables
    String branch;
    String fullTime;
    String serviceLength;

    //Physical Health String
    String physicalHealthString;

    //Substance Abuse String
    String subAbuseString;


    Housing housing = new Housing(rentTrouble,subsidizedHousing,voucher,housingType);
    MentalHealth mhealth = new MentalHealth(mentalHealthString);
    MilitaryBranch Milbranch = new MilitaryBranch(branch,fullTime,serviceLength);
    PhysicalHealth phealth = new PhysicalHealth(physicalHealthString);
    SubstanceAbuse subAbuse = new SubstanceAbuse(subAbuseString);

    Person person = new Person(mhealth, housing, Milbranch, phealth, subAbuse);

    //grabing values from the GUI


    //Allow other classes to access this person instance.
    public Person getPerson(){
        return person;
    }


}
