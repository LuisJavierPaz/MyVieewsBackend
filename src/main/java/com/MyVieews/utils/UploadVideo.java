package com.MyVieews.utils;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class UploadVideo {
    private Cloudinary cloudinary;
    private Map<String, String> credenciales = new HashMap<String, String>();

    public UploadVideo() {
        credenciales.put("cloud_name", "dzkcr9eec");
        credenciales.put("api_key", "314263318477114");
        credenciales.put("api_secret", "w4b7HseGjkcPejfnh5CbZvr_yTs");
        cloudinary = new Cloudinary(credenciales);
    }


    public Map upload(MultipartFile multipartFile) throws IOException{
        File fileUpload = convertMulFile(multipartFile);
        System.out.printf("Accesidoe ========================================================");
        String public_id = cloudinary.randomPublicId();
        Map apiValuer = cloudinary.uploader().uploadLarge(fileUpload, ObjectUtils.asMap(
                "resource_type", "video",
                "chunk_size", 6000000));
        return apiValuer;
    }

    private File convertMulFile(MultipartFile multipartFile) throws IOException {
        File file = new File(multipartFile.getOriginalFilename());
        FileOutputStream fileOutputStream= new FileOutputStream(file);
        fileOutputStream.write(multipartFile.getBytes());
        fileOutputStream.close();
        return file;
    }
}
