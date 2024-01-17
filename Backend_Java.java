// package com.mycompany.backend_java;
// import java.util.*;
// public class Backend_Java{
//     public static void main(String args[]){
//     // output
//     System.out.print("Hello world with java!\n"); //using /n
//     System.out.println("Hello world with java!"); //using println

//     //print the pattern: Just to print the *
//     System.out.println("*");
//     System.out.println("**");
//     System.out.println("***");
//     System.out.println("****");

//     // //variables: int, double, string:datatypes

//     // //Input: Scanner
//     Scanner sc = new Scanner(System.in); 
//     //String name1 = sc.next(); //this will only scan for 1 word and stop so we use,
//     String name2 = sc.nextLine();
//     System.out.println(name2);
//     // //nextint(), nextfloat();
//     sc.close();

// //***Tasks
// 1. Scanner scan = new Scanner(System.in);
//     System.out.println("Enter the value of k:");
//     int k = scan.nextInt();
//     System.out.println("Enter the value of z:");
//     int z= scan.nextInt();    
//     int add=k+z;
//     System.out.println("the sum is:");
//     System.out.println(add);
//     scan.close();
    
// // 2. Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
// Scanner scan1 = new Scanner(System.in);
// System.out.println("Enter the radius value:");
// int radius=scan1.nextInt();
// Double Area= 3.14*radius*radius;
// System.out.println("Area of the circle is:");
// System.out.println(Area);
// scan1.close();

// // 3. Make a program that prints the table of a number that is input by the user. (without conditions or loops)
// Scanner scanner= new Scanner(System.in);
// System.out.println("Enter the number:");
// int o=scanner.nextInt();
// int c = o*2;
// System.out.println(c);
// int d = o*3;
// System.out.println(d);
// int e = o*4;
// System.out.println(e);
// int f = o*5;
// System.out.println(f);
// int g = o*6;
// System.out.println(g);
// int h = o*7;
// System.out.println(h);
// int i = o*8;
// System.out.println(i);
// int j = o*9;
// System.out.println(j);
// int l = o*10;
// System.out.println(l);
// scanner.close();
// //The above code works, but it takes up a lot of lines to write it, in the next topic, I learn how to do this more effectively using conditional and loop statements

//   }      
// }

//If-else, switch
    // //4.To check age
    // Scanner sc = new Scanner(System.in);
    // int a= sc.nextInt();
    // sc.close();
    // if(a>=18){
    //     System.out.println("U are an adult");
    // }else{
    //     System.out.println("U are just a baby");
    // }

    // // 5. To check even or odd
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the no.: ");
    // int a= sc.nextInt();
    // sc.close();
    // if(a%2==0){
    // System.out.println("even no.");
    // }else{
    //     System.out.println("odd no.");
    // } 

// //6. Compare 2 numbers
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a:");
//     int a= sc.nextInt();
//     System.out.println("Enter b");
//     int b= sc.nextInt();
//     sc.close();

//     if(a==b){
//         System.out.println("The digits u gave are equal");
//     }
//     if(a<b){
//         System.out.println("b is greater than a");
//     } else if(a>b){
//         System.out.println("a is greater than b");
//     }


//Switch statement:
// // 7.
// package com.mycompany.backend_java;
// import java.util.*;
// public class Backend_Java{
//     public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int n= sc.nextInt();
// switch(n) {
//   case 1 :
//       System.out.println("Monday");
//       break;
//   case 2 :
//       System.out.println("Tuesday");
//       break;
//   case 3 :
//       System.out.println("Wednesday");
//       break;
//   case 4 :
//       System.out.println("Thursday");
//       break;
//   case 5:
//       System.out.println("Friday");
//       break;
//   case 6 :
//       System.out.println("Saturday");
//       break;
//   default :
//       System.out.println("Sunday");
//       break;
// }
//     }
// } 

//8. Example for Switch:
//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	// 1 : + (Addition) a + b
    // 2 : - (Subtraction) a - b
    // 3 : * (Multiplication) a * b
    // 4 : / (Division) a / b
    // 5 : % (Modulo or remainder) a % b
    // Calculate the result according to the operation given and display it to the user.

// package com.mycompany.backend_java;
// import java.util.*;
// public class Backend_Java{
//     public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Please enter a:");
// int a= sc.nextInt();
// System.out.println("Please enter b: ");
// int b=sc.nextInt();
// System.out.println("Choose operation (+, -, *, /, %):");
// char operator = sc.next().charAt(0);

// switch(operator) {
//   case '+':
//       System.out.println(a+b);
//       break;
//   case '-':
//       System.out.println(a-b);
//       break;
//   case '*' :
//       System.out.println(a*b);
//       break;
//   case '/' :
//       System.out.println(a/b);
//       break;
//   case '%':
//       System.out.println(a%b);
//       break;
//   default :
//       System.out.println("U gave wrong input dummy");
//       break;
// }


 //9. Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

//  Scanner sc= new Scanner(System.in);
//  System.out.println("Enter the number of the month: ");
//  int a=sc.nextInt();
//  sc.close();
//  switch(a){
//     case 1: System.out.println("January");
//     break;
//     case 2: System.out.println("Febuary");
//     break;
//     case 3:System.out.println("March");
//     break;
//     case 4:System.out.println("April");
//     break;
//     case 5:System.out.println("May");
//     break;
//     case 6:System.out.println("June");
//     break;
//     case 7:System.out.println("July");
//     break;
//     case 8:System.out.println("August");
//     break;
//     case 9:System.out.println("September");
//     break;
//     case 10:System.out.println("Oct");
//     break;
//     case 11:System.out.println("November");
//     break;
//     case 12:System.out.println("December");
//     break;
//     default:System.out.println("Not valid");
//     break;
//  }
//     }
// } 


//Loops:
//FOR LOOP:
// package com.mycompany.backend_java;
// import java.util.*;
// public class Backend_Java{
//     public static void main(String args[]){
//         for(int i=0;i<=10;i++){
//           System.out.println(i);
//         }

//WHILE LOOP:  
// int i=0;
// while(i<11){
//    System.out.println(i);
//    i++;
//     }

 //DO WHILE:
// int i=0;
// do{
//     System.out.println(i);
//     i++;
// } while(i<11);

//To show difference between while and do-while:
// int i=12;
//i++;
// while(i<11){
//     System.out.println("Sahiti");
//     //THis will give us no o/p at all as the i value is 12 and the condition is checked and it won't enter the loop. 
// }
// int i=12;
// do{
//     System.out.println("Sahiti");
//     i++;
//     // Here, even tho the condition is wrong, SAHITI is printed once and then later after the loop ends , the condition is checked anthen terminated.
// }while(i<11);

//Practice Questions:
//10.Print the sum of first n natural numbers;
// Scanner sc= new Scanner(System.in);
// System.out.println("Enter number n:");
// int n=sc.nextInt();
// sc.close();
// int sum=0;
// for(int i=1;i<=n;i++){
//     sum=sum+i;
// }
// System.out.println("Sum is :" +sum);

//11.Print the table of a numberr input by the user
// Scanner sc= new Scanner(System.in);
// System.out.println("Enter number n:");
// int n=sc.nextInt();
// sc.close();
// for(int i=1; i<=10;i++){
//     System.out.println(n*i);
// }


//12. Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”

// package com.mycompany.backend_java;
// import java.util.Scanner;

// public class Backend_Java {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int choice;
//         int marks;

//         do {
//             // Display menu
//             System.out.println("1. Enter student's marks");
//             System.out.println("0. Exit");
//             System.out.println("Enter your choice:");

//             // Get user's choice
//             choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     // Take input for student's marks
//                     System.out.println("Enter student's marks (out of 100):");
//                     marks = scanner.nextInt();

//                     // Check and print message based on marks
//                     if (marks >= 90) {
//                         System.out.println("This is Good");
//                     } else if (marks >= 60 && marks <= 89) {
//                         System.out.println("This is also Good");
//                     } else if (marks >= 0 && marks <= 59) {
//                         System.out.println("This is Good as well");
//                     } else {
//                         System.out.println("Invalid marks. Marks should be between 0 and 100.");
//                     }
//                     break;
//                 case 0:
//                     System.out.println("Exiting program. Goodbye!");
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please enter 1 or 0.");
//             }

//         } while (choice != 0);

//         scanner.close();
//     }
// }


//***************************************************/
//Solved Hackerrank problems of Variables, Datatypes, loops, operator and i/p,o/p st. - 8 progarms.
//Also, examples for each of the topic - 12 examples.
//Total : 20 programs.
//***************************************************/

//Non primitive datatypes
//Functions or Methods
// package com.mycompany.backend_java;
// import java.util.*;

// public class Backend_Java{
// public static int calculateSum(int a, int b){
//     int sum = a+b;
//     return sum;
// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         sc.close();

//         int sum= calculateSum(a, b);
//         System.out.println("Sum is:"+sum);

//     }
// }

// package com.mycompany.backend_java;
// import java.util.*;

// public class Backend_Java{
// public static int calculateProduct(int a, int b){
//     int multi= a*b;
//     return multi;
// }
// public static void main(String[]args){
//     Scanner sc= new Scanner(System.in);
//     int a= sc.nextInt();
//     int b= sc.nextInt();
//     sc.close();

//     int multi=calculateProduct(a, b);
//     System.out.println("Multiplication of the 2 numbers is:"+multi);
// }
// }

// package com.mycompany.backend_java;
// import java.util.*;

// public class Backend_Java{

//     public static void printFactorial(int n){
//         if(n<0){
//             System.out.println("Invalid");
//             return;
//         }
//         int factorial= 1;

//         for(int i=n; i>=1; i--){
//            factorial = factorial*i;
//         }

//         System.out.println(factorial);
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         sc.close();
         
//         printFactorial(n);
//     }
// }

// package com.mycompany.backend_java;
// import java.util.*;

// public class Backend_Java{
//     public static void main(String[] args){
//         int[] marks = new int[3];
//         marks[0] = 97;
//         marks[1] = 98;
//         marks[2] = 95;

//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         //or use for loop
//         for(int i=0; i<3; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }


// package com.mycompany.backend_java;
// import java.util.*;

// //2d arrays
// public class Backend_Java{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int rows= sc.nextInt();
//         int cols = sc.nextInt();

//         int [][] numbers= new int[rows][cols];

//         //input
//         //rows
//         for(int i=0; i<rows; i++){
//             //columns
//             for(int j=0; j<cols; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }

//         //output
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 System.out.print(numbers[i][j]+ " ");//here we will get a gap after entering each input element
//             }
//                 System.out.println();//here this is after the row is printed, it will go to the next line
//         }
//     }
// }

//example:
// package com.mycompany.backend_java;
// import java.util.*;

//2d arrays
// public class Backend_Java{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int rows= sc.nextInt();
//         int cols = sc.nextInt();

//         int [][] numbers= new int[rows][cols];

//         //input
//         //rows
//         for(int i=0;i<rows;i++){
//         for(int j=0; j<cols;j++){
//             numbers[i][j]= sc.nextInt();
//         }
//         }
//            int x= sc.nextInt();
            
//            //output
//            for(int i=0; i<rows; i++){
//             for(int j=0; j<cols;j++){
//                 if(numbers[i][j]==x){
//                     System.out.println("x found at the location:" +i + "," +j);
//                 }
//                 }
//             }
//     } 
    
// }

//STRINGS:
// package com.mycompany.backend_java;
// import java.util.*;

// public class Backend_Java{
//     public static void main(String[] args){
        //string declaration
        // String name= "Tony";
        // String fullName ="Tony Stark";
        // String Sentence= "My name is Tony Stark";
        // System.out.println(name +" "+ fullName + " "+ Sentence);

        // to take input
        // Scanner sc= new Scanner(System.in);
        // String name= sc.nextLine();
        // System.out.println("Your name is: "+name);

        //Concatination:
        // String firstName= "Tony";
        // String lastName ="Stark";
        // String fullName = firstName+ " " + lastName;
        // System.out.println(fullName);

        //length of string
        // String firstName= "Tony";
        // String lastName ="Stark";
        // String fullName = firstName+ " " + lastName;
        // System.out.println(fullName.length());

        //print all the elements
        // String firstName= "Tony";
        // String lastName ="Stark";
        // String fullName = firstName+ " " + lastName;
        // System.out.println(fullName.length());
        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }

        //Compare two strings
        // String name1 = "Sahiti";
        // String name2 = "Sahiti";

        //s1>s2 then +ve value
        //s1==s2 then 0
        //s1< s2 then -ve value

        //hello wello , hello is small and wello is larger

        // if(name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        //substring:
        // String sentence= "My name is Sahiti";
        // substring(bed index, end index);

        // String name= sentence.substring(11, sentence.length());
        // System.out.println(name);

        //String name= sentence.substring(5); //it by default takes the last element place as end index

        //strings are immutable
//     }
// }


//String builder : for modifying a string
// package com.mycompany.backend_java;
// import java.util.*;

// public class Backend_Java{
//     public static void main(String[] args){
//         StringBuilder sb= new StringBuilder("Sahiti");
//         System.out.println(sb);

        // //char at index 0:
        // System.out.println(sb.charAt(0));

        // //set char at index:
        // sb.setCharAt(0, 'T');
        // System.out.println(sb);

        //insert a element in a string
        // sb.insert(0, 'D');
        // System.out.println(sb);

        //delete something
        // sb.delete(0, 2);
        // System.out.println(sb);

        //append -> add something at the end
        // sb.append('D'); //if using strings then str= str+"D"
        // sb.append('w');
        // sb.append('i');
        // sb.append('v');
        // sb.append('i');
        // sb.append('d');
        // System.out.println(sb);

        //length
        // System.out.println(sb.length());
//     }
// }


//Reversing a string:
// package com.mycompany.backend_java;
// import java.util.*;

// public class Backend_Java{
//     public static void main(String[] args){
//         StringBuilder sb= new StringBuilder("Sahiti");

//         for(int i=0;i<sb.length()/2;i++){ //here we calculated what the front and back indexes are
//             int front =i;
//             int back = sb.length()-1-i; //here it means h is going to the position 5(length)-1-0(its position in string)=4 i.e, 4th index

//             char frontChar = sb.charAt(front); //here we discovered what the front char is and which is the back char and assigned it to some variables like frontChar ad backChar
//             char backChar= sb.charAt(back);

//             sb.setCharAt(front, backChar); //here we replaced the front index character with backchar
//             sb.setCharAt(back, frontChar);
//         }

//         System.out.println(sb);
//     }
// }

//time complexity : O(n)

// **** End of Java Basics ****//
