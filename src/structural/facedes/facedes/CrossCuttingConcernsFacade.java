package structural.facedes.facedes;

import structural.adapter.logging.DBLogger;
import structural.adapter.logging.ILogger;
import structural.facedes.authorization.Auth;
import structural.facedes.authorization.IAuth;
import structural.facedes.caching.ICaching;
import structural.facedes.caching.RedisCaching;

public class CrossCuttingConcernsFacade {
    public ILogger logger;
    public ICaching caching;
    public IAuth auth;

    public CrossCuttingConcernsFacade() {
        // IoC, DI Container
        this.logger = new DBLogger();
        this.caching = new RedisCaching();
        this.auth = new Auth();
    }
}
