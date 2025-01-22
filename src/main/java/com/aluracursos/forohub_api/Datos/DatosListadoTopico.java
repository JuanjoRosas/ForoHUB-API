package com.aluracursos.forohub_api.Datos;
import com.aluracursos.forohub_api.Modelos.EstadoTopico;

import java.time.LocalDateTime;

public record DatosListadoTopico(Long id, String titulo, String mensaje, LocalDateTime fecha, Long idUsuario, String nombreUsuario, Long idCurso, String nombreCurso, EstadoTopico estadoTopico){
}
