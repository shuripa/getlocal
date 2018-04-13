import org.junit.Test;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

import static org.junit.Assert.*;

public class GetMyResTest {

    @Test
    public void getMyHello() throws UnsupportedEncodingException {
//        byte[] b;
//        String s1, s2;
//        s1 = res.getString("hello").getBytes("ISO-8859-1");
//        s = new String(b,("windows-1251"));

        assertEquals("Привет ресурс!", new GetMyRes().getMyHello(new Locale("ru")));
    }
}