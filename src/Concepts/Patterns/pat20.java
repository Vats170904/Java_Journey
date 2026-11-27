package Concepts.Patterns;

public class pat20 {
    public static void main(String[]args){
        int rw = 5;
        for(int i = 1; i<=rw;i++){
            for(int j=1 ;j<=i;j++){
                if(i==j){
                    System.out.print(1);
                }
                
                else if((i+j)%2==0){
                    System.out.print("1");
                }
              
                else{
                    System.out.print("0");
                }
            

            }
            System.out.println();
        }
    }
    
}
