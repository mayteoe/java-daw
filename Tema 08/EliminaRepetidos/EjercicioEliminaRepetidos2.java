public class EjercicioEliminaRepetidos{
  public static void main(String[] args){
    int[] prueba = {1,2,2,5,5,56,56};
    int[] result = eliminaRepetidos(prueba);
    for(int item: result) System.out.print(item + " ");
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
