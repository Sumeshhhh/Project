package javaTask;

//write a program  & find simple interest

public class Example2 {

	public static void main(String[] args) {
		
		int  principleAmount = 60000;
		
		double timeDuration = 18;
		 
		double rateDuration = 2.5, result;
		
		result = (principleAmount*timeDuration* rateDuration)/100;
				
				System.out.println(" Simple interest = "+ result);
		
	}

}
