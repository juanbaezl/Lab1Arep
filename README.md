# Titulo

TAREA INTRODUCCIÓN MVN-GIT Y HEROKU

## Descripción

En este repositorio se encontrara un programa que crea un servidor web, permitiendo multiples solicitudes seguidas concurrentes y consultando la api de Alphavantage y Polygon, para el caso de polygon, no se encuentra en el frontend, sin embargo este está implementado.

Para ver la implementación en Heroku dirijase [aquí](https://lab1arepp.herokuapp.com/)

### Prerrequisitos

Para correr este se debe tener instalado:

- Maven
- Java

### Guía de uso

Para compilar el proyecto se debe usar:

```
mvn package
```

Para ejecutarlo, se debe hacer de la siguiente forma:

Si está en windows:

```
$ java -cp target/classes;target/dependency/* co.edu.escuelaing.SparkWebApp
```

De otra forma:

```
$ java -cp target/classes:target/dependency/* co.edu.escuelaing.SparkWebApp
```

Una vez ejecute este comando podrá ingresar al servidor web desde su navegador con la siguiente ruta http://localhost:55000, en esta encontrará una página en el que podra ingresar al api de alphavantage y en otra un simple formulario para obtener un saludo

En caso de querer probar la concurrencia mencionada debe ejecutar el siguiente código:

```
$ java -cp target/classes;target/dependency/* co.edu.escuelaing.SparkWebApp [Número de peticiones a realizar]
```

En ambos casos se tiene una limitación a 10 hilos, luego de cumplir estos, se esperará en una cola a que pueda seguir la petición, debido a esto se recomienda no hacer una cantidad desmedida de peticiones puesto que puede llegar a demorarse bastante en dar respuesta a todas estas, tambien es de suma importancia aclarar que se cuenta con una cuenta gratuita de cada api, por lo que la consulta de cada una está limitada, en caso de pasarse del numero de peticiones posibles, dará error.

## Documentación

Para visualizar la documentación se debe ejecutar el siguiente comando:

```
mvn javadoc:javadoc
```

Una vez se realice este comando, se debe buscar en la siguiente ruta "target\site\apidocs\index.html"

## Estructura de Archivos

    .
    |____pom.xml
    |____src
    | |____main
    | | |____java
    | | | |____co
    | | | | |____edu
    | | | | | |____escuelaing
    | | | | | | |____SparkWebApp.java
    | | | | | | |____ApiGetter
    | | | | | | | |____APIClassGetter.java
    | | | | | | | |____Cache.java
    | | | | | | | |____APIGetter
    | | | | | | | | |____AlphaGetter.java
    | | | | | | | | |____Daily.java
    | | | | | | | | |____Intraday.java
    | | | | | | | | |____Monthly.java
    | | | | | | | | |____Weekly.java
    | | | | | | | |____ApiPolygon
    | | | | | | | | |____Aggregates.java
    | | | | | | | | |____OpenClose.java
    | | | | | | | | |____PolyGetter.java
    | | | | | | | | |____PrevousClose.java
    | | | | | | | |____Test
    | | | | | | | | |____APITestConcurrency.java
    | | | | | | | | |____TestRequest.java

## Construido con

- [Maven](https://maven.apache.org/) - Dependency Management
- [Java](https://www.java.com/es/) - Progamming Language

## Autor

- **Juan Carlos Baez Lizarazo** - [juanbaezl](https://github.com/juanbaezl)

## Fecha

29 de Agosto, 2022

## Licencia

Para más información ver: [LICENSE.txt](License.txt)
