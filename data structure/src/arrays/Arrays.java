package arrays;

public class Arrays {
	public static void main(String args[]){  

		int a[]=new int[5];  //declaration and instantiation  

		a[0]=10;  //initialization  

		a[1]=20;  

		a[2]=70;  

		a[3]=40;  

		a[4]=50;  

		//traversing array  

		for(int i=0;i<a.length;i++)  //length is the property of array  

		System.out.println(a[i]);  
		
		// Enhanced For loop
		System.out.println("Enhanced For loop");
		for(int i : a)  //length is the property of array  
	
			System.out.println(i);  
			
			
	
			}

}
