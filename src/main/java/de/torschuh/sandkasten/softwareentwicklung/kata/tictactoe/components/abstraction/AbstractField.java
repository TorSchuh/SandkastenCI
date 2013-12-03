package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.FieldIdentifiable;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Token;

/**
 * Represents a field on a TicTacToe playboard.
 * 
 * @author Torsten
 *
 */
public abstract class AbstractField implements Field, FieldIdentifiable {
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Locatable#getIdentifier()
     */
    public abstract Identifier getIdentifier();

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Field#getToken()
     */
    public abstract Token getToken();
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Field
     *      #setToken(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Token)
     */
    public abstract void setToken(final Token pToken);

}
