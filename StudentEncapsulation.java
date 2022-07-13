public class StudentEncapsulation {
	
		private String name;
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

	}

	class Test_Encapsulation {
		public static void main(String[] args) {
			StudentEncapsulation obj = new StudentEncapsulation();
			obj.setName("Sayan"); 
			System.out.println(obj.getName()); 
		}
	}

