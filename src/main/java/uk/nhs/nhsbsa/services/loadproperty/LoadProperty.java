package uk.nhs.nhsbsa.services.loadproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/***
 * Created by Ankita
 */

public class LoadProperty {
    /**
     * Project path to get property of user directory
     */
    String projectPath = System.getProperty("user.dir");

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();
        /**
         * use try and catch blocks to handle IOException
         */

        try {
            input = new FileInputStream(projectPath + "/src/test/java/uk/nhs/nhsbsa/services/resources/propertyfile/config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
