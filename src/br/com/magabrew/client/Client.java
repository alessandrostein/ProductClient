package br.com.magabrew.client;

import java.util.List;

import br.com.magabrew.service.ListarCervejas;
import br.com.magabrew.service.ListarCervejasService;
import br.com.magabrew.service.Produto;

public class Client {
	
	public static void main(String[] args) {
		ListarCervejasService service = new ListarCervejasService();
		ListarCervejas client = service.getListarCervejasPort();
		
		List<Produto> produtos = client.listarCervejas();
		for (Produto produto: produtos){
			System.out.println(produto.getNome());
			System.out.println("Decrição:" + produto.getDescricao());
			System.out.println("Estoque: " + produto.getQuantidade());
			System.out.println("Unidade de Medida: " + produto.getUnidadeDeMedida());
			System.out.println("Volume: " + produto.getVolume());
			System.out.println("Valor: " + produto.getPreco());
			System.out.println("");
		}
	}

}
