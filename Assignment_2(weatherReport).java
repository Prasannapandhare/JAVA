/*
Design a class named weather report that holds a daily weather report with data members day_of_month,
hightemp, lowtemp, amount_rain and amount_snow. Use different types of constructors to initialize the
objects. Write a program to generate monthly report that displays average of each attribute. 
*/

package Weather_Report;

import java.util.*;


class WeatherReport
{
    double d,ht,lt,ar,as;
    
    WeatherReport()
    {
        d = 0;
        ht = 0;
        lt = 0;
        ar = 0;
        as = 0;
    }

    WeatherReport(double day,double high_temp,double low_temp,double amt_rain,double amt_snow)
    {
        d = day;
        ht = high_temp;
        lt = low_temp;
        ar = amt_rain;
        as = amt_snow;
    }

    public void avgH(WeatherReport[] arr, int n)
    {
        double sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum+arr[i].ht;
        }
        double avg = sum/n;
        System.out.println("Average High Temperature is : "+ avg);
    }

    public void avgL(WeatherReport[] arr, int n)
    {
        double sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum+arr[i].lt;
        }
        double avg = sum/n;
        System.out.println("Average Low Temperature is : "+ avg);
    }

    public void avgAr(WeatherReport[] arr, int n)
    {
        double sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum+arr[i].ar;
        }
        double avg = sum/n;
        System.out.println("Average amount of rain is : "+ avg);
    }

    public void avgS(WeatherReport[] arr, int n)
    {
        double sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum+arr[i].as;
        }
        double avg = sum/n;
        System.out.println("Average amount of snow is : "+ avg);
    }
}
public class weather_report 
{
    public static void main(String args[])
    {
        int n;
        double day,high_temp,low_temp,amt_rain,amt_snow;
        Scanner sc = new Scanner(System.in);
        WeatherReport[] arr = new WeatherReport[20];

        WeatherReport obj = new WeatherReport();
        System.out.println("Enter number of days : ");
        n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter day number :");
            day = sc.nextDouble();
            System.out.println("Enter the high temperature :");
            high_temp = sc.nextDouble();
            System.out.println("Enter the low temperature :");
            low_temp = sc.nextDouble();
            System.out.println("Enter amount of rain :");
            amt_rain = sc.nextDouble();
            System.out.println("Enter amount of snow :");
            amt_snow = sc.nextDouble();
            arr[i] = new WeatherReport(day,high_temp,low_temp,amt_rain,amt_snow);
        }
        obj.avgH(arr,n);
        obj.avgL(arr,n);
        obj.avgAr(arr,n);
        obj.avgS(arr,n);
        sc.close();
    }
}
