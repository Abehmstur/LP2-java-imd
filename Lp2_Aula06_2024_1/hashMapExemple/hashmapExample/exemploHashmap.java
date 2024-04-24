package hashmapExample;
import java.util.HashMap;

public class exemploHashmap {
	
	    public static void main(String[] args) {
	        // Criando um HashMap de String para Integer
	        HashMap<String, Integer> notas = new HashMap<>();

	        // Inserindo elementos
	        notas.put("João", 85);
	        notas.put("Maria", 90);
	        notas.put("Carlos", 78);

	        // Acessando um valor pela chave
	        System.out.println("Nota de Maria: " + notas.get("Maria"));

	        // Iterando sobre as entradas
	        for (String nome : notas.keySet()) {
	            System.out.println(nome + ": " + notas.get(nome));
	        }

	        notas.remove("Carlos");

	        // Verificando se uma chave existe
	        if (notas.containsKey("Carlos")) {
	            System.out.println("Carlos ainda tem uma nota registrada.");
	        } else {
	            System.out.println("Carlos não tem mais uma nota registrada.");
	        }
	    
	}


}
