package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.game;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToePlayboard;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToeToken;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.FieldIdentifiable.Identifier;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenTypeable.Type;

/**
 * Rules
 * 
 * Rules for the TicTacToe game.
 * 
 * @author Torsten
 *
 */
public final class Rules {

    /**
     *Private default constructor.
     */
    private Rules() {
    }
    
    /**
     * Checks Rule A1A2A3.
     * 
     * @param pPlayboard current playboard
     * @param pTokenType player token
     * @return true if all three fields have the same tokentype
     */
    public static boolean isSameTokenA1A2A3(final TicTacToePlayboard pPlayboard, final Type pTokenType) {
        return ((TicTacToeToken) pPlayboard.getField(Identifier.A1).getToken()).getType().equals(pTokenType) 
                && ((TicTacToeToken) pPlayboard.getField(Identifier.A2).getToken()).getType().equals(pTokenType)
                && ((TicTacToeToken) pPlayboard.getField(Identifier.A3).getToken()).getType().equals(pTokenType);
    }
        
    /**
     * Checks Rule A1B1C1.
     * 
     * @param pPlayboard current playboard
     * @param pTokenType player token
     * @return true if all three fields have the same tokentype
     */
    public static boolean isSameTokenA1B1C1(final TicTacToePlayboard pPlayboard, final Type pTokenType) {
        return ((TicTacToeToken) pPlayboard.getField(Identifier.A1).getToken()).getType().equals(pTokenType) 
                && ((TicTacToeToken) pPlayboard.getField(Identifier.B1).getToken()).getType().equals(pTokenType)
                && ((TicTacToeToken) pPlayboard.getField(Identifier.C1).getToken()).getType().equals(pTokenType);
    }
    
    /**
     * Checks Rule A1B2C3.
     * 
     * @param pPlayboard current playboard
     * @param pTokenType player token
     * @return true if all three fields have the same tokentype
     */
    public static boolean isSameTokenA1B2C3(final TicTacToePlayboard pPlayboard, final Type pTokenType) {
        return ((TicTacToeToken) pPlayboard.getField(Identifier.A1).getToken()).getType().equals(pTokenType) 
                && ((TicTacToeToken) pPlayboard.getField(Identifier.B2).getToken()).getType().equals(pTokenType)
                && ((TicTacToeToken) pPlayboard.getField(Identifier.C3).getToken()).getType().equals(pTokenType);
    }
    
    /**
     * Checks Rule A2B2C2.
     * 
     * @param pPlayboard current playboard
     * @param pTokenType player token
     * @return true if all three fields have the same tokentype
     */
    public static boolean isSameTokenA2B2C2(final TicTacToePlayboard pPlayboard, final Type pTokenType) {
        return ((TicTacToeToken) pPlayboard.getField(Identifier.A2).getToken()).getType().equals(pTokenType) 
                && ((TicTacToeToken) pPlayboard.getField(Identifier.B2).getToken()).getType().equals(pTokenType)
                && ((TicTacToeToken) pPlayboard.getField(Identifier.C2).getToken()).getType().equals(pTokenType);
    }
    
    /**
     * Checks Rule A3B3C3.
     * 
     * @param pPlayboard current playboard
     * @param pTokenType player token
     * @return true if all three fields have the same tokentype
     */
    public static boolean isSameTokenA3B3C3(final TicTacToePlayboard pPlayboard, final Type pTokenType) {
        return ((TicTacToeToken) pPlayboard.getField(Identifier.A3).getToken()).getType().equals(pTokenType) 
                && ((TicTacToeToken) pPlayboard.getField(Identifier.B3).getToken()).getType().equals(pTokenType)
                && ((TicTacToeToken) pPlayboard.getField(Identifier.C3).getToken()).getType().equals(pTokenType);
    }
    
    /**
     * Checks Rule B1B2B3.
     * 
     * @param pPlayboard current playboard
     * @param pTokenType player token
     * @return true if all three fields have the same tokentype
     */
    public static boolean isSameTokenB1B2B3(final TicTacToePlayboard pPlayboard, final Type pTokenType) {
        return ((TicTacToeToken) pPlayboard.getField(Identifier.B1).getToken()).getType().equals(pTokenType) 
                && ((TicTacToeToken) pPlayboard.getField(Identifier.B2).getToken()).getType().equals(pTokenType)
                && ((TicTacToeToken) pPlayboard.getField(Identifier.B3).getToken()).getType().equals(pTokenType);
    }
    
    /**
     * Checks Rule C1C2C3.
     * 
     * @param pPlayboard current playboard
     * @param pTokenType player token
     * @return true if all three fields have the same tokentype
     */
    public static boolean isSameTokenC1C2C3(final TicTacToePlayboard pPlayboard, final Type pTokenType) {
        return ((TicTacToeToken) pPlayboard.getField(Identifier.C1).getToken()).getType().equals(pTokenType) 
                && ((TicTacToeToken) pPlayboard.getField(Identifier.C2).getToken()).getType().equals(pTokenType)
                && ((TicTacToeToken) pPlayboard.getField(Identifier.C3).getToken()).getType().equals(pTokenType);
    }

    /**
     * Checks Rule C1B2A3.
     * 
     * @param pPlayboard current playboard
     * @param pTokenType player token
     * @return true if all three fields have the same tokentype
     */
    public static boolean isSameTokenC1B2A3(final TicTacToePlayboard pPlayboard, final Type pTokenType) {
        return ((TicTacToeToken) pPlayboard.getField(Identifier.C1).getToken()).getType().equals(pTokenType) 
                && ((TicTacToeToken) pPlayboard.getField(Identifier.B2).getToken()).getType().equals(pTokenType)
                && ((TicTacToeToken) pPlayboard.getField(Identifier.A3).getToken()).getType().equals(pTokenType);
    }
    
}
