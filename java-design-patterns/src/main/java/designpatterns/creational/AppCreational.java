package designpatterns.creational;

import com.dev.designpatterns.creational.abstractfactory.DBConfig;
import com.dev.designpatterns.creational.abstractfactory.DBConnection;
import com.dev.designpatterns.creational.abstractfactory.FactoryDBConnection;
import com.dev.designpatterns.creational.abstractfactory.RequestConnection;
import com.dev.designpatterns.creational.prototype.Employee;
import com.dev.designpatterns.creational.prototype.EmployeeAddress;
import com.dev.designpatterns.creational.singleton.DatabaseConfig;

import java.io.IOException;

/**
 * @author Froy
 * {@link https://www.journaldev.com/1827/java-design-patterns-example-tutorial}
 */
public class AppCreational {

    public static void main(String[] args) throws IOException {

        //Singleton Pattern ----------------------------------
        DatabaseConfig databaseConfigSingleton = DatabaseConfig.getInstance();
        System.out.println(databaseConfigSingleton.toString());

        //Factory Pattern ----------------------------------
        DBConnection dbConnectionMysql = (DBConnection) FactoryDBConnection.getInstance(RequestConnection.MYSQL);
        System.out.println(dbConnectionMysql.connect());
        DBConnection dbConnectionPostgresSQL = (DBConnection) FactoryDBConnection.getInstance(RequestConnection.POSTGRESQL);
        System.out.println(dbConnectionPostgresSQL.connect());

        //Abstract Factory Pattern ----------------------------------
        DBConfig dbConfigMySQL = FactoryDBConnection.getInstance(RequestConnection.MYSQL);
        System.out.println(dbConfigMySQL.connect());
        DBConfig dbConfigRest = FactoryDBConnection.getInstance(RequestConnection.REST);
        System.out.println(dbConfigRest.connect());

        //Prototype Pattern ----------------------------------
        EmployeeAddress empAddress = new EmployeeAddress("22", "Avenue Street", "Dallas");
        Employee emp = new Employee("David", 32, empAddress);
        Employee empClone = null;
        try {
            empClone = (Employee) emp.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }
        System.out.println("Cloned Employee Object: " + empClone);


    }

}
