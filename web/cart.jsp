<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.ItemDAOImpl"%>
<%@page import="model.Item"%>
<%@page import="java.util.List"%>
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
        
        <div class="cart container">
            <form action="bill" method="POST">
                <div class="row">
                    <div class="col-sm-4">
                        <div class="customer-info">
                            <h6 class="cl-red">THÔNG TIN NGƯỜI MUA HÀNG</h6>
                            <input type="text" name="name" placeholder="Họ tên">                       <br><br>
                            <input type="text" name="phone" placeholder="Số điện thoại">                    <br><br>
                            <input type="text" name="email" placeholder="Email">          <br><br>
                            <select name="city">                                                            
                                <option value="0" selected>- tỉnh / thành phố -</option>
                                <option value="1">Hà Nội</option>
                                <option value="2">Đà Nẵng</option>
                                <option value="3">Hồ Chí Minh</option>
                            </select>                                                                       
                            <select name="district">                                                            
                                <option value="0" selected>- quận / huyện -</option>
                                <option value="1">Đống Đa</option>
                                <option value="2">Tây Hồ</option>
                                <option value="3">Thanh Xuân</option>
                            </select>                                                                       <br><br>
                            <input type="text" name="address" placeholder="Địa chỉ">                        <br><br>
                            <textarea name="content" rows="5" placeholder="Ghi chú mua hàng"></textarea>    <br><br>
                        </div>
                        <div class="hidden">
                            <h6 class="cl-red">HÌNH THỨC THANH TOÁN</h6>
                            <input type="radio" name="payment"> Thanh toán khi nhận hàng - COD               <br>
                            <input type="radio" name="payment"> Thanh toán qua chuyển khoản                  <br><br>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="order">
                            <h6 class="cl-red">ĐƠN ĐẶT HÀNG</h6>
                            <table border="2" cellpadding="10px" class="order-table">
                            <tr>
                                <th>STT</th>
                                <th>Tên sản phẩm</th>
                                <th>Giá</th>
                                <th>Số lượng</th>
                                <th>Thành tiền</th>
                            </tr>
                            
                            <% int stt = 0; %>
                            <c:forEach var="item" items="${listItem.getAllItem()}">
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
                                        <a href="deleteItem?i=<%= stt %>" class="delete">Xóa</a>
                                    </div>
                                </td>
                                <td class="cl-red">${item.getDotPrice(item.price)} VND</td>
                                <td class="quantity-col">
                                    <a class="quantity-button" href="quantity?i=<%= stt %>&type=decrease">-</a>
                                    <input class="quantity" type="text" value="${item.quantity}" min="1" max="9999" disabled>
                                    <a class="quantity-button" href="quantity?i=<%= stt %>&type=increase">+</a>
                                </td>
                                <td class="cl-red">${item.getDotPrice(item.price*item.quantity)} VND</td>
                            </tr>
                            <% stt++; %>
                            </c:forEach>
                            </table>
                            <br>
                            <h6>Tổng tiền thanh toán:&ensp;<span class="cl-red">${listItem.getDotPrice(listItem.getTotalPrice())} VND</span></h6>
                            <input type="text" class="hidden" name="total" value="${listItem.getTotalPrice()}">
                            <br>
                            <button type="submit" class="order-button">HOÀN TẤT MUA HÀNG</button>
                            <a href="/BTLLTWeb" class="order-button">TIẾP TỤC MUA HÀNG</a>
                        </div>
                    </div>
                </div>
            </form>
        </div>
        
        <%@include file="footer.jsp" %> 
    </body>
</html>
