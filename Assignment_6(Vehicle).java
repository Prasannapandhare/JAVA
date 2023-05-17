import java.util.*;

interface Vehicle

{

void changeGear(int g);

void speedUp(int inc);

void applyBrakes(int dec);

void display();

}

class bicycle implements Vehicle

{

int gear = 1;

int speed = 10;

int dspeed = speed;

public void changeGear(int g)

{

if(g>5)

{

System.out.println("Gear can't be excessed.");

}

else

{

if(g<0)

{

System.out.println("Gear has been decreasd.");

gear = gear + g;

}

else

{

System.out.println("Gear has been increased.");

gear = gear + g;

}

}

}

public void speedUp(int inc)

{

System.out.println("Speed has been increased.");

speed = speed +inc;

}

public void applyBrakes(int dec)

{

System.out.println("Speed has been decreased.");

dspeed = dspeed - dec;

}

public void display()

{

System.out.println("BICYCLE DATA :");

System.out.println("Speed : "+this.speed+"\nGear : "+this.gear+"\nDecremented Speed : "+this.dspeed);

}

}

class bike implements Vehicle

{

int gear;

int speed = 10;

int dspeed = speed;

public void changeGear(int g)

{

if(g>5)

{

System.out.println("Gear can't be excessed.");

}

else

{

if(g<0)

{

System.out.println("Gear has been decreasd.");

gear = gear + g;

}

else

{

System.out.println("Gear has been increased.");

gear = gear + g;

}

}

}

public void speedUp(int inc)

{

System.out.println("Speed has been increased.");

speed = speed +inc;

}

public void applyBrakes(int dec)

{

System.out.println("Speed has been decreased.");

dspeed = dspeed - dec;

}

public void display()

{

System.out.println("BIKE DATA :");

System.out.println("Speed : "+this.speed+"\nGear : "+this.gear+"\nDecremented Speed : "+this.dspeed);

}

}

class car implements Vehicle

{

int gear;

int speed = 10;

int dspeed = speed;

public void changeGear(int g)

{

if(g>5)

{

System.out.println("Gear can't be excessed.");

}

else

{

if(g<0)

{

System.out.println("Gear has been decreasd.");

gear = gear + g;

}

else

{

System.out.println("Gear has been increased.");

gear = gear + g;

}

}

}

public void speedUp(int inc)

{

System.out.println("Speed has been increased.");

speed = speed + inc;

}

public void applyBrakes(int dec)

{

System.out.println("Speed has been decreased.");

dspeed = dspeed - dec;

}

public void display()

{

System.out.println("CAR DATA :");

System.out.println("Speed : "+this.speed+"\nGear : "+this.gear+"\nDecremented Speed : "+this.dspeed);

}

}

public class Main

{

public static void main(String[] args)

{

Scanner sc = new Scanner(System.in);

int ch,ch1,y;

int g,ng,inc,dec;

Vehicle v = null;

bicycle bicycle = new bicycle();

bike bike = new bike();

car car = new car();

do

{

System.out.println("=========================================");

System.out.println("1.Bicycle. \n2.Bike. \n3.Car.");

System.out.println("-----------------------------------------");

System.out.print("Enter your choice : ");

ch = sc.nextInt();

System.out.print("\n=========================================\n");

switch(ch)

{

case 1 : v = bicycle;

break;

case 2 : v = bike;

break;

case 3 : v = car;

break;

}

System.out.println("=========================================");

System.out.println("1.Change Gear. \n2.Change Speed. \n3.Apply Brake.");

System.out.println("-----------------------------------------");

System.out.print("Enter your choice : ");

ch1 = sc.nextInt();

System.out.println("=========================================");

switch(ch1)

{

case 1 : System.out.println("Enter change in gear : ");

g = sc.nextInt();

v.changeGear(g);

break;

case 2 : System.out.println("Enter change in speed : ");

inc = sc.nextInt();

v.speedUp(inc);

break;

case 3 : System.out.println("Enter change in speed : ");

dec = sc.nextInt();

v.applyBrakes(dec);

break;

}

System.out.println("=========================================");

v.display();

System.out.println("=========================================");

System.out.println("Press 1 to continue else 0 : ");

y = sc.nextInt();

}while(y!=0);

}

}
