public class TakeBuy {

    public static void main(String[] args) {
        int[] storage = {0, 5, 6, 2, 5, 9, 8, 10};

        for(int i = 0; i < storage.length; i++){
            if(storage[i] == 0){
                System.out.println("ERROR: There aren't any available units of this product in storage.");
                continue;
            }

            if(storage[i] < 3){
                System.out.println("ERROR: There aren't enough units of this product in storage.");
                continue;
            }

            else{
                System.out.println("Product " + i + " qualified for take 3 buy 2 sale.");
            }
        }
    }
    
}
