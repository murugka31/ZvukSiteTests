package com.emurugova.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/credentials.properties"
})
public interface AppConfig extends Config{

    String remoteUrlLogin();
    String remoteUrlPassword();
    String remoteUrl();
}
