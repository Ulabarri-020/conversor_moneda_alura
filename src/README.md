# 💱 Conversor de Monedas

![GitHub last commit](https://img.shields.io/github/last-commit/TU_USUARIO/TU_REPO)
![GitHub issues](https://img.shields.io/github/issues/TU_USUARIO/TU_REPO)
![GitHub license](https://img.shields.io/github/license/TU_USUARIO/TU_REPO)
![Java](https://img.shields.io/badge/java-17+-orange)

Aplicación en **Java** que convierte entre divisas en tiempo real usando la API de [ExchangeRate-API](https://www.exchangerate-api.com/).  
Incluye sitio de documentación generado con **Docusaurus**.

---

## 🚀 Características

- ✅ Conversión USD ↔ ARS / BRL / COP
- ✅ Actualización en vivo mediante API
- ✅ CLI interactiva con menú en bucle
- ✅ Documentación propia en `/docs` (Docusaurus)

---

## 📦 Requisitos

| Herramienta | Versión |
|-------------|---------|
| Java        | 17+     |
| Gson        | 2.10.1  |


> Añade Gson a tu *build* (Maven/Gradle) o copia el JAR al `classpath`.

---

## 🧑‍💻 Uso rápido

```bash
git clone https://github.com/TU_USUARIO/TU_REPO.git
cd conversor-monedas

# Compilar
javac -cp "lib/gson-2.10.1.jar" src/*.java

# Ejecutar
java -cp "lib/gson-2.10.1.jar:src" principal
