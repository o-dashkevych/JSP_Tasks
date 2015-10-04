package tasks.BLL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by oleg on 30.09.15.
 */
public interface Command {
	void execute(HttpServletRequest request, HttpServletResponse response);
}
