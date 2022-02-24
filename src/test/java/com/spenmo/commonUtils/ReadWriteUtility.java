package com.spenmo.commonUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadWriteUtility {

    private static FileOutputStream output;
    private static Properties prop;

    public static String getValueFromConfigPropertiesFile(String Key) {
        String value = null;
        try {
            InputStream input = new FileInputStream("config.properties");
            prop = new Properties();
            // load a properties file
            prop.load(input);
            value = prop.getProperty(Key);
            input.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return value;
    }

    public static void insertValueIntoPropertiesFile(String key, String value) {
        try {
            output = new FileOutputStream("config.properties", true);
            prop = new Properties();
            // set the properties value
            prop.setProperty(key, value);
            // save properties to project root folder
            prop.store(output, null);
            output.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static String getValueFromUserPropertiesFile(String Key) {
        String value = null;
        try {
            InputStream input = new FileInputStream("users.properties");
            prop = new Properties();
            // load a properties file
            prop.load(input);
            value = prop.getProperty(Key);
            input.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return value;
    }
}

