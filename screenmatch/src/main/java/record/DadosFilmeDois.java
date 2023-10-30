package record;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)//não deixa puxar todas as chaves e puxar somente as que estão descritas abaixo

public record DadosFilmeDois(@JsonAlias("Type") String filme,@JsonAlias("Language") String lingua,@JsonAlias("Source") String source, @JsonAlias("Actors") String ator) {

}