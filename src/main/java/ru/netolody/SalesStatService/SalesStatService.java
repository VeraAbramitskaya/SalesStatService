package ru.netolody.SalesStatService;

public class SalesStatService {
    public int totalSales(int[] sales) {   //1.считаем сумму всех продаж

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) { // 2. средняя сумма продаж = сумма продаж/длину массива
        int sum = totalSales(sales);  // в переменную sum положим результат вызова метода totalSales
        // int sum = 0;
        // int average;
        // for (int i = 0; i < sales.length; i++) {
        // sum = sum + sales[i];
        //int average = sum / sales.length;
        return sum / sales.length;
    }

    public int maxSalesMonth(int[] sales) { // 3. номер месяца, в котором были максимальные продажи

        int maxMonth=0;
        for (int i = 0; i < sales.length; i++) {
        //for (int sale:sales){
           if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] sales) { // 4. номер месяца, в котором были минимальные продажи
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int salesLessAverage(int[] sales) { // 5. количество месяцев, в которых продажи ниже среднего
        int average = averageSales(sales);
        //int sum = 0;
        // int average = 0;
        //for (int i = 0; i < sales.length; i++) {
        // sum = sum + sales[i];
        //average = sum / sales.length;
        //}

        int monthQuantity = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthQuantity++;
            }
        }
        return monthQuantity;
    }

    public int salesAboveAverage(int[] sales) { // 6. количество месяцев, в которых продажи выше среднего
        int average = averageSales(sales);
        //int sum = 0;
        //int average = 0;
        //for (int i = 0; i < sales.length; i++) {
          //  sum = sum + sales[i];
        //}
        //average = sum / sales.length;

        int monthQuantity = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthQuantity++;
            }
        }
        return monthQuantity;
    }

}
