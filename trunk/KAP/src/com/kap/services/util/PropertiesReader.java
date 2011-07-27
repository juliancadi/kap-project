package com.kap.services.util;

import java.util.ResourceBundle;

public class PropertiesReader {

    public static ResourceBundle readProperties(String path) {
        ResourceBundle rb = ResourceBundle.getBundle(path);
        return rb;
    }

}
