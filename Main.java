class Main{
  public static void main(String[] args){
    int n = 3;
    char O = 'A';
    char D = 'C';
    char A = 'B';
  
    TH(n, O, D, A);
  }
  
  public static void TH(int n, char O, char D, char A){
      if(n > 1){
        TH(n-1, O, A, D);
        System.out.println("Mover anel " + n + " de " + O + " para " + D);
        TH(n-1, A, D, O);
      } else {
          System.out.println("Mover anel 1 da torre " + O + " para a torre " + D);
    }
  }
}