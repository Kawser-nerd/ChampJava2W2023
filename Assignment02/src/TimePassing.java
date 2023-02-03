/*
You are the manager of five "Time Passing" coffee shops. Everyday, after the sales hour, you need to set see what is
sales states in different stores.

Write a program that will help you to enter each day's sales for five stores. The program should then display a bar
chart comparing each store's sales as shown in attached file. Create each bar in the bar chart by displaying a
row of asterisks. Each asterisk should represent $100 of sales.

Please used Access class and driver class structure as I showed it in the class. And develop this program such a way
that it will show you bar chart status for different days until the user enter s/S from the keyboard.
 */
public class TimePassing {
    private int sales1, sales2, sales3, sales4, sales5;
    public TimePassing(int shopSale1, int shopSale2, int shopSale3, int shopSale4, int shopSale5){
        this.sales1 = shopSale1;
        this.sales2 = shopSale2;
        this.sales3 = shopSale3;
        this.sales4 = shopSale4;
        this.sales5 = shopSale5;
    }

    public int getStore1Bars(){
        return this.sales1/100;
    }

    public int getStore2Bars(){
        return this.sales2/100;
    }

    public int getStore3Bars(){
        return this.sales3/100;
    }

    public int getStore4Bars(){
        return this.sales4/100;
    }

    public int getStore5Bars(){
        return this.sales5/100;
    }
}
