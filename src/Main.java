import br.com.desafio.domain.Curso;
import br.com.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();


        curso1.setDescreicao("descriçao curso java");
        curso1.setTitulo("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();


        curso2.setDescreicao("descriçao curso JS");
        curso2.setTitulo("Curso JS");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria do java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
