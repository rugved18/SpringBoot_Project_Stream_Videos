package com.stream.Streaming_app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Videos {

    @Id
    private String VideoId;
    private String VideoTitle;
    private String VideoDis;
    private String ContentPath;
    private String ContentType;

    public String getVideoId() {
        return VideoId;
    }

    public void setVideoId(String videoId) {
        VideoId = videoId;
    }

    public String getVideoTitle() {
        return VideoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        VideoTitle = videoTitle;
    }

    public String getVideoDis() {
        return VideoDis;
    }

    public void setVideoDis(String videoDis) {
        VideoDis = videoDis;
    }

    public String getContentPath() {
        return ContentPath;
    }

    public void setContentPath(String contentPath) {
        ContentPath = contentPath;
    }

    public String getContentType() {
        return ContentType;
    }

    public void setContentType(String contentType) {
        ContentType = contentType;
    }

    public Videos() {
    }

    public Videos(String videoId, String videoTitle, String videoDis, String contentPath, String contentType) {
        VideoId = videoId;
        VideoTitle = videoTitle;
        VideoDis = videoDis;
        ContentPath = contentPath;
        ContentType = contentType;
    }
}
