package com.company;

public class Camera {

    public static void main(String[] args) {
        int film = 1; //начальное состояние/ тут задать 0 или 1
        boolean isEnd = false; //конец пленки
        System.out.println("Сейчас вылетит птичка!");

            if (film == 0) {
                System.out.println("Вставьте плёнку");
                isEnd = false;
            } else {
                for (int i = 1; i < 10; i++) {
                    System.out.println("Щелк!"); //делаем кадр

                    System.out.println("Вжик!"); //перематываем кадр
                }
                isEnd = true;
            }
    }
}
