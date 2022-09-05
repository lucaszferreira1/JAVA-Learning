class Produto():
    def __init__(self, nome, marca, preco) -> None:
        self.nome = nome
        self.marca = marca
        self.preco = preco
    
    def __str__(self) -> str:
        return ("Nome: {} Marca: {} Preco: {}".format(self.nome, self.marca, self.preco))