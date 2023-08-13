/*
 * File:     ProductionProfile
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
package com.dromakin.netology_spring_boot_1.model;

public class ProductionProfile implements SystemProfile {

    public static final String msg = "Current profile is production";
    @Override
    public String getProfile() {
        return msg;
    }
}
