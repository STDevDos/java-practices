package abstractfactory;

/**
 * @author Froy
 */
public class DBConnectionPostgreSQL extends DBConnection {

    public DBConnectionPostgreSQL() {
        super("localhost", "5432", "postgres", "postgresPass");
    }

    @Override
    public String connect() {
        return ":: DBConnection PostgreSQL - connected :: ";
    }

}
