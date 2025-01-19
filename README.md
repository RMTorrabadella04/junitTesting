<div align="center">

# CLASES DE EQUIVALENCIA

## INTRODUCCIÓN DEL DNI AL REGISTRARSE

</div>

| Estado | Ejemplo           | Notas                                                                                           |
|--------|-------------------|-------------------------------------------------------------------------------------------------|
| BIEN   | 77873378R         |                                                                                                 |
| BIEN   | 77873378S         | Debería estar MAL - Hay fallo en el uso de la letra del DNI, no se comprueba que la letra sea equivalente al proceso de selección real |
| MAL    | 0                 |                                                                                                 |
| MAL    | 0000000000        |                                                                                                 |
| MAL    | 000000000000A     |                                                                                                 |
| MAL    | AAAAAAAAA         |                                                                                                 |
| MAL    | #/*-+?¿           |                                                                                                 |

<div align="center">

## MENÚ DE SELECCIÓN DE INGRESOS/GASTOS/SALIR

</div>

| Estado | Ejemplo           |
|--------|-------------------|
| BIEN   | 0                 |
| BIEN   | 1                 |
| BIEN   | 2                 |
| MAL    | P                 |
| MAL    | -1                |
| MAL    | 3                 |
| MAL    | 11                |
| MAL    | #/*-+?¿           |

<div align="center">

## MENÚ DE SELECCIÓN DE NÓMINA/VENTA SEGUNDA MANO

</div>

| Estado | Ejemplo               |
|--------|-----------------------|
| BIEN   | Nómina                |
| BIEN   | Venta segunda mano    |
| MAL    | nómina                |
| MAL    | nomina                |
| MAL    | venta                 |
| MAL    | 0                     |
| MAL    | #/*-+?¿               |

<div align="center">

## MENÚ DE SELECCIÓN DE VACACIONES/ALQUILER/VICIOS

</div>

| Estado | Ejemplo     |
|--------|-------------|
| BIEN   | Vacaciones  |
| BIEN   | Alquiler    |
| BIEN   | Vicios      |
| MAL    | vacaciones  |
| MAL    | alquiler    |
| MAL    | vicios      |
| MAL    | #/*-+?¿     |
| MAL    | 0           |

<div align="center">

## INTRODUCIR CANTIDADES

</div>

| Estado | Ejemplo | Notas                                                                                      |
|--------|---------|--------------------------------------------------------------------------------------------|
| BIEN   | 0       | Debería estar MAL - A la hora de poner el ingreso o gasto te deja poner 0                  |
| BIEN   | 100     |                                                                                             |
| MAL    | -1      |                                                                                             |
| MAL    | A       |                                                                                             |

<div align="center">

**PD**: Al hacer un ingreso este no se actualiza hasta que se hace un gasto.

*Raúl Martín Torrabadella Mendoza*

</div>
