package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Token;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenTypeable;

/**
 * AbstractToken
 * 
 * Represents a token for a playboard.
 * 
 * @author Torsten
 *
 */
public abstract class AbstractToken implements Token, TokenTypeable {
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.
     *      kata.tictactoe.interfaces.Token#getType()
     */
    @Override
    public abstract Type getType();

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.
     *      kata.tictactoe.interfaces.Token#getTypeString()
     */
    @Override
    public abstract String getTokenName();
    
}
