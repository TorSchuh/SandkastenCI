package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractPlayboard;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.FieldIdentifiable.Identifier;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenTypeable.Type;

/**
 * TicTacToePlayboard
 * 
 * Implementation for TicTacToe playboard.
 * 
 * @author Torsten
 *
 */
public class TicTacToePlayboard extends AbstractPlayboard {
   
    /**
     * Map with all neighbouring fields and there direction.
     */
    private final Map<Identifier, Field> fields = new ConcurrentHashMap<Identifier, Field>();

    /**
     * Default constructor to create fields with blank tokens.
     */
    public TicTacToePlayboard() {        
        super();
        this.addField(Identifier.A1, new TicTacToeField(new TicTacToeToken(Type.BLANK, TicTacToeToken.TOKEN_BLANK), Identifier.A1));
        this.addField(Identifier.A2, new TicTacToeField(new TicTacToeToken(Type.BLANK, TicTacToeToken.TOKEN_BLANK), Identifier.A2));
        this.addField(Identifier.A3, new TicTacToeField(new TicTacToeToken(Type.BLANK, TicTacToeToken.TOKEN_BLANK), Identifier.A3));
        this.addField(Identifier.B1, new TicTacToeField(new TicTacToeToken(Type.BLANK, TicTacToeToken.TOKEN_BLANK), Identifier.B1));
        this.addField(Identifier.B2, new TicTacToeField(new TicTacToeToken(Type.BLANK, TicTacToeToken.TOKEN_BLANK), Identifier.B2));
        this.addField(Identifier.B3, new TicTacToeField(new TicTacToeToken(Type.BLANK, TicTacToeToken.TOKEN_BLANK), Identifier.B3));
        this.addField(Identifier.C1, new TicTacToeField(new TicTacToeToken(Type.BLANK, TicTacToeToken.TOKEN_BLANK), Identifier.C1));
        this.addField(Identifier.C2, new TicTacToeField(new TicTacToeToken(Type.BLANK, TicTacToeToken.TOKEN_BLANK), Identifier.C2));
        this.addField(Identifier.C3, new TicTacToeField(new TicTacToeToken(Type.BLANK, TicTacToeToken.TOKEN_BLANK), Identifier.C3));       
    }
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard
     *      #addField(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field)
     */
    @Override
    public final void addField(final Identifier pIdentifier, final Field pField) {
        this.fields.put(pIdentifier, pField);
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard
     *      #getField(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field)
     */
    @Override
    public final Field getField(final Identifier pIdentifier) {
        return this.fields.get(pIdentifier);
    }
        
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard#getFields()
     */
    @Override
    public final List<Field> getFields() {
        return new ArrayList<Field>(fields.values());
    }
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard#printPlayboard()
     */
    @Override
    public final void printPlayboard() {
        System.out.println("#\n#");
        System.out.println("#         A       B       C");
        System.out.println("#    ");
        System.out.println("#    1    " + this.getField(Identifier.A1).getToken().getTokenName() + "   " 
                            + "|   " + this.getField(Identifier.B1).getToken().getTokenName() + "   |   " 
                            + this.getField(Identifier.C1).getToken().getTokenName() + "  ");
        System.out.println("#       ----- + ----- + -----");
        System.out.println("#    2    " + this.getField(Identifier.A2).getToken().getTokenName() + "   " 
                            + "|   " + this.getField(Identifier.B2).getToken().getTokenName() + "   |   " 
                            + this.getField(Identifier.C2).getToken().getTokenName() + "  ");
        System.out.println("#       ----- + ----- + -----");
        System.out.println("#    3    " + this.getField(Identifier.A3).getToken().getTokenName() + "   " 
                            + "|   " + this.getField(Identifier.B3).getToken().getTokenName() + "   |   " 
                            + this.getField(Identifier.C3).getToken().getTokenName() + "  ");
        System.out.println("#\n#");
    }
    
}
