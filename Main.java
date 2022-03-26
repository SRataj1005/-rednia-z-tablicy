class Main {
  public static void main(String[] args) 
  {
    double[] oceny = {2,3,3,6};
    double suma = 0;
    int liczbaOcen = 4;
    for(int i = 0; i < liczbaOcen; i++)
      {
        suma = suma + oceny[i];
      }
    double sr = suma / liczbaOcen;
    System.out.print(sr);
  }
}