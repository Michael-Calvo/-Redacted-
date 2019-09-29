package javaapplication25;
/**
 *
 * @author biscu
 */
public class Housing {

    private String rentTrouble; //If the person needs help paying rent or mortgage

    private String subsidizedHousing; //If person needs subsidized housing

    private String voucher; //If person needs vouchers for private housing

    private String housingType; //What kind of house are they living in? 
    
    public Housing(){
        
    }

    public Housing(String rentTrouble, String subsidizedHousing, String voucher, String housingType) {
        this.rentTrouble = rentTrouble;
        this.subsidizedHousing = subsidizedHousing;
        this.voucher = voucher;
        this.housingType = housingType;
    }

    public String getRentTrouble() {
        return rentTrouble;
    }

    public String getSubsidizedHousing() {
        return subsidizedHousing;
    }

    public String getVoucher() {
        return voucher;
    }

    public String getHousingType() {
        return housingType;
    }

    public void setRentTrouble(String rentTrouble) {
        this.rentTrouble = rentTrouble;
    }

    public void setSubsidizedHousing(String subsidizedHousing) {
        this.subsidizedHousing = subsidizedHousing;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public void setHousingType(String housingType) {
        this.housingType = housingType;
    }   
}