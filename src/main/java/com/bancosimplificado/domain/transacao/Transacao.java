package com.bancosimplificado.domain.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.bancosimplificado.domain.usuario.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "transacoes")
@Table(name = "transacoes")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal quantia;
	
	@ManyToOne
	@JoinColumn(name="enviar_id")
	private Usuario enviar;
	
	@ManyToOne
	@JoinColumn(name="receber_id")
	private Usuario receber;
	
	private LocalDateTime emissao;
	
	
	

}
