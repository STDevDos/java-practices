package designpatterns.creational.abstractfactory;

public class DBRest extends DBConfig {

    @Override
    public String connect() {
        return ":: DBRest ::";
    }

}
