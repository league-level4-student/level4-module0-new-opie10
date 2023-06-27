package _03_Intro_to_Enums;

public enum StatesOfMatter {
SOLID(0.0),LIQUID(25.55),GAS(100.0);
private Double CelsiusTemp;
private StatesOfMatter(Double temps) {
	this.CelsiusTemp = temps;
 }
public Double convertToFarenheit(Double temps) {
Double	F = (temps * 9/5) + 32;
	return F;
 }
}
