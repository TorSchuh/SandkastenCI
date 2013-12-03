package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractToken;

/**
 * TicTacToeToken
 * 
 * Represents an impementation of a tictactoe token.
 * 
 * @author Torsten
 *
 */
public class TicTacToeToken extends AbstractToken {

    /**
     * Type of the token.
     */
    private Type type = null;
    
    /**
     * Name of the token.
     */
    private String tokenName = null;
    
    /**
     * Token represents a placeholder.
     */
    public static final String TOKEN_BLANK = " ";
    
    /**
     * Token represents a circle.
     */
    public static final String TOKEN_CIRCLE = "O";
    
    /**
     * Token represents a cross.
     */
    public static final String TOKEN_CROSS = "X";
    
    /**
     * Default constructor to create token.
     * 
     * @param pType type of the token
     * @param pTokenName name of the token
     */
    public TicTacToeToken(final Type pType, final String pTokenName) {
        super();
        this.type = pType;
        this.tokenName = pTokenName;
    }
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.
     *      kata.tictactoe.interfaces.Token#getType()
     */
    @Override
    public final Type getType() {
        return this.type;
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.
     *      kata.tictactoe.interfaces.Token#getTypeString()
     */
    @Override
    public final String getTokenName() {
        return this.tokenName;
    }

}
