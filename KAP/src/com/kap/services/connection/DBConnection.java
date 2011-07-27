package com.kap.services.connection;

import com.kap.services.util.PropertiesReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import org.apache.commons.dbcp.BasicDataSource;

public class DBConnection {

    private static BasicDataSource bds;
    private static Connection con;
    private static ResourceBundle connectionProperties;
    private static final String propertiesName = "com.kap.services.connection.connectionParameters";
    
    static{
        String urlDb = null;
	String usuarioDb = null;
	String passwordDb = null;
	String driver = null;
        int initialSize = 0;
        int maxActive= 0;
        int maxIdle= 0;
        int maxWait= 0;
        String validationQuery = null;
        try {
            connectionProperties = PropertiesReader.readProperties( propertiesName);
            urlDb = (String)connectionProperties.getObject("Url");
            usuarioDb = (String)connectionProperties.getObject("Username");
            passwordDb = (String)connectionProperties.getObject("Password");
            driver = (String)connectionProperties.getObject("Driver");
            initialSize = Integer.parseInt((String)connectionProperties.getObject("InitialSize"));
            maxActive = Integer.parseInt((String)connectionProperties.getObject("MaxActive"));
            maxIdle = Integer.parseInt((String)connectionProperties.getObject("MaxIdle"));
            maxWait = Integer.parseInt((String)connectionProperties.getObject("MaxWait"));
            validationQuery = (String)connectionProperties.getObject("ValidationQuery");
	} catch (Exception e) {
            e.printStackTrace();
	}
	try {
            Class.forName(driver);
            bds = new BasicDataSource();
            bds.setDriverClassName(driver);
            bds.setUrl(urlDb);
            bds.setUsername(usuarioDb);
            bds.setPassword(passwordDb);
            bds.setInitialSize(initialSize);
            bds.setMaxActive(maxActive);
            bds.setMaxIdle(maxIdle);
            bds.setMaxWait(maxWait);
            bds.setValidationQuery(validationQuery);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
	}
    }

    private synchronized static void setCon(Connection con) {
        DBConnection.con = con;
    }
    
    private synchronized static void ConexionDB()
    {
        try{
            setCon(DriverManager.getConnection((String)connectionProperties.getObject("Url"),(String)connectionProperties.getObject("Username"),(String)connectionProperties.getObject("Password")));
        }
        catch (SQLException eSQL){
            eSQL.printStackTrace();
        }
        catch (Exception eOtra){
            eOtra.printStackTrace();
        }
     }

    public synchronized static Connection getConnection(){
        try{
            ConexionDB();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }

    public synchronized static void returnConnection(Connection conn){
        if(conn==null){
            return;
	}
	try{
            conn.close();
	}
        catch(SQLException e){
            e.printStackTrace();
        }
    }
	
}
