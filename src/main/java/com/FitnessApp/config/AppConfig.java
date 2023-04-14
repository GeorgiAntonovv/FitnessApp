package com.FitnessApp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * General configuration of the application.
 */
@ComponentScan(basePackages = {})
@Import({
        DbConfig.class,
})
public class AppConfig {

}
