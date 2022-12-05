package javaMultiDimensionalArrays;

public class Example2 {

	public static void main(String[] args) {
		
		//multidimensional array(declaration and initialization) in multiple lines
		
		//array declaration or array object
		String employeeNames[][] = new  String[3][3];
		
		//array initialization 
		employeeNames[0][0] = "A";
		employeeNames[0][1] = "*";
		employeeNames[0][2] = "*";		
		
		employeeNames[1][0] = "*";
		employeeNames[1][1] = "A";
		employeeNames[1][2] = "*";
		
		employeeNames[2][0] = "*";
		employeeNames[2][1] = "*";
		employeeNames[2][2] = "A";
				
		for(int i = 0; i < employeeNames.length; i++)
		{
			for(int j = 0; j < employeeNames.length; j++)
			{
				System.out.print(employeeNames[i][j]+"\t");
			}
			System.out.println("\n\n");
		}
		
	}

}
