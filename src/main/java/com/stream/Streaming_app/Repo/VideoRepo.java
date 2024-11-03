package com.stream.Streaming_app.Repo;

import com.stream.Streaming_app.Model.Videos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepo extends JpaRepository<Videos, String> {
}
