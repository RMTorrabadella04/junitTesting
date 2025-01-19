# CLASES DE EQUIVALENCIA

## INTRODUCCIÓN DEL DNI AL REGISTRARSE

| Estado | Ejemplo                          | Notas                                                                                      |
|--------|----------------------------------|--------------------------------------------------------------------------------------------|
| MAL    | 77873378R                        |                                                                                            |
| BIEN   | 77873378S                        | Hay fallo en el uso de la letra del DNI, no comprueba que el uso de la letra sea equivalente al proceso de selección real |
| MAL    | 0                                |                                                                                            |
| MAL    | 0000000000                       |                                                                                            |
| MAL    | 000000000000A                    |                                                                                            |
| MAL    | AAAAAAAAA                        |                                                                                            |
| MAL    | #/*-+?¿                         |                                                                                            |

## MENÚ DE SELECCIÓN DE INGRESOS/GASTOS/SALIR

| Estado | Ejemplo                          |
|--------|----------------------------------|
| MAL    | 0                                |
| MAL    | 1                                |
| MAL    | 2                                |
| MAL    | P                                |
| MAL    | -1                               |
| MAL    | 3                                |
| MAL    | 11                               |
| MAL    | #/*-+?¿                         |

## MENÚ DE SELECCIÓN DE NÓMINA/VENTA SEGUNDA MANO

| Estado | Ejemplo                          |
|--------|----------------------------------|
| MAL    | Nómina                           |
| MAL    | Venta segunda mano               |
| MAL    | nómina                           |
| MAL    | nomina                           |
| MAL    | venta                            |
| MAL    | 0                                |
| MAL    | #/*-+?¿                         |

## MENÚ DE SELECCIÓN DE VACACIONES/ALQUILER/VICIOS

| Estado | Ejemplo                          |
|--------|----------------------------------|
| MAL    | Vacaciones                       |
| MAL    | Alquiler                         |
| MAL    | Vicios                           |
| MAL    | vacaciones                       |
| MAL    | alquiler                         |
| MAL    | vicios                           |
| MAL    | #/*-+?¿                         |
| MAL    | 0                                |

## INTRODUCIR CANTIDADES

| Estado | Ejemplo                          | Notas                                                                                      |
|--------|----------------------------------|--------------------------------------------------------------------------------------------|
| MAL    | 0                                | A la hora de poner el ingreso o gasto te deja poner 0, no se hasta qué punto este mal    |
| BIEN   | 100                              |                                                                                            |
| MAL    | -1                               |                                                                                            |
| MAL    | A                                |                                                                                            |

**PD**: Al hacer un ingreso este no se actualiza hasta que se hace un gasto.

*Raúl Martín Torrabadella Mendoza*
