<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>연산</h3>
	${iVal + 10*2 }<br>
	${bVal && iVal < 1000 }<br>
	${fVal == 3.14 }<br>
	${empty sVal }<br>
	${not empty sVal }<br>
	${empty myVal }<br>
	${not empty myVal }<br>
</body>
</html>