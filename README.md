<h1 align="center">Kata5P2 Histogram with bd-sqlite 🛢️</h1>

## Overview
Kata5P2 is a Java application that reads email addresses from an SQLite database, extracts the domain names, and creates a histogram to display the frequency of each domain. It is an extension of Kata3, now utilizing an SQLite database to store email addresses. 📧📊

# 👥 Development Team (Ctrl + Click to view profiles)

[![GitHub](https://img.shields.io/badge/GitHub-Alejandro%20David%20Arzola%20Saavedra-blue?style=flat-square&logo=github)](https://github.com/AlejandroDavidArzolaSaavedra)

## Table of Contents
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Classes](#classes)
- [License](#license)

## Prerequisites
To run Kata5P2, ensure you have the following installed:
- Java Development Kit (JDK) ☕
- SQLite database 🗃️
- JFreeChart library for chart generation 📈

## Installation
1. Clone or download the Kata5P2 project to your local machine.
2. Make sure you have the SQLite database (`mail.db`) in the specified path: `C:\Users\Lab-DIS\Documents\NetBeansProjects\kata5P2\mail.db`.
3. Open the project in a Java IDE, such as NetBeans.
4. Add the JFreeChart library to the project.

## Usage
1. Run the `Kata5P2` class, which contains the `main` method.
2. The application will read email addresses from the SQLite database, extract domain names, create a histogram, and display it using JFreeChart. 🚀

## Classes

### 1. Kata5P2 🚀
- **Main class**
- `execute()`: Entry point for the application, calling `input()`, `process()`, and `output()` in sequence.
- `input()`: Reads email addresses from the SQLite database and extracts domain names.
- `process()`: Builds a histogram of domain frequencies.
- `output()`: Displays the histogram using `HistogramDisplay`. 📉

### 2. Histogram\<T\> 📊
- **Generic class**
- Represents a histogram using a map to store frequencies of generic elements.
- Methods include `get(T key)`, `keySet()`, and `increment(T key)`.

### 3. Mail ✉️
- Represents an email address.
- Includes a `getDomain()` method to extract and return the domain from the email address.

### 4. HistogramDisplay 📈
- Extends `ApplicationFrame` from JFreeChart.
- Displays the histogram using JFreeChart with methods such as `execute()`, `createPanel()`, `createChart()`, and `createDataset()`. 🖥️

### 5. MailHistogramBuilder 🏗️
- Builds a histogram from a list of email addresses.

## 🤝 Contributions

Contributions are welcome! If you have suggestions, improvements, or corrections, feel free to submit pull requests. Diversity of ideas enriches the project.


### 6. MailListReaderBD 📚
- Reads email addresses from an SQLite database.
- Uses JDBC to connect to the database and retrieve data.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details. 📜
