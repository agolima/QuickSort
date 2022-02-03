public class Principal {
	public static void main(String[] args) {
		int[] valoresExemplo = { 21, 546, 34, 23, 36, 446, 58, 9, 10, 11, 1, 4, 6, 2, 3, 65 };

		Ordenacao ord = new Ordenacao();
		int[] arrayOrdenado = ord.quickSort(valoresExemplo, 0, (valoresExemplo.length - 1));

		for (int i = 0; i < arrayOrdenado.length; i++) {
			System.out.println(arrayOrdenado[i]);
		}
	}
}