# Trabajo Árboles

## 📌 Información General

- **Título:** Árbol AVL
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Usabel Ullauri, Jonnathan Saavedra
- **Fecha:** 1 de julio del 2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

### Funcionalidades Principales
Esta implementación del Árbol AVL incluye las siguientes funcionalidades principales:

#### Inserción de Nodos: 
El método insert(int value) se encarga de añadir nuevos elementos al árbol. Durante la inserción, el árbol realiza automáticamente las operaciones de reequilibrio necesarias para mantener las propiedades del AVL.

#### Cálculo de Altura: 
El método height(Node node) calcula la altura del subárbol de un nodo dado. Esta es una función de utilidad crucial utilizada internamente para los cálculos del factor de equilibrio.

#### Cálculo del Factor de Equilibrio: 
El método getBalance(Node node) determina el factor de equilibrio de un nodo comparando las alturas de sus subárboles izquierdo y derecho. Este factor es crítico para identificar desequilibrios que requieren rotación.

#### Rotaciones del Árbol: 
El proyecto incluye implementaciones para las rotaciones fundamentales del árbol AVL:

#### rotateRight(Node y): 
Realiza una rotación a la derecha para reequilibrar un subárbol cargado a la izquierda.

#### rotateLeft(Node x): 
Realiza una rotación a la izquierda para reequilibrar un subárbol cargado a la derecha. 
Las combinaciones de estas (rotaciones izquierda-derecha y derecha-izquierda) se manejan dentro del método insertRec para abordar escenarios de desequilibrio más complejos.
---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Salida

```plaintext
---RunHashSet---
Nodo a insertar: 
Nodo insertado: 10Balance a insertar: 0
Nodo a insertar: 
Nodo insertado: 20Balance a insertar: 0
Node actual: 10
	 Altura = 2
	 Balance = -1
```
---
## 📚 Créditos
Trabajo realizado por Usabel Ullauri y Jonnathan Saavedra, estudiantes de la carrera de Computación. Este proyecto es parte del curso de Estructura de Datos bajo la supervisión del Ing. Pablo Torres.