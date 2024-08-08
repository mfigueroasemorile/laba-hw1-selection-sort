import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        main.sort();

    }

    public void sort (){
        int size = 10;
        int[] array = new int[size];
        Random random = new Random();
        for(int i = 0; i < 10; i++)
        {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }

        int lowest;
        int index;

        for (int i = 0; i < array.length; i++){

            index = i;
            lowest = array[i];
            for (int x = i+1; x < array.length; x++){

                if (array[x]<array[index]){
                    index = x;
                    lowest = array[x];
                }
            }
            int y = array[index];
            array[index] = array[i];
            array[i] = y;
        }
        System.out.println("---------------------------SORTED------------------------");
        for (int i = 0; i< array.length;i++){
            System.out.println(array[i]);
        }
    }

}