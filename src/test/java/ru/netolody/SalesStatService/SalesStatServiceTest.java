package ru.netolody.SalesStatService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SalesStatServiceTest {
    @Test
    public void totalSales() {
        SalesStatService service = new SalesStatService();
        int[] sales = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300};
        int expectTotalSales = 1050;
        int actualTotalSales = service.totalSales(sales);

        Assertions.assertEquals(expectTotalSales, actualTotalSales);
    }

    @Test
    public void averageSales() {
        SalesStatService service = new SalesStatService();
        int[] sales = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300};
        int expectAverageSales = 87;
        int actualAverageSales = service.averageSales(sales);

        Assertions.assertEquals(expectAverageSales, actualAverageSales);
    }

    @Test
    public void maxSalesMonth() {
        SalesStatService service = new SalesStatService();
        int[] sales = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300};
        int expectMaxSalesMonth = 12;
        int actualMaxSalesMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectMaxSalesMonth, actualMaxSalesMonth);
    }

    @Test
    public void minSalesMonth() {
        SalesStatService service = new SalesStatService();
        int[] sales = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300};
        int expectMinSalesMonth = 1;
        int actualMinSalesMonth = service.minSalesMonth(sales);

        Assertions.assertEquals(expectMinSalesMonth, actualMinSalesMonth);
    }

    @Test
    public void salesLessAverage() {
        SalesStatService service = new SalesStatService();
        int[] sales = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300};
        int expectSalesLessAverage = 8;
        int actualSalesLessAverage = service.salesLessAverage(sales);

        Assertions.assertEquals(expectSalesLessAverage, actualSalesLessAverage);
    }

    @Test
    public void salesAboveAverage() {
        SalesStatService service = new SalesStatService();
        int[] sales = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300};
        int expectSalesAboveAverage = 4;
        int actualSalesAboveAverage = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectSalesAboveAverage, actualSalesAboveAverage);
    }

}