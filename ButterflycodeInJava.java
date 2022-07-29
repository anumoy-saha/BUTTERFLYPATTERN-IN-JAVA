import java.util.*;

 class firstclass {

 /** 
 *
 */
public static void main(String[] args) {

  int n=4; 
 

  //upperone

     for(int i=1;i<=n;i++){
      //1stpart

      for(int j=1;j<=i;j++){

      System.out.print("*");

     }
     //spaces

     int spaces=2*(n-i);
     for(int j=1;j<=spaces;j++){
      System.out.print(" ");
     }

     //2nd part
     for(int j=1;j<=i;j++){
      System.out.print("*");

     }
     System.out.println();
    
  }


 //lowerhalf
 for(int i=n;i>=1;i--){
  //1stpart

  for(int j=1;j<=i;j++){

  System.out.print("*");

 }
 //spaces
 int spaces=2*(n-i);
 for(int j=1;j<=spaces;j++){
  System.out.print(" ");
 }

 //2nd part
 for(int j=1;j<=i;j++){
  System.out.print("*");

 }
 System.out.println();

 
 }

 }
}


       
    



       
     
 

