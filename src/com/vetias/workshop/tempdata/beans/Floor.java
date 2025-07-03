package vetias.workshop.tempdata.beans;

public class floor {
    package location;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int number;
    private List<Zone> zones;

    public Floor(int number) {
        this.number = number;
        this.zones = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void addZone(Zone zone) {
        zones.add(zone);
    }

    public List<Zone> getZones() {
        return zones;
    }

    @Override
    public String toString() {
        return "Floor{number=" + number + ", zones=" + zones.size() + "}";
    }
}

    
}
