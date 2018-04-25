public class GeneticAlgorithm {
    private int populationSize;
    private int jobsSize;
    private double mutationRate;
    private double crossoverRate;

    public GeneticAlgorithm(int populationSize, int jobsSize, double mutationRate, double crossoverRate) {
        this.populationSize = populationSize;
        this.jobsSize = jobsSize;
        this.mutationRate = mutationRate;
        this.crossoverRate = crossoverRate;
    }

    public Population initPopulation(int NUMERO_JOBS){
        Population population = new Population(this.populationSize,NUMERO_JOBS);
        return population;
    }

    //public double calcFitness(Individual individual){ return fitness;}



}
