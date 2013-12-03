package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToePlayboard;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.game.Gameplay;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.game.Interaction;

/**
 * TicTacToe game.
 * 
 * @author Torsten
 *
 */
public final class TicTacToe {
    
    /**
     * Gameplay of the TicTacToe game.
     */
    private static Gameplay gameplay;
    
    /**
     * Playboard of the TicTacToe game.
     */
    private static TicTacToePlayboard playboard;
    
    /**
     * Token symbol of the the human player. 
     */
    private static String humanTokenSymbol;
    
    /**
     * If end of game is reached.  
     */
    private static boolean endOfGame; 
    
    /**
     * Private default constructor.
     */
    private TicTacToe() {
    }
    
    /**
     * Starts TicTacToe game.
     * 
     * @param args Parameter for main method
     */
    public static void main(final String[] args) {
        initNewGame();
        introduceGame(true);    
        do {
            Interaction.printPlayboard(playboard);
            if (gameplay.isComputerNext()) {
                moveComputer();
            } else {
                moveHuman();                
            }
            if (!gameplay.hasBlankFields(playboard) || gameplay.isFinishedGame()) {
                lastMove();
                if (Interaction.askForRematch()) {
                   initNewGame();
                   introduceGame(false);
                } else {
                    endOfGame = true;
                }
            }
        } while (!endOfGame);
    }    
    
    /**
     * Initialise a new game.
     */
    private static void initNewGame() {
        gameplay = new Gameplay(); 
        playboard = new TicTacToePlayboard();
        endOfGame = false;
    }
    
    /**
     * Introduced the game.
     * 
     * @param pWithHeadline headline should be printed out
     */
    private static void introduceGame(final boolean pWithHeadline) {
        if (pWithHeadline) {
            Interaction.printHeadline();
        }
        humanTokenSymbol = Interaction.askForHumanTokenType();
    }
    
    /**
     * Computer move.
     */
    private static void moveComputer() {
        if (gameplay.moveComputer(playboard,  Interaction.getComputerToken(humanTokenSymbol))) {
            gameplay.setComputerNext(false);
        }
    }
    
    /**
     * Human move.
     */
    private static void moveHuman() {
        if (gameplay.moveHuman(playboard,  Interaction.getHumanToken(humanTokenSymbol),  Interaction.askForHumanNextMove(gameplay, playboard))) {
            gameplay.setComputerNext(true);
        }
    }
    
    /**
     * No more moves possible.
     */
    private static void lastMove() {
        if (gameplay.hasBlankFields(playboard)) {
            if (gameplay.isFinishedGame()) {
                Interaction.printPlayboard(playboard);
                if (gameplay.isComputerNext()) {
                    Interaction.printMessageWin();
                } else {
                    Interaction.printMessageLose();
                }
            }
        } else { 
            Interaction.printPlayboard(playboard);
            Interaction.printMessageDrawn();
        }
    }
    
}
