<%@ page import="org.hibernate.Session" %>
<%@ page import="com.mojafirma.utility.HibernateConnector" %><%--
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
    Session singleSession = HibernateConnector.getHibernateSession();
%>

<div style="position: absolute; right: 40; top: 30;">
    <form>
        <input type="text" name="user" placeholder="username"/>
        <input type="text" name="password" placeholder="password"/>
    </form>
    <form>
        <div style="position: absolute; right: 0;">
            <input type="button" value="Log In"/>
            <input type="button" value="Sign Up">
        </div>
    </form>
</div>

<%

%>
</body>
</html>
