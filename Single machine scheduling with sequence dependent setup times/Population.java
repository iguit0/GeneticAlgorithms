public class Population {
    private Individual population[];
    private double populationFitness = -1;

    public Population(int populationSize) {
        this.population = new Individual[populationSize];
    }

    public Population(int populationSize, int NUMERO_JOBS){
        this.population = new Individual[populationSize];
        for(int indidivualCount=0;indidivualCount<populationSize;indidivualCount++){
            Individual individual = new Individual(NUMERO_JOBS);
            this.population[indidivualCount] = individual;
        }
    }

    public Individual[] getIndividuals(){
        return this.population;
    }

    public void setPopulationFitness(double fitness){
        this.populationFitness = fitness;
    }

    public double getPopulationFitness(){
        return this.populationFitness;
    }

    public int size(){
        return this.population.length;
    }

    public Individual getIndividual(int offset){
        return population[offset];
    }

}
