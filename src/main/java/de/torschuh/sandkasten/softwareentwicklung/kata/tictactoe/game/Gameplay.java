package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.game;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToePlayboard;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToeToken;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.FieldIdentifiable.Identifier;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Token;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenTypeable;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenTypeable.Type;

/**
 * Gameplay 
 * 
 * Methods for playing the game.
 * 
 * @author Torsten
 *
 */
public class Gameplay {

    /**
     * Is computer next.
     */
    private boolean isComputerNext;
    
    /**
     * Is game finished.
     */
    private boolean isFinishedGame;
    
    /**
     * The half.
     */
    private static final double FIVEPOINTZERO = 0.5;
    
    /**
     * Default constructor.
     */
    public Gameplay() {
        this.isComputerNext = isComputerFirst();
    }
    
    /**
     * Set if the computer is next.
     * 
     * @param pComputerIsNext if computer is next
     */
    public final void setComputerNext(final boolean pComputerIsNext) {
        this.isComputerNext = pComputerIsNext;
    }
    
    /**
     * Moves computer token.
     * 
     * @param pPlayboard actual playboard
     * @param pToken token of the player
     * @return true if move was successful
     */
    public final boolean moveComputer(final TicTacToePlayboard pPlayboard, final TicTacToeToken pToken) {      
        
        // test if computer can win
        for (Field field : pPlayboard.getFields()) {
            AbstractField fieldTmp = (AbstractField) field;
            Token tokenTmp = fieldTmp.getToken();
            if (isValidMove(pPlayboard, fieldTmp.getIdentifier())) {
                fieldTmp.setToken(pToken);
                if (isFinishingMove(pPlayboard, pToken)) {
                    this.isFinishedGame = true;
                    return true;
                }
            }
            fieldTmp.setToken(tokenTmp);
        }
        
        // test if human can win
        for (Field field : pPlayboard.getFields()) {
            AbstractField fieldTmp = (AbstractField) field;
            Token tokenTmp = fieldTmp.getToken();
            TicTacToeToken tokenOpponent = new TicTacToeToken(Type.CIRCLE, TicTacToeToken.TOKEN_CIRCLE);
            if (pToken.getType().equals(TokenTypeable.Type.CIRCLE)) {
                tokenOpponent = new TicTacToeToken(Type.CROSS, TicTacToeToken.TOKEN_CROSS);
            }
            if (isValidMove(pPlayboard, fieldTmp.getIdentifier())) {
                fieldTmp.setToken(tokenOpponent);
                if (isFinishingMove(pPlayboard, tokenOpponent)) {
                    fieldTmp.setToken(pToken);
                    return true;
                }
            }
            fieldTmp.setToken(tokenTmp);
        }
        
        // test if center field is empty
        if (((TicTacToeToken) pPlayboard.getField(Identifier.B2).getToken()).getType().equals(TokenTypeable.Type.BLANK)) {
            pPlayboard.getField(Identifier.B2).setToken(pToken);
            return true;
        }
        
        // choose any/next free field
        for (Field field : pPlayboard.getFields()) {
            AbstractField fieldTmp = (AbstractField) field;
            Token tokenTmp = fieldTmp.getToken();
            if (isValidMove(pPlayboard, fieldTmp.getIdentifier())) {
                fieldTmp.setToken(pToken);
                pPlayboard.getField(fieldTmp.getIdentifier()).setToken(pToken);
                return true;
            }
            fieldTmp.setToken(tokenTmp);
        }
        
        // no empty field
        return false;
    }
    
    
    
    /**
     * Moves human token.
     * 
     * @param pPlayboard actual playboard
     * @param pToken token of the player
     * @param pIdentifier identifier for the move
     * @return true if move was successful
     */
    public final boolean moveHuman(final TicTacToePlayboard pPlayboard, final TicTacToeToken pToken, final Identifier pIdentifier) {
        if (isValidMove(pPlayboard, pIdentifier)) {
            pPlayboard.getField(pIdentifier).setToken(pToken);
            if (isFinishingMove(pPlayboard, pToken)) {
                this.isFinishedGame = true;
            }
            return true;
        }
        return false;
    }
    
    /**
     * Is the move valid.
     * 
     * @param pPlayboard actual playboard
     * @param pIdentifier identifier for the move
     * @return true if it is a valid move
     */
    public final boolean isValidMove(final TicTacToePlayboard pPlayboard, final Identifier pIdentifier) {
        return ((TicTacToeToken) pPlayboard.getField(pIdentifier).getToken()).getType().equals(Type.BLANK);
    }
    
    /**
     * Has the playboard blank fields.
     * 
     * @param pPlayboard actual playboard
     * @return if it is has blank fields
     */
    public final boolean hasBlankFields(final TicTacToePlayboard pPlayboard) {
        boolean hasBlankFields = false;
        for (final Field field : pPlayboard.getFields()) {
            if (field.getToken().getTokenName().equals(TicTacToeToken.TOKEN_BLANK)) {
                hasBlankFields = true;
            }
        }
        return hasBlankFields;
    }
    
    /**
     * Is this move the last one.
     * 
     * @param pPlayboard actual playboard
     * @param pToken token for the player
     * @return if it is the last move
     */
    private boolean isFinishingMove(final TicTacToePlayboard pPlayboard, final TicTacToeToken pToken) {
        return Rules.isSameTokenA1A2A3(pPlayboard, pToken.getType()) || Rules.isSameTokenA1B1C1(pPlayboard, pToken.getType())
                || Rules.isSameTokenA1B2C3(pPlayboard, pToken.getType()) || Rules.isSameTokenA2B2C2(pPlayboard, pToken.getType())
                || Rules.isSameTokenA3B3C3(pPlayboard, pToken.getType()) || Rules.isSameTokenB1B2B3(pPlayboard, pToken.getType())
                || Rules.isSameTokenC1B2A3(pPlayboard, pToken.getType()) || Rules.isSameTokenC1C2C3(pPlayboard, pToken.getType());
    }

    /**
     * Is computer firs.
     * 
     * @return true if computer first
     */
    private boolean isComputerFirst() {
        return Math.random() < FIVEPOINTZERO;
    }
    
    /**
     * Is computer is next.
     * 
     * @return true if computer is next
     */
    public final boolean isComputerNext() {
        return this.isComputerNext;
    }
 
    /**
     * Is the game finished.
     * 
     * @return true if finished
     */
    public final boolean isFinishedGame() {
        return this.isFinishedGame;
    }
    
}
