public class Location {
    public static void main(String[] args) {
        
    Location location = new Location("Vet Tindhl", 40.785091, -73.968285, "Erode", "10024", "123-456-7890");
        System.out.println(location);
    }
    private String name;
    private double latitude;
    private double longitude;
    private String address;
    private String postalCode;
    private String contact;

    public Location(String name, double latitude, double longitude, String address, String postalCode, String contact) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.postalCode = postalCode;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }

    
    public String getPostalCode() {
        return postalCode;
    }

    public String getContact() {
        return contact;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setContact(String contact) {
        this.contact = contact;
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
    
}