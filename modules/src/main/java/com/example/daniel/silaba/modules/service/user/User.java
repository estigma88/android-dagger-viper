package com.example.daniel.silaba.modules.service.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private final String id;
    private final String username;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String avatarUrl;
    private final String fullName;
    private final String displayName;

}
