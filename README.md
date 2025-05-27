# Back-SV-Visits CareConnect

## Descripción
El servicio `back-sv-visits` es un componente del sistema CareConnect, desarrollado para el Hospital Universitario San Ignacio. Gestiona las operaciones relacionadas con visitas domiciliarias, historiales de visitas y actividades de pacientes, integrándose con otros módulos a través de un API Gateway. Proporciona endpoints REST para crear, consultar y actualizar visitas, así como para manejar historiales y actividades asociadas, soportando la sincronización con el portal web y la app móvil.

## Funcionalidades
- **Gestión de Visitas**: Creación (`POST /visitas`), actualización (`PUT /visitas/{id}`), consulta paginada por fecha (`GET /visitas`), y búsqueda por enfermera (`GET /visitas/enfermera/{enfermeraId}`).
- **Historial de Visitas**: Registro (`POST /historial-visitas`) y consulta por visita (`GET /historial-visitas/visita/{idVisita}`).
- **Actividades de Pacientes**: Consulta por ID (`GET /actividad-paciente-visita/{id}`).
- **Integración**: Conexión con API Gateway para comunicación con otros servicios (e.g., pacientes, enfermeras).

## Tecnologías
- **Framework**: Spring Boot
- **Lenguaje**: Java
- **Base de Datos**: PostgreSQL
- **Dependencias Clave** (asumidas):
  - `spring-boot-starter-web`
  - `spring-boot-starter-data-jpa`
  - `postgresql`
- **Conexión**: API Gateway (e.g., `http://localhost:8080/api`)

## Requisitos
- Java 17
- Maven 3.8+
- PostgreSQL (configurado en `application.properties`)
- API Gateway activo
- Archivo `application.properties` con:
  ```
  spring.datasource.url=jdbc:postgresql://localhost:5432/careconnect
  spring.datasource.username=your_user
  spring.datasource.password=your_password
  server.port=8082
  ```

## Instalación
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/careconnect/back-sv-visits.git
   cd back-sv-visits
   ```

2. Configurar `application.properties` con las credenciales de la base de datos.

3. Compilar e instalar dependencias:
   ```bash
   mvn clean install
   ```

4. Iniciar el servicio:
   ```bash
   mvn spring-boot:run
   ```

   El servicio estará disponible en `http://localhost:8082`, accesible vía API Gateway.

## Uso
- **Endpoints** (prefijo `/visitas`, `/historial-visitas`, o `/actividad-paciente-visita`):
  - Crear visita: `POST http://localhost:8080/api/visitas`
  - Consultar visitas por enfermera: `GET http://localhost:8080/api/visitas/enfermera/{enfermeraId}`
  - Registrar historial: `POST http://localhost:8080/api/historial-visitas`
- **Autenticación**: Gestionada por el API Gateway (e.g., JWT).
- **Ejemplo**:
  ```bash
  curl -X POST "http://localhost:8080/api/visitas" -H "Content-Type: application/json" -d '{"enfermeraId": 1, "horaInicioCalculada": "08:00"}'
  ```

## Autoría
- Juan David González
- Lina María Salamanca
- Laura Alexandra Rodríguez
- Axel Nicolás Caro

**Pontificia Universidad Javeriana**  
**Mayo 26, 2025**