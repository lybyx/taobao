package com.lybxxx.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author lybxxx
 */
@Getter
@Setter
public class UploadedImageFile {
    MultipartFile image;

}
