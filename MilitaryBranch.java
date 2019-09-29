/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biscu
 */
public class MilitaryBranch {

    private String branch;
    private String fullTime;
    private String serviceLength;

    public MilitaryBranch(String branch, String fullTime, String serviceLength) {
        this.branch = branch;
        this.fullTime = fullTime;
        this.serviceLength = serviceLength;
    }

    public String getBranch() {
        return branch;
    }

    public String getFullTime() {
        return fullTime;
    }

    public String getServiceLength() {
        return serviceLength;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setFullTime(String fullTime) {
        this.fullTime = fullTime;
    }

    public void setServiceLength(String serviceLength) {
        this.serviceLength = serviceLength;
    }

    

}
