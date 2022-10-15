package com.example.image_upload;


import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ImageVO {
    private String desc;
    private MultipartFile file;
}
