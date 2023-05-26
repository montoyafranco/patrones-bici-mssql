package org.example.entidad;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ticket {

    private Integer id_ticket;

    private Integer id_usuario;

    private Integer id_bici;

    private Boolean ticket_estado;

    private Integer dinero;

    private LocalDateTime fecha_inicio;
    private LocalDateTime fecha_fin;


}
