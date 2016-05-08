package com.demo.controller;

import com.demo.common.GetPicture;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by One on 2016/5/3.
 */
@Controller
public class Picture {
    @RequestMapping("/getPic.htm")
    public void getPic(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //response.setContentType("image/jpeg");
        //response.setHeader("Pragma", "no-cache");
        //response.setHeader("Cache-Control", "no-cache");
        //response.setDateHeader("Expires", 0);
        GetPicture vCode = new GetPicture(300,150,1,"这是服务器随机生成的图片文字");
        //HttpSession session = request.getSession();
        //session.removeAttribute("validateCode");
        //vCode.write(response.getOutputStream());
        //session.setAttribute("validateCode", vCode.getCode());
        vCode.write(response.getOutputStream());
    }
}
