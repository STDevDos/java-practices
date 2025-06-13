package designpatterns.creational.singleton;

import java.io.Serializable;

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

    @java.lang.SuppressWarnings("all")
    public String getUrl() {
        return this.url;
    }

    @java.lang.SuppressWarnings("all")
    public String getPort() {
        return this.port;
    }

    @java.lang.SuppressWarnings("all")
    public String getUser() {
        return this.user;
    }

    @java.lang.SuppressWarnings("all")
    public String getPass() {
        return this.pass;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "DatabaseConfig(url=" + this.getUrl() + ", port=" + this.getPort() + ", user=" + this.getUser() + ", pass=" + this.getPass() + ")";
    }
}
