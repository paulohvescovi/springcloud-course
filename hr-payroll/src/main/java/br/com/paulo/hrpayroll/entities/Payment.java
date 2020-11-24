package br.com.paulo.hrpayroll.entities;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Payment implements Serializable {

    private String name;
    private Double dailyIncome;
    private Integer days;

    public Double getTotal(){
        return dailyIncome * days;
    }

}
