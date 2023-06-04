package com.FitnessApp.config;

import java.time.Clock;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * General configuration of the application.
 */
@ComponentScan(basePackages = {})
@Import({
        DbConfig.class,
        MvcConfig.class
})
public class AppConfig {

    @Bean
    public OkHttpClient okHttpClient() {
        return new OkHttpClient();
    }

    @Bean
    public Clock clock() {
        return Clock.systemDefaultZone();
    }
}
