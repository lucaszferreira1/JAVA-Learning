from mailbox import NotEmptyError


class Cliente():
    def __init__(self, nome, cpf, telefone) -> None:
        self.nome = nome
        self.cpf = cpf
        self.telefone = telefone
    
    def __str__(self) -> str:
        return ("Nome: {} CPF: {} Telefone: {}".format(self.nome, self.cpf, self.telefone))