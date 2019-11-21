package designpatterns.creational.abstractfactory;

/**
 * @author Froy
 */
public class DBConnectionMySQL extends DBConnection {

    public DBConnectionMySQL() {
        super("localhost", "3306", "root", "Abc321");
    }

    @Override
    public String connect() {
        return ":: DBConnection MySQL - connected :: ";
    }

}
