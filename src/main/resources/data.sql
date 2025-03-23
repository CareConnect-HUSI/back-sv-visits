-- Datos de ejemplo para la tabla visita
INSERT INTO visita (id_paciente, id_enfermera, fecha_visita, hora_inicio, hora_fin, estado, orden) VALUES
(101, 201, '2025-03-20', '08:00', '09:00', 'COMPLETADA', 'Toma de signos vitales'),
(102, 202, '2025-03-21', '10:30', '11:30', 'EN PROCESO', 'Aplicación de medicamento'),
(103, 203, '2025-03-22', '14:00', '15:00', 'PENDIENTE', 'Evaluación de rutina');

-- Datos de ejemplo para la tabla historial_visita
INSERT INTO historial_visita (id_visita, observaciones) VALUES
(1, 'Paciente estable. Presión arterial y frecuencia cardíaca normales.'),
(1, 'Se brindó orientación sobre cuidados postoperatorios.'),
(2, 'Paciente presentó leve reacción al medicamento. Se notificó al médico.'),
(3, 'Primera visita pendiente de ejecución. Enfermera asignada confirmada.');
