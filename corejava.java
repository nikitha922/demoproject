package demoproject;

import java.lang.reflect.Array;

public class corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 9; 
        String websitePage = "amazon.com";
        char letter = 'p';
        double dec = 4.99;
        boolean myCard = true;
        
        System.out.println(dec+"this value is true");
        System.out.println(websitePage+dec);
        
       int[] num = {1,3,7,8,8878,878789};
  
       System.out.println(num[2]);
       
       String[]name = {"subject","object"};
       System.out.println(name[1]);
       //for loop 
       for (int i=0; i<3;i++) 
       {
           System.out.println(num[i]);
       }
     
    
	}

}
