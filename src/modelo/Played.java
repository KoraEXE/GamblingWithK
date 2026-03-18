package modelo;

import java.time.LocalDate;

public class Played{
	private LocalDate date;
	private Result Result;
	
	public Played(LocalDate date, modelo.Result result) {
		this.date = date;
		Result = result;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Result getResult() {
		return Result;
	}
	public void setResult(Result result) {
		Result = result;
	}
	
	@Override
	public String toString() {
		return "Played [date=" + date + ", Result=" + Result + "]";
	}



}
