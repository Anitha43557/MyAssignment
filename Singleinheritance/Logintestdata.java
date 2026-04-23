package week3.day2.Singleinheritance;

public class Logintestdata extends testdata {
    public void enterusername(){
        System.out.println("enter the username");
    }
    public void enterpassword(){
        System.out.println("enter the password");
    }
    public static void main(String[] args) {
        Logintestdata lt = new Logintestdata();
lt.enterpassword();
lt.navigatetohomepage();
    }

}
