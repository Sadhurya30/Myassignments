package week1.day1;

public class Mobile {
    public void sendMessage(){
    	System.out.println("can able to send message");
    }
    public void shareDocument() {
    	System.out.println("can able to share document");
    }
    
    public void call() {
    	System.out.println("can able to call");
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile vivo = new Mobile();
		vivo.sendMessage();
		vivo.shareDocument();
		vivo.call();

	}

}
