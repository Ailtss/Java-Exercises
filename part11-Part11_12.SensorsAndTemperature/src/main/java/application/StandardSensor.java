package application;

public class StandardSensor implements Sensor {

    private int value;

    public StandardSensor(int v) {
        this.value = v;
    }

    @Override
    public boolean isOn() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void setOn() {
        // TODO Auto-generated method stub
        return;
    }

    @Override
    public void setOff() {
        // TODO Auto-generated method stub
        return;
    }

    @Override
    public int read() {

        return this.value;
    }

    

}
