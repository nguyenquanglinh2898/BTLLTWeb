<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>TYGY - Tổng kho Guitar, Piano | Organ, Ukulele, Phụ kiện chính hãng</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/guitar.css">
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="guitar container">
            <div class="header">
                <div class="path">
                    <a href="#">Trang chủ</a> / <a href="#">Guitar</a>
                </div>
                <div class="filter">
                    <h5>GUITAR</h5>
                    <ul class="filter-list">
                        <li>
                            <h6 class="type-guitar-head" onclick="filter(this)">LOẠI ĐÀN</h6>
                            <ul class="filter-sub-list" id="type-guitar">
                                <li><a href="#">Acoustic</a></li>
                                <li><a href="#">Classic</a></li>
                                <li><a href="#">Ukulele</a></li>
                                <li><a href="#">Electric - Bass</a></li>
                                <li><a href="#">Vọng cổ</a></li>
                            </ul>
                        </li> 
                        <li>
                            <h6 class="guitar-brand-head" onclick="filter(this)">THƯƠNG HIỆU</h6>
                            <ul class="filter-sub-list split" id="guitar-brand">
                                <li><a href="#">Almansa</a></li>
                                <li><a href="#">Epiphone</a></li>
                                <li><a href="#">Fender</a></li>
                                <li><a href="#">Ibanez</a></li>
                                <li><a href="#">NG</a></li>
                                <li><a href="#">Martin</a></li>
                                <li><a href="#">Poshman</a></li>
                                <li><a href="#">Stagg</a></li>
                                <li><a href="#">Takamine</a></li>
                                <li><a href="#">Đàn Việt Nam</a></li>
                                <li><a href="#">Cordoba</a></li>
                                <li><a href="#">Everest</a></li>
                                <li><a href="#">Hohner</a></li>
                                <li><a href="#">Kepma</a></li>
                                <li><a href="#">Mantic</a></li>
                                <li><a href="#">Morrison | Rosen</a></li>
                                <li><a href="#">Taylor</a></li>
                                <li><a href="#">Saga</a></li>
                                <li><a href="#">Yamaha</a></li>
                                <li><a href="#">Khác</a></li>
                            </ul>
                        </li> 
                        <li>
                            <h6 class="price-comportable-head" onclick="filter(this)">KHOẢNG GIÁ</h6>
                            <ul class="filter-sub-list" id="price-comportable">
                                <li><a href="#">Dưới 1.5 triệu</a></li>
                                <li><a href="#">Từ 1.5 - 3 triệu</a></li>
                                <li><a href="#">Từ 3 - 5 triệu</a></li>
                                <li><a href="#">Từ 5 - 10 triệu</a></li>
                                <li><a href="#">Trên 10 triệu</a></li>
                            </ul>
                        </li> 
                        <li>
                            <h6 class="others-head" onclick="filter(this)">KHÁC</h6>
                            <div class="sub-list">
                                <ul class="filter-sub-list sub-list1" id="others1">
                                    <li><a><b>KIỂU DÁNG</b></a></li>
                                    <li><a href="#">O</a></li>
                                    <li><a href="#">A</a></li>
                                    <li><a href="#">Concert</a></li>
                                    <li><a href="#">Cổ điển</a></li>
                                    <li><a href="#">D Đầy</a></li>
                                    <li><a href="#">D Khuyết</a></li>
                                    <li><a href="#">Trẻ con</a></li>
                                    <li><a href="#">Jumbo</a></li>
                                    <li><a href="#">Khác</a></li>
                                </ul>
                                <ul class="filter-sub-list sub-list2" id="others2">
                                    <li><a><b>GỖ LÀM ĐÀN</b></a></li>
                                    <li><a href="#">Gỗ thịt</a></li>
                                    <li><a href="#">Gỗ ép</a></li>
                                    <li><a href="#">Mặt đàn gỗ thịt</a></li>
                                    <li><a><b>KIỂU SƠN</b></a></li>
                                    <li><a href="#">Sơn bóng (Gloss)</a></li>
                                    <li><a href="#">Sơn mờ (Satin)</a></li>
                                    <li><a><b>EQ</b></a></li>
                                    <li><a href="#">EQ</a></li>
                                    <li><a href="#">Không EQ</a></li>
                                </ul>
                            </div>
                        </li> 
                        <li>
                            <input type="checkbox">KHUYẾN MÃI
                        </li>
                        <li>
                            <h6 class="sort-head" onclick="filter(this)">SẮP XẾP</h6>
                            <ul class="filter-sub-list" id="sort">
                                <li><a href="#">Mặc định</a></li>
                                <li><a href="#">Giá thấp đến cao</a></li>
                                <li><a href="#">Giá cao đến thấp</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="guitar-list container">
            <div class="hot-item">
                <div class="list-item">
                    <div class="row">
                        <c:forEach var="item" items="${list}">
                            <a class="item col-sm-3" href="detail?id=${item.id}&instru_type=${item.instru_type}">
                                <div class="item-image">
                                    <img src="${item.image}">
                                </div>
                                <p class="item-header">${item.name}</p>
                                <p class="item-price">${item.getDotPrice()} VND</p>
                            </a>
                            <a href="edit?id=${item.id}&instru_type=${item.instru_type}">Edit</a>
                            <a href="delete?id=${item.id}&instru_type=${item.instru_type}">Delete</a>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
        
        <%@include file="footer.jsp" %> 
        
        <script>
            function filter(d){
                if( d.className === "type-guitar-head" )
                    if(document.getElementById("type-guitar").style.display === "none" || 
                        document.getElementById("type-guitar").style.display === "")
                        document.getElementById("type-guitar").style.display = "block";
                    else
                        document.getElementById("type-guitar").style.display = "none";
                if( d.className === "guitar-brand-head" )
                    if(document.getElementById("guitar-brand").style.display === "none" || 
                        document.getElementById("guitar-brand").style.display === "")
                        document.getElementById("guitar-brand").style.display = "block";
                    else
                        document.getElementById("guitar-brand").style.display = "none";
                if( d.className === "price-comportable-head" )
                    if(document.getElementById("price-comportable").style.display === "none" || 
                        document.getElementById("price-comportable").style.display === "")
                        document.getElementById("price-comportable").style.display = "block";
                    else
                        document.getElementById("price-comportable").style.display = "none";
                if( d.className === "others-head" )
                    if(document.getElementById("others1").style.display === "none" || 
                        document.getElementById("others1").style.display === ""){
                        document.getElementById("others1").style.display = "block";
                        document.getElementById("others2").style.display = "block";
                    }
                    else{
                        document.getElementById("others1").style.display = "none";   
                        document.getElementById("others2").style.display = "none";   
                    }
                if( d.className === "sort-head" )
                    if(document.getElementById("sort").style.display === "none" || 
                        document.getElementById("sort").style.display === "")
                        document.getElementById("sort").style.display = "block";
                    else
                        document.getElementById("sort").style.display = "none";
            }
        </script>
    </body>
</html>