package javaArrays;

public class Example1 
{
	public static void main(String[] args) {
		
		
		int employeeIds[] = {101, 102, 103, 104, 105};
		
		System.out.println(employeeIds[0]);
		
		System.out.println("===================");
		
		for(int i = 0; i < employeeIds.length; i++)
		{
			System.out.println(employeeIds[i]);
		}
		
		System.out.println("=====================");
		
		//using length attribute
		System.out.println(employeeIds.length);
		
		System.out.println("===============");
		
		int count = 0;
		
		//by using enhanced for loop 
		for(int employeeId: employeeIds)
		{
			count++;
		}
		
		System.out.println(count);
		
	} 
}
