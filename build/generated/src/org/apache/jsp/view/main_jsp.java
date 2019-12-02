package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/view/header.jsp");
    _jspx_dependants.add("/view/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("        <title>TYGY - Tổng kho Guitar, Piano | Organ, Ukulele, Phụ kiện chính hãng</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <header>\r\n");
      out.write("            <div class=\"header-function\">\r\n");
      out.write("                <div class=\"brand fl\">\r\n");
      out.write("                    <img src=\"image/logo.png\" alt=\"logo.png\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"search-engine fl\">\r\n");
      out.write("                    <form action=\"search.jsp\" method=\"GET\">\r\n");
      out.write("                        <input type=\"text\" class=\"search-keyword\" name=\"search-keyword\" placeholder=\"Bạn cần tìm gì...\">\r\n");
      out.write("                        <button type=\"submit\" class=\"search-button bg-yellow\">\r\n");
      out.write("                            <i class=\"fa fa-search\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </form> \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"notice-box fr\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-user icon\"></i><p>Đăng nhập</p></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-user-plus icon\"></i><p>Đăng ký</p></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-shopping-cart icon\"><span>0</span></i><p>Giỏ hàng</p></a></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a>\r\n");
      out.write("                                <i class=\"fa fa-phone icon\"></i>\r\n");
      out.write("                                <span><i>Hotline</i></span>\r\n");
      out.write("                                <p>0123456789 (Hà Nội)</p>\r\n");
      out.write("                                <p>9876543210 (Hồ Chí Minh)</p>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"header-menu bg-yellow\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"image/su-kien-icon-tygy-1.png\">\r\n");
      out.write("                            <p>SỰ KIỆN</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"image/graduated-hat.png\">\r\n");
      out.write("                            <p>GIÁO DỤC</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"image/ky-gui-icon-tygy.png\">\r\n");
      out.write("                            <p>CŨ | KÝ GỬI</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"image/guitar-icon-tygy.png\">\r\n");
      out.write("                            <p>GUITAR</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"image/piano-icon-tygy-1.png\">\r\n");
      out.write("                            <p>PIANO | ORGAN</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"image/ukulele-icon-tygy.png\">\r\n");
      out.write("                            <p>UKULELE</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"image/drum-icon-tygy.png\">\r\n");
      out.write("                            <p>NHẠC CỤ KHÁC</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"image/phu-kien-icon-tygy.png\">\r\n");
      out.write("                            <p>SÁCH | PHỤ KIỆN +</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"image/hop-am-icon-tygy-1.png\">\r\n");
      out.write("                            <p>HỢP ÂM</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"image/tin-tuc-icon-tygy-2.png\">\r\n");
      out.write("                            <p>TIN TỨC</p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("    ");
      out.write("\n");
      out.write("    <div class=\"main-page\">\n");
      out.write("        <div class=\"hot-item\">\n");
      out.write("            <div class=\"list-header\">\n");
      out.write("                <h6>SẢN PHẨM NỔI BẬT</h6>\n");
      out.write("                <b></b>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"list-item\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <a class=\"item col-sm-3\" href=\"#\">\n");
      out.write("                        <div class=\"hot-tag\">HOT</div>\n");
      out.write("                        <div class=\"item-image\">\n");
      out.write("                            <img src=\"image/dia_chi_ban_dan_piano_dien_dynatone_dpp_510_gia_rex500x500x4.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <p class=\"item-header\">Đàn Piano Điện Dynatone DPP510 (Chính Hãng Full Box 100%)</p>\n");
      out.write("                        <p class=\"item-price\">12.500.000 VND</p>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"hot-item\">\n");
      out.write("            <div class=\"list-header\">\n");
      out.write("                <h6>SÁCH | PHỤ KIỆN</h6>\n");
      out.write("                <b></b>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"list-item\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <a class=\"item col-sm-2\" href=\"#\">\n");
      out.write("                        <div class=\"item-image\">\n");
      out.write("                            <img class=\"plugin\" src=\"image/dia_chi_ban_dan_piano_dien_dynatone_dpp_510_gia_rex500x500x4.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <p class=\"item-header\">Đàn Piano Điện Dynatone DPP510 (Chính Hãng Full Box 100%)</p>\n");
      out.write("                        <p class=\"item-price\">12.500.000 VND</p>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>          \n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-2\">\r\n");
      out.write("                <h6>CHÍNH SÁCH</h6>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">Chính sách giao hàng</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Chính sách bảo hành và đổi trả</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Chính sách thanh toán</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Chính sách bảo mật thông tin</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-2\">\r\n");
      out.write("                <h6>DICH VỤ & HỖ TRỢ</h6>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">An toàn mua bán</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Đăng kí cộng tác viên</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Hợp tác giảng dạy</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Câu hỏi thường gặp</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-2\">\r\n");
      out.write("                <h6>TYGY.VN</h6>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">Giới thiệu công ty</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Tuyển dụng</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Liên hệ</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-3\">\r\n");
      out.write("                <h6>MUA HÀNG (9h00 - 22h00)</h6>\r\n");
      out.write("                <p class=\"cl-red\">Bán lẻ: 0123 456 789</p>\r\n");
      out.write("                <p class=\"cl-red\">Bán sỉ: 0789 456 123</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-3\">\r\n");
      out.write("                <h6>GÓP Ý, PHẢN ÁNH (9h00 - 19h00)</h6>\r\n");
      out.write("                <p class=\"cl-red\">0147 258 369</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("                <p><b>© 2016. CÔNG TY CP GIÁO DỤC VÀ DỊCH VỤ ÂM NHẠC TYGY</b></p>\r\n");
      out.write("                <p><b>TP.Hà Nội:</b> 254 Đường Láng, Quận Đống Đa</p>\r\n");
      out.write("                <p><b>TP.Hải Phòng:</b> 306 Văn Cao, Quận Hải An</p>\r\n");
      out.write("                <p><b>TP.Hồ Chí Minh:</b> 1005 Cách Mạng Tháng 8, Phường 7, Quận Tân Bình</p>\r\n");
      out.write("                <p>Số ĐKKD 0106666819 do Sở Kế Hoạch và Đầu Tư TP. Hà Nội cấp ngày 20/05/2016</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("                <h6>LIÊN HỆ</h6>\r\n");
      out.write("                <ul class=\"social-link\">\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-youtube\"></i></a></li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-pinterest\"></i></a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <img src=\"image/bocongthuong.png\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-2\">\r\n");
      out.write("                <h6>CHẤP NHẬN THANH TOÁN</h6>\r\n");
      out.write("                <img src=\"image/footer_list_payment.png\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer-brand\">\r\n");
      out.write("            <img src=\"image/banner-footer-tong-kho-nhac-cu-01.jpg\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("       ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
