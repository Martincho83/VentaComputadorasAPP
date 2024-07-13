# 📋 VentaComputadorasAPP

## 📖 Descripción
VentaComputadorasAPP es una aplicación de consola que permite gestionar la venta de computadoras, agrupando diferentes componentes como monitores, teclados y ratones en órdenes de compra.

## 🌟 Características
- 🖱️ **Agregar Componentes**: Añade componentes como ratones, teclados y monitores.
- 🖥️ **Crear Computadora**: Agrupa componentes en una computadora.
- 📦 **Crear Orden**: Agrupa computadoras en una orden y muestra el detalle de la misma.

## 📝 Código Principal

### 📂 VentaComputadorasAPP.java
Define la clase principal `VentaComputadorasAPP` que realiza las siguientes operaciones:
- **Crear Componentes**: Crea instancias de ratones, teclados y monitores.
- **Crear Computadoras**: Agrupa los componentes en computadoras.
- **Crear Orden**: Agrupa las computadoras en una orden y muestra el detalle de la misma.

### 📂 Computadora.java
Define una clase `Computadora` con los siguientes atributos y métodos:
- **Atributos**: `idComputadora`, `nombre`, `monitor`, `teclado`, `raton`
- **Métodos**:
  - Constructor con parámetros `nombre`, `monitor`, `teclado`, `raton`
  - `toString()`: para una representación en cadena del objeto `Computadora`

### 📂 DispositivoEntrada.java
Clase base `DispositivoEntrada` para los dispositivos de entrada con los siguientes atributos y métodos:
- **Atributos**: `tipoDeEntrada`, `marca`
- **Métodos**:
  - Constructor con parámetros `tipoDeEntrada`, `marca`
  - `toString()`: para una representación en cadena del objeto `DispositivoEntrada`

### 📂 Monitor.java
Define una clase `Monitor` con los siguientes atributos y métodos:
- **Atributos**: `idMonitor`, `marca`, `tamanio`
- **Métodos**:
  - Constructor con parámetros `marca`, `tamanio`
  - `toString()`: para una representación en cadena del objeto `Monitor`

### 📂 Raton.java
Define una clase `Raton` que extiende de `DispositivoEntrada` con los siguientes atributos y métodos:
- **Atributos**: `idRaton`
- **Métodos**:
  - Constructor con parámetros `tipoDeEntrada`, `marca`
  - `toString()`: para una representación en cadena del objeto `Raton`

### 📂 Teclado.java
Define una clase `Teclado` que extiende de `DispositivoEntrada` con los siguientes atributos y métodos:
- **Atributos**: `idTeclado`
- **Métodos**:
  - Constructor con parámetros `tipoDeEntrada`, `marca`
  - `toString()`: para una representación en cadena del objeto `Teclado`

### 📂 Orden.java
Define una clase `Orden` con los siguientes atributos y métodos:
- **Atributos**: `idOrden`, `computadoras`
- **Métodos**:
  - Constructor para inicializar la lista de computadoras
  - `agregarComputadora(Computadora computadora)`: para agregar una computadora a la orden
  - `mostrarOrden()`: para mostrar el detalle de la orden

## ⚙️ Requisitos
- Java 8 o superior
- IDE recomendado: IntelliJ IDEA o Eclipse

## 🚀 Ejecución
1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/VentaComputadorasAPP.git
2. Importa el proyecto en tu IDE preferido.
3. Ejecuta la clase `VentaComputadorasAPP` para iniciar la aplicación.

## 🤝 Contribuciones
Si deseas contribuir a este proyecto, por favor realiza un fork del repositorio y crea un pull request con tus cambios.

## 👨‍💻 Autor
Martín - Desarrollador Principal - [Martincho83](https://github.com/Martincho83)
