# Energy Consumption System

Sistema desenvolvido em **Java** para gerenciamento de clientes e controle de consumo de energia, com operações CRUD e cálculo de tarifas baseado no consumo mensal.

## Objetivo

Projeto criado para praticar conceitos essenciais de desenvolvimento backend com Java, aplicando Programação Orientada a Objetos, organização em camadas e lógica de negócio.

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Collections Framework
- Exceptions Customizadas
- Estrutura MVC
- IDE Java (Eclipse)

## Funcionalidades

### Clientes

- Cadastrar cliente
- Listar clientes
- Buscar cliente por CPF
- Atualizar dados cadastrais
- Remover cliente

### Consumo de Energia

- Registrar consumo mensal
- Calcular valor da tarifa
- Associar consumo ao cliente
- Exibir informações de consumo

## Regras de Negócio

- CPF utilizado como identificador único
- Tarifação baseada na faixa de consumo
- Validação para registros duplicados
- Tratamento para listas vazias e buscas inválidas


## Autor

Desenvolvido por **Jhonatan Silva** como projeto de estudo focado em evolução técnica com Java, Programação Orientada a Objetos e boas práticas de desenvolvimento backend.

- GitHub: https://github.com/JhonOliv
- LinkedIn: https://linkedin.com/in/jhonatanosilva

## Estrutura do Projeto

```text
src/
├── controller
├── model
├── view
├── exception
└── main
