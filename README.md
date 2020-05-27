## Grafos aleatorios

Este es un pequeño ejemplo realizado en Java, que nos permite visualizar grafos aleatorios usando la librería  [GraphStream](http://graphstream-project.org/doc/Tutorials/Getting-Started/1.0/)

En la línea 10 de nuestra clase Main, definimos el promedio de aristas que tendrá cada nodo del grafo

```
Generator gen = new RandomGenerator(3);
```
Y en el ciclo for de la línea 13 generamos la cantidad de nodos que queramos.

Al final nos va a generar unas imágenes interactivas que permiten mover cada uno de los nodos.

A continuación dejamos 4 ejemplos generados con este código

![Grafo con 100 nodos y en promedio 1 arista por cada nodo](https://raw.githubusercontent.com/hdmoncaleanos/RandomGraph/master/GrafoAleatorio/img/Grafo_1.png)

![Grafo con 100 nodos y en promedio 3 aristas por cada nodo](https://raw.githubusercontent.com/hdmoncaleanos/RandomGraph/master/GrafoAleatorio/img/Grafo_2.png)

![Grafo con 1000 nodos y en promedio 1 arista por cada nodo](https://raw.githubusercontent.com/hdmoncaleanos/RandomGraph/master/GrafoAleatorio/img/Grafo_3.png)

![Grafo con 1000 nodos y en promedio 3 aristas por cada nodo](https://raw.githubusercontent.com/hdmoncaleanos/RandomGraph/master/GrafoAleatorio/img/Grafo_4.png)
