import java.util.Arrays;


public class array {
	
	//Заполнение массива случайными числами
	public static void randArray(int inputArray[]){
		for(int i = 0; i < inputArray.length; i++) {
			inputArray[i] = (int)(Math.random() * 100);
		}
	}
	
	//Сортировка методом пузырька
	public static void bblSort(int inputArray[]) {
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
	
	//Сортировка мотодом выбора
	public static void selSort(int inputArray[]){
		for(int i = 0; i < inputArray.length; i++){
			int min = inputArray[i];
			int min_i = i;
			for(int j = i + 1; j < inputArray.length; j++){
				if(min > inputArray[j]){
					min = inputArray[j];
					min_i = j;
				}
			}
			if(i != min_i){
				int tmp = inputArray[i];
				inputArray[i] = inputArray[min_i];
				inputArray[min_i] = tmp;
			}
		}
	}
	
	//Вывод массива на экран
	public static void printArray(int inputArray[]){
		System.out.println(Arrays.toString(inputArray));
	}

}
