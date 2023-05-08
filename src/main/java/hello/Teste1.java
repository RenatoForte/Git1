import org.junit.Test;
import static org.junit.Assert.*;


public class Teste1{
    public static void main(String[] args) {
      
      //QUESTÃO 1

  Questao1 q;
  
  @BeforeEach
      q = new Questao1();
  
  @Test
  public void testQuandoFazer() {
      assertEquals(1, q.quandoFazer(10, 3, 5));
    }
  
  @Test
  public void testQuandoFazer() {
      assertEquals(2, q.quandoFazer(5, 2, 4));
    }
  
  @Test
  public void testQuandoFazer() {
      assertEquals(1, q.quandoFazer(7, 0, 7));
    }
  }
