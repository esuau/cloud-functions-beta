import javax.servlet.http.*;
import java.io.*;

public class Example {

    public void helloWorld(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Content-Type", "application/json");
        PrintWriter writer = response.getWriter();
        writer.write("{\"message\": \"Hello world!\"}");
    }

}
