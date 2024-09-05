package dev.jatin.Singleton;

public class DatabaseConnection {
    String url;
    String username;
    String password;

    public static DatabaseConnection instance=null;

    private DatabaseConnection() {


    }

    //Double Check Locking
    public static DatabaseConnection getInstance() {
        if(instance==null) {
            synchronized (DatabaseConnection.class) {
                if(instance==null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

}
