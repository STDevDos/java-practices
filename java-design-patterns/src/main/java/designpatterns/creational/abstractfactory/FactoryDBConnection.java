package designpatterns.creational.abstractfactory;

public final class FactoryDBConnection {
    public static DBConfig getInstance(ConnectionType connectionType) {
        return switch (connectionType) {
            case MYSQL -> new DBConnectionMySQL();
            case POSTGRESQL -> new DBConnectionPostgreSQL();
            case REST -> new DBRest();
            default -> throw new IllegalArgumentException("Unknown connection type: " + connectionType);
        };
    }

    @java.lang.SuppressWarnings("all")
    private FactoryDBConnection() {
        throw new java.lang.UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
