import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class GetMyRes {
    public String getMyHello(Locale locale) throws UnsupportedEncodingException {
        byte[] b;
        String s;
        ResourceBundle res = ResourceBundle.getBundle("text", locale);

        String [] code = {"ISO-8859-1", "ISO-8859-5", "windows-1251", "UTF-8", "US-ASCII"};

        for (String cin : code){
            for (String cto: code){
                System.out.println("" + cin + " to " + cto + " : " + new String(res.getString("hello").getBytes(cin),cto));
            }
        }

        s = new String(res.getString("hello").getBytes("ISO-8859-1"), "ISO-8859-5");
        return s;
    }
}
