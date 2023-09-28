package med.voll.api.domain.consulta.validacoes.agendamento;

import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.consulta.ValidacaoException;
import med.voll.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component
//public class ValidadorPacienteSemOutraConsultaNoDia implements ValidadorAgendamentoDeConsulta {
//
//    @Autowired
//    private PacienteRepository pacienteRepository;
//
//    @Override
//    public void validar(DadosAgendamentoConsulta dados) {
//        LocalDateTime primeiroHorario = dados.data().withHour(7);
//        LocalDateTime ultimoHorario = dados.data().withHour(18);
//
//        Boolean pacientePossuiOutraConsultaNoDia = pacienteRepository.existsByPacienteIdAndData(dados.idPaciente());
//        if (pacientePossuiOutraConsultaNoDia) {
//            throw new ValidacaoException("Paciente já possui uma consulta agendada nesse dia.");
//        }
//    }
//}
