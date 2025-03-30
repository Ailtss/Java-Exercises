package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }
    
    @Override
    public boolean isOn() {
        // TODO Auto-generated method stub
        if (this.isOn) {
            return true;
        }

        return false;
    }

    @Override
    public void setOn() {
        // TODO Auto-generated method stub
        this.isOn = true;
    }

    @Override
    public void setOff() {
        // TODO Auto-generated method stub
        this.isOn = false;
    }

    @Override
    public int read() {
        // TODO Auto-generated method stub
        if (this.isOn) {

            Random r = new Random();
            
            return r.nextInt(60) - 30;
        }

        throw new IllegalStateException("The sensor is off.");
    }
    
    
}
