package service;

public interface IConverterDados {

	public <T> T obterDados(String json, Class<T> classe);
}