package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<Character>();
        characters.add(new Character("Barry Allan",Hero.FLASH,1200,120,100,4));
        Scanner scan = new Scanner(System.in);
        String characterName = scan.next();
        for(Character character : characters){
            if(character.getHero().fromString(characterName) == character.getHero()){
                System.out.println(character.toString());
            }
        }

    }
}


