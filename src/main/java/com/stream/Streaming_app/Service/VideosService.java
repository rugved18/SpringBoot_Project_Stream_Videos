package com.stream.Streaming_app.Service;

import com.stream.Streaming_app.Model.Videos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class VideosService {

    @Value("${file.video}")
    String DIR;

    public Videos SaveVideo(Videos video, MultipartFile file) {
        try {
            String fileName = file.getOriginalFilename();
            String fileContent = file.getContentType();
            InputStream inputStream = file.getInputStream();

            String cleanFilename = StringUtils.cleanPath(fileName);
            String cleanFolder = StringUtils.cleanPath(DIR);

            Path path = Paths.get(cleanFilename,cleanFolder);

        } catch (IOException e) {
            System.out.println("error and need to handle it");
        }
        return null;
    }

    public Videos Get(String VideoId) {
        return null;
    }

    public Videos GetTitle(String VideoTitle) {
        return null;
    }

    public List<Videos> getAll() {
        return null;
    }
}

