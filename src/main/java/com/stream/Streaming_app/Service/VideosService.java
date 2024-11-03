package com.stream.Streaming_app.Service;

import com.stream.Streaming_app.Model.Videos;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class VideosService {

    public Videos SaveVideo(Videos video, MultipartFile file){
        String filename = file.getOriginalFilename();
        return null;
    }

    public Videos Get(String VideoId){
        return null;
    }

    public Videos GetTitle(String VideoTitle){
        return null;
    }

    public List<Videos> getAll(){
        return null;
    }
}
