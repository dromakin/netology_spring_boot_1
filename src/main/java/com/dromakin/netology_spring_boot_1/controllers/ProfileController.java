/*
 * File:     ProfileController
 * Package:  com.dromakin.netology_spring_boot_1.controllers
 * Project:  netology_spring_boot_1
 *
 * Created by dromakin as 06.08.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.08.06
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package com.dromakin.netology_spring_boot_1.controllers;

import com.dromakin.netology_spring_boot_1.config.SystemProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProfileController {
    private SystemProfile profile;

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}
