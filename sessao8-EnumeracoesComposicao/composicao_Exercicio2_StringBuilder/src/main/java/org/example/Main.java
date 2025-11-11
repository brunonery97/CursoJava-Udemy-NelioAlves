package org.example;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        /*
            Exercicio Video 125 - Curso Udemy - Nélio alvez
         */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), 12, "Vou visitar esse pais maravilhoso", "Viajando para Nova Zelândia");
        Comment c1 = new Comment("Tenha uma boa viagem!");
        Comment c2 = new Comment("Uau, isso é incrível!");
        post1.addComment(c1);
        post1.addComment(c2);

        Post post2 = new Post(sdf.parse("12/08/2018 15:10:23"), 5, "Vejo você amanhã", "Boa noite galera!");
        Comment c3 = new Comment("Boa noite");
        Comment c4 = new Comment("Que a força esteja com você");
        post2.addComment(c3);
        post2.addComment(c4);

        System.out.println(post1);
        System.out.println(post2);




    }
}