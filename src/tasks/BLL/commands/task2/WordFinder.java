package tasks.BLL.commands.task2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Oleg Dashkevych on 9/20/2015.
 */
@WebServlet(
        urlPatterns = {"/find_word"},
        name = "Find word",
        displayName = "Find word in a file"
)
public class WordFinder extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String word = req.getParameter("word");
        if (word == null) resp.sendError(1, "Your request wasn`t processed");

        String filePath = getClass().getResource("/src/tasks.BLL.commands.task2/file.txt").toString();
        File file = new File(filePath);
        if (!file.exists()) resp.sendError(2, "Could't find file");
        Integer count = Integer.valueOf(0);
        Scanner sc = new Scanner(file);
        Pattern p = Pattern.compile(word);
        Matcher m;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            m = p.matcher(line);
            m.matches();
            while (m.find()) {
                count++;
            }
        }
        sc.close();
        req.setAttribute("count", count);
    }
}
