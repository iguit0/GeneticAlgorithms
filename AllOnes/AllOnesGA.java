public class AllOnesGA {
    public static void main(String[] args) {
        // Create GA object
        GeneticAlgorithm ga = new GeneticAlgorithm(20,0.10,0.80,2);
        // Initialize Population
        Population population = ga.initPopulation(12);

        ga.evalPopulation(population);
        int generation = 1;

        while(!ga.isTerminationConditionMet(population)){
            // Print fittest individual from population
            System.out.println("Best solution: " + population.getFittest(0).toString());

            // Apply Crossover
            population = ga.crossoverPopulation(population);

            // Apply Mutation
            population = ga.mutatePopulation(population);

            // Evaluate Population
            ga.evalPopulation(population);

            // Increment the current generation
            generation++;
        }

        System.out.println("Found solution in "+generation + " generations");
        System.out.println("Best solution: " + population.getFittest(0).toString());
    }
}
