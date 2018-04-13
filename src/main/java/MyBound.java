import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class MyBound {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("Привет проект!");

        System.out.println(new GetMyRes().getMyHello(new Locale("en")));
        System.out.println(new GetMyRes().getMyHello(new Locale("xx")));
        System.out.println(new GetMyRes().getMyHello(new Locale("ru")));

    }
}
