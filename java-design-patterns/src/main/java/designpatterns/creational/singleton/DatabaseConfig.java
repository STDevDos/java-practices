package designpatterns.creational.singleton;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
public class DatabaseConfig implements Serializable {

    private static final long serialVersionUID = 3374603135957280336L;

    private static DatabaseConfig instance;

    private String url;
    private String port;
    private String user;
    private String pass;

    private DatabaseConfig() {
        this.url = "localhost";
        this.port = "0000";
        this.user = "root";
        this.pass = "Abc321";
    }

    public static DatabaseConfig getInstance() {
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

}
