package musicinstrument.tests;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import musicinstrument.src.MIType;
import org.junit.Test;
import musicinstrument.src.MusicInstrument;

public class MusicInstrumentTestMockito {
    @Test
    public void setType_TypeValid_True() {
        MusicInstrument mi = mock(MusicInstrument.class);
        mi.setType(MIType.STRING);
        when(mi.type()).thenReturn(MIType.STRING);
        assertEquals(mi.type(), MIType.STRING);
    }
}
