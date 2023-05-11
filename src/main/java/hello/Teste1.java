package hello;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste1 {


        //QUESTÃO 1

        Questao1  q = new Questao1();


        @Test
        public void testQuandoFazer1 () {
            assertEquals(1, q.quandoFazer(10, 3, 5));
        }

        @Test
        public void testQuandoFazer2 () {
            assertEquals(2, q.quandoFazer(5, 2, 4));
        }

        @Test
        public void testQuandoFazer3 () {
            assertEquals(1, q.quandoFazer(7, 0, 7));
        }

}
