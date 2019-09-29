public class General {


    //creating the Person via survey pull.
    private static PersonController personControl =  new PersonController();
    private static Person person = personControl.getPerson();

    /**
     * The method takes all the housing data and brings it to the functionn to create and compare the housing list.
     *
     * @return
     */
    public static int HousingList( ){

        Housing housingTest= person.getHousingData();

        return 0;
    }

    /**
     * To create the Mental Health List using the Person
     * @return
     */
    public static int MentalHealthList(){

        MentalHealth mhealthTest =person.getMentalHealthData();

        return 0;
    }

    /**
     * To create the Military Branch List
     * @return
     */
    public static int MilitaryBranchList(){

        MilitaryBranch branch = person.getBranchData();

        return 0;
    }

    /**
     * Creating the Physical Health List
     * @return
     */
    public static int PhysicalHealthList(){

        PhysicalHealth phealth = person.getPhysicalHealthData();


        return 0;
    }

    /**
     * To create the Substance Abuse List
     * @return
     */
    public static int SubstanceAbuseList(){

        SubstanceAbuse subAbuse = person.getSubAbuseData();

        return 0;
    }

}
