# Perfiles UML

Esta carpeta documenta los perfiles y estereotipos utilizados en el modelo UML del proyecto SIMPA.

Se creó el perfil `Perfil_SIMPA` en Visual Paradigm, el cual contiene el estereotipo `Entity`. Este estereotipo tiene como tipo base `Class` y fue aplicado a las ocho clases del modelo:

- Usuario
- Administrador
- Trabajador
- Plantacion
- Lote
- Palma
- Labor
- RegistroClimatico

El perfil se encuentra integrado dentro del archivo nativo `SIMPA_MDD_Grupo_C.vpp`, ubicado en la carpeta `02_Modelo`. Su propósito es identificar semánticamente las clases principales del dominio. La generación de código Java se realiza a partir de la estructura UML del modelo.
