package hashmapExample;

import java.util.ArrayList;
import java.util.HashMap;

public class Professor {
	
	private String nome;
    private String nivelEnsino; // Pode ser "mestrado", "doutorado", etc.

    // Construtor
    public Professor(String nome, String nivelEnsino) {
        this.nome = nome;
        this.nivelEnsino = nivelEnsino;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getNivelEnsino() {
        return nivelEnsino;
    }
    
   
    public static void main(String[] args) {
        ArrayList<Professor> professores = new ArrayList<>();

        // Adicionando professores ao ArrayList
        professores.add(new Professor("João", "mestrado"));
        professores.add(new Professor("Maria", "doutorado"));
        professores.add(new Professor("Pedro", "mestrado"));
        // Adicione mais professores conforme necessário
        
     // Criando HashMap para armazenar professores com mestrado
        HashMap<String, Professor> professoresMestrado = new HashMap<>();

        // Iterando sobre a lista de professores e adicionando no HashMap se tiverem mestrado
        for (Professor professor : professores) {
            if (professor.getNivelEnsino().equals("mestrado")) {
                professoresMestrado.put(professor.getNome(), professor);
            }
        }

        // Exibindo os professores com mestrado no HashMap
        System.out.println("Professores com mestrado:");
        for (String nome : professoresMestrado.keySet()) {
            System.out.println("- " + nome);
        }
        
//        Outro exmeplo
     // Criando um HashMap para armazenar os professores e seus níveis de ensino
        HashMap<String, String> professores2 = new HashMap<>();

        // Adicionando professores ao HashMap
        professores2.put("João", "mestrado");
        professores2.put("Maria", "doutorado");
        professores2.put("Pedro", "mestrado");
        professores2.put("Ana", "graduação");
        professores2.put("Carlos", "doutorado");
        professores2.put("Luísa", "mestrado");

        // Exibindo os professores com nível de ensino "mestrado"
        System.out.println("Professores com nível de ensino 'mestrado':");
        for (String nomeProfessor : professores2.keySet()) {
            if (professores2.get(nomeProfessor).equals("mestrado")) {
                System.out.println("- " + nomeProfessor);
            }
        }
    }
    
}
