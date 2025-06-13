package designpatterns.creational.abstractfactory;

public abstract class DBConnection extends DBConfig {
    private String url;
    private String port;
    private String user;
    private String pass;

    public DBConnection(String url, String port, String user, String pass) {
        super();
        this.url = url;
        this.port = port;
        this.user = user;
        this.pass = pass;
    }

    @Override
    public String connect() {
        return ":: DBConnection - connected ::";
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "DBConnection(url=" + this.url + ", port=" + this.port + ", user=" + this.user + ", pass=" + this.pass + ")";
    }
}
