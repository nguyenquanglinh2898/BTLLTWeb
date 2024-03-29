<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <header>
        <div class="header-function">
            <div class="brand fl">
                <a href="/BTLLTWeb"><img src="image/logo.png" alt="logo.png"></a>
            </div>
            <div class="search-engine fl">
                <form action="search.jsp" method="GET">
                    <input type="text" class="search-keyword" name="search-keyword" placeholder="Bạn cần tìm gì...">
                    <button type="submit" class="search-button bg-yellow">
                        <i class="fa fa-search"></i>
                    </button>
                </form> 
            </div>
            <div class="notice-box fr">
                <ul>
                    <c:set var="role" value="admin"></c:set>
                    <c:choose>
                        <c:when test="${user.role eq role}">
                            <li><a href="addInstrument">Add Instrument</a></li>
                        </c:when>
                        <c:otherwise>
                            <li></li>
                        </c:otherwise>
                    </c:choose>
                    <c:choose>
                        <c:when test="${user eq null}">
                            <li><a href="signin"><i class="fa fa-user icon"></i><p>Đăng nhập</p></a></li>
                        </c:when>
                        <c:otherwise>
                            <li><a href="signout" class="signout">Sign Out</a></li>
                            <li><a href="#"><i class="fa fa-user icon"></i><p>${user.username}</p></a></li>
                        </c:otherwise> 
                    </c:choose>
                    <li><a href="signup"><i class="fa fa-user-plus icon"></i><p>Đăng ký</p></a></li>
                    <li><a href="cart"><i class="fa fa-shopping-cart icon"><span>${listItem.getAllItem().size()}</span></i><p>Giỏ hàng</p></a></li>
                    <li>
                        <a>
                            <i class="fa fa-phone icon"></i>
                            <span><i>Hotline</i></span>
                            <p>0123456789 (Hà Nội)</p>
                            <p>9876543210 (Hồ Chí Minh)</p>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="header-menu bg-yellow">
            <ul>
                <li>
                    <a href="#">
                        <img src="image/su-kien-icon-tygy-1.png">
                        <p>SỰ KIỆN</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="image/graduated-hat.png">
                        <p>GIÁO DỤC</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="image/ky-gui-icon-tygy.png">
                        <p>CŨ | KÝ GỬI</p>
                    </a>
                </li>
                <li>
                    <a href="guitar">
                        <img src="image/guitar-icon-tygy.png">
                        <p>GUITAR</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="image/piano-icon-tygy-1.png">
                        <p>PIANO | ORGAN</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="image/ukulele-icon-tygy.png">
                        <p>UKULELE</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="image/drum-icon-tygy.png">
                        <p>NHẠC CỤ KHÁC</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="image/phu-kien-icon-tygy.png">
                        <p>SÁCH | PHỤ KIỆN +</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="image/hop-am-icon-tygy-1.png">
                        <p>HỢP ÂM</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="image/tin-tuc-icon-tygy-2.png">
                        <p>TIN TỨC</p>
                    </a>
                </li>
            </ul>
        </div>
    </header>
    