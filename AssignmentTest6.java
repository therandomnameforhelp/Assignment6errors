/*Name:Test
Developer:Keanu Correa
Date:9/10/2016
Description:Create a reference data type that will be used by a college to store a persons information.
The information that needs to be stored are the persons name, current address, permanent address, id number, 
date of birth, current age, year the person entered the college system, and how long the person has been with the college.
*/

import java.util.Scanner;

class Test {

   public static void main(String[] args) {
   
   Persons_Information pers1;
   Persons_Information pers2;
   
           
   Scanner input = new Scanner(System.in);
   Scanner inStr = new Scanner(System.in);
  
  
   String name;
   String adress;
   String permAdress;
   int id;
   String birth;
   int age;
   int year;
   int totalyears;
  
  
   pers1 = new Persons_Information();
   pers2 = new Persons_Information(1111);
   
   //object 1
   
   System.out.println("Enter Name:");
   name = input.nextLine();
   pers1.setPersonName(name);
   System.out.println("You entered " + pers1.getPersonName() + ".\n");
   
   System.out.println("Enter Current Adress:");
   adress = input.nextLine();
   pers1.setCurrentAdress(birth);
   System.out.println("You entered " + pers1.getCurrentAdress() + ".\n");
   
   System.out.println("Enter Permanent Adress:");
   permAdress = input.nextLine();
   pers1.setBirthDate(permAdress);
   System.out.println("You entered " + pers1.getPermanentAdress() + ".\n");
   
   System.out.println("Enter ID Number:");
   id = input.nextInt();
   pers1.setIdNumber(id);
   System.out.println("You entered " + pers1.getIdNumber() + ".\n");

   System.out.println("Enter Birth Date:");
   birth = input.nextLine();
   pers1.setBirthDate(birth);
   System.out.println("You entered " + pers1.getBirthDate() + ".\n");
   
   System.out.println("Enter Age:");
   age = input.nextInt();
   pers1.setPersonAge(age);
   System.out.println("You entered " + pers1.getPersonAge() + ".\n");
  
   System.out.println("Enter College Entry Year:");
   year = input.nextInt();
   pers1.setEntryYear(year);
   System.out.println("You entered " + pers1.getEntryYear() + ".\n");   

   System.out.println("Enter Total Years in College:");
   totalyears = input.nextInt();
   pers1.setTotalyears(totalyears);
   System.out.println("You entered " + pers1.getTotalYears() + ".\n");

   //object 2
   
   System.out.println("Enter Name:");
   name = input.nextLine();
   pers1.setPersonName(name);
   System.out.println("You entered " + pers1.getPersonName() + ".\n");
   
   System.out.println("Enter Current Adress:");
   adress = input.nextLine();
   pers1.setCurrentAdress(birth);
   System.out.println("You entered " + pers1.getCurrentAdress() + ".\n");
   
   System.out.println("Enter Permanent Adress:");
   permAdress = input.nextLine();
   pers1.setBirthDate(permAdress);
   System.out.println("You entered " + pers1.getPermanentAdress() + ".\n");
   
   System.out.println("Enter Birth Date:");
   birth = input.nextLine();
   pers1.setBirthDate(birth);
   System.out.println("You entered " + pers1.getBirthDate() + ".\n");
   
   System.out.println("Enter Age:");
   age = input.nextInt();
   pers1.setPersonAge(age);
   System.out.println("You entered " + pers1.getPersonAge() + ".\n");
  
   System.out.println("Enter College Entry Year:");
   year = input.nextInt();
   pers1.setEntryYear(year);
   System.out.println("You entered " + pers1.getEntryYear() + ".\n");   

   System.out.println("Enter Total Years in College:");
   totalyears = input.nextInt();
   pers1.setTotalyears(totalyears);
   System.out.println("You entered " + pers1.getTotalYears() + ".\n");   

   //toString
   
   System.out.println("Name:\n" + pers1.toString() + "\n");
   System.out.println("Current Adress:\n" + pers1.toString());
   System.out.println("Permanent Adress:\n" + pers1.toString());
   System.out.println("ID Number:\n" + pers1.toString());
   System.out.println("Birth Date:\n" + pers1.toString());
   System.out.println("Age:\n" + pers1.toString());
   System.out.println("Entry Yeara:\n" + pers1.toString());
   System.out.println("Total Year in System:\n" + pers1.toString());
   }

}
