

public class Gee17{
  public static void main(String[] args){

    int[][] ray = new int[7][7];

    //populate  ray with sequential numbers
    for(int row = 0; row < ray.length; row++)
      for(int col = 0; col < ray[row].length; col++)
        ray[row][col] = row * 7 + col;


    ArrayAverages twoDee = new ArrayAverages(ray);

    System.out.println(twoDee);
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
