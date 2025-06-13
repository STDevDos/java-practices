package designpatterns.creational.abstractfactory;

public final class FactoryDBConnection {
    public static DBConfig getInstance(ConnectionType connectionType) {
        switch (connectionType) {
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

    @java.lang.SuppressWarnings("all")
    private FactoryDBConnection() {
        throw new java.lang.UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
