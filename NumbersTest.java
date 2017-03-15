import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class NumbersTest {

  @Before
  public void before() {

    scanner = new Scanner();
  }

  @Test
  public void canGetEvenNumber() {
    assertEquals(2, numbers.getEvenNumber);
  }

  @Test
  public void canGetOddNumber() {
    assertEquals(1, numbers.getOddNumber);
  }
}