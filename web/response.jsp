<%-- 
    Document   : response
    Created on : 15/09/2022, 08:16:55 PM
    Author     : Juanes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Exit</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="page" class="mypackage.NameHandler" />        
        <jsp:setProperty name="mybean" property="name" />
        <jsp:setProperty name="mybean" property="birth"/>
        
        <h1>  
            <jsp:getProperty name="mybean" property="name" />, 
            Your age is <jsp:getProperty name="mybean" property="birth"/>.
        </h1>
        
    </body>
</html>
