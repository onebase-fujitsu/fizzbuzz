import unittest
from fizz_buzz import FizzBuzz


class TestFizzBuzz(unittest.TestCase):
    def test_入力1で1を返す(self):
        fizz_buzz = FizzBuzz()
        result = fizz_buzz.play(1)
        self.assertEqual(result, '1')

    def test_入力2で2を返す(self):
        print('nothing yet')


if __name__ == "__main__":
    unittest.main()
