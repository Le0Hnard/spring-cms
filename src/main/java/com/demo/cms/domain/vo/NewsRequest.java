package com.demo.cms.domain.vo;

import com.demo.cms.domain.models.Category;
import com.demo.cms.domain.models.Tag;
import lombok.Data;

import java.util.Set;

@Data
public class NewsRequest {

    String title;
    String content;
    Set<Category> categories;
    Set<Tag> tags;

}
