// import java.text.Format;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(int day, int month, int year){
        dia = day;
        mes = month;
        ano = year;
    }

    String obterData(){
       return String.format("%d/%d/%d", dia, mes, ano);
    }
}
