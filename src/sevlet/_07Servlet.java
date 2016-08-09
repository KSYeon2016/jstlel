package sevlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.MemberVo;

@WebServlet("/07")
public class _07Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVo vo = new MemberVo();
		vo.setName("둘리");
		vo.setEmail("dooly@gmail.com");
		vo.setNo(10L);
		vo.setGender("MALE");
		
		// requestScope 저장
		request.setAttribute("memberVo", vo);
		
		// sessionScope 저장
		MemberVo vo2 = new MemberVo();
		vo2.setName("도우너");
		vo2.setEmail("donut@gmail.com");
		vo2.setNo(20L);
		vo2.setGender("MALE");
		HttpSession session = request.getSession(true);
		session.setAttribute("memberVo", vo2);
		
		// applicationScope 저장 : tomcat이 내려가기 전엔 어디서든 사용가능
		MemberVo vo3 = new MemberVo();
		vo3.setName("고길동");
		vo3.setEmail("gildong@gmail.com");
		vo3.setNo(30L);
		vo3.setGender("MALE");
		this.getServletContext().setAttribute("memberVo", vo3);
		
		request.getRequestDispatcher( "/view/07.jsp" ).forward( request, response );
	}
}
