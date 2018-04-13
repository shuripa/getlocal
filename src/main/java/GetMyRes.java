import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class GetMyRes {
    public String getMyHello(Locale locale) throws UnsupportedEncodingException {
//        byte[] b;
        String s;
//        b = res.getString("hello").getBytes("ISO-8859-1");
//        s = new String(b,("windows-1251"));
//        System.out.println("Получение ресурса");
        ResourceBundle res = ResourceBundle.getBundle("text", locale);
        s = res.getString("hello");
        return s;
    }
}
