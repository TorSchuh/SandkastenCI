package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces;

/**
 * Identifiable
 * 
 * Interface to add the ability to identify a field.
 * 
 * @author Torsten
 *
 */
public interface FieldIdentifiable {
    
    /**
     * Identifier enumeration of the available identities. 
     */
    static enum Identifier { A1, A2, A3, B1, B2, B3, C1, C2, C3 };
    
    /**
     * Returns the identifier of the field.
     * 
     * @return Identifier identification of the field
     */
    Identifier getIdentifier();
    
}
