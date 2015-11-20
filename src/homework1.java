
public class homework1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Создаем массив
		int array[] = {6,4,8,2,7,1,3,5,10,9};
		//Применяем сортировку пузырьком
		bblSort(array);
		//Выводим массив на экран поэлементно
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}

	}
	//Создаем алгоритм сортировки пузырьком
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

}
