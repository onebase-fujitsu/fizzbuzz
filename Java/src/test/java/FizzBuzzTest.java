import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    @Test
    void 数字の1を入力すると文字列の1が返ってくる() {
        FizzBuzz fb = new FizzBuzz();
        assertThat(fb.getResponse(1)).isEqualTo("1");
    }

    @Test
    void 数字の2を入力すると文字列の2が返ってくる() {}

    @Test
    void 数字の3の倍数を入力すると文字列のFizzが返ってくる() {
        FizzBuzz fb = new FizzBuzz();
        // 3を入力した場合
        // 6を入力した場合
        // 9を入力した場合
    }
}
