package Recursion;

public class toer_of_hannoi {

       public static void towerOfHannoi(int n,String src,String help,String dest){
          if(n==1){
              System.out.println("Disk transfer form "+src+" xto "+dest);
              return;
          }
           towerOfHannoi(n-1,src,dest,help);
           System.out.println("Disk transfer form "+src+" to "+dest);
           towerOfHannoi(n-1,help,src,dest);
    
       }

       public static void main(String[]args){

              
               int n=3;
               towerOfHannoi(n,"Source","Helper","Destination");
}
}
