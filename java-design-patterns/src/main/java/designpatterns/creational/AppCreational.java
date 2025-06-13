package designpatterns.creational;

import designpatterns.creational.abstractfactory.DBConfig;
import designpatterns.creational.abstractfactory.DBConnection;
import designpatterns.creational.abstractfactory.FactoryDBConnection;
import designpatterns.creational.factorymethod.ViewRequest;
import designpatterns.creational.factorymethod.ViewRequestFactory;
import designpatterns.creational.prototype.Employee;
import designpatterns.creational.prototype.EmployeeAddress;
import designpatterns.creational.singleton.DatabaseConfig;
import java.io.IOException;
import static designpatterns.creational.abstractfactory.ConnectionType.*;

/**
 * {@link https://www.journaldev.com/1827/java-design-patterns-example-tutorial}
 */
public class AppCreational {
    @java.lang.SuppressWarnings("all")
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(AppCreational.class.getName());

    public static void main(String[] args) throws IOException {
        //Singleton Pattern ----------------------------------
        DatabaseConfig databaseConfigSingleton = DatabaseConfig.getInstance();
        log.info(databaseConfigSingleton.toString());
        //Factory Method ----------------------------------
        ViewRequestFactory factory = new ViewRequestFactory();
        ViewRequest viewRequest = factory.getViewRequest("two");
        viewRequest.executeProcess();
        //Factory Pattern ----------------------------------
        DBConnection dbConnectionMysql = (DBConnection) FactoryDBConnection.getInstance(MYSQL);
        log.info(dbConnectionMysql.connect());
        DBConnection dbConnectionPostgresSQL = (DBConnection) FactoryDBConnection.getInstance(POSTGRESQL);
        log.info(dbConnectionPostgresSQL.connect());
        //Abstract Factory Pattern ----------------------------------
        DBConfig dbConfigMySQL = FactoryDBConnection.getInstance(MYSQL);
        log.info(dbConfigMySQL.connect());
        DBConfig dbConfigRest = FactoryDBConnection.getInstance(REST);
        log.info(dbConfigRest.connect());
        //Prototype Pattern ----------------------------------
        EmployeeAddress empAddress = new EmployeeAddress("22", "Avenue Street", "Dallas");
        Employee emp = new Employee("David", 32, empAddress);
        Employee empClone = null;
        try {
            empClone = (Employee) emp.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }
        System.out.println(emp == empClone);
        log.info("Original Employee Object: " + emp);
        log.info("Cloned Employee Object: " + empClone);
    }
}
