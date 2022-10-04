import json

class Filme:
    def __init__(self, titulo, ano, classificacao, nota):
        self.titulo = titulo
        self.ano = ano
        self.classificacao = classificacao
        self.nota = nota
    def get_nota(self):
        return self.nota
    def to_string(self):
        return f"{self.titulo}: {self.nota}, {self.ano}, {self.classificacao}"

lista = []

f = open('arquivo.json')
data = json.load(f)
for i in data['filmes']:
    lista.append(Filme(i['titulo'], i['ano'], i['classificacao'], i['nota']))

f.close()

for i in range(0, len(lista)):
    for j in range(0, len(lista) - 1):
        if (lista[i].get_nota() > lista[j].get_nota()):
            temp = lista[i]
            lista[i] = lista[j]
            lista[j] = temp

for i in lista:
    print(i.to_string())