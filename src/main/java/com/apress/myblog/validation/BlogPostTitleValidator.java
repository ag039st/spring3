package com.apress.myblog.validation;

import com.apress.myblog.domain.Post;
import com.apress.myblog.services.PostService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.log4j.Log4j2;
import org.thymeleaf.util.StringUtils;
@Log4j2
public record BlogPostTitleValidator(PostService postService)
        implements ConstraintValidator<BlogPostTitleAlreadyExists, Post> {
    @Override
    public void initialize(BlogPostTitleAlreadyExists constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Post post, ConstraintValidatorContext constraintValidatorContext) {
        log.info("checking if valid () ");
        if (!StringUtils.isEmpty(post.getTitle()) &&
                postService.postExistsWithTitle(post.getTitle())){
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate("Title already Exists")
                    .addPropertyNode("title")
                    .addConstraintViolation();
            return false;

        }
        return true;
    }
}
