import java.util.Hashtable;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		int tableSize = 13;
		HashNode students = new HashNode();
		
		
		Student student1 = new Student("Homer Simpson", "SECTOR7G", "742 Evergreen Terrace, Springfield");
		Student student2 = new Student("Ned Flanders", "LEFTORIUM", "744 Evergreen Terrace, Springfield");
		Student student3 = new Student("C Montgomery Burns", "NUCLEAR", "1 Richman Way, Springfield");
        Student student4 = new Student("Moe Syslak", "MOETAVERN", "1 Broadway Way, Springfield");
        Student student5 = new Student("Comic Book Guy", "COMICS", "110 Broadway Way, Springfield");
        Student student6 = new Student("Marge Simpson", "BLUEHAIR", "742 Evergreen Terrace, Springfield");
        Student student7 = new Student("Lisa Simpson", "SPIKEYHAIR", "742 Evergreen Terrace, Springfield");
	
        System.out.println("Hash Codes for students");
        System.out.println("hash code for " + student1.getName() + " = " + student1.getHash(tableSize));
        System.out.println("hash code for " + student2.getName() + " = " + student2.getHash(tableSize));
        System.out.println("hash code for " + student3.getName() + " = " + student3.getHash(tableSize));
        System.out.println("hash code for " + student4.getName() + " = " + student4.getHash(tableSize));
        System.out.println("hash code for " + student5.getName() + " = " + student5.getHash(tableSize));
        System.out.println("hash code for " + student6.getName() + " = " + student6.getHash(tableSize));
        System.out.println("hash code for " + student7.getName() + " = " + student7.getHash(tableSize));
	
		
    
	
       
       
        

        
        
	}
	
	

}
