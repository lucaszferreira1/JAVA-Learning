
class ObjetoSobrepostoException(Exception):
    def __init__(self, msg):
        print(msg)


class EspacoGeometrico:
    def __init__(self, retas, pontos):
        self.retas = retas
        self.pontos = pontos

    def adicionarReta(self, reta):
        for r in self.retas:
            if (r.intercepta(reta)):
                raise ObjetoSobrepostoException("Reta não pode ser adicionada pois sobrepõe outro objeto")
        for p in self.pontos:
            if (reta.estaNaReta(p)):
                raise ObjetoSobrepostoException("Reta não pode ser adicionada pois sobrepõe outro objeto")

    def adicionarPonto(self, ponto):
        for r in self.retas:
            if (r.estaNaReta(ponto)):
                raise ObjetoSobrepostoException("Ponto não pode ser adicionado pois sobrepõe outro objeto")
        if ponto in self.pontos:
            raise ObjetoSobrepostoException("Ponto não pode ser adicionado pois sobrepõe outro objeto")
        self.pontos.append(ponto)


class Reta:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def intercepta(self, reta):
        if (self.a - reta.a == 0):
            return False
        det = (reta.b - self.b) / (self.a - reta.a)
        return False if det == 0 else True

    def estaNaReta(self, ponto):
        return True if (self.a * ponto.x + self.b == ponto.y) else False


class Ponto2D:
    def __init__(self, x, y):
        self.x = x
        self.y = y

espaco = EspacoGeometrico([], [])
espaco.adicionarPonto(Ponto2D(3, 4))
espaco.adicionarPonto(Ponto2D(2, 3))
espaco.adicionarPonto(Ponto2D(4, 6))
espaco.adicionarReta(Reta(1, 2))
espaco.adicionarReta(Reta(1, 1))
espaco.adicionarReta(Reta(2, -2))