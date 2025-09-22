// BrandBetaFactory.java
public class BrandBetaFactory implements DeviceFactory {
    @Override
    public LightBulb createLightBulb() {
        return new BrandBetaBulb();
    }

    @Override
    public SmartLock createSmartLock() {
        return new BrandBetaLock();
    }
}
