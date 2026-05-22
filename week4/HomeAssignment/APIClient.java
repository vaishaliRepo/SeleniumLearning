package org.testleaf.week4.HomeAssignment;

public class APIClient {

    public void sendRequest(String endpoint){
        System.out.println("SendRequest method overloading with 1 argument : " +endpoint);


    }
    public void sendRequest(String endpoint,String requestBody,boolean requestStatus){
        System.out.println("SendRequest method overloading with 3 arguments : " + endpoint +" " +requestBody+ " " +requestStatus);

    }
    public static void main(String args[]){

        APIClient call= new APIClient();
        call.sendRequest("Rest");
        call.sendRequest("PostMan","Head",true);

    }

}
