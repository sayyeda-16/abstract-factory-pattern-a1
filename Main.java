// Main.java
public class Main {
    public static void main(String[] args) {
        // Example 1: Create a Bulb from Brand A
        System.out.println("Creating a Brand A Smart Bulb:");
        DeviceFactory BrandAlphaFactory = new BrandAlphaFactory();
        LightBulb brandABulb = BrandAlphaFactory.createLightBulb();

        // Using the setPowerUsage() method: passing a descriptive string ("high") and the brand name.
        brandABulb.setPowerUsage("high", "BrandA");

        brandABulb.switchOn();
        System.out.println("Brand A Bulb Power Usage: " + brandABulb.getPowerUsage() + "W\n");

        // Example 2: Create a Lock from Brand B
        System.out.println("Creating a Brand B Smart Lock:");
        DeviceFactory brandBFactory = new BrandBetaFactory();
        SmartLock brandBLock = brandBFactory.createSmartLock();

        // Assigning a value for the battery for simplicity
        int brandBLockBattery = 40;
        brandBLock.setBatteryConsumption(brandBLockBattery);

        brandBLock.lock();
        System.out.println("Brand B Lock Battery Consumption: " + brandBLock.getBatteryConsumption() + "%\n");
    }
}