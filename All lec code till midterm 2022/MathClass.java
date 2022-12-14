
//Ex---1


public class MathClass
    
{    
    public static void main(String[] args)     
    {    
        double x = 28;    
        double y = 4;    
          
        // return the maximum of two numbers  
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
          
        // return the square root of y   
        System.out.println("Square root of y is: " + Math.sqrt(y));   
          
        //returns 28 power of 4 i.e. 28*28*28*28    
        System.out.println("Power of x and y is: " + Math.pow(x, y));      
  
        // return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
          
        // return the logarithm of given value when base is 10      
        System.out.println("log10 of x is: " + Math.log10(x));   
        System.out.println("log10 of y is: " + Math.log10(y));    
          
        // return the log of x + 1  
        System.out.println("log1p of x is: " +Math.log1p(x));    
  
        // return a power of 2    
        System.out.println("exp of a is: " +Math.exp(x));    
          
        // return (a power of 2)-1  
        System.out.println("expm1 of a is: " +Math.expm1(x));  
    }    
}    



//Ex--2


// public class MathClass    
// {    
//     public static void main(String[] args)     
//     {    
//         double a = 30;    
          
//         // converting values to radian    
//         double b = Math.toRadians(a);   
          
//         // return the trigonometric sine of a      
//         System.out.println("Sine value of a is: " +Math.sin(a));    
          
//         // return the trigonometric cosine value of a  
//         System.out.println("Cosine value of a is: " +Math.cos(a));  
          
//         // return the trigonometric tangent value of a  
//         System.out.println("Tangent value of a is: " +Math.tan(a));  
          
//         // return the trigonometric arc sine of a      
//         System.out.println("Sine value of a is: " +Math.asin(a));    
          
//         // return the trigonometric arc cosine value of a  
//         System.out.println("Cosine value of a is: " +Math.acos(a));  
          
//         // return the trigonometric arc tangent value of a  
//         System.out.println("Tangent value of a is: " +Math.atan(a));  
  
//         // return the hyperbolic sine of a      
//         System.out.println("Sine value of a is: " +Math.sinh(a));    
          
//         // return the hyperbolic cosine value of a  
//         System.out.println("Cosine value of a is: " +Math.cosh(a));  
          
//         // return the hyperbolic tangent value of a  
//         System.out.println("Tangent value of a is: " +Math.tanh(a));  
//     }    
// }    





// Math.max()	  -->   It returns the Largest of two values.
// Math.min()  -->   	It is used to return the Smallest of two values.
// Math.round()  -->   	It is used to round of the decimal numbers to the nearest value.
// Math.sqrt()  -->   	It is used to return the square root of a number.
// Math.cbrt()	  -->   It is used to return the cube root of a number.
// Math.pow()  -->   	It returns the value of first argument raised to the power to second argument.
// Math.signum()  -->   	It is used to find the sign of a given value.
// Math.ceil()	  -->   It is used to find the smallest integer value that is greater than or equal to the argument or mathematical integer.
// Math.copySign()  -->   	It is used to find the Absolute value of first argument along with sign specified in second argument.
// Math.nextAfter()  -->   	It is used to return the floating-point number adjacent to the first argument in the direction of the second argument.
// Math.nextUp()  -->   	It returns the floating-point value adjacent to d in the direction of positive infinity.
// Math.nextDown()	  -->   It returns the floating-point value adjacent to d in the direction of negative infinity.
// Math.floor()  -->   	It is used to find the largest integer value which is less than or equal to the argument and is equal to the mathematical integer of a double value.
// Math.floorDiv()	  -->   It is used to find the largest integer value that is less than or equal to the algebraic quotient.
// Math.random()  -->   	It returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
// Math.rint()	  -->   It returns the double value that is closest to the given argument and equal to mathematical integer.
// Math.hypot()  -->   	It returns sqrt(x2 +y2) without intermediate overflow or underflow.
// Math.ulp()	  -->   It returns the size of an ulp of the argument.
// Math.getExponent()  -->   	It is used to return the unbiased exponent used in the representation of a value.
// Math.IEEEremainder()  -->   	It is used to calculate the remainder operation on two arguments as prescribed by the IEEE 754 standard and returns value.
// Math.addExact()	  -->   It is used to return the sum of its arguments, throwing an exception if the result overflows an int or long.
// Math.subtractExact()  -->   	It returns the difference of the arguments, throwing an exception if the result overflows an int.
// Math.multiplyExact()  -->   	It is used to return the product of the arguments, throwing an exception if the result overflows an int or long.
// Math.incrementExact()  -->   	It returns the argument incremented by one, throwing an exception if the result overflows an int.
// Math.decrementExact()  -->   	It is used to return the argument decremented by one, throwing an exception if the result overflows an int or long.
// Math.negateExact()  -->   	It is used to return the negation of the argument, throwing an exception if the result overflows an int or long.
// Math.toIntExact()	  -->   It returns the value of the long argument, throwing an exception if the value overflows an int.