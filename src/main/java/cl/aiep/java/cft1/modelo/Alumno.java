package cl.aiep.java.cft1.modelo;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Alumno {
	
	@Min(0)
	private int id;
	@Size(min = 3, max = 20, message="Debe tener entre 3 y 20 caracteres")
	private String nombre;
	private LocalDate fechaNacimiento;
	@NotNull
	private Carrera carrera;
	
	public Alumno() {
		super();
	}

	public Alumno(int id, String nombre, LocalDate fechaNacimiento, Carrera carrera) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.carrera = carrera;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
}
