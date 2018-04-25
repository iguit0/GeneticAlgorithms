import java.util.Random;

/**
 *
 * @author IGOR
 */
public class Util {
    /**
     * retorna um valor inteiro aleatório com um range definido
     * @return numero inteiro aleatório entre o min e max.
     */
    public static int randomNumber(int min , int max) {
        Random r = new Random();
        double d = min + r.nextDouble() * (max - min);
        return (int)d;
    }

    /**
     * verifica se num array de inteiros tem certo elemento
     */
    public static boolean arrayContains(int[] arr, int e){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == e)
                return true;
        }
        return false;
    }

    public static void rotate(int[] arr, int order) {
        int offset = arr.length - order % arr.length;
        if (offset > 0) {
            int[] copy = arr.clone();
            for (int i = 0; i < arr.length; ++i) {
                int j = (i + offset) % arr.length;
                arr[i] = copy[j];
            }
        }
    }

    //embaralha array
    private static void shuffleArray(int[] array) {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    /**
     * This method randomises the order of array elements
     * i.e. shuffles array elements
     * Implements Fisher–Yates shuffle
     * @param array an int array
     * @return copy the scrambled/randomised/shuffled array
     */
    static int[] shuffleIntArray(int[] array)
    {
        int[] copy = array.clone();
        Random rnd = new Random();
        for (int i = copy.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = copy[index];
            copy[index] = copy[i];
            copy[i] = a;
        }
        return copy;
    }






}
