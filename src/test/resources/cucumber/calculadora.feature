Feature: Calculadora
  As um usuario
  Eu quero usar uma calculadora
  Para que eu n�o precise calcular por mim mesmo.

  Scenario: Adicionar dois numeros
    Given eu tenho uma calculadora
    When eu somo 2 e 3
    Then o resultado deve ser 5