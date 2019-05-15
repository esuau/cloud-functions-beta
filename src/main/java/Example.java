import javax.servlet.http.*;
import java.io.*;

public class Example {

    public void helloWorld(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.write("{\"message\": \"Hello world!\"}");
    }

}
