package net.ekene.response;

import lombok.*;
import net.ekene.enums.Role;


@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseVO {
    private String name;
    private String email;
    private boolean verifiedAccount;
    private Role role;
    private String token;
}