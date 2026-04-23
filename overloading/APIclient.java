package week4.day2.overloading;

import week4.Javaclass;

public class APIclient {
    public void sendrequest(String string){
        System.out.println("endpoint");
    }
public void sendrequest(String endpoint, String requestboday, String requeststatus){
System.out.println(endpoint+""+requestboday+requeststatus);
}
public static void main(String[] args) {
    APIclient API = new APIclient();
    API.sendrequest(null);
    API.sendrequest("stop","received","seccess");


}
}

