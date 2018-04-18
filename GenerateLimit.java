public class GenerateLimit{

public static void m1(int pageNumber){
    int pageSize = 25;
    int lowLimit = 0;
    int upLimit =0;
    
    
    lowLimit = 1+ pageNumber*pageSize;
    upLimit = pageSize+ pageNumber*pageSize;
    
    System.out.println("Your Lower Limit is:" + " " +lowLimit);
    System.out.println("Your Upper Limit is:" + " " +upLimit);

    
    
    
}
     public static void main(String []args){

        m1(3);
     }
}
