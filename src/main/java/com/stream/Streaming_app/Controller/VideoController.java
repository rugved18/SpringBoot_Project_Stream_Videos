package com.stream.Streaming_app.Controller;

import com.stream.Streaming_app.Service.VideosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class VideoController {

  public   VideosService videosService;

   public VideoController(VideosService videosService){
       this.videosService= videosService;
    }

    @PostMapping
    public ResponseEntity<contextMessage> create(
            @RequestParam("file")MultipartFile file,
            @RequestParam("title")String title,
            @RequestParam("discription") String discription
            ){
       
    }
}
