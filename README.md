# 💻Projeto: Sistema de pagamentos em java
Este é um projeto simples em java que que utiliza o conceito de **Programação Orientada a Objetos(POO)**, como o **polimorfismo**.

## ✅Objetivo
Demonstrar, de forma prática e simples, como o polimorfismo funciona em diferentes tipos de pagamentos(Boleto, cartão e Pix).

## 🗂️Estrutura do projeto
src/
├── entities/
|    ├── Pagamento.java            # Superclasse
|    ├── PagamentoPix.java         # Subclasse - pagamento via PIX
|    ├── PagamentoCartao.java      # Subclasse - pagamento via Cartão
|    ├── PagamentoBoleto.java      # Subclasse - pagamento via Boleto
|
└── application/
     └──Main.java                  # Classe que executa o programa

