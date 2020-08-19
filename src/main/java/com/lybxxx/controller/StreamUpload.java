package com.lybxxx.controller;

import jdk.internal.util.xml.impl.Input;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;

/**
 * @author lybxxx
 */
@Controller
public class StreamUpload {
    @RequestMapping("/image/streamUpload")
    public String streamUpload(@RequestParam("file")CommonsMultipartFile file){
        try {
            OutputStream output = new FileOutputStream(System.currentTimeMillis()+"lyb");
            InputStream input = file.getInputStream();
            int temp = 0;
            while ((temp = input.read())!= -1){
                output.write(temp);
            }
            output.flush();
            output.close();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "/success";
    }
}
