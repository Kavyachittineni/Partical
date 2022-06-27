public class Nestedifloop{
	
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "vijayawada, india";
		if (address.endsWith("Hyderabad")) {
			if (address.contains("nuzvid")) {
				System.out.println("your city is nuzvid");
			} else if(address.contains ("vizag")) {
				System.out.println("your city is vizag");
			}else {
				System.out.println("you are not living in Hyderabad");
			}
		}
	}

}
