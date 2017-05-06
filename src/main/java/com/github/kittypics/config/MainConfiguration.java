package com.github.kittypics.config;

import com.github.kittypics.controller.SignUpController;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by aishu on 6/05/2017.
 */
@Configuration
@Import(SignUpController.class)
public class MainConfiguration {

}
