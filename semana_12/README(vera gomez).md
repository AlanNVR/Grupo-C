# PFC Sistema Inteligente de Mantenimiento de Palma Africana — MDD con Visual Paradigm

**Asignatura:** Ingeniería de Requisitos (ISR-401) — UTEQ, 2026–2027 PPA
**Actividad:** GA — Exposición Segundo Corte: Herramientas CASE para la Generación de Código

**Equipo:**
- Castro Bajaña, Ariel Omar
- Mora Duarte, Alex José
- Villafuerte Rosero, Allan Noé
- Vera Gómez, Anthony Alfredo

## Descripción

Sistema Inteligente de Mantenimiento de Palma Africana. Este trabajo modela y genera
código para el subsistema de gestión de mantenimiento, con la clase `Palma` como
entidad central del dominio. [Completar con 2-3 líneas más sobre el alcance exacto
del subsistema modelado: actores, funcionalidad cubierta, etc.]

## Herramienta

Visual Paradigm [edición y versión exacta, ej. Community Edition 17.2]

## Requisitos previos

- SDK/lenguaje objetivo: [ej. Java 17 / JDK 17]
- Compilador / IDE: [ej. IntelliJ IDEA 2025.x]
- Sistema operativo probado: [ej. Windows 11]

## Estructura del repositorio

```
PFC-Sistema-MDD-Equipo/
├── README.md
├── docs/
│   ├── informe.tex
│   ├── informe.pdf
│   ├── referencias.bib
│   └── figuras/
├── modelo/
│   └── proyecto.vpp
├── perfiles/
├── plantillas/
├── generado/
├── evidencias/
│   ├── capturas/
│   └── video-demo.mp4      (o enlace más abajo)
└── exposicion/
    └── diapositivas.pdf
```

## Cómo reproducir

1. Clonar el repositorio:
   ```
   git clone https://github.com/USUARIO/PFC-Sistema-MDD-Equipo.git
   ```
2. Abrir `modelo/proyecto.vpp` en Visual Paradigm.
3. Ejecutar la generación: `Tools > Code > Instant Generator` (o la ruta exacta usada), aplicando la plantilla en `plantillas/`.
4. Abrir la carpeta `generado/` en el IDE, compilar y ejecutar [unidad demostrable, ej. la entidad principal / un endpoint / una prueba CRUD].

## Cómo compilar el informe

Desde la carpeta `docs/`:

```
pdflatex informe.tex
bibtex informe
pdflatex informe.tex
pdflatex informe.tex
```

(Se compila 3 veces para resolver referencias cruzadas y bibliografía.)

## Video demo

[Enlace al video o ruta: evidencias/video-demo.mp4]

## Responsabilidades por integrante

| Integrante | Responsabilidad principal |
|---|---|
| Ariel Castro Bajaña | Marco teórico (MDD/MDA/MDE) y criterios éticos de uso de IA |
| Alex Mora Duarte | Configuración del generador, proceso de generación y verificación del código |
| Allan Villafuerte Rosero | Modelado UML de origen y justificación de la herramienta |
| Anthony Vera Gómez | Roundtrip, documento LaTeX, organización del repositorio |

Historial de contribuciones verificable en: `Insights → Contributors` del repositorio.

## Repositorio

<https://github.com/USUARIO/PFC-Sistema-MDD-Equipo>
