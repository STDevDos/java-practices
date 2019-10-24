package creational.singleton;

import java.io.Serializable;

/**
 * @author Froy
 */
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

    public String getUrl() {
        return url;
    }

    public String getPort() {
        return port;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DatabaseConfig [url=");
        builder.append(url);
        builder.append(", port=");
        builder.append(port);
        builder.append(", user=");
        builder.append(user);
        builder.append(", pass=");
        builder.append(pass);
        builder.append("]");
        return builder.toString();
    }

}
