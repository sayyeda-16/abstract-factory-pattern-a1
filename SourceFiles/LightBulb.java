// LightBulb.java
public abstract class LightBulb {
    private int powerUsage;
    private String bulbColor;

    public abstract void switchOn();
    public abstract void switchOff();

    public String changeBulbColor(String color) {
        System.out.println("Changing color to : " + color);
        return color;
    }

    public int getPowerUsage() {
        return powerUsage;
    }


    // This Factory method determines the power usage based on the input string and brand.
    public void setPowerUsage(String level, String brand) {
        int newPowerUsage;

        switch (level.toLowerCase()) {
            case "low":
                // Different brands may have different low power settings
                if ("BrandA".equals(brand)) {
                    newPowerUsage = 5;
                } else if ("BrandB".equals(brand)) {
                    newPowerUsage = 7;
                } else {
                    newPowerUsage = 6; // Default low
                }
                break;
            case "medium":
                if ("BrandA".equals(brand)) {
                    newPowerUsage = 10;
                } else if ("BrandB".equals(brand)) {
                    newPowerUsage = 12;
                } else {
                    newPowerUsage = 11; // Default medium
                }
                break;
            case "high":
                if ("BrandA".equals(brand)) {
                    newPowerUsage = 15;
                } else if ("BrandB".equals(brand)) {
                    newPowerUsage = 18;
                } else {
                    newPowerUsage = 16; // Default high
                }
                break;
            default:
                System.out.println("Invalid power level. Setting to default medium.");
                newPowerUsage = 11;
                break;
        }

        // Set the final power usage
        this.powerUsage = newPowerUsage;
    }
}
