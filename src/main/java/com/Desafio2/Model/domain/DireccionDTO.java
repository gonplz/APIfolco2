package com.Desafio2.Model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class DireccionDTO {
    private String calle;
    private Float altura;
}
