package Training2;

import java.util.Scanner;

public class train2 extends basicJavaImp{
    public static void main(String[] args) {
        basicJavaImp obj= new basicJavaImp();
        train2 obj2 = new train2();

        System.out.println("Welcome to the Basic Java");
        Scanner value1= new Scanner(System.in);
        System.out.println("Enter the value1:a:");
       int a= value1.nextInt();
        Scanner value2 = new Scanner(System.in);
        System.out.println("Enter the value2:b:");
       int b= value2.nextInt();
        obj.kashikaa(a,b);
        obj2.adwaithaa();
    }

    public void adwaithaa(){
        int divide, num1, num2;
        System.out.println("Enter the value for num1, num2");
        Scanner num= new Scanner(System.in);
        num1= num.nextInt();
        Scanner num20 = new Scanner(System.in);
        num2=num20.nextInt();
        divide= num1 / num2;
        System.out.println(divide);
    }
}
