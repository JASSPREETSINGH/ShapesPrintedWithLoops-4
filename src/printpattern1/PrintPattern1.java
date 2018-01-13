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
          for(int row=0;row<=7;row++){
          for(int col=0;col<=7;col++){
             if(row<col){
              System.out.print("# ");
             }
             else
             {
                 System.out.print("");
             }
            }
           System.out.println();
       }
    }
}
    

