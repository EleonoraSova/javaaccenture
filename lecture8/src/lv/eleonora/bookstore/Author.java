package lv.eleonora.bookstore;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
		if(checkGender(gender)){
			this.gender = gender;
		}else{
			this.gender = 'x';
		}
	}
	public Author(String name){
	this.name = name;
	}
	
	public static boolean checkGender(char gender){
		
		char m = 'm';
		char f ='f';
		
		if(m == 0 || f == gender){
			return true;
		}else{
			return false;
		}
		
	}
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

//	@Override
//	public String toString() {
//		return "Author [name=" + name + ", email=" + email + ", gender="
//				+ gender + "]";
//	}
	
public String toString(){
	return "Name "+this.name;
}
}
