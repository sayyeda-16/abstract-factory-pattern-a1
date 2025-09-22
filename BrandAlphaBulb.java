// BrandAlphaBulb.java
public class BrandAlphaBulb extends LightBulb {
    @Override
    public void switchOn() {
        System.out.println("Brand A Bulb is turning on with a bright white light.");
    }

    @Override
    public void switchOff() {
        System.out.println("Brand A Bulb is turned off.");
    }
}
