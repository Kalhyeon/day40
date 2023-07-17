package day40_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/write")
public class BoardWriteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		입력 화면을 보여준다 : JSP 로 forward 한다.
		RequestDispatcher rd = request.getRequestDispatcher("/board/write.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
//		사용자가 입력한 다음 제목과 내용을 받아
//		서비스에 넘긴다.
//		그리고 /board/list 로 이동한다.
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		BoardService.create(title, content);
//		목록 작업으로 이동 (Servlet 으로)한다.
		response.sendRedirect("/day40/board/list");
	}

}
