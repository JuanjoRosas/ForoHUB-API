package com.aluracursos.forohub_api.Datos;

import com.aluracursos.forohub_api.Modelos.EstadoTopico;

import java.time.LocalDateTime;

public record DatosRegistroTopico(String titulo, String mensaje, LocalDateTime fecha, Long idUsuario, Long idCurso, EstadoTopico estadoTopico) {
}
