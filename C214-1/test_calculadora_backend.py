import unittest
from tkinter import Tk
from calculadora import Calculadora
from calculadora_backend import CalculadoraBackend


class TestCalculadoraBackend(unittest.TestCase):
    def setUp(self):
        self.calculadora = Calculadora()
        self.backend = CalculadoraBackend(self.calculadora)

    def test_press_button(self):
        self.backend.press_button("2")
        self.assertEqual(self.backend.get_current_text(), "2")

        self.backend.press_button("+")
        self.assertEqual(self.backend.get_current_text(), "2+")

        self.backend.press_button("3")
        self.assertEqual(self.backend.get_current_text(), "2+3")

        self.backend.press_button("=")
        self.assertEqual(self.backend.get_current_text(), "5")

        self.backend.press_button("C")
        self.assertEqual(self.backend.get_current_text(), "")

    def test_calculate(self):
        self.backend.press_button("8")
        self.backend.press_button("/")
        self.backend.press_button("2")
        self.backend.press_button("=")
        self.assertEqual(self.backend.get_current_text(), "4.0")

        with self.assertRaises(ZeroDivisionError):
            self.backend.press_button("0")
            self.backend.press_button("/")
            self.backend.press_button("0")
            self.backend.press_button("=")


if __name__ == "__main__":
    unittest.main()
