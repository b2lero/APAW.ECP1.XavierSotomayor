
## Practica Arquitectura y Patrones

### Patrones utilizados
* Factory
* Singleton
* Builder
* Composite
* Observer
* Strategy

### Patron Strategy

Encapsula algoritmos en clases, permitiendo que éstos sean re-utilizados e intercambiables.
En base a un parámetro, que puede ser cualquier objeto, permite a una aplicación
decidir en tiempo de ejecución el algoritmo que debe ejecutar. 

![pattern strategy uml](http://stacktips.com/wp-content/uploads/2015/01/Strategy-Design-Pattern-Java.png)


#### SortingStrategy
> Declara una interfaz común a todos los algoritmos soportados.

#### InsertionSort/SelectionSort
> implementa un algoritmo utilizando la interfaz Strategy. Es la representación de un algoritmo.

#### SortingContext
> mantiene una referencia a Strategy y según las características del contexto, optará por una estrategia determinada.
