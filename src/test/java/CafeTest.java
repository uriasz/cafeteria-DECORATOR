import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CafeTest {

    @Test
    public void testCafeBasePreco() {
        Cafe cafe = new CafeBase();
        assertEquals(5.0, cafe.getPreco(), 0.01);
    }

    @Test
    public void testCafeBaseDescricao() {
        Cafe cafe = new CafeBase();
        assertEquals("Café simples", cafe.getDescricao());
    }

    @Test
    public void testComLeitePreco() {
        Cafe cafe = new ComLeite(new CafeBase());
        assertEquals(6.5, cafe.getPreco(), 0.01);
    }

    @Test
    public void testComLeiteDescricao() {
        Cafe cafe = new ComLeite(new CafeBase());
        assertEquals("Café simples, leite", cafe.getDescricao());
    }

    @Test
    public void testComChocolatePreco() {
        Cafe cafe = new ComChocolate(new CafeBase());
        assertEquals(7.0, cafe.getPreco(), 0.01);
    }

    @Test
    public void testComChocolateDescricao() {
        Cafe cafe = new ComChocolate(new CafeBase());
        assertEquals("Café simples, chocolate", cafe.getDescricao());
    }

    @Test
    public void testComChantillyPreco() {
        Cafe cafe = new ComChantilly(new CafeBase());
        assertEquals(7.5, cafe.getPreco(), 0.01);
    }

    @Test
    public void testComChantillyDescricao() {
        Cafe cafe = new ComChantilly(new CafeBase());
        assertEquals("Café simples, chantilly", cafe.getDescricao());
    }

    @Test
    public void testCafeComTodosAdicionaisPreco() {
        Cafe cafe = new CafeBase();
        cafe = new ComLeite(cafe);
        cafe = new ComChocolate(cafe);
        cafe = new ComChantilly(cafe);

        double precoEsperado = 5.0 + 1.5 + 2.0 + 2.5;
        assertEquals(precoEsperado, cafe.getPreco(), 0.01);
    }

    @Test
    public void testCafeComTodosAdicionaisDescricao() {
        Cafe cafe = new CafeBase();
        cafe = new ComLeite(cafe);
        cafe = new ComChocolate(cafe);
        cafe = new ComChantilly(cafe);

        String descricaoEsperada = "Café simples, leite, chocolate, chantilly";
        assertEquals(descricaoEsperada, cafe.getDescricao());
    }

    @Test
    public void testOrdemDosDecoradoresMudaDescricao() {
        Cafe cafe1 = new ComLeite(new ComChocolate(new CafeBase()));
        Cafe cafe2 = new ComChocolate(new ComLeite(new CafeBase()));

        assertNotEquals(cafe1.getDescricao(), cafe2.getDescricao());
    }

    @Test
    public void testOrdemDosDecoradoresMantemPrecoTotal() {
        Cafe cafe1 = new ComLeite(new ComChocolate(new CafeBase()));
        Cafe cafe2 = new ComChocolate(new ComLeite(new CafeBase()));

        assertEquals(cafe1.getPreco(), cafe2.getPreco(), 0.01);
    }

    @Test
    public void testDescricaoNaoContemDuplicatasInesperadas() {
        Cafe cafe = new ComLeite(new ComLeite(new CafeBase()));
        assertTrue(cafe.getDescricao().contains("leite"));
        assertEquals("Café simples, leite, leite", cafe.getDescricao());
    }


    @Test
    public void testResumoGeradoPelaMain() {
        Cafe cafe = new CafeBase();
        cafe = new ComLeite(cafe);
        cafe = new ComChocolate(cafe);
        cafe = new ComChantilly(cafe);

        String resumo = Main.gerarResumoPedido(cafe);

        assertTrue(resumo.contains("Café simples, leite, chocolate, chantilly"));

        double precoEsperado = 5.0 + 1.5 + 2.0 + 2.5;
        String precoEsperadoFormatado = String.format("R$ %.2f", precoEsperado);

        assertTrue(resumo.contains(precoEsperadoFormatado));
    }
}
