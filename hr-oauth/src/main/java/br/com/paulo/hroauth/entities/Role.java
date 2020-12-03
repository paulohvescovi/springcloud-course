package br.com.paulo.hroauth.entities;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@EqualsAndHashCode(of = "roleName")
public class Role implements Serializable {

    private Long id;
    private String roleName;

}
