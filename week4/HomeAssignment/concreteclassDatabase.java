package org.testleaf.week4.HomeAssignment;

public class concreteclassDatabase implements DatabseConnection {

    @Override
    public void connect() {
        System.out.println("Connect method in concrete class");
            }

    @Override
    public void disconnect() {
        System.out.println("disconnect method in concrete class");
        
    }

    @Override
    public void executeUpdate() {
        System.out.println("executeupdate method in concrete class");
       
    }

    public static void main(String[] args) {
        concreteclassDatabase objj= new concreteclassDatabase();
        objj.connect();
        objj.disconnect();
        objj.executeUpdate();
        
    }
}
