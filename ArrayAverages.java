import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    int sum = 0;

    for(int row = 0; row < ray.length; row++){

      sum = 0;

      for(int col = 0; col < ray[row].length; col ++){
        sum += col;
      }

      System.out.println("The average of row " + row + " is " + sum/ray[row].length);
    } 
  }

  public void columnAverages(){
    int sum = 0;

    //Column major order
    // Take each column and go through all of the rows
    // Top down, left right
    for(int col = 0; col < ray[0].length; col++){
      sum = 0;
      for(int row = 0; row < ray.length; row++){
        sum+= ray[row][col];
      }
      System.out.println("The average of column " + col + " is " +sum/ray[0].length);
    }
  }

  public void arrayAverage(){
    int sum = 0;
    for(int[] row: ray){
      for(int col: row){
        sum += col;
      }
    }
    System.out.println("The average of the array is " + sum/(ray.length * ray[0].length));
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
