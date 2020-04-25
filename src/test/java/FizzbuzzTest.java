import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import test1.Fizzbuzz;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


/**
 * @author ：ls05
 * @date ：Created in 2020/4/25 9:18
 */
public class FizzbuzzTest {
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @Test
    public void should_get_num_when_no_del_by_5_or_3() throws Exception {
        assertThat(Fizzbuzz.printFizzBuzzNum(1)).isEqualTo("1");
        assertThat(Fizzbuzz.printFizzBuzzNum(3)).isEqualTo(Fizzbuzz.FIZZ);
        assertThat(Fizzbuzz.printFizzBuzzNum(5)).isEqualTo(Fizzbuzz.BUZZ);
        assertThat(Fizzbuzz.printFizzBuzzNum(15)).isEqualTo(Fizzbuzz.FIZZ_BUZZ);
    }
    @Test
    public void should_get_Exception_when_no_del_by_5_or_3() throws Exception {
    }
}
