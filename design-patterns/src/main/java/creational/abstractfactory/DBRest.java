package creational.abstractfactory;

/**
 * @author Froy
 */
public class DBRest extends DBConfig {

    @Override
    public String connect() {
        return ":: DBRest ::";
    }

}
