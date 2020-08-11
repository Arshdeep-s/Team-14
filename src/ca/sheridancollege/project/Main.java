/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.project;
/**
 *
 * @author Arshdeep
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        War game = new War("WAR");
        UserPlayer playerName = new UserPlayer(name);
        playerName.play(game.getName());
        
        game.play();
        game.declareWinner();
    }

}
