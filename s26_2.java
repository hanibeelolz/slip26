slip14.html
<html>
<body>
<form method=post action="slip14.jsp">
Enter Any Number : <Input type=text name=num>
<input type=submit value=Display>
</form>
</body>
</html>

slip14.jsp
<%@page language="java" import="java.util.*"%>

<html>
<body>
<%! int n,rem,r; %>
<% n=Integer.parseInt(request.getParameter("num"));
if(n<10)
{
out.println("Sum of first and last digit is ");
%><font size=18 color=red><%= n %>
<%
}
else
{
rem=n%10;
do
{
r=n%10;
n=n/10;
}while(n>0);
n=rem+r;
out.println("Sum of first and last digit is ");
%><font size=18 color=red><%= n %>
<%
}
%>
</body>
</html>
