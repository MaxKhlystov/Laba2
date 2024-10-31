//Задачи:
//модификаторы доступа
public class numberWord {
    String [] unitNumber = new String [9];
    {unitNumber[0]="один ";
        unitNumber[1]="два ";
        unitNumber[2]="три ";
        unitNumber[3]="четыре ";
        unitNumber[4]="пять ";
        unitNumber[5]="шесть ";
        unitNumber[6]="семь ";
        unitNumber[7]="восемь ";
        unitNumber[8]="девять ";}

    String [] dozenMore19Num = new String [8];
    {dozenMore19Num [0]="двадцать ";//20
        dozenMore19Num [1]="тридцать ";//30
        dozenMore19Num [2]="сорок ";
        dozenMore19Num [3]="пятьдесят ";//50
        dozenMore19Num [4]="шестьдесят ";//60
        dozenMore19Num [5]="семьдесят ";//70
        dozenMore19Num [6]="восемьдесят ";//80
        dozenMore19Num [7]="девяносто ";}

    String [] dozenNotMore19Num = new String [10];
    {dozenNotMore19Num [0]="десять ";
        dozenNotMore19Num [1]="одиннадцать ";
        dozenNotMore19Num [2]="двенадцать ";
        dozenNotMore19Num [3]="тринадцать ";
        dozenNotMore19Num [4]="четырнадцать ";
        dozenNotMore19Num [5]="пятнадцать ";
        dozenNotMore19Num [6]="шестнадцать ";
        dozenNotMore19Num [7]="семнадцать ";
        dozenNotMore19Num [8]="восемнадцать ";
        dozenNotMore19Num [9]="девятнадцать ";}

    String [] hundredNum = new String [9];
    {hundredNum [0]="сто ";
        hundredNum [1]="двести ";
        hundredNum [2]="триста ";
        hundredNum [3]="четыреста ";
        hundredNum [4]="пятьсот ";
        hundredNum [5]="шестьсот ";
        hundredNum [6]="семьсот ";
        hundredNum [7]="восемьсот ";
        hundredNum [8]="девятьсот ";}

    String [] thousandNum = new String[9];
    {thousandNum[0]="одна тысяча ";
        thousandNum[1]="две тысячи ";
        thousandNum[2]="три тысячи ";
        thousandNum[3]="четыре тысячи ";
        thousandNum[4]="пять тысяч ";
        thousandNum[5]="шесть тысяч ";
        thousandNum[6]="семь тысяч ";
        thousandNum[7]="восемь тысяч ";
        thousandNum[8]="девять тысяч ";}

    String [] dozenMore19NumFloat = new String [8];
    {dozenMore19NumFloat [0]="двадцать ";
        dozenMore19NumFloat [1]="тридцать ";
        dozenMore19NumFloat [2]="сорок ";
        dozenMore19NumFloat [3]="пятьдесят ";
        dozenMore19NumFloat [4]="шестьдесят ";
        dozenMore19NumFloat [5]="семьдесят ";
        dozenMore19NumFloat [6]="восемьдесят ";
        dozenMore19NumFloat [7]="девяносто ";}

    String [] dozenNotMore19NumFloat = new String [10];
    {dozenNotMore19NumFloat [0]="десять ";
        dozenNotMore19NumFloat [1]="одиннадцать ";
        dozenNotMore19NumFloat [2]="двенадцать ";
        dozenNotMore19NumFloat [3]="тринадцать ";
        dozenNotMore19NumFloat [4]="четырнадцать ";
        dozenNotMore19NumFloat [5]="пятнадцать ";
        dozenNotMore19NumFloat [6]="шестнадцать ";
        dozenNotMore19NumFloat [7]="семнадцать ";
        dozenNotMore19NumFloat [8]="восемнадцать ";
        dozenNotMore19NumFloat [9]="девятнадцать ";}

    String [] unitNumberFloat = new String [9];
    {unitNumberFloat[0]="один ";
        unitNumberFloat[1]="два ";
        unitNumberFloat[2]="три ";
        unitNumberFloat[3]="четыре ";
        unitNumberFloat[4]="пять ";
        unitNumberFloat[5]="шесть ";
        unitNumberFloat[6]="семь ";
        unitNumberFloat[7]="восемь ";
        unitNumberFloat[8]="девять ";}

    double numb;
    String hundred="";
    String dozen="";
    String unit="";
    String thousand="";
    String dozenFloat="";
    String unitFloat="";
    public numberWord(double numb){
        this.numb=numb;
    }
    void writeNumber() {
        int i=0;
        int g=0;
        int numbInt = (int) numb;
        double numbFloat = (numb - numbInt);
        //System.out.println("Заданное число: " + numbFloat);
        numbFloat = Math.round(numbFloat * 100);
        if (numbInt!=0) {
            if ((numbInt / 1000) != 0) {
                thousand = thousandNum[(numbInt / 1000) - 1];
            }
            if (((numbInt % 1000) / 100) != 0) {
                hundred = hundredNum[((numbInt % 1000) / 100) - 1];
            }
            if ((numbInt % 100) / 10 != 0) {
                if (numbInt % 100 >= 10 && numbInt % 100 <= 19) {
                    dozen = dozenNotMore19Num[(numbInt % 100) % 10];
                    i = 1;
                } else {
                    dozen = dozenMore19Num[((numbInt % 100) / 10) - 2];
                    i = 0;
                }
            }
            if ((numbInt % 100) % 10 != 0 && i == 0) {
                unit = unitNumber[((numbInt % 100) % 10) - 1];
            }
        }
        else unit = "ноль ";
        if (numbFloat!=0)
        {
            if (numbFloat/10 >= 1){
                if (numbFloat >= 10 && numbFloat <=19){
                    dozenFloat = dozenNotMore19NumFloat[(int) (numbFloat%10)];
                    g=1;
                }else {
                    dozenFloat = dozenMore19NumFloat[(int) (numbFloat/10)-2];
                    g=0;
                }
            }
            if (numbFloat%10 >=1 && g==0){
                unitFloat = unitNumberFloat[(int) (numbFloat % 10) -1];
            }
            //System.out.println("Заданное число: " + numbFloat%10);
        }
        else unitFloat = "ноль ";
        System.out.println("Заданное число: " + numb);
        System.out.println("Заданное число словами: "+ thousand + hundred + dozen + unit + "рублей " + dozenFloat + unitFloat + "копеек" );
    }
}
