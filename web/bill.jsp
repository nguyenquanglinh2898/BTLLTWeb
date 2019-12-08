<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>TYGY - Tổng kho Guitar, Piano | Organ, Ukulele, Phụ kiện chính hãng</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/cart.css">
    </head>
    <body>
        <%@include file="header.jsp" %>
        
        <div class="bill container">
            <div class="cl-red">MUA HÀNG THÀNH CÔNG</div>
            <br>
            <div>
                <div class="order">
                    <h6 class="cl-red">Thông tin đơn hàng</h6>
                    <div>UserID: ${userID}</div>
                    <table border="2" cellpadding="10px" class="order-table">
                    <tr>
                        <th>STT</th>
                        <th>Tên sản phẩm</th>
                        <th>Giá</th>
                        <th>Số lượng</th>
                        <th>Thành tiền</th>
                    </tr>

                    <% int stt = 0; %>
                    <c:forEach var="item" items="${list.getAllItem()}">
                    <tr>
                        <td><%= stt+1 %></td>
                        <td class="second-col">
                            <div class="instrument-info">
                                <div class="instrument-image">
                                    <img src="${item.image}" style="width: 78px; height:78px;">
                                </div>
                                <div class="instrument-name">
                                    <a href="#">${item.name}</a>
                                </div>
                            </div>
                        </td>
                        <td class="cl-red">${item.getDotPrice(item.price)} VND</td>
                        <td class="quantity-col">
                            <input class="quantity" type="text" value="${item.quantity}" min="1" max="9999" disabled>
                        </td>
                        <td class="cl-red">${item.getDotPrice(item.price*item.quantity)} VND</td>
                    </tr>
                    <% stt++; %>
                    </c:forEach>
                    </table>
                    <br>
                    <h6>Tổng tiền thanh toán:&ensp;<span class="cl-red">${list.getDotPrice(total)} VND</span></h6>
                    <br>
                    <a href="/BTLLTWeb" class="order-button">TIẾP TỤC MUA HÀNG</a>
                </div>
            </div>
        </div>  
                    
        <div class="hidden">${listItem.clear()}</div>
        
        <%@include file="footer.jsp" %> 
    </body>
</html>