
public class Student {
	private	String Id;
	private	String name;
	private	char gender;
	private	String branch;
	
	public void setId(String Id) {
		if(Id.matches("^.{9}$")) {
			this.Id = Id;
		}
		else {
			System.out.println("Invalid Id");
			}
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(char gender) {
		if(gender == 'M' || gender == 'F') {
		this.gender = gender;
		}
		else {
			
		}
	}
	public void setBranch(String branch) {
		if(branch == "ECE" || branch == "CSE" || branch == "ME" || branch == "ECSE" || branch == "CE" || branch == "BT" || branch =="EEE") {
		this.branch = branch;
		}
		else {
			
		}
	}
	public String getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public String getBranch() {
		return branch;
	}
	public String toString() {
		String s;
		s = String.format("ID: %s\nName: %s\nGender: %c\nBranch: %s\n",this.getId(),this.getName(),this.getGender(),this.getBranch());
		return s;
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId("945304822");
		s1.setName("Rishabh Kumar");
		s1.setGender('M');
		s1.setBranch("CSE");
		System.out.println(s1);
		
		Student s2 = new Student();
		s2.setId("453048235");
		s2.setName("Swyam Singh");
		s2.setGender('F');
		s2.setBranch("CSE");
		System.out.println(s2);
	}
}
