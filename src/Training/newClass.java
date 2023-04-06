package Training;

import Training.myLearn;

import java.util.Scanner;

public class newClass {
    public static void main(String[] args) {
        //calling the object
         myLearn objectcall = new myLearn();
         objectcall.mymethod(5);

        //getting inputs from user
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter user name:");
        String username = obj.nextLine();
        Scanner ver = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = ver.nextLine();
        //print the output what user entered
        System.out.println(username+password);
        String comb = username+password;
        //performing do operations
        do {
            System.out.println("proceed");
        }while(comb=="vijayalaksmi");

        //passing the method parameters
        objectcall.mymethod(12);
        objectcall.mymethod(25);
    }

}
