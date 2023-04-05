1.Calculate variance and variance pct given sales data of product for two years like 2022 and 2021.
Product	Sales 2021	Sales 2022
Tea     	100 	120
Coffee	    100 	110
Green Tea	75	    100

Summary:

This Java program calculates the variance and variance percentage between two sets of sales data for the years 2021 and 2022. Here's a detailed explanation of the code
The program defines two arrays of sales data for the years 2021 and 2022, with three sales figures in each array
The program calls the calculateMean() method to calculate the mean of each year's sales data.
The program calls the calculateVariance() method to calculate the variance of each year's sales data, passing in the sales data and mean sales for each year.
The program calculates the variance percentage between the two years by subtracting the variance of 2021 from the variance of 2022, dividing the result by the variance of 2021, and then multiplying by 100. This gives the percentage change in variance from 2021 to 2022.
Finally, the program prints out the variance and variance percentage for the two years using the printf() method to format the output with two decimal places and a percent sign.
The program also includes two helper methods: calculateMean() and calculateVariance(). These methods take an array of doubles as input and return the mean and variance of the values in the array, respectively. The calculateVariance() method calculates the sample variance using the formula sum of squares of deviations / (n - 1), where n is the number of data points. This formula is used because we are working with a sample of data rather than the entire population of sales data.

  
  
 public class SalesVariance {
    
    public static void main(String[] args) {
        
        // Sales data for 2021 and 2022
        double[] sales2021 = {100.0, 100.0, 75.0};
        double[] sales2022 = {120.0, 110.0, 100.0};
        
        // Calculate the mean of each year's sales data
        double mean2021 = calculateMean(sales2021);
        double mean2022 = calculateMean(sales2022);
        
        // Calculate the variance of each year's sales data
        double variance2021 = calculateVariance(sales2021, mean2021);
        double variance2022 = calculateVariance(sales2022, mean2022);
        
        // Calculate the variance percentage between the two years
        double variancePct = (variance2022 - variance2021) / variance2021 * 100.0;
        
        // Print the results
        System.out.printf("2021 Variance: %.2f\n", variance2021);
        System.out.printf("2022 Variance: %.2f\n", variance2022);
        System.out.printf("Variance Pct: %.2f%%\n", variancePct);
    }
    
    // Helper method to calculate the mean of an array of doubles
    public static double calculateMean(double[] data) {
        double sum = 0.0;
        for (double d : data) {
            sum += d;
        }
        return sum / data.length;
    }
    
    // Helper method to calculate the variance of an array of doubles
    public static double calculateVariance(double[] data, double mean) {
        double sumSquares = 0.0;
        for (double d : data) {
            sumSquares += (d - mean) * (d - mean);
        }
        return sumSquares / (data.length - 1);
    }
}
