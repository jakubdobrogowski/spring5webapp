package com.jd.spring5webapp.dtos;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserLoginDTO {

    private String email;

    private String password;
}
