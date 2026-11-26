# LlanquihueTourApp - Semana 6

## Objetivo de la semana
Se creó una jerarquía de clases para los servicios turísticos usando herencia simple (`extends`), el constructor de la superclase con `super(...)` y la sobrescritura de `toString()`.

## Clases creadas
- **model**
  - `ServicioTuristico`: superclase con `nombre` y `duracionHoras`.
  - `RutaGastronomica`: agrega `numeroDeParadas`.
  - `PaseoLacustre`: agrega `tipoEmbarcacion`.
  - `ExcursionCultural`: agrega `lugarHistorico`.
- **data**
  - `GestorServicios`: crea los 6 servicios de prueba y los devuelve en una lista.
- **ui**
  - `Main`: recorre la lista e imprime cada servicio por consola.

## Cómo ejecutar
1. Abrir el proyecto `LlanquihueTourApp` en NetBeans.
2. Ejecutar la clase `ui.Main` (no `app.Main`, que es de la semana 5).
3. Se muestran 6 líneas por consola, una por servicio.
