/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.util.Duration;


/**
 * @author hanif
 */
public class Komponen {

    RandString unduh = new RandString();
    private Label angka1;
    private Label angka2;
    private Label Nilai;
    private Label operator;
    private TextField jawab;
    private Button Menjawab;
    private int Nilaiint = 0;

    public Label getOperator() {
        operator = new Label();
        operator.setText(unduh.getOperator());
        return operator;
    }

    public Label getAngka() {
        angka1 = new Label();
        angka1.setText(unduh.getAngkaS());
        return angka1;
    }

    public Label getAngka2() {
        angka2 = new Label();
        angka2.setText(unduh.getAngkaS());
        return angka2;
    }

    public Label getNilai() {
        Nilai = new Label();
        Nilai.setText("" + Nilaiint);
        return Nilai;
    }

    public TextField setJawab() {
        jawab = new TextField();
        return jawab;
    }

    public Button Jawab() {
        Menjawab = new Button();
        Menjawab.setText("jawab");
        Menjawab.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (operator.getText() == "+") {
                    int nilai, bil1, bil2, jawaban;
                    bil1 = Integer.parseInt(angka1.getText());
                    bil2 = Integer.parseInt(angka2.getText());
                    nilai = bil1 + bil2;
                    jawaban = Integer.parseInt(jawab.getText());
                    if (nilai != jawaban) {
                        Nilaiint -= 50;
                        jawab.setText("");
                        angka1.setText(unduh.getAngkaS());
                        angka2.setText(unduh.getAngkaS());
                        operator.setText(unduh.getOperator());
                        Nilai.setText("" + Nilaiint);
                    } else {
                        Nilaiint += 100;
                        jawab.setText("");
                        angka1.setText(unduh.getAngkaS());
                        angka2.setText(unduh.getAngkaS());
                        operator.setText(unduh.getOperator());
                        Nilai.setText("" + Nilaiint);
                    }
                } else if (operator.getText() == "-") {
                    int nilai, bil1, bil2, jawaban;
                    bil1 = Integer.parseInt(angka1.getText());
                    bil2 = Integer.parseInt(angka2.getText());
                    nilai = bil1 - bil2;
                    jawaban = Integer.parseInt(jawab.getText());
                    if (nilai != jawaban) {
                        Nilaiint -= 50;
                        jawab.setText("");
                        angka1.setText(unduh.getAngkaS());
                        angka2.setText(unduh.getAngkaS());
                        operator.setText(unduh.getOperator());
                        Nilai.setText("" + Nilaiint);
                    } else {
                        Nilaiint += 100;
                        jawab.setText("");
                        angka1.setText(unduh.getAngkaS());
                        angka2.setText(unduh.getAngkaS());
                        operator.setText(unduh.getOperator());
                        Nilai.setText("" + Nilaiint);
                    }
                } else if (operator.getText() == "*") {
                    int nilai, bil1, bil2, jawaban;
                    bil1 = Integer.parseInt(angka1.getText());
                    bil2 = Integer.parseInt(angka2.getText());
                    nilai = bil1 * bil2;
                    jawaban = Integer.parseInt(jawab.getText());
                    if (nilai != jawaban) {
                        Nilaiint -= 50;
                        jawab.setText("");
                        angka1.setText(unduh.getAngkaS());
                        angka2.setText(unduh.getAngkaS());
                        operator.setText(unduh.getOperator());
                        Nilai.setText("" + Nilaiint);
                    } else {
                        Nilaiint += 100;
                        jawab.setText("");
                        angka1.setText(unduh.getAngkaS());
                        angka2.setText(unduh.getAngkaS());
                        operator.setText(unduh.getOperator());
                        Nilai.setText("" + Nilaiint);
                    }
                } else if (operator.getText() == ":") {
                    double nilai, bil1, bil2, jawaban;
                    bil1 = Double.parseDouble(angka1.getText());
                    bil2 = Double.parseDouble(angka2.getText());
                    nilai = bil1 / bil2;
                    jawaban = Double.parseDouble(jawab.getText());
                    if (nilai != jawaban) {
                        Nilaiint -= 50;
                        jawab.setText("");
                        angka1.setText(unduh.getAngkaS());
                        angka2.setText(unduh.getAngkaS());
                        operator.setText(unduh.getOperator());
                        Nilai.setText("" + Nilaiint);
                    } else {
                        Nilaiint += 100;
                        jawab.setText("");
                        angka1.setText(unduh.getAngkaS());
                        angka2.setText(unduh.getAngkaS());
                        operator.setText(unduh.getOperator());
                        Nilai.setText("" + Nilaiint);
                    }
                }
            }
        }));
        return Menjawab;
    }
}
