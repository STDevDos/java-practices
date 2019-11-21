package designpatterns.creational.abstractfactory;

/**
 * @author Froy
 */
public class FactoryDBConnection {

    private FactoryDBConnection() {
        throw new IllegalArgumentException("NOT VALID.");
    }

    public static DBConfig getInstance(RequestConnection requestConnection) {
        switch (requestConnection) {
            case MYSQL:
                return new DBConnectionMySQL();
            case POSTGRESQL:
                return new DBConnectionPostgreSQL();
            case REST:
                return new DBRest();
            default:
                return null;
        }
    }
}
