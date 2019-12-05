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
        
        <div class="edit-instrument container">
            <form method="POST">
                <div class="guitar">
                    ID: <input type="text" name="id" value="${g.id}" disabled>                        <br><br>
                    Name: <input type="text" name="name" value="${g.name}">                           <br><br>
                    Type: <input type="text" name="type" value="${g.type}">                           <br><br>
                    Price: <input type="text" name="price" value="${g.price}">                         <br><br>
                    Image: <input type="text" name="image" value="${g.image}">                         <br><br>
                </div>
                
                <input type="submit" name="submit" value="Edit">
            </form>                                                                 <br>
            <div class="success">${mess}</div>
        </div>          
        
        <%@include file="footer.jsp" %> 
    </body>
</html>