import br.com.desafio.domain.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();


        curso1.setDescricao("descriçao curso java");
        curso1.setTitulo("Curso Java");
        curso1.setCargaHoraria(8);

        curso2.setDescricao("descriçao curso JS");
        curso2.setTitulo("Curso JS");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria do java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHenrique = new Dev();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos - Henrique: " + devHenrique.getConteudosInscritos());
        devHenrique.progredir();
        devHenrique.progredir();
        devHenrique.progredir();
        System.out.println("\n----------------------");
        System.out.println("Conteudos Inscritos - Henrique: " + devHenrique.getConteudosInscritos());
        System.out.println("Conteudos Concluidos - Henrique: " + devHenrique.getConteudosConcluidos());
        System.out.println("XP Ganho: " + devHenrique.calcularTotalXp());
        System.out.println("\n----------------------");



        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos - Joao: " + devJoao.getConteudosInscritos());
        System.out.println("\n----------------------");
        devJoao.progredir();
        System.out.println("Conteudos Inscritos- Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos - Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP Ganho: " + devJoao.calcularTotalXp());











    }
}
