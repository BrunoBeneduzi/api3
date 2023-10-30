package service;

import java.util.Scanner;
import java.util.*;
import record.DadosFilme;

public class entregaDados {
	private final String ENDERECO = "https://www.omdbapi.com/?t=";
	private final String API = "&apikey=72710dd0";
	private ConverterDados converte = new ConverterDados();
	private Scanner sc = new Scanner(System.in);
	List<DadosFilme> teste = new ArrayList<>();
	
	public <T> void mostraFilme() {
		var consumoApi = new ConsumoApi();
		
		String nomeFilme = sc.nextLine();
		
		nomeFilme = ENDERECO + nomeFilme.replace(" ", "+") + API;//procura o nome do filme
		
		 String json = consumoApi.obterDados(nomeFilme);//converte em um objeto para manipular
		
		DadosFilme dados = converte.obterDados(json, DadosFilme.class);
		
		
		
		teste.add(dados);//adiciona na lista
		
		
		teste.forEach(System.out::println);
		
	}
	
}