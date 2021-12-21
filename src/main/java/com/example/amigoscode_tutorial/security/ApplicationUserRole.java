package com.example.amigoscode_tutorial.security;

import static com.example.amigoscode_tutorial.security.ApplicationUserPermission.COURSE_READ;
import static com.example.amigoscode_tutorial.security.ApplicationUserPermission.COURSE_WRITE;
import static com.example.amigoscode_tutorial.security.ApplicationUserPermission.STUDENT_READ;
import static com.example.amigoscode_tutorial.security.ApplicationUserPermission.STUDENT_WRITE;
import com.google.common.collect.Sets;
import java.util.Set;

public enum ApplicationUserRole {
  STUDENT(Sets.newHashSet()),
  ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE)),
  ADMINTRAINEE(Sets.newHashSet(COURSE_READ, STUDENT_READ));

  private final Set<ApplicationUserPermission> permissions;

  ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
    this.permissions = permissions;
  }
}
