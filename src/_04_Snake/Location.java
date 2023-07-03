package _04_Snake;

public class Location {
private int x;
private int y;

public Location(int setX, int setY) {
	this.x = setX;
	this.y = setY;
}






public Boolean locationEquals(int Lx, int Ly) {
	Boolean isEqual = false;
	if (Lx==x&&Ly==y) {
		isEqual = true;
	}
	return isEqual;
	
}
public int getX() {
	return x;
}
public int getY() {
	return y;
}
}
