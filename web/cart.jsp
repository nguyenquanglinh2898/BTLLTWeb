<%@page import="model.Item"%>
<%@page import="java.util.List"%>
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
        
        <div class="cart container">
            <form action="" method="POST">
                <div class="row">
                    <div class="col-sm-4">
                        <div class="customer-info">
                            <h6 class="cl-red">THÔNG TIN NGƯỜI MUA HÀNG</h6>
                            <input type="text" name="name" value="Linh Quang Nguyen">                       <br><br>
                            <input type="text" name="phone" placeholder="Số điện thoại">                    <br><br>
                            <input type="text" name="email" value="nguyenquanglinh2898@gmail.com">          <br><br>
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
                        <div class="">
                            <h6 class="cl-red">HÌNH THỨC THANH TOÁN</h6>
                            <input type="radio" name="payment"> Thanh toán khi nhận hàng - COD               <br>
                            <input type="radio" name="payment"> Thanh toán qua chuyển khoản                  <br><br>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="order">
                            <h6 class="cl-red">ĐƠN ĐẶT HÀNG</h6>
                            
                            <%
                                List <Item> listItem = (List <Item>)session.getAttribute("listItem");
                            %>
                            
                            <table border="2" cellpadding="10px">
                            <tr>
                                <th>STT</th>
                                <th>Tên sản phẩm</th>
                                <th>Giá</th>
                                <th>Số lượng</th>
                                <th>Chiết khấu</th>
                                <th>Thành tiền</th>
                            </tr>
                            <% for( int i = 0 ; i < listItem.size() ; i++ ){    %>
                            <tr>
                                <td><%= listItem.get(i).getId() %></td>
                                <td>
                                    <div class="instrument-info">
                                        <div class="instrument-image">
                                            <img src="<%= listItem.get(i).getImage()%>" style="width: 78px; height:78px;">
                                        </div>
                                        <div class="instrument-name">
                                            <a href="#"><%= listItem.get(i).getName()%></a>
                                        </div>
                                        <button class="delete">Xóa</button>
                                    </div>
                                </td>
                                <td class="cl-red"><%= listItem.get(i).getDotPrice()%> VND</td>
                                <td><input type="number" value="1" min="1" max="9999"></td>
                                <td>0%</td>
                                <td class="cl-red"><%= listItem.get(i).getDotPrice(listItem.get(i).getQuantity()*listItem.get(i).getPrice()) %> VND</td>
                            </tr>
                            <% } %>
                            </table>
                            <br>
                            <% 
                                int total = 0;
                                for( Item i : listItem ) 
                                    total += i.getPrice()*i.getQuantity();
                            %>
                            <h6>Tổng tiền thanh toán:&ensp;<span class="cl-red"><%= total %> VND</span></h6>
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
