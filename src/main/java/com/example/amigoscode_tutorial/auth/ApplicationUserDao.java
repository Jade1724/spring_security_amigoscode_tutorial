package com.example.amigoscode_tutorial.auth;

import java.util.Optional;

public interface ApplicationUserDao {

  Optional<ApplicationUser> selectApplicationUserByUsername(String username);

}
