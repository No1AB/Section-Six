public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        
        int[] randomNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = randomNumber();
            if (randomNumbers[i] > highScore) {
                highScore = randomNumbers[i];
            }
        }

        System.out.print("Here are the scores: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        

        System.out.println("\n\nThe highest score is: " + highScore + "! Give that man a cookie!");
        
    }    

    public static int randomNumber() {
       double random = Math.random() * 49999;
       random ++;
       return (int) random;
    }

}
