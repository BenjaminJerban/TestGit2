public class CountOdd {
    // Counting the odd numbers lower than 10
    void countOdd(int temp){
        
        int odd;
        for (temp=0; temp<10; temp+=2){
            odd = temp+1;
            System.out.println("--"+odd);
        }
    }

    
}
