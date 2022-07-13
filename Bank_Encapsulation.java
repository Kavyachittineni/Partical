public class Bank_Encapsulation {
		private String name;
		private String email;
		private int accNum;
		private int amount;
		

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getAccNum() {
			return accNum;
		}
		public void setAccNum(int accNum) {
			this.accNum = accNum;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}

	}

	class Test_Bank_Encapsulation {
		public static void main(String[] args) {
			Bank_Encapsulation obj = new Bank_Encapsulation();
			obj.setName("kavya");
			System.out.println(obj.getName());
			
			obj.setEmail("kavyach.8881@gmail.com");
			System.out.println(obj.getEmail());
			
			obj.setAccNum(19987654);
			System.out.println(obj.getAccNum());
			
			obj.setAmount(1000);
			System.out.println(obj.getAmount());
			
			
			
		}
		
	}
