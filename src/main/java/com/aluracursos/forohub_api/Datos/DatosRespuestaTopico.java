package com.aluracursos.forohub_api.Datos;

import com.aluracursos.forohub_api.Modelos.EstadoTopico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, LocalDateTime fecha, String nombreUsuario, String nombreCurso, EstadoTopico estadoTopico ) {
}
