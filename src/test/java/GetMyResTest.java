import org.junit.Test;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

import static org.junit.Assert.*;

public class GetMyResTest {

    @Test
    public void getMyHello() throws UnsupportedEncodingException {
        assertEquals("������ ������!", new GetMyRes().getMyHello(new Locale("ru")));
    }
}