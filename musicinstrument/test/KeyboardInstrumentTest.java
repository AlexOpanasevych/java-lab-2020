package musicinstrument.tests;

import org.mockito.Mockito;

import musicinstrument.src.KeyboardInstrument;
import musicinstrument.src.Tune;
import musicinstrument.src.exceptions.IncompatibleMIPartTypeException;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * musicinstrument.tests.KeyboardInstrumentTest
 */
public class KeyboardInstrumentTest {

    @Test(expected = IncompatibleMIPartTypeException.class)
    public void addPart_IncompatiblePart_ExceptionThrown() throws IncompatibleMIPartTypeException {
        KeyboardInstrument ins = Mockito.mock(KeyboardInstrument.class);
        when(ins.addPart(any(Tune.class))).thenThrow(IncompatibleMIPartTypeException.class);
        ins.addPart(new Tune(1.2));
    }
}