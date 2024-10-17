# Repositorio de Árbol de Búsqueda Binario

Este repositorio contiene una implementación básica de un Árbol de Búsqueda Binario (Binary Search Tree, BST) en Java 17. El árbol se utiliza para almacenar datos de manera ordenada, lo que permite realizar búsquedas y inserciones eficientes.

## Contenido

El código en este repositorio incluye las siguientes funciones:

- `insert(int value)`: Inserta un nuevo valor en el árbol.
- `search(int value)`: Busca un valor en el árbol 

## Estructura del Árbol de Búsqueda Binario

Un Árbol de Búsqueda Binario es una estructura de datos en forma de árbol donde cada nodo tiene como máximo dos hijos. Para cada nodo:

- Los valores en el subárbol izquierdo son menores que el valor del nodo.
- Los valores en el subárbol derecho son mayores que el valor del nodo.

Esta propiedad permite realizar búsquedas, inserciones y eliminaciones de manera eficiente.

## Instalación

Para utilizar este repositorio, simplemente clona el proyecto y asegúrate de tener Java 17 instalado en tu sistema.

```bash
git clone https://github.com/tu_usuario/arbol-busqueda-binario.git
cd arbol-busqueda-binario


## Uso

public class Main {
    public static void main(String[] args) {
        BinarySearchTree arbol = new BinarySearchTree();

        arbol.insert(10);
        arbol.insert(5);
        arbol.insert(15);

        // Buscar valores
        System.out.println(arbol.search(10));  // Salida: Info del nodo existe
        System.out.println(arbol.search(7));   // Salida: Excepcion mostrando que no existe
    }
}
