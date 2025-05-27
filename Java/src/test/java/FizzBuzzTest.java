import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    @Test
    void 数字の1を入力すると文字列の1が返ってくる() {
        FizzBuzz fb = new FizzBuzz();
        assertThat(fb.getResponse(1)).isEqualTo("1");
    }

    @Test
    void 数字の2を入力すると文字列の2が返ってくる() {
        FizzBuzz fb = new FizzBuzz();
        assertThat(fb.getResponse(2)).isEqualTo("2");
    }

    @Test
    void 数字の3の倍数を入力すると文字列のFizzが返ってくる() {
        FizzBuzz fb = new FizzBuzz();
        assertThat(fb.getResponse(3)).isEqualTo("Fizz");
        assertThat(fb.getResponse(6)).isEqualTo("Fizz");
        assertThat(fb.getResponse(9)).isEqualTo("Fizz");
        assertThat(fb.getResponse(12)).isEqualTo("Fizz");
        assertThat(fb.getResponse(15)).contains("Fizz");
    }

    @Test
    void 数字の5の倍数を入力すると文字列のBuzzが返ってくる() {
        FizzBuzz fb = new FizzBuzz();
        assertThat(fb.getResponse(5)).isEqualTo("Buzz");
        assertThat(fb.getResponse(10)).isEqualTo("Buzz");
        assertThat(fb.getResponse(15)).contains("Buzz");
    }

    @Test
    void 数字の3と5の倍数を入力すると文字列のFizzBuzzが返ってくる() {
        FizzBuzz fb = new FizzBuzz();
        assertThat(fb.getResponse(15)).contains("FizzBuzz");
        assertThat(fb.getResponse(30)).contains("FizzBuzz");
        assertThat(fb.getResponse(45)).contains("FizzBuzz");
        assertThat(fb.getResponse(60)).contains("FizzBuzz");
    }
}
