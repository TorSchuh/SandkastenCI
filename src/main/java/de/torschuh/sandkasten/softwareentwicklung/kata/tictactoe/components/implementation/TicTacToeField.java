package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Token;

/**
 * TicTacToeField
 * 
 * Implementation for the TicTacToe fields.
 * 
 * @author Torsten
 *
 */
public class TicTacToeField extends AbstractField {
    
    /**
     * Unique identifier of the location.
     */
    private Identifier identifier;
    
    /**
     * Token on the field.
     */
    private Token token;
    
    /**
     * Default constructor to create a field.
     * 
     * @param pToken token for the field 
     * @param pIdentifier identifier for the field
     */
    public TicTacToeField(final Token pToken, final Identifier pIdentifier) {
        super();
        this.token = pToken;
        this.identifier = pIdentifier;
    }
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Locatable#getIdentifier()
     */
    @Override
    public final Identifier getIdentifier() {
        return this.identifier;
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Field#getToken()
     */
    @Override
    public final Token getToken() {
        return this.token;
    }
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Field
     *      #setToken(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Token)
     */
    @Override
    public final void setToken(final Token pToken) {
        this.token = pToken;
    }

}
