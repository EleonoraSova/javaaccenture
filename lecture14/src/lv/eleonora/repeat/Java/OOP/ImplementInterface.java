package lv.eleonora.repeat.Java.OOP;

public class ImplementInterface implements Interface{

	@Override
	public void sendEmail() {
		System.out.println("email@email.com");
		
	}

	@Override
	public int sendEmailCount() {
		int i = 0;
		return ++i;
	}

}
