// SmartLock.java
public abstract class SmartLock {
    private int batteryConsumption;
    private int passcode;


    public void setPasscode(int code) {
        this.passcode = code;
    }
    public abstract void lock();
    public abstract void unlock();


    public int getBatteryConsumption() {
        return batteryConsumption;
    }

    // Factory Method to set the value
    public void setBatteryConsumption(int batteryConsumption) {
        this.batteryConsumption = batteryConsumption;
    }
}
