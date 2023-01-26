package structural.facedes.caching;

public class RedisCaching implements ICaching {
    @Override
    public void cache() {
        System.out.println("Redis cached");
    }
}
