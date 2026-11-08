#EcoRuta

### Muévete mejor. Reduce tu impacto.

**EcoRuta** es una aplicación de escritorio desarrollada en Java que permite registrar recorridos y estimar las emisiones de dióxido de carbono (CO₂) generadas según la distancia recorrida y el medio de transporte utilizado.

El proyecto busca fomentar la movilidad sostenible mediante una herramienta sencilla que permite visualizar el impacto ambiental estimado de los desplazamientos cotidianos.

---

##Objetivo del proyecto

Desarrollar una solución de software que aplique principios de ingeniería de software sostenible, promoviendo el uso responsable de los recursos tecnológicos y la conciencia ambiental mediante el registro y estimación de emisiones de CO₂.

##Tecnologías utilizadas

- **Lenguaje:** Java 25.
- **Interfaz gráfica:** Java Swing.
- **Gestor de dependencias y construcción:** Maven.
- **Base de datos:** SQLite.
- **Conector de base de datos:** SQLite JDBC.
- **Entorno de desarrollo:** Apache NetBeans.

##Funcionalidades principales

- Registro de recorridos mediante origen y destino.
- Captura de la distancia recorrida en kilómetros.
- Selección del medio de transporte.
- Cálculo estimado de emisiones de CO₂.
- Almacenamiento local de los recorridos.
- Consulta del historial de recorridos registrados.
- Visualización del total acumulado de emisiones estimadas.

##Factores de emisión utilizados

La aplicación utiliza factores de emisión de referencia con fines educativos para estimar las emisiones de cada recorrido.

| Medio de transporte | Factor de emisión |
|---|---:|
| Bicicleta | 0.000 kg CO₂/km |
| Caminata | 0.000 kg CO₂/km |
| Transporte público | 0.080 kg CO₂/km |
| Automóvil | 0.192 kg CO₂/km |

**Fórmula utilizada:**

Emisiones estimadas = Distancia recorrida × Factor de emisión

*Nota: Los factores son valores de referencia educativos y no mediciones directas. Las emisiones reales pueden variar según el vehículo, la ocupación, la tecnología y la fuente de energía.*

##Ingeniería de software sostenible

EcoRuta incorpora principios de sostenibilidad mediante:

- Organización modular del código.
- Uso de herramientas y bibliotecas reutilizables.
- Almacenamiento local de información.
- Consultas SQL mediante PreparedStatement.
- Validación de datos de entrada.
- Uso de tecnologías de código abierto.
- Análisis cualitativo del impacto ambiental durante el ciclo de vida del software.

##Estructura del proyecto

EcoRuta/
├── Documentacion/
│   ├── 01_Descripcion_Proyecto.pdf
│   ├── 02_Manual_Usuario.pdf
│   ├── 03_Evaluacion_Ambiental.pdf
│   ├── 04_Mantenimiento_Sostenible.pdf
│   └── 05_Responsabilidad_Social.pdf
├── src/
│   └── main/
│       └── java/
├── .gitignore
├── .gitattributes
├── pom.xml
└── README.md

##Instalación y ejecución

1. Descargar o clonar este repositorio.
2. Abrir el proyecto desde Apache NetBeans.
3. Verificar que se encuentre instalado Java 25.
4. Permitir que Maven descargue las dependencias necesarias.
5. Ejecutar la clase principal `EcoRuta.java`.

La aplicación prepara la base de datos SQLite local al iniciar.

##Documentación

El proyecto incluye los siguientes documentos:

1. Descripción general del proyecto.
2. Manual de usuario.
3. Evaluación del impacto ambiental.
4. Informe de mantenimiento sostenible.
5. Responsabilidad social.

##Responsabilidad social

EcoRuta busca fomentar decisiones de movilidad más conscientes, manteniendo un enfoque de transparencia en los cálculos y almacenamiento local de la información.

Los resultados representan estimaciones orientativas y no sustituyen mediciones ambientales certificadas.

##Proyecto académico

**Nombre:** EcoRuta  
**Área:** Ingeniería de Software Sostenible  
**Versión:** 1.0  
**Repositorio:** GitHub

---

*EcoRuta: pequeños cambios en la movilidad pueden contribuir a un futuro más sostenible.*
