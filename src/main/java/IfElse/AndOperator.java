package IfElse;

public class AndOperator {
    public static void main(String[] args) {

        String actualUsername = "sunshine123";
        String actualPassword = "moonlight456";
        String actualEmail ="sunshine123@gmail.com";

        String enteredUsername = "sunshine123";
        String enteredPassword = "moonlight456!true";
        String enteredEmail = "sunshine123@gmail.com";
         if (enteredUsername.equals(actualUsername) && enteredPassword.equals(actualPassword)){
             System.out.println(("Logged in"));
             if (!enteredEmail.equals(actualEmail)){
                 System.out.println("Recover email");

             }

         }
         if (!enteredUsername.equals(actualUsername) && !actualPassword.equals(enteredPassword)){
             System.out.println("don't check password");
         }

    }
}
