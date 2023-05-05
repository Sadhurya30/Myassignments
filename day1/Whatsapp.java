package week1.day1;

public class Whatsapp {
	 public void texting() {
	    	System.out.println("can able to text");
	    }
		public void calling() {
			System.out.println("can able to call");
		}
		
		public void payment() {
			System.out.println("can able to make payments");
		}
		
		public void transfer() {
			System.out.println("can able to transfer photos,documents,videos");
		}
		
		public void locationSharing() {
			System.out.println("can able to share location");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Whatsapp whatsapp = new Whatsapp();
         whatsapp.texting();
         whatsapp.calling();
         whatsapp.payment();
         whatsapp.transfer();
         whatsapp.locationSharing();
	}

}
