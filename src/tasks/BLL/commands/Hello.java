package tasks.BLL.commands;

import tasks.BLL.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by oleg on 30.09.15.
 */
public class Hello implements Command {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("result", "Hello");
	}
}
