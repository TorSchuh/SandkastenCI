package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction;

import java.util.List;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.FieldIdentifiable.Identifier;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard;

/**
 * AbstractToken
 * 
 * Represents a playboard for a tictactoe game.
 * 
 * @author Torsten
 *
 */
public abstract class AbstractPlayboard implements Playboard {

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard
     *      #addField(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field)
     */
    @Override
    public abstract void addField(final Identifier pIdentifier, final Field pField);

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard
     *      #getField(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field)
     */
    @Override
    public abstract Field getField(final Identifier pIdentifier);
        
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard#getFields()
     */
    @Override
    public abstract List<Field> getFields();
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard#printPlayboard()
     */
    @Override
    public abstract void printPlayboard();
    
}
