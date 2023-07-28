// Program to demonstrate access specifier
//Drivar Class 

package in.kkw.library;
import in.bkcmet.library.*;
public class FacultyExecute {

	public static void main(String[] args) {
		Library l=new Library();
		l.libraryName="Bhujbal Library";
		l.displayPublic();
		
		/* User id and displayPrivate(), method is private so
		 * we cant access into anothe package or class, only
		 * we can access inside the same class
		 */ 		
		 
		//l.user_id=12345L;
		//l.displayPrivate()
		
		/* booksName and displayDefault method is default
		 * we cant access into another package, only we can access 
		 * it within the same package
		 */
		
		// l.booksName();
		//l.displayDefault();
		 
	}

}
