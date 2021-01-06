package eberth;

import javax.xml.ws.Endpoint;

/**
 * this class provides the main method where the program begins
 */
public class Main {

    /**
     * in this class we provide a simple web service
     * @param args is not used
     */
    public static void main(String[] args) {

        HelloWorld test = new HelloWorld();
        Endpoint endpoint = Endpoint.publish("http://localhost:8081/HelloWorld", test);
        System.out.println("server up and running...");

    }
}
