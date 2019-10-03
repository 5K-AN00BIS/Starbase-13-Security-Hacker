package com.jetbrains;

import java.util.*;

public class PasswordCracker
{
    public void RunPasswordCracker()
    {
        String passwordToCrack = "privacy";

        ArrayList<String> PasswordDatabase = new ArrayList<>();
        PasswordDatabase.add("quiet");
        PasswordDatabase.add("secret");
        PasswordDatabase.add("quarters");
        PasswordDatabase.add("spaceballs");
        PasswordDatabase.add("space");
        PasswordDatabase.add("sleepytime");
        PasswordDatabase.add("guns1234");
        PasswordDatabase.add("password");
        PasswordDatabase.add("privacy");
        PasswordDatabase.add("banana");

        for (String s : PasswordDatabase)
        {
            System.out.println("Attempting to use password " + s);

            if (s.equals(passwordToCrack))
            {
                System.out.println("Password has been cracked. Password was " + s + ".\nUnlocking the door.");
                break;
            }
            else
            {
                System.out.println("Password incorrect. Attempting another password...\n");
            }
        }
    }
}