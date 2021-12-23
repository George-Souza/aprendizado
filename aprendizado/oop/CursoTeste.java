public class CursoTeste {
    public static void main(String[] args) {
        Aluno std1 = new Aluno("Adonis");
        Aluno std2= new Aluno("Rodolfo");

        std1.adicionarCurso(new Curso("Teste de Software"));
        std1.adicionarCurso(new Curso("Estrutura de Dados"));

        std2.adicionarCurso(new Curso("Libras"));
        std2.adicionarCurso(new Curso("Estrutura de Dados"));

    }
}
