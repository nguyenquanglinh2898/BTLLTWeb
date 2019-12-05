<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>TYGY - Tổng kho Guitar, Piano | Organ, Ukulele, Phụ kiện chính hãng</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/add.css">
    </head>
    <body>
        <%@include file="header.jsp" %>
        
        <div class="add-instrument container">
            <form method="POST">
                <select name="instru_type">                                                            
                    <option selected>guitar</option>
                    <option>piano | organ</option>
                    <option>ukulele</option>
                    <option>violin</option>
                    <option>drum</option>
                </select>                                                           <br><br>
                
                <div class="guitar">
                    Name: <input type="text" name="name">                           <br><br>
                    Type: <input type="text" name="type">                           <br><br>
                    Price: <input type="text" name="price">                         <br><br>
                    Image: <input type="text" name="image">                         <br><br>
                </div>
                
                <input type="submit" name="submit" value="Add">
            </form>                                                                 <br>
            <div class="success">${mess}</div>
        </div>          
        
        <%@include file="footer.jsp" %> 
    </body>
</html>