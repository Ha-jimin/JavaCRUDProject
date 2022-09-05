package com.mycom.word;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
    ArrayList<Word> list;
    Scanner s;

    WordCRUD(Scanner s){
        list = new ArrayList<>();
        this.s = s;
    }
    @Override
    public Object add() {
        // TODO Auto-generated method stub
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();//입력 버퍼
        System.out.print("뜻 입력 : ");
        String meaning = s.nextLine();//공백 포함

        return new Word(0, level, word, meaning);//word 데이터에 다시 입력
    }

    public void addWord() {
        Word one = (Word)add();//return 타입이 object이기 때문에
        list.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다.");
    }

    @Override
    public int update(Object obj) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(Object obj) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int selectOne(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    public void listAll() {
        System.out.println("------------------------------");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(i+1 + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("------------------------------");
    }

}
