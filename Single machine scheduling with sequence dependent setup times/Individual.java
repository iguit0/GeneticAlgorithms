import java.util.Random;

public class Individual {
    private int[] cromossomo;
    private double fitness = -1;

    public Individual(int[] cromossomo) {
        this.cromossomo = cromossomo;
    }

    public Individual(int NUMERO_JOBS) {
        this.cromossomo = new int[NUMERO_JOBS];
        int i=0;
        while (i<cromossomo.length){
            cromossomo[i] = new Random().nextInt(NUMERO_JOBS);
            boolean colide = false;
            for(int j=0; j<i; j++){
                if(cromossomo[i] == cromossomo[j]){
                    colide = true;
                    break;
                }
            }
            if(!colide)
                i++;
        }
    }

    public int[] getCromossomo(){
        return this.cromossomo;
    }

    public int getCromossomoLength(){
        return this.cromossomo.length;
    }

    public int getGene(int offset){
        return this.cromossomo[offset];
    }

    public void setGene(int offset, int gene){
        this.cromossomo[offset] = gene;
    }

    public void setFitness(double fitness){
        this.fitness = fitness;
    }

    public double getFitness(){
        return this.fitness;
    }

}
