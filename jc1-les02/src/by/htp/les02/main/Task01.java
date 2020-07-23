package by.htp.les02.main;

/*
Âû÷èñëèòü çíà÷åíèå âûðàæåíèÿ ïî ôîðìóëå (âñå ïåðíåìåííûå ïðèíèìàþò äåéñòâèòåëüíûå çíà÷åíèÿ):
(b + sqrt(b^2 + 4*a*c)) / 2a - a^3*c + b^(-2)
 */
/*
Вычислить значение выражения по формуле (все пернеменные принимают действительные значения):
(b + sqrt(b^2 + 4*a*c)) / 2a - a^3*c + b^(-2)
 */
public class Task01 {
    public static void main(String[] args) {
        double b = 10;
        double a = 10;
        double c = 10;
        double result;
        result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2*a) - Math.pow(a , 3) * c + Math.pow(b, -2);
        System.out.println(result);
    }

}
