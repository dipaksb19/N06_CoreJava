// Program to demonstrate access specifier

package in.bkcmet.library;

public class Library {
	
	//Different access specifier
	public String libraryName;
	private long user_id;
	String bookName;
	
	// Public Methos
	public void displayPublic() {
		System.out.println("Library Name : " + libraryName );
	}
	
	// Private Method
	private void displayPrivate() {
		System.out.println("User ID : " + user_id );
	}
	
	//Default Method
	void displayDefault() {
		System.out.println("BookName is : " + bookName);
	}

}
