package record;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)//não deixa puxar todas as chaves e puxar somente as que estão descritas abaixo

public record DadosFilme(@JsonAlias("Title") String title,@JsonAlias("Genre") String genre,@JsonAlias("Year") Integer ano, @JsonAlias("Metascore") String valor) {

}