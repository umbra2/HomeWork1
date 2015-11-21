
public class array {
	public static void randArray(int inputArray[]){
		for(int i = 0; i < inputArray.length; i++) {
			inputArray[i] = (int)(Math.random() * 100);
		}
	}
	
	public static void bblSort(int inputArray[]) {
		//Создаем 2 цикла - внешний проводит итеррацию по массиву, внутренний меняет местами элементы в неупорядоченной паре
		for(int i = inputArray.length - 1; i > 0 ; i--){
			for(int j = 0; j < i; j++){
				if (inputArray[j] > inputArray[j + 1]) {
					int tmp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = tmp;
				}
			}
		}
		
	}
	public static void printArray(int inputArray[]){
		for (int i = 0; i < inputArray.length; i++){
			System.out.println(inputArray[i]);
		}
	}

}
