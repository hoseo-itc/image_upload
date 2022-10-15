package com.example.image_upload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class UploadService {

    @Autowired
    Environment environment;

    public String save(ImageVO vo){
        String dir = environment.getProperty("app.image-dir");
        MultipartFile file = vo.getFile();
        String savedPath = Path.of(dir,file.getOriginalFilename()).toAbsolutePath().toString();

        try {
            Files.copy(file.getInputStream(),Path.of(dir,file.getOriginalFilename()));
        } catch (IOException e) {
            throw new RuntimeException("파일 복사중 오류 발생 ");
        }
        return savedPath;
    }

}
