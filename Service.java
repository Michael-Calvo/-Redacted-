import java.util.ArrayList;

public class Service { // Not being implemented right now, but can be used in a database setting
    private String name;
    private String number;
    private String address;
    private String description;
    private ArrayList flags;
    private String URL;

    public service(String name, String number, String address, String description, ArrayList flags, String URL) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.description = description;
        this.flags = flags;
        this.URL = URL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList getFlags() {
        return flags;
    }

    public void setFlags(ArrayList flags) {
        this.flags = flags;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}