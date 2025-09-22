// BrandBetaBulb.java
public class BrandBetaBulb extends LightBulb {
    @Override
    public void switchOn() {
        System.out.println("Brand B Bulb is turning on with a bright yellow light.");
    }

    @Override
    public void switchOff() {
        System.out.println("Brand B Bulb is turned off.");
    }
}
