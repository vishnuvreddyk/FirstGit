
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "The best of both worlds";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("total no of characters in a string:"+ count);
	}

}
