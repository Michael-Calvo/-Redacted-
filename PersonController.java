public class PersonController {
    private static final String YES_VALUE ="yes";
    //Housing Variables
    private static String rentTrouble;
    private static String subsidizedHousing;
    private static String voucher;
    private static String housingType;

    //Mental Health Variables
    private static String mentalHealthString;

    //Military Branch Variables
    private static String branch;
    private static String fullTime;
    private static String serviceLength;

    //Physical Health String
    private static String physicalHealthString;

    //Substance Abuse String
    private static String subAbuseString;


    private static Housing housing = new Housing(rentTrouble,subsidizedHousing,voucher,housingType);
    private static MentalHealth mhealth = new MentalHealth(mentalHealthString);
    private static MilitaryBranch Milbranch = new MilitaryBranch(branch,fullTime,serviceLength);
    private static PhysicalHealth phealth = new PhysicalHealth(physicalHealthString);
    private static SubstanceAbuse subAbuse = new SubstanceAbuse(subAbuseString);

    private static Person person = new Person(mhealth, housing, Milbranch, phealth, subAbuse);




    /**
     * The method takes all the housing data and brings it to the function to set housing flags.
     *
     * @return
     */
    public static boolean[] HousingList( ){
        boolean housingArray[] =new boolean[3];
        Housing housingTest= person.getHousingData();

        if(housingTest.getRentTrouble().equalsIgnoreCase(YES_VALUE)){
            housingArray[0]=true;
        }else housingArray[0]=false;
        if(housingTest.getSubsidizedHousing().equalsIgnoreCase(YES_VALUE)){
            housingArray[1]=true;
        }else housingArray[1]=false;

        if(housingTest.getVoucher().equalsIgnoreCase(YES_VALUE)){
            housingArray[2]=true;
        }else housingArray[2]=false;

        if(housingTest.getHousingType().equalsIgnoreCase(YES_VALUE)){
            housingArray[3]=true;
        }else housingArray[3]=false;

        return housingArray;
    }


    /**
     * To create the Substance Abuse List
     * @return
     */
    public static  boolean SubstanceAbuseList(){
        boolean substanceBoolean;
        SubstanceAbuse subabuse =person.getSubAbuseData();

        if(subabuse.getSubstanceAbuse().equalsIgnoreCase(YES_VALUE)){
            substanceBoolean=true;
        }else substanceBoolean =false;
        return substanceBoolean;
    }

    /**
     * To create the Mental Health List using the Person
     * @return
     */
    public boolean MentalHealthList(){
        boolean mentalHealthBoolean;
        MentalHealth mhealth =person.getMentalHealthData();

        if(mhealth.getmDisability().equalsIgnoreCase(YES_VALUE)){
            mentalHealthBoolean=true;
        }else mentalHealthBoolean=false;
      return mentalHealthBoolean;
    }

    /**
     * Creating the Physical Health List
     * @return
     */
    public static boolean PhysicalHealthList(){
        boolean phealthBoolean;
        PhysicalHealth phealthTest =person.getPhysicalHealthData();

        if(phealthTest.getpDisablility().equalsIgnoreCase(YES_VALUE)){
            phealthBoolean=true;
        }else phealthBoolean =false;
        return phealthBoolean;
    }

    /**
     * To create the Military Branch List
     * @return
     */
    public static boolean[] MilitaryBranchList(){
        boolean militaryArray[] = new boolean[2];
        MilitaryBranch branch = person.getBranchData();

        if (branch.getFullTime().equalsIgnoreCase(YES_VALUE)){
            militaryArray[0]=true;
        }
        if(branch.getServiceLength().equalsIgnoreCase("")){
            militaryArray[1]=true;
        }
        if(branch.getBranch().equalsIgnoreCase("")){
            militaryArray[2]=true;
        }

        return militaryArray;
    }





}
