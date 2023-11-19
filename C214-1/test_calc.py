from calculadora import Calculadora
import unittest


class TestCalculadora(unittest.TestCase):
    def test_soma(self):
        calc = Calculadora()
        result = calc.somar(3, 5)
        self.assertEqual(result, 8)

    def test_subtracao(self):
        calc = Calculadora()
        result = calc.subtrair(10, 3)
        self.assertEqual(result, 7)

    def test_multiplicacao(self):
        calc = Calculadora()
        result = calc.multiplicar(2, 4)
        self.assertEqual(result, 8)

    def test_divisao(self):
        calc = Calculadora()
        result = calc.dividir(10, 2)
        self.assertEqual(result, 5)

    def test_divisao_por_zero(self):
        calc = Calculadora()
        with self.assertRaises(ValueError) as context:
            calc.dividir(5, 0)
        self.assertEqual(str(context.exception), "Não é possível dividir por zero")


if __name__ == "__main__":
    unittest.main()
