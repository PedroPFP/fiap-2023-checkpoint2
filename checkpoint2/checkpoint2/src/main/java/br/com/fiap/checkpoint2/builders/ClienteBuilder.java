package br.com.fiap.checkpoint2.builders;

import br.com.fiap.checkpoint2.models.Cliente;
import br.com.fiap.checkpoint2.records.ClienteDto;

public class ClienteBuilder implements IGenericBuilder<Cliente, ClienteDto>{

	@Override
	public Cliente toEntity(ClienteDto dto) {
		Cliente cliente = new Cliente(dto.id(), dto.nome(), dto.cep(), dto.logradouro(), dto.numero(), dto.complemento(), dto.bairro(), dto.municipio(), dto.uf(), dto.dataCadastro(), dto.ativo());
		return cliente;
	}

	@Override
	public ClienteDto toDto(Cliente entity) {
		ClienteDto dto = new ClienteDto(entity.getId(), entity.getNome(), entity.getCep(), entity.getLogradouro(), entity.getNumero(), entity.getComplemento(), entity.getBairro(), entity.getMunicipio(), entity.getUf(), entity.getDataCadastro(), entity.getAtivo());
		return dto;
	}

}
