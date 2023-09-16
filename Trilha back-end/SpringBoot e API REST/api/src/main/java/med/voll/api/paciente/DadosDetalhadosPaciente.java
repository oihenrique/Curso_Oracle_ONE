package med.voll.api.paciente;

import med.voll.api.endereco.Endereco;

public record DadosDetalhadosPaciente(String nome, String email, String cpf, String telefone, Endereco endereco) {

    public DadosDetalhadosPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone(), paciente.getEndereco());
    }
}
