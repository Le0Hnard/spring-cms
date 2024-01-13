package com.demo.cms.domain.vo;

import com.demo.cms.domain.models.Role;
import lombok.Data;

@Data
public class UserRequest {

    String identity;
    String name;
    Role role;

}
