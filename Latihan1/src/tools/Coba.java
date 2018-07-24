/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kresna bayu
 */
public class Coba {

    public String randomCards(int player) {
        String cardType[] = {"Hati", "Sekop", "Wajik", "Kriting"};
        String cardValue[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String deck[] = new String[52];
        String deckPlayer[] = new String[52];
        ArrayList<String> card = new ArrayList<String>();
        String result = "";
//menampung kartu 
        for (int i = 0; i < cardType.length; i++) {
            for (int j = 0; j < cardValue.length; j++) {
                card.add(new String(cardValue[j] + "" + cardType[i]));
            }
        }

        Collections.shuffle(card);     //random agar pemain tdk mendapatkan kartu yg sama
        int num = 0;
        //menampilkan kartu pemain
        for (int i = 1; i < 4; i++) {
            result += "Pemain " + i + " Dapet kartu : ";

            for (int j = 1; j < 52 / player; j++) {

                result += card.get(num);
                if (j == (52 / player) - 1) {
                    result += ".\n";
                } else {
                    result += ", ";
                }
                num++;
            }

        }

        return result;
    }

}
