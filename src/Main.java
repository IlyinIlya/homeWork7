
public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        //Продолжите работать с кодом, который вы написали в предыдущем
        // уроке — в задачах с накоплениями.
        //С помощью цикла while посчитайте, сколько месяцев потребуется,
        // чтобы накопить 2 459 000 рублей при условии, что первоначально мы
        // имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        //Результат программы должен быть выведен в консоль с тем количеством
        // месяцев, которое необходимо для накопления данной суммы. Формат
        // сообщения: «Месяц …, сумма накоплений равна … рублей».
        int total = 0;
        int salary = 15_000;
        int month = 0;
        while (total < 2_459_000) {
            total = total + total/100;  // + 12% годовых
            total = total + salary;
            month ++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Task 2");
        //Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        //Для обоих циклов можно использовать как одну общую переменную, так и свою в каждом цикле.
        //Не забудьте выполнить переход на новую строку между двумя циклами.
        //В результате программы вывод должен получиться следующим:
        //1 2 3 4 5 6 7 8 9 10
        //10 9 8 7 6 5 4 3 2 1

        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number ++;
        }

        System.out.println(" ");
        for (number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }

        System.out.println(" ");
        System.out.println("Task 3");
        //В стране Y население — 12 миллионов человек.
        //Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая
        // численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
        int population = 12_000_000;
        // int peopleBirth = (17 * population) / 1000;
        // int peopleDie = (8 * population) / 1000;
        int increasePopulation, year = 0;
        while (year < 10) {
            increasePopulation = (9 * population) / 1000; // естественный прирост населения
            population = population + increasePopulation;
            year ++;
            System.out.println("За " + year + " год, численность населения составляет " + population);
        }

        System.out.println("Task 4");
        //Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада
        // добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать
        // сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
        //Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
        int deposit = 15_000;
        month = 0;
        //При условии что Василий не будет вкладывать дополнительную сумму, будем расссчитывать только накопление процентов
        while (deposit < 12_000_000) {
            deposit = deposit + ((deposit*7)/100);
            month ++;
            System.out.println("За " + month + " месяц, удалось накопить " + deposit);
        }

        System.out.println("Task 5");
        //Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а
        // только каждый шестой. Должны быть видны накопления за 6-й, 12-й, 18-й, 24-й и следующие месяцы.
        deposit = 15_000;
        month = 0;
        while (deposit < 12_000_000) {
            deposit = deposit + ((deposit * 7) / 100);
            month ++;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяц, удалось накопить " + deposit);
            }
        }

        System.out.println("Task 6");
        //Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать, какой будет сумма
        // его накоплений каждые полгода на протяжении этих 9 лет.
        //Исходная сумма всё та же — 15 тысяч рублей, проценты банка — 7% ежемесячно.
        //Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
        deposit = 15_000;
        month = 0;
        year = 0;
        while (year < 9) {
            deposit = deposit + ((deposit * 7) / 100);
            month++;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяц, удалось накопить " + deposit);
            }
            if (month % 12 == 0) {
                year++;
            }
        }

        System.out.println("Task 7");
        //В компании пятница — отчетный день.
        //Нужно написать программу, которая считает дни месяца по датам, определяет, какой день — пятница,
        // и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        // «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
        //В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.

        //1 путь
        for (int day = 1; day < 31; day ++) {
            if (day % 7 == 0) {
                System.out.println("Сегодня пятница, " + (day-2) + " -е число");
            }
        }
        //2 путь
        int friday = 5;     // Пятница = 5 день
        int day = 0;
        int week = 7;       // Неделя = 7 дней
        while (day < 31) {
            day ++;
            if (day == friday) {
                friday = friday + week;  //Через неделю опять пятница
                System.out.println("Сегодня тоже пятница, " + (day) + " -е число");
            }
        }

        System.out.println("Task 8");
        //Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
        //Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также
        // следующий год ее появления (ближайшие 100 лет).
        //Для вычисления периода можно создать две дополнительные переменные, которые содержат год за
        // 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
        //В результате решения задачи в консоли должен получиться следующий результат:
        //1896
        //1975
        //2054
        int beforeNowYear = 1824; // расчетный год 2024 минус 200 лет
        int afterNowYear = 2124;   // расчетный год 2024 плюс 100 лет
        while (beforeNowYear < afterNowYear) {
            beforeNowYear++;
            if (beforeNowYear % 79 == 0) {
                System.out.println(beforeNowYear);
            }
        }
        // 2 путь
        System.out.println(" ");
        int nowYear = 2024;
        for (int astronomyYear = 0; astronomyYear < 5000; astronomyYear ++) {
            if (astronomyYear % 79 == 0 && astronomyYear >= nowYear - 200 && astronomyYear <= nowYear + 100) {
                System.out.println(astronomyYear);
            }
        }

    }
}