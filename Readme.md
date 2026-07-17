# Generics

**Descripció**:  
Aquest projecte té com a objectiu aprendre i practicar l'ús dels **Generics** en Java. S'implementen classes i mètodes genèrics per entendre com treballar amb diferents tipus de dades de forma segura, reutilitzable i flexible.

---

## 📌 Enunciat de l'exercici

### Exercici 1 — Classe sense genèrics

Crear una classe `NoGenericMethods` que emmagatzemi tres arguments del mateix tipus, amb:

- Un constructor que els inicialitzi.
- Els mètodes `getElement1()`, `getElement2()` i `getElement3()`.

Comprovar que els arguments es poden passar en qualsevol ordre al constructor.

### Exercici 2 — Mètode genèric amb paràmetres diversos

Crear una classe `Person` amb els atributs:

- `name`
- `surname`
- `age`

Crear una classe `GenericMethods` amb un mètode genèric `printElements()` capaç d'acceptar tres paràmetres de tipus diferents i mostrar-los per pantalla.

Comprovar des del `main()` que el mètode funciona amb diferents combinacions de tipus.

---

## ✨ Funcionalitats

- Creació d'una classe sense utilitzar Generics.
- Ús de constructors i getters.
- Creació d'una classe `Person`.
- Implementació d'un mètode genèric.
- Impressió d'objectes de diferents tipus mitjançant Generics.
- Comprovació del funcionament amb diferents combinacions de paràmetres.

---

## 🛠 Tecnologies

- Java 26
- Maven
- IntelliJ IDEA

---

## 🚀 Instal·lació i Execució

1. Clonar el repositori:

```bash
git clone https://github.com/ArnauCasals/Generics.git
```

2. Entrar al projecte:

```bash
cd Generics
```

3. Compilar el projecte:

```bash
mvn compile
```

4. Executar l'aplicació des d'IntelliJ IDEA o amb Maven.

---

## 📸 Demo

### Exercici 1

```
Tres
Uno
Dos
```

### Exercici 2

```
Person{name='Arnau', surname='Casals', age=33}
Hola
25
```

---

## 🧩 Diagrames i justificació de decisions tècniques

S'han utilitzat atributs privats per aplicar el principi d'encapsulació i controlar l'accés a les dades mitjançant getters.

L'exercici diferencia una implementació tradicional (`NoGenericMethods`) d'una implementació basada en Generics (`GenericMethods`), demostrant que un únic mètode genèric pot treballar amb diferents tipus d'objectes sense necessitat de crear múltiples versions del mateix mètode.

## 📁 Estructura del projecte

```text
.
├── README.md
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── Level1
│   │   │       ├── GenericMethods.java
│   │   │       ├── Main.java
│   │   │       ├── NoGenericMethods.java
│   │   │       └── Person.java
│   │   └── resources
│   └── test
│       └── java
└── target
    ├── classes
    │   └── Level1
    │       ├── GenericMethods.class
    │       ├── Main.class
    │       ├── NoGenericMethods.class
    │       └── Person.class
    └── generated-sources
        └── annotations
```