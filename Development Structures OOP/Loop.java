public class Loop {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        } // checks its conditions then loops

        int i = 0;

        while(i <= 10){
            System.out.println(i);
            i++;
        } // checks its conditions then loops

        do{
            System.out.println(i);
        }while(i <= 10); // do-while first do the loop, then checks its conditions

    }
}
