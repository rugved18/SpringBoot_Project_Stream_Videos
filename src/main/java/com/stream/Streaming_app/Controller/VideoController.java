package com.stream.Streaming_app.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Video")
public class VideoController {

    @GetMapping("/output")
    public String Output(){
        return "Hello World This is Rugved";
    }
}
