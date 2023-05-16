package ar.edu.unju.fi.model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Walker {
		
		private final static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
	
		// region Attributes
		private String nombre;
		private LocalTime horarioDisponibleDesde;
		private LocalTime horarioDisponibleHasta; 
		// endregion
		
		// region Constructor
		public Walker() {}
		
		public Walker(
				String nombre,
				int horaInicio,
				int minutoInicio,
				int horaFin,
				int minutoFin
			) {

			this.nombre = nombre;
			this.horarioDisponibleDesde = LocalTime.of(horaInicio, minutoInicio);
			this.horarioDisponibleHasta = LocalTime.of(horaFin, minutoFin);
		}
		// endregion
		
		// region Getters and Setters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getHorarioDisponibleDesde() {
			return horarioDisponibleDesde.format(dateTimeFormatter);
		}

		public void setHorarioDisponibleDesde(int hora, int minutos) {
			this.horarioDisponibleDesde = LocalTime.of(hora, minutos);
		}

		public String getHorarioDisponibleHasta() {
			return horarioDisponibleHasta.format(dateTimeFormatter);
		}

		public void setHorarioDisponibleHasta(int hora, int minutos) {
			this.horarioDisponibleHasta = LocalTime.of(hora, minutos);
		}
	    // endregion
		
		// region Methods
		public String getHorario() {
			return getHorarioDisponibleDesde() + " - " + getHorarioDisponibleHasta();
		}
		// endregion
		
}
