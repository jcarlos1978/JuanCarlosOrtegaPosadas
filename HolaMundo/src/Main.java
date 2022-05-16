public class Main {
    
    public static void main(String[] args) {

		System.out.println("Hola Mundo");
        
        int[] v = {0,1,3};
		System.out.println(sum_vect(v));
	}

    static int sum_vect(int v[]) {
		int i = 0;
		int suma = 0;

		while (i < 2) {
			if (v[i] == 0) {
				break;
			}
			else {
				suma = suma + v[i];
				i = i + 1;
			}
		}
		return suma;
	}
}
