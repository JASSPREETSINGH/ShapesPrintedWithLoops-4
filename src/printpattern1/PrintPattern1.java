/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printpattern1;

/**
 *
 * @author Dell
 */
public class PrintPattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int size=7;
          for(int row=0;row<=size;row++){
          for(int col=0;col<=size;col++){
             int sumRowCol;
             sumRowCol=row +col; 
             if(sumRowCol==size+1){
              System.out.print("# ");
              
             }
             else if(row==col){
              System.out.print("# ");   
             }
             else
             {
                 System.out.print("  ");
             }
            }
           System.out.println();
       }
    }
}
    

