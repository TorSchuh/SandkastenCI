package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToePlayboard;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToeToken;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.FieldIdentifiable.Identifier;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenTypeable.Type;

/**
 * Interaction 
 * 
 * Methods to interact with the user.
 * 
 * @author Torsten
 *
 */
public final class Interaction {

    /**
     * Input reader.
     */
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
    /**
     * Private default constructor.
     */
    private Interaction() {
     
    }
 
    /**
     * Returns the tokentype of the user.
     * 
     * @param pHumanSymbol by user chosen symbol
     * @return TicTacToeToken token for user
     */
    public static TicTacToeToken getHumanToken(final String pHumanSymbol) {
        if (pHumanSymbol.equals(TicTacToeToken.TOKEN_CIRCLE)) {
            return new TicTacToeToken(Type.CIRCLE, TicTacToeToken.TOKEN_CIRCLE);
        }
        return new TicTacToeToken(Type.CROSS, TicTacToeToken.TOKEN_CROSS); 
    }
    
    /**
     * Returns the tokentype of the computer.
     * 
     * @param pHumanSymbol by user chosen symbol
     * @return TicTacToeToken token for computer
     */
    public static TicTacToeToken getComputerToken(final String pHumanSymbol) {
        if (pHumanSymbol.equals(TicTacToeToken.TOKEN_CIRCLE)) {
            return new TicTacToeToken(Type.CROSS, TicTacToeToken.TOKEN_CROSS);
        } 
        return new TicTacToeToken(Type.CIRCLE, TicTacToeToken.TOKEN_CIRCLE);
    }
    
    /**
     * Asks user for his next move. 
     * 
     * @param pGameplay actual gamplay
     * @param pPlayboard actual playboard
     * @return Identifier identifier for next move by user
     */
    public static Identifier askForHumanNextMove(final Gameplay pGameplay, final TicTacToePlayboard pPlayboard) {
        String identifier;
        do {
            identifier = getUserInput("your turn");
            if (pGameplay.isValidMove(pPlayboard, Identifier.valueOf(identifier))) {
                return Identifier.valueOf(identifier);
            }
        } while (true);        
    }
    
    /**
     * Reads user input.
     * 
     * @param pOutput advice for input
     * @return String input from user
     */
    private static String getUserInput(final String pOutput) {
        String returnString = "";
        System.out.print("#\n#--> " + pOutput + ": ");
        try {
            returnString = input.readLine();
            if (returnString != null) {
                returnString = returnString.trim();
                returnString = returnString.toUpperCase(Locale.GERMAN);    
            }
        } catch (IOException e) {
            System.out.println("Error reading user input!");
        }
        return returnString;
    }
    
    /**
     * Asks user for his tokentype.
     * 
     * @return String tokentype for user
     */
    public static String askForHumanTokenType() {
        String symbol = "";
        do {
            symbol = getUserInput("please choose your symbol ( " + TicTacToeToken.TOKEN_CIRCLE + " or " + TicTacToeToken.TOKEN_CROSS + " )");
            if (symbol.equals(TicTacToeToken.TOKEN_CIRCLE) || symbol.equals(TicTacToeToken.TOKEN_CROSS)) {
                System.out.print("#\n#\n#    Human: " + getHumanToken(symbol).getTokenName() 
                                + "  vs. Computer: " + getComputerToken(symbol).getTokenName() + "\n");
                return symbol;
            }
        } while (true);
    }
    
    /**
     * Asks the user for a rematch. 
     * 
     * @return boolean true, if user wants a rematch 
     */
    public static boolean askForRematch() {
        String decicion = "";
            do {
                decicion = getUserInput("do you want a rematch [y] or [n]?");    
                if (decicion.equals("Y") || decicion.equals("N")) {
                    return decicion.equals("Y");
                }
            } while (true);
    }
    
    /**
     * Prints out the actual playboard.
     * 
     * @param pPlayboard actual playboard
     */
    public static void printPlayboard(final TicTacToePlayboard pPlayboard) {
        pPlayboard.printPlayboard();
    }
    
    /**
     * Prints out the game headline.
     */
    public static void printHeadline() {
        System.out.print("################################################\n");
        System.out.print("#   _____ _     _____         _____            #\n");
        System.out.print("#  |_   _(_) __|_   _|_ _  __|_   _|__   ___   #\n");
        System.out.print("#    | | | |/ __|| |/ _` |/ __|| |/ _ \\ / _ \\  #\n");
        System.out.print("#    | | | | (__ | | (_| | (__ | | (_) |  __/  #\n");
        System.out.print("#    |_| |_|\\___||_|\\__,_|\\___||_|\\___/ \\___|  #\n");
        System.out.print("#                                              #\n");
        System.out.print("###############################################");
    }
    
    /**
     * Prints out drawn message.
     */
    public static void printMessageDrawn() {
        System.out.println("#\n#--> DRAWN :|");
    }
    
    /**
     * Prints out win message.
     */
    public static void printMessageWin() {
        System.out.println("#\n#--> YOU WIN :)");
    }
    
    /**
     * Prints out lose message.
     */
    public static void printMessageLose() {
        System.out.println("#\n#--> YOU LOSE :(");
    }
    
}
