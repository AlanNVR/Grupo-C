# Plantillas de generación de código

Esta carpeta documenta las plantillas utilizadas para generar código Java desde el modelo UML del proyecto **SIMPA: Sistema Inteligente de Mantenimiento de Palma Africana**.

## 1. Herramienta utilizada

La generación de código se realizó mediante **Visual Paradigm Community Edition 18.1**, utilizando la función **Instant Generator**.

El lenguaje objetivo configurado fue:

```text
Java
```

## 2. Plantillas utilizadas

Para esta actividad se utilizaron las plantillas estándar de generación de código Java incluidas en la instalación de Visual Paradigm.

El directorio local de las plantillas fue:

```text
C:\Program Files\Visual Paradigm CE 18.1\resources\instantgenerator\java
```

No se crearon ni modificaron plantillas personalizadas.

## 3. Justificación

Se conservaron las plantillas estándar porque permitieron generar correctamente:

- Las clases Java correspondientes al modelo UML.
- Los atributos y sus métodos getter y setter.
- La herencia entre las clases.
- Las asociaciones y colecciones.
- Los tipos de fecha mediante `java.time.LocalDate`.
- El archivo de construcción `build.xml`.

El resultado generado fue posteriormente compilado y validado sin modificar directamente las plantillas originales.

## 4. Contenido de la carpeta

```text
04_Plantillas/
└── README.md
```

No se incluyen copias físicas de las plantillas instaladas con Visual Paradigm, debido a que forman parte de los recursos estándar de la herramienta.

## 5. Consideraciones para futuras generaciones

En futuras regeneraciones se deberán mantener las siguientes medidas:

1. Utilizar la vista previa antes de generar el código.
2. Confirmar los archivos antes de sobrescribirlos.
3. Mantener separados el código generado y el código manual.
4. Realizar los cambios estructurales desde el modelo UML.
5. Validar nuevamente la compilación después de cada regeneración.
6. Evitar modificar las plantillas estándar sin una justificación documentada.

## 6. Conclusión

Las plantillas estándar de Java proporcionadas por Visual Paradigm fueron suficientes para generar la estructura base del modelo de SIMPA. Por esta razón, no fue necesario desarrollar plantillas personalizadas para la actividad.
