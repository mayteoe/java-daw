public class EliminaRepetidos {
  public static void main (String[] args) {
    int [] valores = {34,56,34,56,78,87,55,34,1,2,3,3,2,10,2};
    int [] sinRepetidos;
    
    System.out.println("Array original: ");
    presentaArray(valores);
    
    sinRepetidos = eliminaRepetidos(valores);
    System.out.println("Array sin repetidos: ");
    presentaArray(sinRepetidos);    
  }  
  
  public static void presentaArray (int [] x) {
    for (int i=0; i<x.length; i++) {
      System.out.printf("%4d",x[i]);
    }
    System.out.println();
  }
  
  public static int[] eliminaRepetidos(int[] v){
    int[] result = new int[0];
    for(int i=0; i<v.length; i++){
      if(!presente(result, v[i])){
        result = anidaElementoArrayEnteros(result, v[i]);
      }
    }
    return result;
  }
  
  public static int[] anidaElementoArrayEnteros(int[]v, int num ){
    int[] result = new int[v.length + 1];
    for(int j=0; j<result.length-1; j++){
      result[j] = v[j];
    }
    result[result.length-1] = num;
    return result;
  }
  
  public static boolean presente(int[] arr, int num){
    boolean check = false;
    for(int i=0; i<arr.length; i++){
      if(arr[i] == num) check = true;
    }
    return check;
  }
  
  
}
