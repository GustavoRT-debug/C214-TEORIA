from calculadora import Calculadora

def test_soma():
    calc = Calculadora()
    assert calc.somar(3, 5) == 8


def test_subtracao():
    calc = Calculadora()
    assert calc.subtrair(10, 3) == 7


def test_multiplicacao():
    calc = Calculadora()
    assert calc.multiplicar(2, 4) == 8


def test_divisao():
    calc = Calculadora()
    assert calc.dividir(10, 2) == 5


def test_divisao_por_zero():
    calc = Calculadora()
    try:
        calc.dividir(5, 0)
    except ValueError as e:
        assert str(e) == "Não é possível dividir por zero"
