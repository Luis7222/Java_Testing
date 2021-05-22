package project1;

import java.util.Scanner;

public class project {
    private String userName;
    private String passWord;

    //Constructor to receive username
    public project(String userName, String passWord){

        //"this" is referring to the private variable

        this.userName = userName;
        this.passWord = passWord;


        System.out.println("logged in as "+ this.userName);

        this.passWord = correctPass();
        System.out.println(this.passWord);

    }



    //ask for password
    private String correctPass(){
        System.out.print("Enter your password: ");
        Scanner in = new Scanner(System.in);
        String attempt = in.nextLine();
        if(attempt == this.passWord) return "logged in";

       else {
            return "incorrect password";
        }




    }

}
