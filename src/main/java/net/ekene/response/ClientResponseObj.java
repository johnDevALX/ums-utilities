package net.ekene.response;

import lombok.*;
import net.ekene.enums.Role;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponseObj {
    private String firstName;
    private String email;
    private String gender;
    private String departmentName;
    private Role role;
}