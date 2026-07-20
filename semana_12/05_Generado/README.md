# Código generado y unidad demostrable de SIMPA

Esta carpeta contiene el código Java obtenido mediante el generador de código de Visual Paradigm a partir del modelo UML del proyecto **SIMPA: Sistema Inteligente de Mantenimiento de Palma Africana**.

La generación se realizó utilizando el paquete:

```text
ec.edu.uteq.simpa.modelo
```

## 1. Estructura de la carpeta

```text
05_Generado/
├── codigo_generado/
│   ├── build.xml
│   └── ec/
│       └── edu/
│           └── uteq/
│               └── simpa/
│                   └── modelo/
│                       ├── Administrador.java
│                       ├── Labor.java
│                       ├── Lote.java
│                       ├── Palma.java
│                       ├── Plantacion.java
│                       ├── RegistroClimatico.java
│                       ├── Trabajador.java
│                       └── Usuario.java
├── codigo_manual/
│   └── ec/
│       └── edu/
│           └── uteq/
│               └── simpa/
│                   └── demo/
│                       ├── Main.java
│                       └── LoteCrud.java
├── Informe_generacion_codigo.tex
└── README.md
```

## 2. Código generado por Visual Paradigm

La carpeta `codigo_generado` contiene ocho clases Java producidas automáticamente a partir del modelo UML de SIMPA.

El código generado conserva los siguientes elementos del modelo:

- La clase abstracta `Usuario`.
- La herencia de `Administrador` y `Trabajador` respecto de `Usuario`.
- Los atributos definidos en las clases UML.
- Los métodos getter y setter.
- Las relaciones entre las entidades.
- Las multiplicidades de varios elementos mediante colecciones `ArrayList`.
- Los atributos de fecha mediante `java.time.LocalDate`.
- El archivo de construcción `build.xml`.

Algunas operaciones modeladas fueron generadas como esqueletos con la instrucción:

```java
throw new UnsupportedOperationException();
```

Estas operaciones no producen errores durante la compilación, pero requieren una implementación manual antes de ser ejecutadas.

## 3. Código manual

La carpeta `codigo_manual` se mantiene separada de `codigo_generado` para evitar que las modificaciones manuales sean sobrescritas durante una regeneración desde Visual Paradigm.

Contiene los siguientes archivos:

- `Main.java`: unidad demostrable que instancia y relaciona las entidades de SIMPA.
- `LoteCrud.java`: implementación manual de operaciones Create, Read, Update y Delete en memoria para la entidad `Lote`.

Las clases generadas por Visual Paradigm no fueron modificadas directamente.

## 4. Requisitos del entorno

La validación se realizó en Windows mediante CMD con las siguientes versiones:

```text
java 21.0.9 LTS
javac 21.0.9
```

La configuración del generador se estableció para Java 8 o superior, por lo que el código fue compatible con el entorno instalado.

## 5. Compilación inicial del código generado

### 5.1 Ruta de trabajo

Abrir CMD desde la siguiente carpeta:

```text
05_Generado\codigo_generado
```

### 5.2 Eliminar una compilación anterior

```cmd
if exist bin rmdir /s /q bin
```

### 5.3 Crear la carpeta de salida

```cmd
mkdir bin
```

### 5.4 Compilar las ocho clases generadas

```cmd
javac -encoding UTF-8 -d bin ec\edu\uteq\simpa\modelo\*.java
```

### 5.5 Verificar los archivos compilados

```cmd
dir /s /b bin\*.class
```

La compilación inicial produjo correctamente ocho archivos `.class`, uno por cada clase generada.

Evidencia relacionada:

```text
EV20_Resultado_compilacion_inicial_clases_Java.png
```

## 6. Creación de la unidad demostrable

El archivo manual se creó en:

```text
codigo_manual\ec\edu\uteq\simpa\demo\Main.java
```

`Main.java` demuestra:

- Creación de objetos.
- Uso de getters y setters.
- Herencia de `Administrador` y `Trabajador`.
- Relaciones entre plantación, lote, palma, labor y registro climático.
- Uso del tipo `LocalDate`.
- Uso de colecciones generadas.

Evidencia relacionada:

```text
EV21_Creacion_unidad_demostrable_Main_Java.png
```

## 7. Compilación conjunta del código generado y Main.java

### 7.1 Ruta de trabajo

Abrir CMD desde:

```text
05_Generado
```

### 7.2 Eliminar una compilación demostrable anterior

```cmd
if exist bin_demo rmdir /s /q bin_demo
```

### 7.3 Crear la carpeta de salida

```cmd
mkdir bin_demo
```

### 7.4 Compilar las ocho clases generadas y Main.java

```cmd
javac -encoding UTF-8 -d bin_demo codigo_generado\ec\edu\uteq\simpa\modelo\*.java codigo_manual\ec\edu\uteq\simpa\demo\Main.java
```

### 7.5 Verificar los archivos compilados

```cmd
dir /s /b bin_demo\*.class
```

Esta compilación produjo nueve archivos `.class`:

- Ocho clases del modelo.
- `Main.class`.

Evidencia relacionada:

```text
EV22_Compilacion_conjunta_codigo_generado_y_Main_Java.png
```

## 8. Ejecución inicial de la unidad demostrable

### 8.1 Ejecutar Main.java

Desde la carpeta `05_Generado`:

```cmd
java -cp bin_demo ec.edu.uteq.simpa.demo.Main
```

La ejecución mostró correctamente información de:

- Administrador.
- Plantación.
- Lote.
- Palma.
- Trabajador.
- Labor.
- Registro climático.

Evidencia relacionada:

```text
EV23_Ejecucion_exitosa_unidad_demostrable_SIMPA.png
```

## 9. Implementación del CRUD manual

Se creó el archivo:

```text
codigo_manual\ec\edu\uteq\simpa\demo\LoteCrud.java
```

El CRUD trabaja en memoria mediante una colección `ArrayList` y contiene las siguientes operaciones:

- `crear`: registra un lote.
- `buscarPorId`: consulta un lote por identificador.
- `listar`: devuelve los lotes registrados.
- `actualizar`: modifica los datos de un lote.
- `eliminar`: elimina un lote.

Evidencia relacionada:

```text
EV24_Implementacion_CRUD_manual_entidad_Lote.png
```

## 10. Compilación del CRUD

### 10.1 Ruta de trabajo

Abrir CMD desde:

```text
05_Generado
```

### 10.2 Eliminar una compilación anterior del CRUD

```cmd
if exist bin_crud rmdir /s /q bin_crud
```

### 10.3 Crear la carpeta de salida

```cmd
mkdir bin_crud
```

### 10.4 Compilar las clases generadas y todos los archivos manuales

```cmd
javac -encoding UTF-8 -d bin_crud codigo_generado\ec\edu\uteq\simpa\modelo\*.java codigo_manual\ec\edu\uteq\simpa\demo\*.java
```

### 10.5 Verificar los archivos compilados

```cmd
dir /s /b bin_crud\*.class
```

La compilación produjo diez archivos `.class`:

- Ocho clases generadas.
- `Main.class`.
- `LoteCrud.class`.

Evidencia relacionada:

```text
EV25_Compilacion_CRUD_SIMPA.png
```

## 11. Ejecución del CRUD

### 11.1 Ejecutar la unidad demostrable

Desde la carpeta `05_Generado`:

```cmd
java -cp bin_crud ec.edu.uteq.simpa.demo.Main
```

La ejecución demostró correctamente las cuatro operaciones CRUD:

- CREATE: registro de un lote.
- READ: consulta del lote mediante su identificador.
- UPDATE: modificación del código, área y etapa del lote.
- DELETE: eliminación del lote.
- Verificación final de que el lote dejó de existir.

Evidencia relacionada:

```text
EV26_Ejecucion_CRUD_entidad_Lote_SIMPA.png
```

## 12. Resultado de la validación

Las siguientes validaciones finalizaron correctamente:

- Compilación de las ocho clases generadas.
- Compilación conjunta con `Main.java`.
- Ejecución de la demostración inicial.
- Compilación del CRUD manual.
- Ejecución completa de las operaciones Create, Read, Update y Delete.
- Uso del código generado sin modificar directamente sus archivos.
- Separación entre código generado y código manual.

## 13. Política de regeneración

Para futuras regeneraciones se aplicará la siguiente política:

1. Utilizar la opción Preview antes de generar código.
2. Mantener activa la confirmación antes de sobrescribir archivos.
3. Realizar cambios estructurales desde el modelo UML.
4. No editar directamente el código generado cuando el cambio pueda realizarse desde el modelo.
5. Mantener separado el código generado del código manual.
6. Validar la compilación después de cada regeneración.
7. Evitar sobrescribir modificaciones realizadas manualmente.
8. Conservar las evidencias de configuración, generación, compilación y ejecución.
9. Probar los archivos localmente antes de copiarlos al repositorio.
10. Registrar los cambios mediante commits separados y trazables.

## 14. Informe de generación de código

El archivo `Informe_generacion_codigo.tex` contiene la documentación correspondiente a la configuración del generador de Visual Paradigm, la generación del código Java, la compilación, la ejecución de la unidad demostrable, la correspondencia entre el modelo UML y el código, la evaluación de calidad y la política de regeneración.

Este archivo se mantiene como un fragmento LaTeX para incorporarlo en el documento grupal mediante:

```latex
\input{Informe_generacion_codigo}
```

La numeración de la sección y de sus subsecciones se ajustará automáticamente según la ubicación en la que se incluya dentro del documento principal.

## 15. Archivos excluidos del repositorio

No se incluyen carpetas ni archivos derivados de la compilación:

```text
bin/
bin_demo/
bin_crud/
*.class
```

Tampoco se incluyen archivos ZIP duplicados del código.

Estos elementos pueden regenerarse localmente mediante los comandos documentados anteriormente.

## 16. Evidencias relacionadas

Las evidencias de este proceso se almacenan en la carpeta:

```text
06_Evidencias
```

Las evidencias correspondientes a la generación, compilación y ejecución comprenden desde EV14 hasta EV26.