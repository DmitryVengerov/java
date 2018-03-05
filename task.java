import java.util.Scanner;
class tasks
{
	public static void main(String[] args)
	{
		/**1. Напишите программу, которая считывает символы пока не встретится точка.
		Также предусмотрите вывод количества пробелов.


		System.out.println("task 1");
		String TaskOne = "Final Solution.";
		if( )




		/**2. Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.
		*/

		System.out.println("\ntask 2");
		double WeightOnEarth = 123, WeightOnMoon;
		WeightOnMoon = WeightOnEarth * 0.17;
		System.out.println(	WeightOnMoon);

		/**3. Напишите метод, который будет увеличивать заданный элемент массива на 10%.
		*/

		System.out.println("\ntask 3");
		double[] array = { 1, 2, 3 ,4 ,5 ,6 ,7 ,8 ,9, 10};
		//System.out.println("Array 1: ");
		for(int i = 0; i <= array.length  - 1; i++)
		{
			System.out.print(array[i] + "  ");
		}
		//System.out.println("\n");
		array[3] = array[3]*0.1;
		array[4] = array[4]*0.1;
		//System.out.println("Array 2: ");
		for(int i = 0; i <= array.length  - 1; i++)
		{
			System.out.print(array[i] + "  ");
		}
		//System.out.println("\n");


		/**4. Напишите метод, заменяющий в строке все вхождения слова «fulish» на «super».
		*/
		System.out.println("\ntask 4");
		String task = "Dima is fulish man!",  s = "fulish";
		// solution
		String s2 = task.replaceAll("fulish", "super");
		System.out.println(task);
		System.out.println(s2);
		// another solution must be here
		boolean numstr =  task.contains("fulish");
		//System.out.println(numstr);


		/**5. Расчет расстояния до места удара молнии.
		Звук в воздухе распространяется со скоростью приблизительно равной 1100 футам в секунду.
		зная интервал времени между вспышкой молнии и звуком сопровождающим ее можно рассчитать расстояние.
		Допустим интервал 7,2 секунды.
		*/

		System.out.println("\ntask 5");
		double time = 7.2, light = 1100;
		System.out.println("Distance= " + time*light + "foots");


		/**6. Создайте простую игру основанную на угадывании букв.
		Пользователь должен угадать загаданную букву A-Z введя ее в консоль.
		Если пользователь угадал букву программа выведет «Right» и игра закончится, если нет, то пользователь продолжит вводить буквы.
		(Опционально) Вывести «You’re too low»- если пользователь ввел букву меньше загаданной, «You’re too high»- если пользователь ввел букву больше загаданной.
		*/

		/**7. Напишите программу, которая вычислит простые числа в пределах от 2 до 100.
		(Опционально) Дополните программу так, чтобы она вычисляла составные числа.

		System.out.println("\ntask 7");
		int Number = 0;
		int Dividers = 0;
		for(int i = 2; i < 100; i++)
		{
			if (Number % i = 0)
			{
				Dividers=+2;
			}
			if
			{

			}
		}

		/**8. Найдите среднее арифметическое массива из 10 элементов типа double.
		*/
		System.out.println("\ntask 8");
		double[] Arrey_for_eight = { 596, 488.7, 7450.7, 495, 3, 5,2,3,4,2 };
		double acc = 0;
		double buff = 0;
		for(int i = 0; i < Arrey_for_eight.length; i++)
		{
			acc = acc + Arrey_for_eight[i];
		}
		buff = acc/Arrey_for_eight.length;
		System.out.println(buff);

		/**9. Напишите рекурсивный метод отображающий строку задом на перед.
		*/


		/**10. Найдите победителя марафона.
		Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон вы можете увидеть ниже.
		Ваша задача найти человека, который быстрее всех пробежал дистанцию и вывести его имя и счет.
		(Опционально) Найдите человека, который прибежал вторым.
		*/
		System.out.println("\ntask 10");

		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
		// нужно отсортировать списки times
		// вывести индекс двух лидеров
		// соотнести индексы со списком names
		//System.out.println(times.lenght);
		//System.out.println(names.lenght);


		/** Написать программу, коотрая создает идеальный квадрат числу
		*/

		System.out.println("\nExtra Task");
		int x = 54;
		int answer = 1;
		while( answer * answer <= x)
		{
			answer = answer + 1;
		}
		System.out.println(answer + " is perfect squad of " + x);



	}
}
