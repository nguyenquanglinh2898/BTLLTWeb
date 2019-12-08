<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>TYGY - Tổng kho Guitar, Piano | Organ, Ukulele, Phụ kiện chính hãng</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/main.css">
    </head>
    <body>
        <%@include file="header.jsp" %>
        
        <div class="signup container">
            <form method="POST">
                Username: <input type="text" name="username">                               <br><br>
                Password: <input type="text" name="password">                               <br><br>
                <input type="submit" name="submit" value="Sign up">                         <br><br>
            </form>
            <div>${mess}</div>
        </div>  
        <%@include file="footer.jsp" %> 
    </body>
</html>