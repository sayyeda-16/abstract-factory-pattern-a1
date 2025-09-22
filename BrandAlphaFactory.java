// BrandAlphaFactory.java
public class BrandAlphaFactory implements DeviceFactory {
    @Override
    public LightBulb createLightBulb() {
        return new BrandAlphaBulb();
    }

    @Override
    public SmartLock createSmartLock() {
        return new BrandAlphaLock();
    }
}
