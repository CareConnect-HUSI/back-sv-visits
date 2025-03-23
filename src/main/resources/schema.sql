CREATE TABLE IF NOT EXISTS visita (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_paciente BIGINT NOT NULL,
    id_enfermera BIGINT NOT NULL,
    fecha_visita VARCHAR(50),
    hora_inicio VARCHAR(50),
    hora_fin VARCHAR(50),
    estado VARCHAR(50),
    orden VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS historial_visita (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_visita BIGINT NOT NULL,
    observaciones VARCHAR(1000)
);
