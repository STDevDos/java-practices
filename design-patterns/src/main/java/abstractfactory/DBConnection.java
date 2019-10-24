package abstractfactory;

/**
 * @author Froy
 */
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


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DBConnection [url=");
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
