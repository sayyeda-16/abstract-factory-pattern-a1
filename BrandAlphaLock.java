// BrandAlphaLock.java
public class BrandAlphaLock extends SmartLock {
    @Override
    public void lock() {
        System.out.println("Brand A Lock is locked.");
    }

    @Override
    public void unlock() {
        System.out.println("Brand A Lock is unlocked.");
    }
}
