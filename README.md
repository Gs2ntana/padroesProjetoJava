# Projeto de Gerenciamento de Conexões com Banco de Dados

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

## Visão Geral

Este projeto demonstra uma implementação simples do padrão de design Singleton para gerenciar conexões com banco de dados em Java. O padrão Singleton garante que apenas uma instância de uma classe seja criada e fornece um ponto de acesso global a ela.

## Funcionalidades

- **Padrão de Design Singleton**: Garante uma única instância de `DatabaseConnection` em toda a aplicação.
- **Banco de Dados MySQL**: Conecta-se a um banco de dados MySQL usando JDBC.
- **Pooling de Conexões**: Gerencia conexões com o banco de dados de forma eficiente.

## Instalação

Para executar este projeto localmente, certifique-se de ter o seguinte configurado:

- Java Development Kit (JDK) instalado
- Maven instalado (para gerenciamento de dependências)

### Clonar o Repositório

```bash
git clone https://github.com/Gs2ntana/padroesProjetoJava.git
cd padroesProjetoJava