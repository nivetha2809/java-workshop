package vetias.workshop.tempdata.beans;

public class sensor {


public class Sensor {
    private String sensorId;
    private double temperature;

    public Sensor(String sensorId, double temperature) {
        this.sensorId = sensorId;
        this.temperature = temperature;
    }

    public String getSensorId() {
        return sensorId;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Sensor{id='" + sensorId + "', temp=" + temperature + "}";
    }
}
}
        
            
    

    
    

