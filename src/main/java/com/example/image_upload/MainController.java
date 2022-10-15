package com.example.image_upload;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.annotation.MultipartConfig;

@Controller
@Slf4j
public class MainController {

    @Autowired
    private UploadService uploadService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/upload")
    public String upload(@ModelAttribute ImageVO imageVO){
        log.info("{}",imageVO);
        uploadService.save(imageVO);
        return "redirect:/";
    }
}
