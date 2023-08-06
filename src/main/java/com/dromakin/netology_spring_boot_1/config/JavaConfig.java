/*
 * File:     JavaConfig
 * Package:  com.dromakin.netology_spring_boot_1
 * Project:  netology_spring_boot_1
 *
 * Created by dromakin as 06.08.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.08.06
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package com.dromakin.netology_spring_boot_1.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(
            value = "netology.profile.dev",
            havingValue = "true"
    )
    public SystemProfile getDevProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(
            value = "netology.profile.dev",
            havingValue = "false"
    )
    public SystemProfile getProdProfile() {
        return new ProductionProfile();
    }

}
