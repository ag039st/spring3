package com.apress.myblog.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class Comment {
    private Integer id;
    @NotNull
    @Size(min = 3,max = 50,message = "Title must be minimum 3 characters," +
            " and maximum 50 characters long")
    private String title;
    @NotNull
    @Size(min = 3,max = 50,message = "authorName must be minimum 3 characters," +
            " and maximum 50 characters long")
    private String authorName;
    @NotNull
    @Size(min = 3,max = 100,message = "Body must be minimum 3 characters," +
            " and maximum 100 characters long")
    private String body;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
