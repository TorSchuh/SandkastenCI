package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces;

/**
 * Field
 * 
 * Interface for a playboardfield.
 * 
 * @author Torsten
 *
 */
public interface Field {

    /**
     * Returns the placed token.
     * 
     * @return Token placed token of the field
     */
    Token getToken();
    
    /**
     * Places the token of the field.
     * 
     * @param pToken token to place 
     */
    void setToken(Token pToken);
    
}
