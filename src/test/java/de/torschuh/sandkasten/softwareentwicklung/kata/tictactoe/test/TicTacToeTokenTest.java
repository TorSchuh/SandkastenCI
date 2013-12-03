package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToeToken;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenTypeable.Type;

/**
 * @author Torsten
 */
public class TicTacToeTokenTest {
    
    /**
     * Test method for {@link de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToeToken#getType()}.
     */
    @Test
    public final void testGetType() {
        
        TicTacToeToken ticTacToeToken;
        
        // null
        ticTacToeToken = new TicTacToeToken(null, null);
        assertEquals("Es darf kein Type gesetzt sein", null, ticTacToeToken.getType());
        
        //blank
        ticTacToeToken = new TicTacToeToken(Type.BLANK, null);
        assertEquals("Es muss Type.Blank gesetzt sein", Type.BLANK, ticTacToeToken.getType());
        
        // circle
        ticTacToeToken = new TicTacToeToken(Type.CROSS, null);
        assertEquals("Es muss Type.CROSS gesetzt sein", Type.CROSS, ticTacToeToken.getType());
        
        // cross
        ticTacToeToken = new TicTacToeToken(Type.CIRCLE, null);
        assertEquals("Es muss Type.CIRCLE gesetzt sein", Type.CIRCLE, ticTacToeToken.getType());
    }

    /**
     * Test method for {@link de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToeToken#getTokenName()}.
     */
    @Test
    public final void testGetTokenName() {

        TicTacToeToken ticTacToeToken;
        
        // null
        ticTacToeToken = new TicTacToeToken(null, null);
        assertEquals("Es darf kein Type gesetzt sein", null, ticTacToeToken.getTokenName());
        
        //blank
        ticTacToeToken = new TicTacToeToken(null, TicTacToeToken.TOKEN_BLANK);
        assertEquals("Es muss TicTacToeToken.TOKEN_BLANK gesetzt sein", TicTacToeToken.TOKEN_BLANK, ticTacToeToken.getTokenName());
        
        // circle
        ticTacToeToken = new TicTacToeToken(null, TicTacToeToken.TOKEN_CIRCLE);
        assertEquals("Es muss TicTacToeToken.TOKEN_CIRCLE gesetzt sein", TicTacToeToken.TOKEN_CIRCLE, ticTacToeToken.getTokenName());
        
        // cross
        ticTacToeToken = new TicTacToeToken(null, TicTacToeToken.TOKEN_CROSS);
        assertEquals("Es muss TicTacToeToken.TOKEN_CROSS gesetzt sein", TicTacToeToken.TOKEN_CROSS, ticTacToeToken.getTokenName());
        
    }

    /**
     * Test method for {@link de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToeToken
     *                  #TicTacToeToken(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenTypeable.Type, java.lang.String)}.
     */
    @Test
    public final void testTicTacToeToken() {
        
        TicTacToeToken ticTacToeToken;
        
        ticTacToeToken = new TicTacToeToken(null, null);
        assertEquals("Es darf kein Type gesetzt sein", null, ticTacToeToken.getType());
        
        ticTacToeToken = new TicTacToeToken(null, null);
        assertEquals("Es darf kein Type gesetzt sein", null, ticTacToeToken.getTokenName());
        
    }

}
