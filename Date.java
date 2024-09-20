public class Date{
int day;
int month;
int year;
Date(Date d){
this.day=d.day;
this.month=d.month;
this.year=d.year;
}
Date(){
this.day=1;
this.month=1;
this.year=1;

}
public void display(){
System.out.println(day+"-" + month +"-"+year);
}

}