package com.example.example_mod;

import java.nio.file.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ExampleMod {

    public static final String MODID = "example_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    public void init() {
        initConfig();
    }

    public void initClient() {
        initConfig();
    }

    private void initConfig() {
    }

    public abstract Path getConfigFolder();

}
