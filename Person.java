//Object to parse survey data into an object such that the program can

import java.util.Date;

/**
 * Object to parse survey data into an object such that the program can
 *  create a profile for specific filter
 *
 */
public class Person {
    MentalHealth mentalHealthData;
    Housing housingData;
    MilitaryBranch branchData;
    PhysicalHealth physicalHealthData;
    SubstanceAbuse subAbuseData;

    public Person(MentalHealth mentalHealthData, Housing housingData, MilitaryBranch branchData, PhysicalHealth physicalHealthData,SubstanceAbuse subAbuseData){
        this.mentalHealthData=mentalHealthData;
        this.housingData=housingData;
        this.branchData=branchData;
        this.physicalHealthData=physicalHealthData;
        this.subAbuseData=subAbuseData;
    }


    public MentalHealth getMentalHealthData() {
        return mentalHealthData;
    }

    public Housing getHousingData() {
        return housingData;
    }

    public MilitaryBranch getBranchData() {
        return branchData;
    }

    public PhysicalHealth getPhysicalHealthData() {
        return physicalHealthData;
    }

    public SubstanceAbuse getSubAbuseData() {
        return subAbuseData;
    }
}
