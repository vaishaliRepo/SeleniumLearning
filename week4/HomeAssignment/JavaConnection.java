package org.testleaf.week4.HomeAssignment;

public class JavaConnection extends MySqlConnection{

    @Override
    public void connect() {
        System.err.println("Connect method is defined in concrete class");
    }

    @Override
    public void disconnect() {
        System.err.println("disconnect method is defined in concrete class"); 
    }

    @Override
    public void executeUpdate() {
      System.err.println("executeUpdate method is defined in concrete class");   
    }

   /*  @Override
    public void executeQuery() {
        System.err.println("executeQuery method is defined in concrete class"); 
    }
   */
    public static void main(String[] args) {
        JavaConnection java= new JavaConnection();
        java.connect();
        java.disconnect();java.executeUpdate();
        java.executeQuery();
        
    }

    

}
