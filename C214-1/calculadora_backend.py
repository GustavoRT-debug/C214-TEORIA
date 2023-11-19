import tkinter as tk
from tkinter import messagebox
from calculadora import Calculadora

class CalculadoraBackend:
    def __init__(self, calculadora):
        self.calculadora = calculadora
        self.current_text = ""

    def press_button(self, value):
        if value == 'C':
            self.current_text = ""
        elif value == '=':
            try:
                result = self.calculate()
                self.current_text = str(result)
            except ValueError as e:
                messagebox.showerror("Erro", str(e))
        else:
            self.current_text += value

    def get_current_text(self):
        return self.current_text

    def calculate(self):
        return eval(self.current_text)

if __name__ == "__main__":
    calculadora = Calculadora()
    backend = CalculadoraBackend(calculadora)
    # Pode adicionar testes para o backend aqui
