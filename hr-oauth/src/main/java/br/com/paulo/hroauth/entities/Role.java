package br.com.paulo.hroauth.entities;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "roleName")
public class Role implements Serializable {

	private Long id;
	private String roleName;


}
