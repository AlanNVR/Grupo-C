# PFC Sistema Inteligente de Mantenimiento de Palma Africana — MDD con Visual Paradigm

**Asignatura:** Ingeniería de Requisitos
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

Visual Paradigm [18.0]

## Requisitos previos

- lenguaje objetivo: C#/.NET
- Compilador: Visual Studio
- Sistema operativo probado: Windows 11

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
│   └── video-demo.mp4 
└── exposicion/
    └── diapositivas.pdf
```

## Cómo reproducir

1. Clonar el repositorio:
   
   git clone https://github.com/AlanNVR/Grupo-C
   
2. Abrir `modelo/proyecto.vpp` en Visual Paradigm.
3. Ejecutar la generación: `Tools > Code > Instant Generator` (o la ruta exacta usada), aplicando la plantilla en `plantillas/`.
4. Abrir la carpeta `generado/` en el IDE, compilar y ejecutar.

## Cómo compilar el informe

Desde la carpeta `docs/`:

```
pdflatex informe.tex
bibtex informe
pdflatex informe.tex
pdflatex informe.tex
```
## Video demo

falta poner el enlace del video

## Responsabilidades por integrante

Integrante y Responsabilidad principal 
Ariel Castro Bajaña: Marco teórico (MDD/MDA/MDE) y criterios éticos de uso de IA
Alex Mora Duarte: Configuración del generador, proceso de generación y verificación del código.
Allan Villafuerte Rosero: Modelado UML de origen y justificación de la herramienta.
Anthony Vera Gómez: Roundtrip, documento LaTeX, organización del repositorio.

## Repositorio

[<https://github.com/AlanNVR/Grupo-C>]
