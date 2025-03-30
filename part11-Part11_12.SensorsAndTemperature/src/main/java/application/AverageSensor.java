package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {

        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        // TODO Auto-generated method stub
        if (this.sensors.isEmpty()) {

            return false;
        }

        for (Sensor s : this.sensors) {

            if (s.isOn() == false) {

                return false;
            }
        }

        return true;

    }

    public List<Integer> readings() {

        return this.readings;
    }

    @Override
    public void setOn() {
        // TODO Auto-generated method stub
        this.sensors.stream().forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        // TODO Auto-generated method stub
        this.sensors.stream().forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        // TODO Auto-generated method stub
        if (this.isOn() == false || this.sensors.isEmpty()) {

            throw new IllegalStateException("The sensor is off.");
        }

        int value =  (int) this.sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
        this.readings.add(value);
        return value;
    }

}
