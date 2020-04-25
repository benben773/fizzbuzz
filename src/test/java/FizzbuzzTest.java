import org.junit.Test;
import test1.Fizzbuzz;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


/**
 * @author ：ls05
 * @date ：Created in 2020/4/25 9:18
 */
public class FizzbuzzTest {
    @Test
    public void should_get_num_when_no_del_by_5_or_3(){
        assertThat(Fizzbuzz.printFizzBuzzNum(1)).isEqualTo("1");
    }
    @Test
    public void should_get_fizz_when_no_del_by_3(){
        assertThat(Fizzbuzz.printFizzBuzzNum(3)).isEqualTo("fizz");
    }
}
