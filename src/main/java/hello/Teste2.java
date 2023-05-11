package hello;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class Teste2 {

        //QUESTÃO 2

        @Test
        public void test1 () {
            int expected = 1;
            int garrafasCompradas = 10;
            int custoTrocas = 3;
            int dias = 1;
            int sobrasGarrafas =Questao2.calculaTrocasGarrafas(garrafasCompradas,custoTrocas,dias);
            assertEquals(expected, sobrasGarrafas);
        }
    }
