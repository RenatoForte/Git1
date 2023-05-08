import org.junit.Test;
import static org.junit.Assert.*;
      

public class Teste2{
    public static void main(String[] args) {
      
      //QUESTÃO 2

    @Test
    public void test1() {
        int expected = 3;
        int actual = Questao2.conteudoGarrafas(4, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int expected = 1;
        int actual = Questao2.conteudoGarrafas(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int expected = 1000000000;
        int actual = Questao2.conteudoGarrafas(1000000000, 1);
        assertEquals(expected, actual);
    }
}
