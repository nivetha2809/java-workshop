package vetias.workshop.tempdata.beans;

public class Location {
private String name;
private String latitude;
private String longitude;
private String description;
private String country;
private String city;
private String address;
private String postalcode;



public String getName() {
    return name;
}
public void setName(String aName) {
    name = aName;
}
public String getLatitude() {
    return latitude;
}
public void setLatitude(String aLatitude) {
    latitude = aLatitude;
}
public String getLongitude() {
    return longitude;
}
public void setLongitude(String aDescription) {
    description = aDescription;
}
public String getdescription() {
    return description;
}
public void setCountry(String aCountry) {
    country = aCountry;
}
public void getcountry() {
    return country;
}
public void setCity(String aCity) {
    city = aCity;
}
public void getcity() {
    return city;
}
public void setAddress(String aAddress) {
    address = aAddress;
}
public void getaddress() {
    return address;
}
public void setPostalcode(String aPostalcode) {
    postalcode = aPostalcode;
}
public void getpostalcode() {
    return postalcode;
}
}

@Override
    public String toString() {      
        return "Location{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
    


