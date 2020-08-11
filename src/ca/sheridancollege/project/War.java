/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Arshdeep
 */
public class War extends Game{

    private int UPoints = 0;
    private int CPoints = 0;
    
    
    public War(String name) {
        super(name);
    }

    @Override
    public void play() {
        int p = 1;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while(p<5)
        {
            i++;
            System.out.println("Round " +i +":");
            GroupOfCards group = new GroupOfCards();
            int UValue = (int) ((Math.random() * 13) + 1);
            int CValue = (int) ((Math.random() * 13) + 1);
            String Usuit = group.getRandomSuit();
            String Csuit = group.getRandomSuit();
            System.out.println("Your Card: " +UValue +" of " +Usuit);
            System.out.println("Computer's Card: " +CValue +" of " +Csuit);

            if(UValue == CValue)
            {
                System.out.println("WAR! You both had same cards");
                UValue = (int) ((Math.random() * 13) + 1);
                CValue = (int) ((Math.random() * 13) + 1);
                Usuit = group.getRandomSuit();
                Csuit = group.getRandomSuit();
                System.out.println("Your Card: " +UValue +" of " +Usuit);
                System.out.println("Computer's Card: " +CValue +" of " +Csuit);
                if(UValue > CValue)
                {
                    UPoints += 2;
                    System.out.println("You won the round and got 2 points");
                }
                else
                {
                    CPoints += 2;
                    System.out.println("You lost the round and got no point");
                }
            }
            else
            {
                if(UValue > CValue)
                {
                    UPoints += 1;
                    System.out.println("You won the round and got 1 point");

                }
                else
                {
                    CPoints += 1;
                    System.out.println("You lost the round and got no point");
                }
            }
            System.out.println("Do you want to play next round?(yes or no)");
            String yesNo = sc.nextLine();
            if(yesNo.equalsIgnoreCase("yes"))
            {
                
            }
            else
            {
                p = 10;
            }
            System.out.println("");
        }
    }

    @Override
    public void declareWinner() {
        if(UPoints > CPoints)
        {
            System.out.println("You won the game from computer");
        }
        else if(CPoints > UPoints)
        {
            System.out.println("You lost the game from computer");
        }
        else
        {
            System.out.println("Game tied with computer");
        }
    }
    
}
