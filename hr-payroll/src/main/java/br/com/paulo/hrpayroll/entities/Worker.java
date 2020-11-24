package br.com.paulo.hrpayroll.entities;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class Worker implements Serializable {


    private Long id;

    private String name;

    private Double dailyIncome;


}
