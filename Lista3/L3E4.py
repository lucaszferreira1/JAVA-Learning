from abc import ABC

class Pessoa(ABC):
    def __init__(self, nome):
        self.nome = nome

class Aluno(Pessoa):
    def __init__(self, nome, notas):
        super().__init__(nome)
        self.notas = notas

    def calcularMedia(self):
        media = 0
        for nota in self.notas:
            media += nota
        return media / len(self.notas)

    def __repr__(self):
        status = "Aprovado" if self.calcularMedia() >= 7 else "Reprovado"
        return f"{self.nome}: {self.notas}, Média = {self.calcularMedia()}, Status: {status}"


class Professor(Pessoa):
    def __init__(self, nome, salario):
        super().__init__(nome)
        self.salario = salario

    def __repr__(self):
        return f"{self.nome}: R${self.salario}"


a1 = Aluno("João", (7, 6, 8, 7))
p1 = Professor("José", 2300)

print(a1.__repr__())
print(p1.__repr__())
