package praunit;

public class Ftem implements Comparable<Ftem> {
private final int gmeswon;

public Ftem(int gmeswon) {
	this.gmeswon=gmeswon;
}

public int getGameswon() {
	return gmeswon;
	}

@Override
public int compareTo(Ftem o) {
	// TODO Auto-generated method stub
//	if(gmeswon > o.getGameswon()) {
//		return 1;
//		}else if( gmeswon < o.getGameswon()) {
//		return -1;
//	}
//	return 0;
	return gmeswon - o.getGameswon();
}
}
