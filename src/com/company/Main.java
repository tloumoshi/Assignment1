package com.company;

import jdk.nashorn.internal.ir.CatchNode;

import java.util.Scanner;
import java.util.Calendar;

public class Main {



    public static void main(String[] args) {
        // declaration

        String firstName;
        String lastName;
        String ID_Number = "";
        String strYear = "", strMonth = "", strDay = "";
        String title = "";
        String strGender = "";
        String gender = "";
        String century = "";
        String tempAge;
        int Age = 0;
        int currentYear;


        // Assign calender and scanner
        currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Scanner input = new Scanner(System.in);

      // check if First name contain alphabets only
        System.out.print("Please Enter your FirstName : ");
        firstName = input.nextLine();
        if (!firstName.matches("[a-zA-Z_]+")) {
            System.out.println("Invalid First Name");

            while (!firstName.matches("[a-zA-Z_]+")) {
                System.out.print("Please Re-Enter your FirstName : ");
                firstName = input.nextLine();
            }
        }
        // check if First name contain alphabets only
            System.out.print("Please Enter your LastName : ");
            lastName = input.nextLine();
            if (!lastName.matches("[a-zA-Z_]+")) {
                System.out.println("Invalid Last Name");

                while (!lastName.matches("[a-zA-Z_]+")) {
                    System.out.print("Please Re-Enter your LastName : ");
                    lastName = input.nextLine();
                }
            }
                System.out.print("Please Enter your ID Number : ");
                ID_Number = input.nextLine();
                if (ID_Number.length() == 13) {

                    //split date of birth from the ID Number using substring

                    strYear = ID_Number.substring(0, 2);
                    strMonth = ID_Number.substring(2, 4);
                    strDay = ID_Number.substring(4, 6);
                    strGender = ID_Number.substring(6, 7);

                    //Convert string to integers

                    int intGender = Integer.parseInt(strGender);
                    int intyear = Integer.parseInt(strYear);


                    if (intyear >= 00 && intyear <= 18) {
                        century = "20";
                        //Break;
                    } else if (intyear >= 90 && intyear <= 99) {
                        century = "19";

                    }

                    //store century and year in to temporary age
                    tempAge = century + strYear;
                    //convert tempAge into integer
                    int intage = Integer.parseInt(tempAge);

                    //calculating Age
                    Age = currentYear - intage;

                    //Display date of birth and Age
                    System.out.println("you were born on " + strDay + " / " + strMonth + " / " + century + strYear);
                    System.out.println("you are " + Age + " old years");

                    // check for gender and assign title from gender
                    if (intGender <= 4) {
                        gender = "Female ";
                        if (gender == "Female ") ;
                        {

                            title = " She ";
                        }
                        //System.out.println(strGender);

                    } else if (intGender > 4 || intGender <= 9) {
                        gender = "Male ";
                        if (gender == "Male ") {

                            title = " He ";
                        }


                    }
                    System.out.println("You are a " + gender);
                    System.out.println("This is the record of " + firstName + " , " + lastName + title + "was born on  " + strDay + " / " + strMonth + " / " + century + strYear);

                } else {
                    System.out.println("ID number must be 13 digits!!");
                }

            }//End If



}//End of Main









