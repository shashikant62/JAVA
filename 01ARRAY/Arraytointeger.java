public class Arraytointeger {
 public static void main(String[] args) {
  int a[] = {2, 0, 1, 9};
  int numberConverted = 0;
  for (int i=0;i<4;i++) {
   numberConverted = 10*numberConverted + a[i];
  }
  System.out.println(numberConverted);
 }
}