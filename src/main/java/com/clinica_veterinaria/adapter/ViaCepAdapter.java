package com.clinica_veterinaria.adapter;

import com.clinica_veterinaria.model.Endereco;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class ViaCepAdapter {

    private static final String VIACEP_URL = "https://viacep.com.br/ws/{cep}/json/";

    public Endereco buscarEnderecoPorCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> resposta = restTemplate.getForObject(VIACEP_URL, Map.class, cep);

        if (resposta == null || resposta.containsKey("erro")) {
            return null;
        }

        return new Endereco.Builder()
                .cep(resposta.get("cep"))
                .logradouro(resposta.get("logradouro"))
                .bairro(resposta.get("bairro"))
                .cidade(resposta.get("localidade"))
                .estado(resposta.get("uf"))
                .pais("Brasil")
                .build();
    }
}
