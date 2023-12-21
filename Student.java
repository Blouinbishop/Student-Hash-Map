public class Student {


	    String name;
	    String id;
	    String address;

	    public Student(String name, String id, String address) {
	        this.name = name;
	        this.id = id;
	        this.address = address;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getId() {
	        return id;
	    }

	    public String getAddress() {
	        return address;
	    }
	    
	    

	    @Override
	    public String toString() {
	        return "Student{" + "name=" + name + ", id=" + id + ", address=" + address + '}';
	    }
	    
	    public int compareTo(Student other) {
	   
	        if (name.equals(other.name) && id.equals(other.id) && address.equals(other.address)) {
	            return 0;
	        }
	        else { // compare these in order of name, id and address
	            
	            // compare name
	            if (name.compareTo(other.name) > 0) {
	                return 1;
	            }
	            else if (name.compareTo(other.name) < 0) {
	                return -1;
	            }
	            
	            // compare id
	            if (id.compareTo(other.id) > 0) {
	                return 1;
	            }
	            else if (id.compareTo(other.id) < 0) {
	                return -1;
	            }
	            
	            // compare address
	            if (address.compareTo(other.address) > 0) {
	                return 1;
	            }
	            else if (address.compareTo(other.address) < 0) {
	                return -1;
	            }
	        }
	        
	        return 0;
	    } 
	  public int tableSize = 13;
	    
	    public int getHash(int factor) {
	        // form hash code using name
	        // add up chars in name and divide by size of hashmap
	        int c;
	        int code = 0;
	        
	        for (int i=0; i < name.length(); i++) {
	            c = name.charAt(i);
	            //System.out.printf("%d\n", c);
	            code += c;
	        }
	        
	        return code % factor;
	    }
	    
}
	    
