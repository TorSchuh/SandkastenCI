package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces;

import java.util.List;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.FieldIdentifiable.Identifier;

/**
 * Playboard
 *
 * Interface to implement a playboard with fields.
 * 
 * @author Torsten
 *
 */
public interface Playboard {
    
    /**
     * Adds a specified field to the playboard.
     * 
     * @param pIdentifier identifier of the field
     * @param pField field to add to the playboard
     */
    void addField(final Identifier pIdentifier, Field pField);
    
    /**
     * Returns field with the specified identifier.
     * 
     * @param pIdentifier identifier of the field
     * @return Field field with the specified identifier
     */
    Field getField(Identifier pIdentifier);

    /**
     * Returns list with fields.
     * 
     * @return List list with fields
     */
    List<Field> getFields();
    
    /**
     * Prints out the actual playboard.
     */
    void printPlayboard();
    
}
