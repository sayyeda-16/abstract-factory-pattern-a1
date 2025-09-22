// BrandBetaLock.java
public class BrandBetaLock extends SmartLock {
    @Override
    public void lock() {
        System.out.println("Brand B Lock is locked.");
    }

    @Override
    public void unlock() {
        System.out.println("Brand B Lock is unlocked.");
    }
}

