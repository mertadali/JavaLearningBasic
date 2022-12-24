package com.mertadali.javalearningbasic;

public class Statements {
    public static void main(String[] args){
        int x=5;
        System.out.println(x);
// Bu bölüm operatörler üzerinden işlenecektir.
        x = x +1;
        System.out.println(x);
       x++; // bu ifade de aynı şekilde ifadeye +1 ekler.
        System.out.println(x);
        x--; // Benzer şekilde bu ifade -1 yapar.
        System.out.println(x);

        int y = 4;
        System.out.println(x>y);
        System.out.println(x<y);
        y = 6;
        System.out.println(x>=y); // büyük eşittir ifadesi eşit mi sorgular.
        System.out.println(x!=y); // Bu ifade eşit değil mi sorgusu yapar.
        // and && işareti ile yazılır.
        // or || işareti ile yazılır.
        x = 5;
        y = 5;
        int z = 6;
        System.out.println(x<y && y<z); // and de herhangi bir ifadenin yanlış olması sorguyu yanlış yapar.
        System.out.println(x<y || z<y); // or da herhangi bir ifadenin doğru olması sorguyu doğru yapar.

        // if statements
        if (x<y){
            System.out.println("y is bigger than x");
            }else if (x>y){
            System.out.println("x is bigger than y");

        }else{
            System.out.println("x and y are eco");

            int day =0;
            String dayStrig ="";
            /*if (day==1){
                dayStrig="Monday";
            } else if (day==2){
                dayStrig ="Tuesday";
            }else if (day==3){
                dayStrig = "Wednesday";
            }else if (day==4){
                dayStrig ="Sunday";
            }*/
            // Switch statements

            switch (day){
                case  1:
                dayStrig ="Monday";
                break;
                case 2:
                dayStrig = "Tuesday";
                break;
                case 3:
                dayStrig ="Wednesday";
                break;
                default:
                    dayStrig ="Sunday";
                    break;

            }

            System.out.println(dayStrig);

        }
    }
}
