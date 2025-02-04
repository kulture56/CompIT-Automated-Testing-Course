package org.compit.course_01_variables;

public class variables {
	
	public static void main(String[] args) {
	
		// Primitives - Integers
		 
		//1. byte Size: 8-bit. Range: -128 to 127. Default value: 0
		//Use: Useful for saving memory in large arrays or when working with raw binary data.
		byte num1 = 100;
		
		//2. short. Size: 16-bit. Range: -32,768 to 32,767. Default value: 0
		//Use: Suitable for saving memory in large arrays when the range of values is small.
		short num2 = 20000;
		
		//3. int Size: 32-bit. Range: -2,147,483,648 to 2,147,483,647. Default value: 0
		//Use: Commonly used for integer arithmetic
		int num3 = -500_000_000;
		
		//4. long Size: 64-bit. Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. Default value: 0L
		//Use: Suitable for large numeric values.
		long num4 = 1456;
		
		//5. double. Size: 64-bit. Range: Approximately ±1.79769313486231570E+308 (15 decimal digits precision)
		//Default value: 0.0d. Use: Default choice for decimal values, offering better precision than float
		double num5 = 123.45678901234567890;
		
		
		//7. char. Size: 16-bit. Range: 0 to 65,535 (represents a single Unicode character)Default value: '\u0000'
		//Use: Useful for storing characters.char chr1 ='A';
		char chr1 = 'A';
		
		//6. boolean. Size: Not precisely defined (depends on JVM). Values: true or false. Default value: false
		//Use: Represents a binary state, such as on/off or true/false.boolean bool1 = false;
		boolean bool = false;
				
		//8. float. Size: 32-bit. Range: Approximately ±3.40282347E+38F (7 decimal digits precision)
		//Default value: 0.0f. Use: Useful for saving memory in large arrays of floating-point numbers, 
		//where precision is less important.
        float num6 = 123.45678901234567890f;
		
		String str = "Hello";
		
		System.out.println(chr1);  
	}

}
