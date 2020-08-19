package com.lybxxx.controller;

import com.lybxxx.pojo.UploadedImageFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author lybxxx
 */
@Controller
public class UploadController {
    @RequestMapping("uploadImage")
    public ModelAndView upload(HttpServletRequest request, UploadedImageFile file) throws IOException {

        String name = System.currentTimeMillis() + "";
        String newFileName = name + ".jpg";
        File newFile = new File(request.getServletContext().getRealPath("/image"),newFileName);
        newFile.getParentFile().mkdirs();
        file.getImage().transferTo(newFile);
        ModelAndView mav = new ModelAndView("showUploadedFile");
        mav.addObject("imageName",newFileName);
        return mav;
    }
}
