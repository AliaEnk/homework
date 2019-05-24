package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.*;

public class Controller {
    double m, r;
    public Label nolik;
    public Label text;
    int o =0 ;

    public void one (){
if( text.getText() == " "){
            text.setText("1" );
        }else {
    text.setText(text.getText()+ "1");
        }
    }
    public void two (){
        if( text.getText() == " "){
            text.setText("2");
        }else {
            text.setText(text.getText()+ "2");
        }
    }
    public void three (){
        if( text.getText() == " "){
            text.setText("3");
        }else {
            text.setText(text.getText()+ "3");
        }
    }
    public void four (){
        if( text.getText() == " "){
            text.setText("4");
        }else {
            text.setText(text.getText()+ "4");
        }
    }
    public void five (){
        if( text.getText() == " "){
            text.setText("5" );
        }else {
            text.setText(text.getText()+ "5");
        }
    }
    public void six (){
        if( text.getText() == " "){
            text.setText("6");
        }else {
            text.setText(text.getText()+ "6");
        }
    }
    public void seven (){
        if( text.getText() == " "){
            text.setText("7");
        }else {
            text.setText(text.getText()+ "7");
        }
    }
    public void eight (){
        if( text.getText() == " "){
            text.setText("8");
        }else {
            text.setText(text.getText()+ "8");
        }
    }
    public void nine (){
        if( text.getText() == " "){
            text.setText("9");
        }else {
            text.setText(text.getText()+ "9");
        }
    }
    public void nulls (){
        if( text.getText() == " "){
            text.setText("0");
        }else {
            text.setText(text.getText()+ "0");
        }
    }
    public void pro(){

    }
    public void cor (){

        double x = Math.sqrt(Double.parseDouble(text.getText()));
      r = x;
        nolik.setText("√" + text.getText());
    }
    public void kv (){

double x = (Double.parseDouble(text.getText()))*(Double.parseDouble(text.getText()));
r= x;
//   nolik.setText(Double.toString(x));
        nolik.setText(text.getText()+ "^2");
    }
    public void delod (){

  double x = 1/(Double.parseDouble(text.getText()));
  r = x;
       // nolik.setText(Double.toString(x));
        nolik.setText("1/"+ text.getText());
    }
    public void ce (){
        nolik.setText( "0");
    }
    public void c (){
        text.setText( "0");
        nolik.setText("0");
    }
    public void ud (){

    }
    public void del (){
//

        nolik.setText(text.getText()+ "/");
        double a = Double.parseDouble(text.getText());
        o = 4;
        matod(a);


        text.setText(Double.toString(r));

    }
    public void pm (){
        double x = -1 *(Double.parseDouble(text.getText()));
        text.setText(Double.toString(x));
    }
    public void zap (){
        if( text.getText() == " "){
            text.setText("Ошибка");
        }else {
            text.setText(text.getText()+ ".");
        }
    }
    public void x (){
        nolik.setText(text.getText()+ "*");
        double a = Double.parseDouble(text.getText());
        o =3;
        matod(a);


        text.setText(Double.toString(r));
    }
    public void min (){
        nolik.setText(text.getText()+ "-");
        double a = Double.parseDouble(text.getText());
        o =2;
        matod(a);


        text.setText(Double.toString(r));

    }
    public void plus (){
        nolik.setText(text.getText()+ "+");
        double a = Double.parseDouble(text.getText());
        o =1;
        matod(a);


        text.setText(Double.toString(r));
    }
    public void mc (){

    }
    public void mr (){
        text.setText(Double.toString(m));

    }
    public void mplus (){

        m =  Double.parseDouble(text.getText())+ Double.parseDouble(text.getText());
    }
    public void mmin (){
        m =  Double.parseDouble(text.getText())- Double.parseDouble(text.getText());
    }
    public void ms (){

    }
    public void ravno (){

        text.setText(Double.toString(r));
    }
    public void matod (double a ){

        switch (o){
            case 1: r = r+a;
            case 2:r =r- a;
            case 3:r = r*a;
            case 4:r = r /a;
        }

    }
}
