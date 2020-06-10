package designpatterns.creational.abstractfactory;

import lombok.experimental.UtilityClass;

@UtilityClass
public class FactoryDBConnection {

    public static DBConfig getInstance(ConnectionType connectionType) {
        switch (connectionType) {
            case MYSQL: return new DBConnectionMySQL();
            case POSTGRESQL: return new DBConnectionPostgreSQL();
            case REST: return new DBRest();
            default: return null;
        }
    }
}
