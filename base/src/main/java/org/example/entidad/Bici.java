package org.example.entidad;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bici {

    private Integer id_bici;

    private String name ;

    private Boolean estado;




}
