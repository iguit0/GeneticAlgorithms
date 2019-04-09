#!/usr/bin/env python

import string
import random

POPULATION_SIZE = 20
MUTATION_RATE = 0.1 #10%
CROSSOVER_RATE = 0.5 #50%
TOURNAMENT_SELECTION_SIZE = 2 #numero de torneios
geneSet = string.ascii_lowercase
TARGET_CHROMOSOME = "igor"

class Chromosome:
    def __init__(self):
        #self.genes = []
        self.fitness = 0
        self.genes =  "".join(random.choice(geneSet) for _ in range(len(TARGET_CHROMOSOME)))

    def getgenes(self):
        return self.genes

    # Distância de Hamming
    def getfitness(self):
        return sum(ch1 != ch2 for ch1, ch2 in zip(self.genes,TARGET_CHROMOSOME))

    def __str__(self):
        return self.genes.__str__()

class Population:
    def __init__(self,size):
        self.chromosomes = []
        i=0
        while i < size:
            self.chromosomes.append(Chromosome())
            i+=1

    def getchromosomes(self):
        return self.chromosomes

class GeneticAlgorithm:
    @staticmethod
    def evolve(pop):
        return GeneticAlgorithm.mutatePopulation(GeneticAlgorithm.crossover(pop))

    def tournament_select(self, pop):
        d = []
        for x in range(POPULATION_SIZE):
            d.append(x)

        pop2 = pop.getchromosomes()

        while (True):
            contestants = random.choice(d)  # contestants are 2 random people from pop
            contestant = random.choice(d)
            if (contestants != contestant):
                break

        if pop2[contestants].getfitness() > pop2[contestant].getfitness():
            return contestant  # aqui eu retoorno a posicao do individuo que ira fazer o cruzamento
        else:
            return contestants

    @staticmethod
    def crossover(self,ind,ind2):
        filhos = []
        cutpoint1 = random.randint(0,3)
        cutpoint2 = random.randint(0,3)
        #cutpoint1 = random.randint((ind.getchromosomes().__len__()/2)-2)+1
        #cutpoint2 = random.randint((ind.getchromosomes().__len__()/2)-2)+ind.getchromosomes().__len__()/2

        genepai1 = "".join(ind.getchromosomes())
        genepai2 = "".join(ind2.getchromosomes())

        genefilho1 = genepai1[0:cutpoint1].join(genepai2[cutpoint1:cutpoint2]).join(genepai1[cutpoint2:genepai1.__len__()])
        genefilho2 = genepai2[0:cutpoint1].join(genepai1[cutpoint1:cutpoint2]).join(genepai2[cutpoint2,genepai2.__len__()])

        filhos[0] = genefilho1
        filhos[1] = genefilho2

        return filhos

    @staticmethod
    def mutatePopulation(pop):
        return pop

def printPopulation(pop,gen_number):
    print("\n-----------------------------------------------------")
    print("Geração:", gen_number, "| Mais apto: ", pop.getchromosomes()[0].getfitness())
    print("\t~> Alvo: ",TARGET_CHROMOSOME)
    print("-----------------------------------------------------")
    i=0
    for x in pop.getchromosomes():
        print("~> Cromossomo #",i,":",x,"| Aptidão: ",x.getfitness())
        i+=1

population = Population(POPULATION_SIZE)
population.getchromosomes().sort(key=lambda x: x.getfitness(), reverse=False)
printPopulation(population,0)
generation_number = 0
while population.getchromosomes()[0].getfitness() < TARGET_CHROMOSOME.__len__():
    population = GeneticAlgorithm.evolve(population)
    population.getchromosomes().sort(key=lambda x: x.getfitness(),reverse=False)
    printPopulation(population,generation_number)
    generation_number+=1
