/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author arshd
 */
public class UserPlayer extends Player {

    public UserPlayer(String name) {
        super(name);
    }

    @Override
    public void play(String gameName) {
        System.out.println("\n" +"Welcome " +getName() + " to the game of " +gameName + "\n");
    }
    
}
