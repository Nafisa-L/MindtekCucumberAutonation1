package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

    private static Properties properties;
    private static FileInputStream input;
    // What we can write that will make connection once we create an object out of this class
    static {
        String path = "/Users/nafisa/IdeaProjects/MindtekCucumberAutonation1/src/test/resources/configuration/Configuration.properties";
        try {
            input= new FileInputStream(path);
            properties=new Properties();
            properties.load(input);
        } catch (FileNotFoundException e) {
            System.out.println("Path for properties file is invalid.");
        }catch (IOException e){
            System.out.println("Failed to load properties file.");
        }finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Had exception while tried to close input object");
            }
        }
    }
    // Write a method that will send as parameter the key of properties file data
    // and it will return the value for that key
    public static String getProperty(String key){ // Configuration.getProperty("browser"); -> return "chrome";
        return properties.getProperty(key); //key = browser -> value=chrome
    }
}


