package tasks.BLL.commands;

import tasks.BLL.Command;
import tasks.BLL.commands.task1.TableGenerator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by oleg on 30.09.15.
 */
@WebServlet(
		urlPatterns = {"/execute"}
)
public class Dispatcher extends HttpServlet {
	private HashMap<String, Command> commands;
	{
		commands.put("gen_table", new TableGenerator());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String command = req.getAttribute("command").toString();
		if(command == null || command.equals(""))   resp.sendError(404, "Invalid command");
		Command executor = commands.get(command);
		if(executor == null)   resp.sendError(404, "Invalid command");
		executor.execute(req,resp);
	}
}
