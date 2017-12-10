<%@ page import="com.mojafirma.utility.HibernateConnector" %>
<%@ page import="org.hibernate.Session" %><%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 10.12.2017
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    Session singleSession = HibernateConnector.getHibernateSession();
%>

<div style="position: absolute; right: 40; top: 30;">
    <form action= "/tweetLogin" method="post">
        <input type="text" name="user" placeholder="username"/>
        <input type="text" name="password" placeholder="password"/>
        <br>
        <div style="position: absolute; right: 80; top: 37">
            <input type="button" value="Log In"/>
        </div>
    </form>
    <form action="/tweetLogin" method="put">
        <div style="position: absolute; right: 5;">
            <input type="button" value="Sign Up">
        </div>
    </form>
</div>

<%

%>
</body>
</html>
