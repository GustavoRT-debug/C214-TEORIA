import tkinter as tk
from calculadora import Calculadora
from calculadora_backend import CalculadoraBackend


class CalculadoraGUI(tk.Tk):
    def __init__(self, backend):
        super().__init__()

        self.title("Calculadora")
        self.geometry("300x400")

        self.backend = backend

        self.create_widgets()

    def create_widgets(self):
        # Entrada
        entry_frame = tk.Frame(self)
        entry_frame.grid(row=0, column=0, columnspan=4, pady=10)

        self.entry = tk.Entry(entry_frame, width=20, font=("Helvetica", 18))
        self.entry.grid(row=0, column=0, pady=10, padx=10)

        # Botões
        button_frame = tk.Frame(self)
        button_frame.grid(row=1, column=0, columnspan=4)

        buttons = [
            ("7", 1, 0),
            ("8", 1, 1),
            ("9", 1, 2),
            ("/", 1, 3),
            ("4", 2, 0),
            ("5", 2, 1),
            ("6", 2, 2),
            ("*", 2, 3),
            ("1", 3, 0),
            ("2", 3, 1),
            ("3", 3, 2),
            ("-", 3, 3),
            ("0", 4, 0),
            ("C", 4, 1),
            ("=", 4, 2),
            ("+", 4, 3),
        ]

        for text, row, column in buttons:
            button = tk.Button(
                button_frame,
                text=text,
                command=lambda t=text: self.on_button_click(t),
                width=4,
                height=2,
                font=("Helvetica", 14),
            )
            button.grid(row=row, column=column, pady=5, padx=5)

    def on_button_click(self, value):
        self.backend.press_button(value)
        current_text = self.backend.get_current_text()
        self.entry.delete(0, tk.END)
        self.entry.insert(tk.END, current_text)


if __name__ == "__main__":
    calculadora = Calculadora()
    backend = CalculadoraBackend(calculadora)
    app = CalculadoraGUI(backend)
    app.mainloop()
