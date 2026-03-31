package week1.day2;

public class chrome {
    
        public String addbook(String booktitle){
            System.out.println("book added successfully"
            +booktitle
            );
            return booktitle;
        }
        public void issuebook(){
            System.out.println("book issued successfully");
        }
        public static void main(String[] args) {
        chrome ch=new chrome();
        ch.addbook("Tamil");
        ch.issuebook();
        }
    }
