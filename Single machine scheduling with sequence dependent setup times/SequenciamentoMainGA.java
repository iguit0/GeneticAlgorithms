public class SequenciamentoMainGA {
/*    public static int NUMERO_JOBS = 10;
    public static int NUMERO_POPULACAO = 20;
    public static int NUMERO_ITERACOES = 150;    //gerações

    public static double TAXA_CRUZAMENTO = 0.80;
    public static double TAXA_MUTACAO = 0.5;

    private static int[][] gerarMatriz() {
        int[][] matriz = new int[NUMERO_JOBS][NUMERO_JOBS];

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                if (i == j)
                    matriz[i][j] = 0;
                else
                    //matriz[i][j] = 10 + new Random().nextInt(90);
                    matriz[i][j] = Util.randomNumber(0, 200);
        return matriz;
     }
		//    espelhar matriz
		for( int i = 0 ; i < matriz.length ; i++ )
			for ( int j = 0 ; j < matriz[i].length ; j++ )
			    matriz [i][j] = matriz [j][i];


    */
    public static void main(String[] args) {
        /*int[][] setup = new int[NUMERO_JOBS][NUMERO_JOBS];

        setup = gerarMatriz();
        //printar matriz
        System.out.println("Matriz Set up:\n");
        for( int[] a : setup )
            System.out.println( Arrays.toString( a ));
        System.out.println("\n"); */

        // Create GA object
        GeneticAlgorithm ga = new GeneticAlgorithm(10, 4, 0.05, 0.80);
        // Initialize Population
        Population population = ga.initPopulation(3);
        //Individual i = new Individual(4);

    }
}
