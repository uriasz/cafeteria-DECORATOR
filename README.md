![28984f7d31ed9946afc5a8074dc27237-ezgif com-resize](https://github.com/user-attachments/assets/66dc9747-11ef-442b-8786-28eaeabf8efc)


# ୨୧ Sistema de Café - Decorator

Este repositório contém uma implementação do padrão de design **Decorator** em Java para criar e modificar pedidos de café de forma modular. O padrão Decorator permite que as funcionalidades (como adicionar leite, chocolate, chantilly) sejam adicionadas ao café de forma flexível, sem a necessidade de alterar a classe base `CafeBase`. O código também inclui testes unitários com JUnit 5 para validar as funcionalidades.

##  Funcionalidade

O sistema permite criar um café simples e adicionar diversos complementos de forma dinâmica. Cada complemento é representado por um **decorador**, e a composição dos decoradores resulta em um café com preço e descrição ajustados.

### Exemplos de funcionalidades:

- ♡ **Café Simples**: Um café básico sem aditivos.
- ♡ **Café com Leite**: Um café simples com leite.
- ♡ **Café com Chocolate**: Um café simples com chocolate.
- ♡ **Café com Chantilly**: Um café simples com chantilly.
- ♡ **Composição de Decoradores**: Combinação de múltiplos complementos no mesmo café.

##  Arquitetura do Projeto

Este projeto implementa o padrão de design **Decorator** para estender as funcionalidades de um café simples de maneira flexível e modular. O sistema é composto pelas seguintes classes principais:

- ♡ `Cafe`: Interface que define os métodos essenciais de um café.
- ♡ `CafeBase`: Implementação da interface `Cafe` que representa o café simples.
- ♡ `CafeDecorator`: Classe abstrata que serve como base para todos os decoradores de café.
- ♡ `ComLeite`, `ComChocolate`, `ComChantilly`: Decoradores concretos que adicionam complementos ao café.
- ♡ `Main`: Classe principal que exemplifica o uso do sistema e gera o resumo do pedido.
- ♡ `CafeTest`: Testes unitários usando JUnit 5 para validar todas as funcionalidades.

##  Instalação

### Pré-requisitos

Antes de rodar o projeto, certifique-se de ter o Java 11 ou superior e Maven ou Gradle configurado na sua máquina.

### Passos para rodar o projeto:

1. Clone este repositório para a sua máquina local:

   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   cd nome-do-repositorio
   ```

2. Compile o projeto com Maven:

   ```bash
   mvn clean install
   ```

3. Rode os testes unitários para garantir que tudo esteja funcionando corretamente:

   ```bash
   mvn test
   ```

4. Para rodar o código e ver o resultado no console (sem a parte gráfica), basta executar a classe `Main`:

   ```bash
   mvn exec:java -Dexec.mainClass="Main"
   ```

---

##  Testes

Este projeto vem com **testes automatizados** implementados em **JUnit 5** para garantir que todas as funcionalidades estão funcionando corretamente.

### Testes Implementados:

- ♡ **Preço e descrição do café simples**
- ♡ **Preço e descrição de cada decorador**
- ♡ **Composição de múltiplos decoradores**
- ♡ **Verificação da ordem dos decoradores e impacto no preço e descrição**
- ♡ **Validação da geração de resumo do pedido**

### Para rodar os testes, use:

```bash
mvn test
```

---

##  Exemplos de Uso

Aqui está um exemplo de como usar o sistema para criar um café com leite, chocolate e chantilly.

```java
public class Main {
    public static void main(String[] args) {
        Cafe meuCafe = new CafeBase();
        meuCafe = new ComLeite(meuCafe);
        meuCafe = new ComChocolate(meuCafe);
        meuCafe = new ComChantilly(meuCafe);

        String resumo = gerarResumoPedido(meuCafe);
        System.out.println(resumo); // Exibe o resumo do pedido
    }

    public static String gerarResumoPedido(Cafe cafe) {
        double preco = cafe.getPreco();
        String precoFormatado = String.format("R$ %.2f", preco);
        return String.format("Pedido: %s\nPreço: %s", cafe.getDescricao(), precoFormatado);
    }
}
```

O código acima cria um **café simples**, adiciona **leite**, **chocolate** e **chantilly**, e então gera um resumo do pedido.

### Exemplo de saída:
```
Pedido: Café simples, leite, chocolate, chantilly
Preço: R$ 11.00
```

---

##  Estrutura do Projeto

```
src/
  Cafe.java           # Interface do Café
  CafeBase.java       # Implementação do Café Simples
  CafeDecorator.java  # Decorador Abstrato
  ComLeite.java       # Decorador para adicionar leite
  ComChocolate.java   # Decorador para adicionar chocolate
  ComChantilly.java   # Decorador para adicionar chantilly
  Main.java           # Classe principal para exemplificar o uso
test/
  CafeTest.java       # Testes unitários em JUnit 5
```

##  Melhorias Futuras

- ♡ **Interface gráfica**: Integrar o sistema com uma interface gráfica simples para interação com o usuário.
- ♡ **Mais tipos de decoradores**: Criar novos decoradores como "Com Açúcar", "Com Baunilha", etc.
- ♡ **Suporte para diferentes tipos de café**: Implementar variações como "Cappuccino", "Latte", etc.
- ♡ **Persistência**: Salvar os pedidos e seus detalhes em banco de dados ou arquivos.


##  Contribuindo

Contribuições são bem-vindas! Se você encontrou algum erro ou tem sugestões de melhorias, fique à vontade para abrir um **issue** ou enviar um **pull request**.

1. Faça um **fork** do repositório.
2. Crie uma nova **branch** para suas alterações (`git checkout -b minha-feature`).
3. **Commit** suas alterações (`git commit -am 'Adicionando nova feature'`).
4. Faça o **push** da sua branch (`git push origin minha-feature`).
5. Abra um **pull request**.

---

##  Licença

Este projeto está licenciado sob a **MIT License** - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

###  Finalizando

Este projeto exemplifica o uso do padrão Decorator para adicionar funcionalidades de maneira flexível e reutilizável. Através de testes unitários, garantimos que cada modificação no sistema seja corretamente validada. Se você quiser aprender mais sobre o padrão de design Decorator ou sobre como usá-lo em projetos Java, sinta-se à vontade para explorar o código ou contribuir com melhorias.
