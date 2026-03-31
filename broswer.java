package week1.day2;

public class broswer {

    public String launchbroswer(String broswername){
            System.out.println("Broswer launched successfully"
            +broswername
            );
            return broswername;
        }
        public void loadurl(){
            System.out.println("Applicatin loaded successfully");
        }
        public static void main(String[] args) {
        broswer br=new broswer();
        br.launchbroswer("Google");
        br.loadurl();
        }
        
    }

