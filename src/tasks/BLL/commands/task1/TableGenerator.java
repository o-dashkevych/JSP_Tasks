package tasks.BLL.commands.task1;

import tasks.BLL.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TableGenerator implements Command{

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp){
        // TEST COMMENT
        int rows, columns;
        String color;
        try {
            rows = Integer.parseInt(req.getParameter("rows"));
            columns = Integer.parseInt(req.getParameter("columns"));
            color = req.getParameter("color");
            if(rows < 1) rows = 0;
            if(columns < 1) columns = 0;
            req.setAttribute("rows", new Integer(rows));
            req.setAttribute("columns", new Integer(columns));
            req.setAttribute("color", color);
            req.getRequestDispatcher("/result.jsp").forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
