package lv.eleonora;

import lv.eleonora.bookstore.Author;
import lv.eleonora.bookstore.Book;



public class TestBookStore {

	
	public static void main(String[] args) {
		
		Author rowling = new Author("J.K.ROWLING", "rowling@gmail.com", 'f');
		Author rainis = new Author("Rainis", "rainis@gmail.com", 'm');
		
		System.out.println(rowling.getEmail());
		rowling.setEmail("rowli@gmail.com");
		System.out.println(rowling.getEmail());
		
		Author test20 = new Author("Test20");

        Book harrypotter = new Book("Harry Potter", rowling, 20.3, 1000);
        Book testBook = new Book("Books". new Author("Author", "email@gmail.com", ""));
        
        System.out.println(harrypotter.toString());
        System.out.println(testBook.toString());
        System.out.println(harrypotter.toString());
        
        Book testBook = new Book("Test Book", test20, 40.2, 20);
        
        System.out.println(testBook2.toString());
		
		
		System.out.println("+++++++++++++++++++++");

		
		Author test1 = new Author("name", "name@name", 'f');
		Author test2 = new Author("name", "name1@name", '0');
		
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		
		System.out.println("+++++++++++++++++++++");
		char checkChar = 'm';
		boolean testBool = checkGender(checkChar);
		System.out.println(testBool);
	}
	
        public static boolean checkGender(char gender){
		
		char m = 'm';
		char f ='f';
		
		if(m == 0 || f == gender){
			return true;
		}else{
			return false;
		}
		
//		char m = 'm';
//		char f ='f';
//		char o = 'o';
//		
//		if(m == 0 || f == 0){
//			System.out.println("It is M for F");
//		}else{
//			System.out.println("It is not M for F");
//		}
//		
//		switch(o){
//		  case 'm':
//			  System.out.println("Its m");
//			  break;
//		  case 'f':
//		  System.out.println("Its f");
//		  break;
//		  default:
//			  System.out.println("Not in list");
		}
}
